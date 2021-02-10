package com.ramirezf.pdelicia.fragments;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ramirezf.pdelicia.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

// implementar LocationListener // para la localización
public class MapFragment extends Fragment implements OnMapReadyCallback, View.OnClickListener {

    private static final int MY_PERMISSION_ACCESS_FINE_LOCATION = 1;
    private View rootView;
    private MapView mapView;
    private GoogleMap gMap;
    private GoogleMap mMap;
    private MarkerOptions marker;
    private FloatingActionButton btn_frisco;

    public MapFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_map, container, false);
        btn_frisco = (FloatingActionButton) rootView.findViewById(R.id.btn_frisco);
        btn_frisco.setOnClickListener(this);
        return rootView;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mapView = (MapView) rootView.findViewById(R.id.map);
        if (mapView != null) {
            mapView.onCreate(null);
            mapView.onResume();
            mapView.getMapAsync(this);
        }


    }

    @Override
    public void onResume() {
        super.onResume();
        this.onCreate(null);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMap = googleMap;
        activarUbicacionActual();
        pizzeriaFrisco(googleMap);
    }

    private MapFragment getMapFragment() {
        return this;
    }

    private void getMap() {
        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            gMap.setMyLocationEnabled(true);
        }
        gMap.getUiSettings().setZoomControlsEnabled(false);
        gMap.getUiSettings().setMyLocationButtonEnabled(true);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSION_ACCESS_FINE_LOCATION: {
                // Si el usuario acepta los permisos
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    //getMap();
                    if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                        mMap.setMyLocationEnabled(true);
                    }
                } else {
                    // Si el usuario no brinda los permisos                                                                                 ********************************
                    Toast.makeText(getActivity(), "Permiso denegado", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }


    // Para vel el GPS si está ACTIVADO O NO
    private boolean isGPSEnable() {
        try {
            int gpsSignal = Settings.Secure.getInt(getActivity().getContentResolver(), Settings.Secure.LOCATION_MODE);                                    // Para el GPS
            if (gpsSignal == 0) {
                return false;
            } else {
                return true;
            }
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void showInfoAlert() {
        new AlertDialog.Builder(getContext())
                .setTitle("GPS Signal")
                .setMessage("You don't have GPS signal enable. Would you like to enable GPS signal now?")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // GPS no está activado
                        Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                        startActivity(intent);
                    }
                }).setNegativeButton("CANCEL", null)
                .show();
    }

    @Override
    public void onClick(View v) {
        if (!this.isGPSEnable()) {
            showInfoAlert();
        } else {
            setLocationKnow();
        }
    }

    // Activar ubicación actual
    public void activarUbicacionActual()
    {
        getMap();
        gMap.getUiSettings().setMyLocationButtonEnabled(true);
    }

    public void setLocationKnow()
    {
        //**********************************************************************************************************************************************************
        // A partir de las versión 6 en adelante cambia las políticas sobre los permisos
        // Hay que verificar los permisos e informar al usuario si va a brindar los accesos correspondientes

        // Validamos la versión
        if (Build.VERSION.SDK_INT >= 23) {
            // Validamos si ACCESS_FINE_LOCATION tiene permisos otorgados por el usuario
            if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // Informamos al usuario sobre que permisos se le van a solicitar.
                ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, MY_PERMISSION_ACCESS_FINE_LOCATION);
                return;
            } else {
                // Esta parte se ejecuta cuando los permisos son otorgados por el usuario
                getMap();
            }
        } else {
            // Esta bloque se ejecuta cuando una versión de android es inferior a la 6 o API 23, obtiene la información sobre los permisos
            // del AndroidManifest.xml
            getMap();
        }

        gMap.getUiSettings().setZoomControlsEnabled(false);
        gMap.getUiSettings().setMyLocationButtonEnabled(true);
        //**********************************************************************************************************************************************************
    }

    public void pizzeriaFrisco(GoogleMap googleMap) {
        mMap = googleMap;

        /*
        //**********************************************************************************************************************************************************
        // A partir de las versión 6 en adelante cambia las políticas sobre los permisos
        // Hay que verificar los permisos e informar al usuario si va a brindar los accesos correspondientes

        // Validamos la versión
        if( Build.VERSION.SDK_INT >= 23) {
            // Validamos si ACCESS_FINE_LOCATION tiene permisos otorgados por el usuario
            if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                // Informamos al usuario sobre que permisos se le van a solicitar.
                ActivityCompat.requestPermissions(getActivity(), new String[] {  Manifest.permission.ACCESS_FINE_LOCATION  }, MY_PERMISSION_ACCESS_FINE_LOCATION);
                return;
            } else {
                // Esta parte se ejecuta cuando los permisos son otorgados por el usuario
                //pizzeriaDelicia(googleMap);
                getMap();
            }
        } else {
            // Esta bloque se ejecuta cuando una versión de android es inferior a la 6 o API 23, obtiene la información sobre los permisos
            // del AndroidManifest.xml
            //pizzeriaDelicia(googleMap);
            getMap();
        }
        //**********************************************************************************************************************************************************
        */



        // Locales
        final LatLng local01 = new LatLng(-12.2751075,-76.8717649);
        final LatLng local02 = new LatLng(-12.0153611,-77.096272);
        final LatLng local03 = new LatLng(-11.8904167,-77.0707443);
        final LatLng local04 = new LatLng(-11.9796389,-76.9081609);
        final LatLng local05 = new LatLng(-12.0164722,-76.9869109);
        final LatLng local06 = new LatLng(-12.0402778,-76.9201054);
        final LatLng local07 = new LatLng(-12.0338611,-76.9154109);
        final LatLng local08 = new LatLng(-11.9559444,-77.054022);
        final LatLng local09 = new LatLng(-11.9643333,-77.0943276);
        final LatLng local10 = new LatLng(-12.0740833,-77.0107443);
        final LatLng local11 = new LatLng(-12.0810278,-77.0194387);
        final LatLng local12 = new LatLng(-11.9921667,-76.8239665);
        final LatLng local13 = new LatLng(-11.9853056,-76.834272);
        final LatLng local14 = new LatLng(-11.9920556,-76.9206331);
        final LatLng local15 = new LatLng(-12.0168889,-76.9188831);
        final LatLng local16 = new LatLng(-12.0250556,-76.9221054);
        final LatLng local17 = new LatLng(-12.0351667,-76.9067165);
        final LatLng local18 = new LatLng(-12.0341389,-76.9314387);
        final LatLng local19 = new LatLng(-12.02975,-76.9291609);
        final LatLng local20 = new LatLng(-12.0434167,-76.9818831);
        final LatLng local21 = new LatLng(-12.0306944,-76.9638276);
        final LatLng local22 = new LatLng(-11.9749167,-76.770272);
        final LatLng local23 = new LatLng(-11.9258889,-76.6880776);
        final LatLng local24 = new LatLng(-12.0243889,-76.9752165);
        final LatLng local25 = new LatLng(-12.0031667,-76.8770498);
        final LatLng local26 = new LatLng(-12.0100556,-76.8553276);
        final LatLng local27 = new LatLng(-12.0453056,-76.8929665);
        final LatLng local28 = new LatLng(-12.0204444,-76.8926331);
        final LatLng local29 = new LatLng(-12.0158611,-76.8851054);
        final LatLng local30 = new LatLng(-12.0459167,-76.9761887);
        final LatLng local31 = new LatLng(-12.0519167,-76.9810776);
        final LatLng local32 = new LatLng(-12.0473056,-76.9845776);
        final LatLng local33 = new LatLng(-12.0033611,-77.0051054);
        final LatLng local34 = new LatLng(-11.971,-77.0073554);
        final LatLng local35 = new LatLng(-12.0055833,-77.1013831);
        final LatLng local36 = new LatLng(-11.9964444,-77.1161054);
        final LatLng local37 = new LatLng(-12.0204167,-76.9026054);
        final LatLng local38 = new LatLng(-12.0544167,-76.9614665);
        final LatLng local39 = new LatLng(-12.0682778,-76.977522);
        final LatLng local40 = new LatLng(-12.028,-76.954272);
        final LatLng local41 = new LatLng(-12.0518056,-76.9666054);
        final LatLng local42 = new LatLng(-12.0413056,-77.004522);
        final LatLng local43 = new LatLng(-12.0532222,-77.0056887);
        final LatLng local44 = new LatLng(-12.1115,-76.875272);
        final LatLng local45 = new LatLng(-12.0951944,-76.886772);

        // Local01
        marker = new MarkerOptions();
        marker.position(local01);
        marker.title("Prueba de Frisco 1");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local02
        marker = new MarkerOptions();
        marker.position(local02);
        marker.title("Prueba de Frisco 2");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local03
        marker = new MarkerOptions();
        marker.position(local03);
        marker.title("Prueba de Frisco 3");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local04
        marker = new MarkerOptions();
        marker.position(local04);
        marker.title("Prueba de Frisco 4");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local05
        marker = new MarkerOptions();
        marker.position(local05);
        marker.title("Prueba de Frisco 5");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local06
        marker = new MarkerOptions();
        marker.position(local06);
        marker.title("Prueba de Frisco 6");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local07
        marker = new MarkerOptions();
        marker.position(local07);
        marker.title("Prueba de Frisco 7");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local08
        marker = new MarkerOptions();
        marker.position(local08);
        marker.title("Prueba de Frisco 8");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local09
        marker = new MarkerOptions();
        marker.position(local09);
        marker.title("Prueba de Frisco 9");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local10
        marker = new MarkerOptions();
        marker.position(local10);
        marker.title("Prueba de Frisco 10");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local11
        marker = new MarkerOptions();
        marker.position(local11);
        marker.title("Prueba de Frisco 11");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local12
        marker = new MarkerOptions();
        marker.position(local12);
        marker.title("Prueba de Frisco 12");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local13
        marker = new MarkerOptions();
        marker.position(local13);
        marker.title("Prueba de Frisco 13");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local14
        marker = new MarkerOptions();
        marker.position(local14);
        marker.title("Prueba de Frisco 14");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local15
        marker = new MarkerOptions();
        marker.position(local15);
        marker.title("Prueba de Frisco 15");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local16
        marker = new MarkerOptions();
        marker.position(local16);
        marker.title("Prueba de Frisco 16");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local17
        marker = new MarkerOptions();
        marker.position(local17);
        marker.title("Prueba de Frisco 17");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local18
        marker = new MarkerOptions();
        marker.position(local18);
        marker.title("Prueba de Frisco 18");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local19
        marker = new MarkerOptions();
        marker.position(local19);
        marker.title("Prueba de Frisco 19");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local20
        marker = new MarkerOptions();
        marker.position(local20);
        marker.title("Prueba de Frisco 20");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local21
        marker = new MarkerOptions();
        marker.position(local21);
        marker.title("Prueba de Frisco 21");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local22
        marker = new MarkerOptions();
        marker.position(local22);
        marker.title("Prueba de Frisco 22");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local23
        marker = new MarkerOptions();
        marker.position(local23);
        marker.title("Prueba de Frisco 23");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local24
        marker = new MarkerOptions();
        marker.position(local24);
        marker.title("Prueba de Frisco 24");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local25
        marker = new MarkerOptions();
        marker.position(local25);
        marker.title("Prueba de Frisco 25");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local26
        marker = new MarkerOptions();
        marker.position(local26);
        marker.title("Prueba de Frisco 26");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local27
        marker = new MarkerOptions();
        marker.position(local27);
        marker.title("Prueba de Frisco 27");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local28
        marker = new MarkerOptions();
        marker.position(local28);
        marker.title("Prueba de Frisco 28");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local29
        marker = new MarkerOptions();
        marker.position(local29);
        marker.title("Prueba de Frisco 29");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local30
        marker = new MarkerOptions();
        marker.position(local30);
        marker.title("Prueba de Frisco 30");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local31
        marker = new MarkerOptions();
        marker.position(local31);
        marker.title("Prueba de Frisco 31");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local32
        marker = new MarkerOptions();
        marker.position(local32);
        marker.title("Prueba de Frisco 32");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local33
        marker = new MarkerOptions();
        marker.position(local33);
        marker.title("Prueba de Frisco 33");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local34
        marker = new MarkerOptions();
        marker.position(local34);
        marker.title("Prueba de Frisco 34");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local35
        marker = new MarkerOptions();
        marker.position(local35);
        marker.title("Prueba de Frisco 35");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local36
        marker = new MarkerOptions();
        marker.position(local36);
        marker.title("Prueba de Frisco 36");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local37
        marker = new MarkerOptions();
        marker.position(local37);
        marker.title("Prueba de Frisco 37");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local38
        marker = new MarkerOptions();
        marker.position(local38);
        marker.title("Prueba de Frisco 38");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local39
        marker = new MarkerOptions();
        marker.position(local39);
        marker.title("Prueba de Frisco 39");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local40
        marker = new MarkerOptions();
        marker.position(local40);
        marker.title("Prueba de Frisco 40");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local41
        marker = new MarkerOptions();
        marker.position(local41);
        marker.title("Prueba de Frisco 41");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local42
        marker = new MarkerOptions();
        marker.position(local42);
        marker.title("Prueba de Frisco 42");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local43
        marker = new MarkerOptions();
        marker.position(local43);
        marker.title("Prueba de Frisco 43");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local44
        marker = new MarkerOptions();
        marker.position(local44);
        marker.title("Prueba de Frisco 44");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local45
        marker = new MarkerOptions();
        marker.position(local45);
        marker.title("Prueba de Frisco 45");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // **********************************************************************************************************

        // Polígono Local 24    CAMPOY

        final LatLng p2401 = new LatLng(-12.024076387091215, -76.97699645338558);
        final LatLng p2402 = new LatLng(-12.025680557676722, -76.97724008138084);
        final LatLng p2403 = new LatLng(-12.026128210136523, -76.96978114416606);
        final LatLng p2404 = new LatLng(-12.020127632211087, -76.9525941634469);
        final LatLng p2405 = new LatLng(-12.019997757697451, -76.9523290899433);
        final LatLng p2406 = new LatLng(-12.019003644168126, -76.95208180289056);
        final LatLng p2407 = new LatLng(-12.019133117127284, -76.95283462984997);
        final LatLng p2408 = new LatLng(-12.01884946857254, -76.9533054419027);
        final LatLng p2409 = new LatLng(-12.0188811292306, -76.95615582226341);
        final LatLng p2410 = new LatLng(-12.017781622890613, -76.95641072902673);
        final LatLng p2411 = new LatLng(-12.017715192358535, -76.95754560806326);
        final LatLng p2412 = new LatLng(-12.015522244760904, -76.95995373807278);
        final LatLng p2413 = new LatLng(-12.006785957705485, -76.95469928275062);
        final LatLng p2414 = new LatLng(-12.003427485742813, -76.9557830022685);
        final LatLng p2415 = new LatLng(-12.006353363145884, -76.95701236506174);
        final LatLng p2416 = new LatLng(-12.00709832193052, -76.96047108097797);
        final LatLng p2417 = new LatLng(-12.006678579660223, -76.96422608692784);
        final LatLng p2418 = new LatLng(-12.009315172996113, -76.96694836786398);
        final LatLng p2419 = new LatLng(-12.012755272311644, -76.96811580162259);
        final LatLng p2420 = new LatLng(-12.013510677273741, -76.96894190739138);
        final LatLng p2421 = new LatLng(-12.01753737784867, -76.9692837399887);
        final LatLng p2422 = new LatLng(-12.016640269794266, -76.97206800064413);
        final LatLng p2423 = new LatLng(-12.018466023211136, -76.97558144972099);
        final LatLng p2424 = new LatLng(-12.021249867287713, -76.97747694527088);
        final LatLng p2425 = new LatLng(-12.021655941560219, -76.97960204711829);
        final LatLng p2426 = new LatLng(-12.022820510992632, -76.98160800226827);
        final LatLng p2427 = new LatLng(-12.020931562240207, -76.98411854459803);
        final LatLng p2428 = new LatLng(-12.021068017226103, -76.98625190042196);
        final LatLng p2429 = new LatLng(-12.019982037722558, -76.99055043720492);
        final LatLng p2430 = new LatLng(-12.021146738211709, -76.99094236506174);
        final LatLng p2431 = new LatLng(-12.022288452063679, -76.99152515039287);
        final LatLng p2432 = new LatLng(-12.026532067024165, -76.99130646196787);
        final LatLng p2433 = new LatLng(-12.026434921639837, -76.98815682500786);


        PolygonOptions laland1 = new PolygonOptions()
                .add(p2401)
                .add(p2402)
                .add(p2403)
                .add(p2404)
                .add(p2405)
                .add(p2406)
                .add(p2407)
                .add(p2408)
                .add(p2409)
                .add(p2410)
                .add(p2411)
                .add(p2412)
                .add(p2413)
                .add(p2414)
                .add(p2415)
                .add(p2416)
                .add(p2417)
                .add(p2418)
                .add(p2419)
                .add(p2420)
                .add(p2421)
                .add(p2422)
                .add(p2423)
                .add(p2424)
                .add(p2425)
                .add(p2426)
                .add(p2427)
                .add(p2428)
                .add(p2429)
                .add(p2430)
                .add(p2431)
                .add(p2432)
                .add(p2433)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon actoress = mMap.addPolygon(laland1);

        // Polígono Local 22 (quitando los 3 primeros puntos)       CHACLACAYO

        final LatLng p2501 = new LatLng(-11.97497287349915, -76.76823011678594);
        final LatLng p2502 = new LatLng(-11.96753472342126, -76.77154857153107);
        final LatLng p2503 = new LatLng(-11.967971551638978, -76.76393572055413);
        final LatLng p2504 = new LatLng(-11.968328295148883, -76.75698861242519);
        final LatLng p2505 = new LatLng(-11.963790467549012, -76.75142953361518);
        final LatLng p2506 = new LatLng(-11.96070468682318, -76.75047466704451);
        final LatLng p2507 = new LatLng(-11.963586084002875, -76.74403754459848);
        final LatLng p2508 = new LatLng(-11.965958034451035, -76.7413981887745);
        final LatLng p2509 = new LatLng(-11.95351006777461, -76.72694690042282);
        final LatLng p2510 = new LatLng(-11.9519577951763, -76.71906385909247);
        final LatLng p2511 = new LatLng(-11.952701450001506, -76.71889000226905);
        final LatLng p2512 = new LatLng(-11.956018236218931, -76.72311716315892);
        final LatLng p2513 = new LatLng(-11.960556828972551, -76.71391145294425);
        final LatLng p2514 = new LatLng(-11.96849200907706, -76.70976973110403);
        final LatLng p2515 = new LatLng(-11.970643478094521, -76.71394327343359);
        final LatLng p2516 = new LatLng(-11.964734000005482, -76.7193397311042);
        final LatLng p2517 = new LatLng(-11.957104741959014, -76.72682427180915);
        final LatLng p2518 = new LatLng(-11.959707750417303, -76.7299195409533);
        final LatLng p2519 = new LatLng(-11.962708006210875, -76.73401500064429);
        final LatLng p2520 = new LatLng(-11.96880800668349, -76.74236728040256);
        final LatLng p2521 = new LatLng(-11.975586496175227, -76.7421340869281);
        final LatLng p2522 = new LatLng(-11.979700962562296, -76.73976345993918);
        final LatLng p2523 = new LatLng(-11.983163971668038, -76.74305710411492);
        final LatLng p2524 = new LatLng(-11.980110001189853, -76.74783154459837);
        final LatLng p2525 = new LatLng(-11.974416516179522, -76.75252321071625);
        final LatLng p2526 = new LatLng(-11.979856028754666, -76.75761083989461);
        final LatLng p2527 = new LatLng(-11.980333683286437, -76.76518110743169);
        final LatLng p2528 = new LatLng(-11.984511001529075, -76.77099573110388);
        final LatLng p2529 = new LatLng(-11.981132017403427, -76.7775888227322);
        final LatLng p2530 = new LatLng(-11.988123108767132, -76.77860073139524);
        final LatLng p2531 = new LatLng(-11.988249461781276, -76.78030709389697);
        final LatLng p2532 = new LatLng(-11.97923353153678, -76.78267500064426);
        final LatLng p2533 = new LatLng(-11.983078806597918, -76.79497487753227);
        final LatLng p2534 = new LatLng(-11.990277970556637, -76.79414906974097);
        final LatLng p2535 = new LatLng(-11.994066400028325, -76.7961983580927);
        final LatLng p2536 = new LatLng(-11.993814529126755, -76.79882692271126);
        final LatLng p2537 = new LatLng(-11.990624143933168, -76.7986552617355);
        final LatLng p2538 = new LatLng(-11.983435144394829, -76.79993199313577);
        final LatLng p2539 = new LatLng(-11.9875962796819, -76.8087165394469);
        final LatLng p2540 = new LatLng(-11.98808953801158, -76.81412387264284);
        final LatLng p2541 = new LatLng(-11.987762265812833, -76.81411192925759);
        final LatLng p2542 = new LatLng(-11.984152496502483, -76.80541073110389);
        final LatLng p2543 = new LatLng(-11.978733422117704, -76.7846349452722);
        final LatLng p2544 = new LatLng(-11.977908320066827, -76.78464333375456);
        final LatLng p2545 = new LatLng(-11.9744790071231, -76.77462054297395);
        final LatLng p2546 = new LatLng(-11.972621777463058, -76.77431435646842);
        final LatLng p2547 = new LatLng(-11.971608964629949, -76.77205057208715);
        final LatLng p2548 = new LatLng(-11.969331006724056, -76.7719329073915);
        final LatLng p2549 = new LatLng(-11.968685245679806, -76.77131200064427);
        final LatLng p2550 = new LatLng(-11.9679720066187, -76.76390927180907);
        final LatLng p2551 = new LatLng(-11.96347405804547, -76.75189288640472);


        PolygonOptions laland2 = new PolygonOptions()
                //.add(p2501)
                //.add(p2502)
                //.add(p2503)
                .add(p2504)
                .add(p2505)
                .add(p2506)
                .add(p2507)
                .add(p2508)
                .add(p2509)
                .add(p2510)
                .add(p2511)
                .add(p2512)
                .add(p2513)
                .add(p2514)
                .add(p2515)
                .add(p2516)
                .add(p2517)
                .add(p2518)
                .add(p2519)
                .add(p2520)
                .add(p2521)
                .add(p2522)
                .add(p2523)
                .add(p2524)
                .add(p2525)
                .add(p2526)
                .add(p2527)
                .add(p2528)
                .add(p2529)
                .add(p2530)
                .add(p2531)
                .add(p2532)
                .add(p2533)
                .add(p2534)
                .add(p2535)
                .add(p2536)
                .add(p2537)
                .add(p2538)
                .add(p2539)
                .add(p2540)
                .add(p2541)
                .add(p2542)
                .add(p2543)
                .add(p2544)
                .add(p2545)
                .add(p2546)
                .add(p2547)
                .add(p2548)
                .add(p2549)
                .add(p2550)
                .add(p2551)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon actoresss = mMap.addPolygon(laland2);

        // Polígono Local 23 (Completo) CHOSICA

        final LatLng cho_01 = new LatLng(-11.924422076093817, -76.68757473871402);
        final LatLng cho_02 = new LatLng(-11.924276552200546, -76.68703757858921);
        final LatLng cho_03 = new LatLng(-11.901017757473127, -76.66686963575795);
        final LatLng cho_04 = new LatLng(-11.89967098073152, -76.66575454764761);
        final LatLng cho_05 = new LatLng(-11.898584267272069, -76.66245590739172);
        final LatLng cho_06 = new LatLng(-11.915362764633821, -76.66659568238433);
        final LatLng cho_07 = new LatLng(-11.919067686854278, -76.66603426056109);
        final LatLng cho_08 = new LatLng(-11.920464023192299, -76.6639420938972);
        final LatLng cho_09 = new LatLng(-11.918319365794007, -76.65193214869748);
        final LatLng cho_10 = new LatLng(-11.920009046885886, -76.64921808692876);
        final LatLng cho_11 = new LatLng(-11.91224300925031, -76.61147873110468);
        final LatLng cho_12 = new LatLng(-11.913796534767963, -76.60729481576396);
        final LatLng cho_13 = new LatLng(-11.927597539277457, -76.60875437528036);
        final LatLng cho_14 = new LatLng(-11.926316560543535, -76.61096473110454);
        final LatLng cho_15 = new LatLng(-11.926316560543535, -76.61096473110454);
        final LatLng cho_16 = new LatLng(-11.916008034027278, -76.61549264644539);
        final LatLng cho_17 = new LatLng(-11.923755547407096, -76.63010508692871);
        final LatLng cho_18 = new LatLng(-11.929005545935638, -76.66236135809338);
        final LatLng cho_19 = new LatLng(-11.92899682200261, -76.67827448044292);
        final LatLng cho_20 = new LatLng(-11.935609563282211, -76.68506600226931);
        final LatLng cho_21 = new LatLng(-11.950431087579187, -76.70042945993943);
        final LatLng cho_22 = new LatLng(-11.949402086542532, -76.71046083295059);
        final LatLng cho_23 = new LatLng(-11.951592096239034, -76.7213419176097);
        final LatLng cho_24 = new LatLng(-11.953513067776978, -76.72885208692837);
        final LatLng cho_25 = new LatLng(-11.967021095618525, -76.74472017158745);
        final LatLng cho_26 = new LatLng(-11.963630562995476, -76.75138327343382);
        final LatLng cho_27 = new LatLng(-11.960451831397219, -76.75052656510212);
        final LatLng cho_28 = new LatLng(-11.951792555195482, -76.74796281576363);
        final LatLng cho_29 = new LatLng(-11.951792555195482, -76.74796281576363);
        final LatLng cho_30 = new LatLng(-11.949720057499425, -76.73110735809317);
        final LatLng cho_31 = new LatLng(-11.944682074835915, -76.73471191760977);
        final LatLng cho_32 = new LatLng(-11.943212563214937, -76.73422900226916);
        final LatLng cho_33 = new LatLng(-11.941428065112843, -76.73164327343409);
        final LatLng cho_34 = new LatLng(-11.942057562288262, -76.72609645964401);
        final LatLng cho_35 = new LatLng(-11.946571062398384, -76.7222988157636);
        final LatLng cho_36 = new LatLng(-11.942336326219477, -76.71561837859667);
        final LatLng cho_37 = new LatLng(-11.931540574589828, -76.7202783525459);
        final LatLng cho_38 = new LatLng(-11.930825895285587, -76.71866073139533);
        final LatLng cho_39 = new LatLng(-11.931164710482069, -76.71747971781498);
        final LatLng cho_40 = new LatLng(-11.935665232151043, -76.71266720594791);
        final LatLng cho_41 = new LatLng(-11.939148863010166, -76.70666315977395);
        final LatLng cho_42 = new LatLng(-11.934296931463413, -76.70548967825846);
        final LatLng cho_43 = new LatLng(-11.923587430719016, -76.70275855795973);
        final LatLng cho_44 = new LatLng(-11.926023439480822, -76.70121692685511);
        final LatLng cho_45 = new LatLng(-11.928563500068563, -76.70091700226934);
        final LatLng cho_46 = new LatLng(-11.936656507316922, -76.70108845993953);
        final LatLng cho_47 = new LatLng(-11.92981250598516, -76.69553091748134);

        PolygonOptions cho_loc = new PolygonOptions()
                .add(cho_01)
                .add(cho_02)
                .add(cho_03)
                .add(cho_04)
                .add(cho_05)
                .add(cho_06)
                .add(cho_07)
                .add(cho_08)
                .add(cho_09)
                .add(cho_10)
                .add(cho_11)
                .add(cho_12)
                .add(cho_13)
                .add(cho_14)
                .add(cho_15)
                .add(cho_16)
                .add(cho_17)
                .add(cho_18)
                .add(cho_19)
                .add(cho_20)
                .add(cho_21)
                .add(cho_22)
                .add(cho_23)
                .add(cho_24)
                .add(cho_25)
                .add(cho_26)
                .add(cho_27)
                .add(cho_28)
                .add(cho_29)
                .add(cho_30)
                .add(cho_31)
                .add(cho_32)
                .add(cho_33)
                .add(cho_34)
                .add(cho_35)
                .add(cho_36)
                .add(cho_37)
                .add(cho_38)
                .add(cho_39)
                .add(cho_40)
                .add(cho_41)
                .add(cho_42)
                .add(cho_43)
                .add(cho_44)
                .add(cho_45)
                .add(cho_46)
                .add(cho_47)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon choLoc = mMap.addPolygon(cho_loc);

        // Polígono Local 18, 19 (Completo)     ATE Elvia y Angeles

        final LatLng ate_01 = new LatLng(-12.029721529865595, -76.92684393237471);
        final LatLng ate_02 = new LatLng(-12.023498847936406, -76.94476323896572);
        final LatLng ate_03 = new LatLng(-12.033328553754068, -76.9424310020477);
        final LatLng ate_04 = new LatLng(-12.043633744154077, -76.9378689896117);
        final LatLng ate_05 = new LatLng(-12.043973991464018, -76.93379018877354);
        final LatLng ate_06 = new LatLng(-12.052413477551367, -76.92977761827386);
        final LatLng ate_07 = new LatLng(-12.055253229610319, -76.92711694736072);
        final LatLng ate_08 = new LatLng(-12.052489427868707, -76.92775009698974);
        final LatLng ate_09 = new LatLng(-12.047267871870579, -76.92963784688855);
        final LatLng ate_10 = new LatLng(-12.043917294350164, -76.92619996933693);
        final LatLng ate_11 = new LatLng(-12.042220962422235, -76.92496883294945);
        final LatLng ate_12 = new LatLng(-12.039157120087275, -76.92372473110325);
        final LatLng ate_13 = new LatLng(-12.032019115888355, -76.92647572901062);
        final LatLng ate_14 = new LatLng(-12.028074605590405, -76.92319100226814);
        final LatLng ate_15 = new LatLng(-12.02460708172612, -76.92470754779639);


        PolygonOptions ate_loc = new PolygonOptions()
                .add(ate_01)
                .add(ate_02)
                .add(ate_03)
                .add(ate_04)
                .add(ate_05)
                .add(ate_06)
                .add(ate_07)
                .add(ate_08)
                .add(ate_09)
                .add(ate_10)
                .add(ate_11)
                .add(ate_12)
                .add(ate_13)
                .add(ate_14)
                .add(ate_15)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon ateLoc = mMap.addPolygon(ate_loc);

        // Polígono Local 18 (Completo)

        final LatLng angel_01 = new LatLng(-12.034059405920985, -76.92924131164027);
        final LatLng angel_02 = new LatLng(-12.023498847936406, -76.94476323896572);
        final LatLng angel_03 = new LatLng(-12.033328553754068, -76.9424310020477);
        final LatLng angel_04 = new LatLng(-12.043633744154077, -76.9378689896117);
        final LatLng angel_05 = new LatLng(-12.043973991464018, -76.93379018877354);
        final LatLng angel_06 = new LatLng(-12.052413477551367, -76.92977761827386);
        final LatLng angel_07 = new LatLng(-12.055253229610319, -76.92711694736072);
        final LatLng angel_08 = new LatLng(-12.052489427868707, -76.92775009698974);
        final LatLng angel_09 = new LatLng(-12.047267871870579, -76.92963784688855);
        final LatLng angel_10 = new LatLng(-12.043917294350164, -76.92619996933693);
        final LatLng angel_11 = new LatLng(-12.042220962422235, -76.92496883294945);
        final LatLng angel_12 = new LatLng(-12.039157120087275, -76.92372473110325);
        final LatLng angel_13 = new LatLng(-12.032019115888355, -76.92647572901062);
        final LatLng angel_14 = new LatLng(-12.028074605590405, -76.92319100226814);
        final LatLng angel_15 = new LatLng(-12.02460708172612, -76.92470754779639);


        PolygonOptions angeles_Loc = new PolygonOptions()
                .add(angel_01)
                .add(angel_02)
                .add(angel_03)
                .add(angel_04)
                .add(angel_05)
                .add(angel_06)
                .add(angel_07)
                .add(angel_08)
                .add(angel_09)
                .add(angel_10)
                .add(angel_11)
                .add(angel_12)
                .add(angel_13)
                .add(angel_14)
                .add(angel_15)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon angelesLoc = mMap.addPolygon(angeles_Loc);

        // Polígono Local 30 (Completo)         FLAMENCOS

        final LatLng flame_01 = new LatLng(-12.051782245648587, -76.96447327134028);
        final LatLng flame_02 = new LatLng(-12.057398083492135, -76.97139719124321);
        final LatLng flame_03 = new LatLng(-12.05577040577797, -76.97417345993821);
        final LatLng flame_04 = new LatLng(-12.051028084311755, -76.97670883589925);
        final LatLng flame_05 = new LatLng(-12.04260454241072, -76.98605618877359);
        final LatLng flame_06 = new LatLng(-12.040646890443035, -76.98726421643686);
        final LatLng flame_07 = new LatLng(-12.039686298828041, -76.987048810216);
        final LatLng flame_08 = new LatLng(-12.039394847018642, -76.98458897937819);
        final LatLng flame_09 = new LatLng(-12.040390904816896, -76.9811511145906);
        final LatLng flame_10 = new LatLng(-12.040160541744081, -76.97493327343288);
        final LatLng flame_11 = new LatLng(-12.032656968426137, -76.96472934710927);
        final LatLng flame_12 = new LatLng(-12.02786455797237, -76.96530716604012);
        final LatLng flame_13 = new LatLng(-12.027026324660486, -76.9626975045209);
        final LatLng flame_14 = new LatLng(-12.026451376128698, -76.96289327134029);
        final LatLng flame_15 = new LatLng(-12.025775791138527, -76.96038898812809);
        final LatLng flame_16 = new LatLng(-12.035110206512975, -76.9554111596059);
        final LatLng flame_17 = new LatLng(-12.030873539211935, -76.94317545993852);
        final LatLng flame_18 = new LatLng(-12.043816469494324, -76.93794798877359);

        PolygonOptions flamenco_Loc = new PolygonOptions()
                .add(flame_01)
                .add(flame_02)
                .add(flame_03)
                .add(flame_04)
                .add(flame_05)
                .add(flame_06)
                .add(flame_07)
                .add(flame_08)
                .add(flame_09)
                .add(flame_10)
                .add(flame_11)
                .add(flame_12)
                .add(flame_13)
                .add(flame_14)
                .add(flame_15)
                .add(flame_16)
                .add(flame_17)
                .add(flame_18)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon flamencoLoc = mMap.addPolygon(flamenco_Loc);

        // Polígono Local 38 COVIMA (Completo)

        final LatLng ang_01 = new LatLng(-12.054457497997973, -76.95934561012335);
        final LatLng ang_02 = new LatLng(-12.043142046842314, -76.93034669989883);
        final LatLng ang_03 = new LatLng(-12.044660777139523, -76.93388335254564);
        final LatLng ang_04 = new LatLng(-12.04670149042901, -76.93413590739132);
        final LatLng ang_05 = new LatLng(-12.047199506922626, -76.93581490693873);
        final LatLng ang_06 = new LatLng(-12.062029315154364, -76.9335047276725);
        final LatLng ang_07 = new LatLng(-12.068829008137858, -76.93342618864094);
        final LatLng ang_08 = new LatLng(-12.069940941379725, -76.9369772734326);
        final LatLng ang_09 = new LatLng(-12.075598585587823, -76.935186829004);
        final LatLng ang_10 = new LatLng(-12.07531497433156, -76.93692510411395);
        final LatLng ang_11 = new LatLng(-12.079496482720511, -76.95055145993804);
        final LatLng ang_12 = new LatLng(-12.07693899144209, -76.95401981576207);
        final LatLng ang_13 = new LatLng(-12.062642975332285, -76.96079500226779);
        final LatLng ang_14 = new LatLng(-12.067568057483987, -76.97137881576222);
        final LatLng ang_15 = new LatLng(-12.063230007618063, -76.97118435809192);
        final LatLng ang_16 = new LatLng(-12.058498007250853, -76.97306191760863);
        final LatLng ang_17 = new LatLng(-12.043019079006905, -76.9363116292571);
        final LatLng ang_18 = new LatLng(-12.037927005656563, -76.93157900226804);


        PolygonOptions ang_loc = new PolygonOptions()
                //.add(ang_01)
                .add(ang_02)
                .add(ang_03)
                .add(ang_04)
                .add(ang_05)
                .add(ang_06)
                .add(ang_07)
                .add(ang_08)
                .add(ang_09)
                .add(ang_10)
                .add(ang_11)
                .add(ang_12)
                .add(ang_13)
                .add(ang_14)
                .add(ang_15)
                .add(ang_16)
                .add(ang_17)
                .add(ang_18)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon angLoc = mMap.addPolygon(ang_loc);

        // Polígono Local 42 ANCASH - AGUSTINO (Completo)

        final LatLng ancash_01 = new LatLng(-12.041308492240882, -77.00232400017546);
        final LatLng ancash_02 = new LatLng(-12.034385902580455, -77.00856874195499);
        final LatLng ancash_03 = new LatLng(-12.037657670350827, -77.00597446395366);
        final LatLng ancash_04 = new LatLng(-12.038246846800497, -77.0056358775319);
        final LatLng ancash_05 = new LatLng(-12.041510116965846, -77.0049170455009);
        final LatLng ancash_06 = new LatLng(-12.04461306864287, -77.01235604820732);
        final LatLng ancash_07 = new LatLng(-12.054328642802865, -77.01314587384859);
        final LatLng ancash_08 = new LatLng(-12.049906085254614, -77.00947630812212);
        final LatLng ancash_09 = new LatLng(-12.04183747635384, -77.00473899128498);
        final LatLng ancash_10 = new LatLng(-12.040147005828427, -76.99728327343287);
        final LatLng ancash_11 = new LatLng(-12.04028296272633, -76.99550181576254);
        final LatLng ancash_12 = new LatLng(-12.039359570139412, -76.98853835809219);
        final LatLng ancash_13 = new LatLng(-12.03496351240612, -76.98972891760886);
        final LatLng ancash_14 = new LatLng(-12.029274606385608, -76.99632200226823);
        final LatLng ancash_15 = new LatLng(-12.032740977689643, -77.00621335809225);


        PolygonOptions ancash_loc = new PolygonOptions()
                //.add(ancash_01)
                .add(ancash_02)
                .add(ancash_03)
                .add(ancash_04)
                .add(ancash_05)
                .add(ancash_06)
                .add(ancash_07)
                .add(ancash_08)
                .add(ancash_09)
                .add(ancash_10)
                .add(ancash_11)
                .add(ancash_12)
                .add(ancash_13)
                .add(ancash_14)
                .add(ancash_15)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        // Polígono Local 42 MANCHAY (Completo)

        final LatLng mancha_01 = new LatLng(-12.111582623977457, -76.87288711684407);
        final LatLng mancha_02 = new LatLng(-12.08799779555258, -76.8839142102076);
        final LatLng mancha_03 = new LatLng(-12.086546967788802, -76.88148795717468);
        final LatLng mancha_04 = new LatLng(-12.086150496608404, -76.87854807995328);
        final LatLng mancha_05 = new LatLng(-12.088258973308388, -76.8729118157619);
        final LatLng mancha_06 = new LatLng(-12.098923483359876, -76.87546389495925);
        final LatLng mancha_07 = new LatLng(-12.109573971620971, -76.86840581576172);
        final LatLng mancha_08 = new LatLng(-12.112914302954518, -76.86755719276978);
        final LatLng mancha_09 = new LatLng(-12.114969481304831, -76.87065918877276);
        final LatLng mancha_10 = new LatLng(-12.11686799141542, -76.8701230869265);
        final LatLng mancha_11 = new LatLng(-12.120947872164592, -76.8710064042176);
        final LatLng mancha_12 = new LatLng(-12.128133187766341, -76.86971894374324);
        final LatLng mancha_13 = new LatLng(-12.14880678572276, -76.86821821985669);
        final LatLng mancha_14 = new LatLng(-12.161859015303078, -76.86353408692597);
        final LatLng mancha_15 = new LatLng(-12.17097430175206, -76.86065746325474);
        final LatLng mancha_16 = new LatLng(-12.17354401621761, -76.86186981576104);
        final LatLng mancha_17 = new LatLng(-12.170984966743339, -76.86632218877212);
        final LatLng mancha_18 = new LatLng(-12.152778526194236, -76.87533808692598);
        final LatLng mancha_19 = new LatLng(-12.123960606556846, -76.87511773110235);
        final LatLng mancha_20 = new LatLng(-12.112257111514218, -76.8764712734321);
        final LatLng mancha_21 = new LatLng(-12.103788010770709, -76.87916881576182);
        final LatLng mancha_22 = new LatLng(-12.097232824582292, -76.88361402493157);
        final LatLng mancha_23 = new LatLng(-12.095810771359249, -76.8843761660856);
        final LatLng mancha_24 = new LatLng(-12.095652873140649, -76.88705185884754);
        final LatLng mancha_25 = new LatLng(-12.090675795662847, -76.88325673442002);


        PolygonOptions manchay_Loc = new PolygonOptions()
                .add(mancha_01)
                .add(mancha_02)
                .add(mancha_03)
                .add(mancha_04)
                .add(mancha_05)
                .add(mancha_06)
                .add(mancha_07)
                .add(mancha_08)
                .add(mancha_09)
                .add(mancha_10)
                .add(mancha_11)
                .add(mancha_12)
                .add(mancha_13)
                .add(mancha_14)
                .add(mancha_15)
                .add(mancha_16)
                .add(mancha_17)
                .add(mancha_18)
                .add(mancha_19)
                .add(mancha_20)
                .add(mancha_21)
                .add(mancha_22)
                .add(mancha_23)
                .add(mancha_24)
                .add(mancha_25)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon manchayLoc = mMap.addPolygon(manchay_Loc);

        // Polígono Local 42 SALAMANCA (Completo)

        final LatLng sala_01 = new LatLng(-12.068269868255348, -76.97521800017546);
        final LatLng sala_02 = new LatLng(-12.058753933554762, -76.97348010254304);
        final LatLng sala_03 = new LatLng(-12.062793363993048, -76.97177653450352);
        final LatLng sala_04 = new LatLng(-12.066947925381278, -76.97147307724426);
        final LatLng sala_05 = new LatLng(-12.079144158611552, -76.97638908464236);
        final LatLng sala_06 = new LatLng(-12.084811805385504, -76.98182096958317);
        final LatLng sala_07 = new LatLng(-12.08475245906298, -76.98394517089426);
        final LatLng sala_08 = new LatLng(-12.083565527001868, -76.9842182824276);
        final LatLng sala_09 = new LatLng(-12.063653957065663, -76.99972494908177);
        final LatLng sala_10 = new LatLng(-12.064069191125226, -76.98921621903983);
        final LatLng sala_11 = new LatLng(-12.062919140416263, -76.98191677678123);
        final LatLng sala_12 = new LatLng(-12.060609452725004, -76.97852487258645);

        PolygonOptions sala_Loc = new PolygonOptions()
                .add(sala_01)
                .add(sala_02)
                .add(sala_03)
                .add(sala_04)
                .add(sala_05)
                .add(sala_06)
                .add(sala_07)
                .add(sala_08)
                .add(sala_09)
                .add(sala_10)
                .add(sala_11)
                .add(sala_12)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon salaLoc = mMap.addPolygon(sala_Loc);

        // Polígono Local 42 SALAMANCA (Completo)

        final LatLng elvi_01 = new LatLng(-12.027909999467138, -76.95202636459305);
        final LatLng elvi_02 = new LatLng(-12.035003456562647, -76.95547673080877);
        final LatLng elvi_03 = new LatLng(-12.029047484726977, -76.93496000226811);
        final LatLng elvi_04 = new LatLng(-12.028291969462838, -76.93219392662256);
        final LatLng elvi_05 = new LatLng(-12.027957180216235, -76.93122653092138);
        final LatLng elvi_06 = new LatLng(-12.02763601034588, -76.9269647597932);
        final LatLng elvi_07 = new LatLng(-12.023961498026267, -76.92688273110346);
        final LatLng elvi_08 = new LatLng(-12.023083671062363, -76.93632615653854);
        final LatLng elvi_09 = new LatLng(-12.022813921789039, -76.94189082500793);
        final LatLng elvi_10 = new LatLng(-12.023779928521716, -76.95334980477965);
        final LatLng elvi_11 = new LatLng(-12.025135034483437, -76.95250813364501);
        final LatLng elvi_12 = new LatLng(-12.029811552483014, -76.95750700226816);

        PolygonOptions elvi_Loc = new PolygonOptions()
                .add(elvi_01)
                .add(elvi_02)
                .add(elvi_03)
                .add(elvi_04)
                .add(elvi_05)
                .add(elvi_06)
                .add(elvi_07)
                .add(elvi_08)
                .add(elvi_09)
                .add(elvi_10)
                .add(elvi_11)
                .add(elvi_12)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon elviLoc = mMap.addPolygon(elvi_Loc);

        // Polígono Local 42 AGUSTINO (Completo)

        final LatLng agus_01 = new LatLng(-12.0496294,-76.998208);
        final LatLng agus_02 = new LatLng(-12.046635065876885, -76.99932462896246);
        final LatLng agus_03 = new LatLng(-12.049419323960938, -77.00141015584246);
        final LatLng agus_04 = new LatLng(-12.049860766766463, -77.0008373650617);
        final LatLng agus_05 = new LatLng(-12.049782012989503, -77.00034917835282);
        final LatLng agus_06 = new LatLng(-12.051348736437692, -76.99973208530334);
        final LatLng agus_07 = new LatLng(-12.051737244047942, -76.99792927180889);
        final LatLng agus_08 = new LatLng(-12.05091873646299, -76.99688363622643);
        final LatLng agus_09 = new LatLng(-12.05046196753363, -76.99685727180888);
        final LatLng agus_10 = new LatLng(-12.050310013021006, -76.99642281413848);
        final LatLng agus_11 = new LatLng(-12.04760246051124, -76.99700263622645);

        PolygonOptions agus_Loc = new PolygonOptions()
                .add(agus_01)
                .add(agus_02)
                .add(agus_03)
                .add(agus_04)
                .add(agus_05)
                .add(agus_06)
                .add(agus_07)
                .add(agus_08)
                .add(agus_09)
                .add(agus_10)
                .add(agus_11)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon agusLoc = mMap.addPolygon(agus_Loc);


        // Posición de Cámara principal
        CameraPosition camera = new CameraPosition.Builder()
                .target(local21)
                .zoom(11)
                .bearing(90)
                .tilt(30)
                .build();

        //mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).anchor(0.0f,1.0f).position(francisco));

        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(camera));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(pizzeria));

    }


}


