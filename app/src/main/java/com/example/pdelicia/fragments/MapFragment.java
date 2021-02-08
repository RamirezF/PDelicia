package com.example.pdelicia.fragments;

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
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.pdelicia.MainActivity;
import com.example.pdelicia.R;
import com.example.pdelicia.activities.PrincipalActivity;
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
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gMap = googleMap;
        pizzeriaDelicia(googleMap);
    }

    private MapFragment getMapFragment() {
        return this;
    }

    private void getMap() {
        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        }
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setMyLocationButtonEnabled (true);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSION_ACCESS_FINE_LOCATION: {
                // Si el usuario acepta los permisos
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    getMap();
                } else {
                    // Si el usuario no brinda los permisos                                                                                 ********************************
                    Toast.makeText(getActivity(), "Permiso denegado", Toast.LENGTH_SHORT).show();
                }
                return;
            }
        }
    }


    // Para vel el GPS si está ACTIVADO O NO
    private boolean isGPSEnable()
    {
        try {
            int gpsSignal = Settings.Secure.getInt(getActivity().getContentResolver(), Settings.Secure.LOCATION_MODE);                                    // Para el GPS
            if(gpsSignal == 0) {
                return false;
            } else {
                return true;
            }
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void showInfoAlert()
    {
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
                }).setNegativeButton("CANCEL",null)
                .show();
    }

    @Override
    public void onClick(View v) {
        if (!this.isGPSEnable())
        {
            showInfoAlert();
        }
    }

    public void pizzeriaDelicia(GoogleMap googleMap) {
        mMap = googleMap;

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

        // Polígonos Locales

        final LatLng poli1 = new LatLng(-12.064418286172712,-77.037570476532);
        final LatLng poli2 = new LatLng(-12.057283719194741,-77.03184127807617);
        final LatLng poli3 = new LatLng(-12.066432717772722,-77.02360153198244);
        final LatLng poli4 = new LatLng(-12.06979007012731,-77.03647613525392);

        PolygonOptions laland = new PolygonOptions()
                .add(poli1)
                .add(poli2)
                .add(poli3)
                .add(poli4)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon actores = mMap.addPolygon(laland);

        // Polígono 2

        final LatLng poli5 = new LatLng(-12.070713334650542,-77.03154087066652);
        final LatLng poli6 = new LatLng(-12.067775663761807,-77.00961112976076);
        final LatLng poli7 = new LatLng(-12.078225232272883,-77.01046943664552);
        final LatLng poli8 = new LatLng(-12.08334495235437,-77.03261375427248);

        PolygonOptions laland1 = new PolygonOptions()
                .add(poli5)
                .add(poli6)
                .add(poli7)
                .add(poli8)
                .fillColor(0x330fff00).strokeColor(Color.GREEN).strokeWidth(3);

        Polygon actoress = mMap.addPolygon(laland1);

        // Polígono 3

        final LatLng poli9 = new LatLng(-12.056822064205187,-77.01441764831544);
        final LatLng poli10 = new LatLng(-12.059298204396145,-77.02991008758546);
        final LatLng poli11 = new LatLng(-12.048805928196956,-77.03909397125246);
        final LatLng poli12 = new LatLng(-12.042594307398083,-77.01141357421876);
        final LatLng poli13 = new LatLng(-12.052709102867727,-77.00351715087892);

        PolygonOptions laland2 = new PolygonOptions()
                .add(poli9)
                .add(poli10)
                .add(poli11)
                .add(poli12)
                .add(poli13)
                .fillColor(0x330013ff).strokeColor(Color.BLUE).strokeWidth(3);

        Polygon actoresss = mMap.addPolygon(laland2);


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


