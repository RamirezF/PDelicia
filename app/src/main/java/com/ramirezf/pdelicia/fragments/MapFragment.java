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

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.model.Marker;
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
    int color_Red = 0x33FF0000;
    private static final int MY_PERMISSION_ACCESS_FINE_LOCATION = 1;
    private View rootView;
    private MapView mapView;
    private GoogleMap gMap;
    private GoogleMap mMap;
    private MarkerOptions marker;
    private FloatingActionButton btn_frisco;

    // MarkerOptions
    private MarkerOptions cmarker;
    private MarkerOptions campoy;
    private MarkerOptions local01;
    private MarkerOptions local02;
    private MarkerOptions local03;
    private MarkerOptions local04;
    private MarkerOptions local05;
    private MarkerOptions local06;
    private MarkerOptions local07;
    private MarkerOptions local08;
    private MarkerOptions local09;
    private MarkerOptions local10;
    private MarkerOptions local11;
    private MarkerOptions local12;
    private MarkerOptions local13;
    private MarkerOptions local14;
    private MarkerOptions local15;
    private MarkerOptions local16;
    private MarkerOptions local17;
    private MarkerOptions local18;
    private MarkerOptions local19;
    private MarkerOptions local20;
    private MarkerOptions local21;
    private MarkerOptions local22;
    private MarkerOptions local25;
    private MarkerOptions local26;
    private MarkerOptions local27;
    private MarkerOptions local28;
    private MarkerOptions local29;
    private MarkerOptions local30;


    // Marker
    private Marker chosica_marker;
    private Marker campoy_marker;
    private Marker local01_marker;
    private Marker local02_marker;
    private Marker local03_marker;
    private Marker local04_marker;
    private Marker local05_marker;
    private Marker local06_marker;
    private Marker local07_marker;
    private Marker local08_marker;
    private Marker local09_marker;
    private Marker local10_marker;
    private Marker local11_marker;
    private Marker local12_marker;
    private Marker local13_marker;
    private Marker local14_marker;
    private Marker local15_marker;
    private Marker local16_marker;
    private Marker local17_marker;
    private Marker local18_marker;
    private Marker local19_marker;
    private Marker local20_marker;
    private Marker local21_marker;
    private Marker local22_marker;
    private Marker local25_marker;
    private Marker local26_marker;
    private Marker local27_marker;
    private Marker local28_marker;
    private Marker local29_marker;
    private Marker local30_marker;
    // Polygon
    private Polygon choLoc;
    private Polygon campoyLoc;
    private Polygon local01Loc;
    private Polygon local02Loc;
    private Polygon local03Loc;
    private Polygon local04Loc;
    private Polygon local05Loc;
    private Polygon local06Loc;
    private Polygon local07Loc;
    private Polygon local08Loc;
    private Polygon local09Loc;
    private Polygon local10Loc;
    private Polygon local11Loc;
    private Polygon local12Loc;
    private Polygon local13Loc;
    private Polygon local14Loc;
    private Polygon local15Loc;
    private Polygon local16Loc;
    private Polygon local17Loc;
    private Polygon local18Loc;
    private Polygon local19Loc;
    private Polygon local20Loc;
    private Polygon local21Loc;
    private Polygon local22Loc;
    private Polygon local25Loc;
    private Polygon local26Loc;
    private Polygon local27Loc;
    private Polygon local28Loc;
    private Polygon local29Loc;
    private Polygon local30Loc;
    public MapFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
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
        // Locales
        ChosicaMap(googleMap);
        campoyMap(googleMap);
        lurinMap(googleMap);
        local02Map(googleMap);
        local03Map(googleMap);
        local04Map(googleMap);
        local05Map(googleMap);
        local06Map(googleMap);
        local07Map(googleMap);
        local08Map(googleMap);
        local09Map(googleMap);
        local10Map(googleMap);
        local11Map(googleMap);
        local12Map(googleMap);
        local13Map(googleMap);
        local14Map(googleMap);
        local15Map(googleMap);
        local16Map(googleMap);
        local17Map(googleMap);
        local18Map(googleMap);
        local19Map(googleMap);
        local20Map(googleMap);
        local21Map(googleMap);
        local22Map(googleMap);
        local25Map(googleMap);
        local26Map(googleMap);
        local27Map(googleMap);
        local28Map(googleMap);
        local29Map(googleMap);
        local30Map(googleMap);
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

    public void setLocationKnow() {
        if (Build.VERSION.SDK_INT >= 23) {
            if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(getActivity(), new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, MY_PERMISSION_ACCESS_FINE_LOCATION);
                return;
            } else {
                getMap();
            }
        } else {
            getMap();
        }

        gMap.getUiSettings().setZoomControlsEnabled(false);
        gMap.getUiSettings().setMyLocationButtonEnabled(true);
    }

    public void pizzeriaFrisco(GoogleMap googleMap) {
        mMap = googleMap;
        /*
        // Locales
        final LatLng local01 = new LatLng(-12.275135117790825, -76.87049838784992);          //     Jr. Castilla N° 280 LURÍN
        final LatLng local02 = new LatLng(-12.015347929575498, -77.09403878938531);          //     Urb. Chávez Mz L lt 29 2da Etapa (Dominicos)
        final LatLng local03 = new LatLng(-11.890411417756997, -77.06855592068621);          //     Asoc. de Vivienda Cruz de Motupe Mz. J Lt. 25 (Paradero Establo)
        final LatLng local04 = new LatLng(-11.979748861746241, -76.90595133991687);          //     LURIGANCHO, CHOSICA - Cajamarquilla
        final LatLng local05 = new LatLng(-12.016473502097616, -76.98471346472935);                          //     SAN JUAN DE LURIGANCHO - Jr Killke                                      Excel Datos
        final LatLng local06 = new LatLng(-12.0402778,-76.9201054);                          //     ATE - Las Garzas de Ate                                                 Excel Datos
        final LatLng local07 = new LatLng(-12.0338611,-76.9154109);                          //     ATE - Santa Rosa de Valle                                               Excel Datos
        final LatLng local08 = new LatLng(-11.9559444,-77.054022);                           //     COMAS - Boulevar España                                                 Excel Datos
        final LatLng local09 = new LatLng(-11.9643333,-77.0943276);                          //     SAN MARTÍN DE PORRES - Vipol de Naranjal                                Excel Datos
        final LatLng local10 = new LatLng(-12.074031542415241, -77.00847702886605);          //     LA VICTORIA - Apolo


        final LatLng local11 = new LatLng(-12.081047339313274, -77.01725123347701);          //     LA VICTORIA - Gral ANtonio de la Guerra
        final LatLng local12 = new LatLng(-11.992188774968882, -76.82175781998149);          //     CHACLACAYO - Huascata
        final LatLng local13 = new LatLng(-11.985258248696661, -76.83210924267368);          //     LURIGANCHO - ÑAÑA
        final LatLng local14 = new LatLng(-11.992164615421363, -76.91830868751566);          //     HUACHIPA - Nievería
        final LatLng local15 = new LatLng(-12.017001396291684, -76.91662882841742);          //     HUACHIPA - Santa María

        final LatLng local16 = new LatLng(-12.024919177128233, -76.9199059743698);           //     ATE - Calle Nueva
        final LatLng local17 = new LatLng(-12.035328570906081, -76.90462357686629);          //     ATE - Residencial Las Américas
        final LatLng local18 = new LatLng(-12.034059405920985, -76.92924131164027);          //     ATE - Arco los Ángeles
        final LatLng local19 = new LatLng(-12.029721529865595, -76.92684393237471);          //     ATE - Asoc. El Porvenir - (H. Solidaridad)
        final LatLng local20 = new LatLng(-12.043440758816804, -76.97970122806369);          //     SANTA ANITA - Universal

        final LatLng local21 = new LatLng(-12.03057827906478, -76.96170461848178);           //     EL AGUSTINO - Las Praderas de S. A.
        final LatLng local22 = new LatLng(-11.97497287349915, -76.76823011678594);           //     CHACLACAYO - Nicolas Ayllón
        //final LatLng local23 = new LatLng(-11.92580746725925, -76.68585551121954);           //     CHOSICA
        //final LatLng local24 = new LatLng(-12.024076387091215, -76.97699645338558);          //     CAMPOY
        final LatLng local25 = new LatLng(-12.00315408863745, -76.87487700950041);           //     CARAPONGO   1
        final LatLng local26 = new LatLng(-12.010114660998658, -76.85282366809392);          //     ATE - Gloria Grande
        final LatLng local27 = new LatLng(-12.0453056,-76.8929665);                          //     ATE - Priale                                                                        Excel Datos
        final LatLng local28 = new LatLng(-12.020449767580827, -76.89039976296671);          //     ATE - Santa Clara, San Martín
        final LatLng local29 = new LatLng(-12.015921297550893, -76.88288248419425);          //     ATE - Santa Clara, Bolívar
        final LatLng local30 = new LatLng(-12.045854831823023, -76.97387102281945);          //     SANTA ANITA BOLOGNESI
        */
        final LatLng local31 = new LatLng(-12.051906396849326, -76.97883616342347);          //     SANTA ANITA - Puente Azul
        final LatLng local32 = new LatLng(-12.04726976832986, -76.98244111026835);           //     SANTA ANITA - Nocheto
        final LatLng local33 = new LatLng(-12.003282293082178, -77.00293845767071);          //     SAN JUAN DE LURIGANCHO - Las Flores
        final LatLng local34 = new LatLng(-11.971012634513713, -77.00517139076717);          //     SAN JUAN DE LURIGANCHO - Cto Grande
        final LatLng local35 = new LatLng(-12.005677310855603, -77.09932629978633);          //     CALLAO - Los Nardos
        final LatLng local36 = new LatLng(-11.99662035205114, -77.11391887911988);           //     SAN MARTÍN DE PORRES - Entrada Cond. CIudad Nueva
        final LatLng local37 = new LatLng(-12.020471494738635, -76.90037925330297);          //     ATE - La Cruz
        final LatLng local38 = new LatLng(-12.054457497997973, -76.95934561012335);          //     ATE - Jr. La Unión
        final LatLng local39 = new LatLng(-12.068269868255348, -76.97521800017546);          //     ATE - Salamanca
        final LatLng local40 = new LatLng(-12.027909999467138, -76.95202636459305);          //     ATE - Santa Elvira
        final LatLng local41 = new LatLng(-12.051782245648587, -76.96447327134028);          //     SANTA ANITA - Flamencos
        final LatLng local42 = new LatLng(-12.041308492240882, -77.00232400017546);          //     Ancash El AGUSTINO
        final LatLng local43 = new LatLng(-12.04028729136067, -76.99746481907955);           //     AGUSTINO CATALAN // Riva Aguero
        final LatLng local44 = new LatLng(-12.111582623977457, -76.87288711684407);          //     Manchay 3 Marías
        final LatLng local45 = new LatLng(-12.095092801112484, -76.88471465091841);          //     MANCHAY - Portada 3
       // NUEVOS
        final LatLng local46 = new LatLng(-12.0496294,-76.998208);                           //     NUEVA SEDE AGUSTINO
        final LatLng local47 = new LatLng(-12.00092513861642, -76.85345509253041);           //     CARAPONGO 2 Gisela
        final LatLng local48 = new LatLng(-12.029922654926871, -76.88703332946335);          //     MANYLSA
        final LatLng local49 = new LatLng(-12.045278114790346, -76.8907195014362);           //     ATE - Priale





        // Local31
        marker = new MarkerOptions();
        marker.position(local31);
        marker.title("La Delicia - SANTA ANITA - Puente Azul");
        marker.snippet("Telf: 01 704 6539 / 912 578 562");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local32
        marker = new MarkerOptions();
        marker.position(local32);
        marker.title("La Delicia - SANTA ANITA - Nocheto");
        marker.snippet("Telef: 01 496 8357 / 957 432 579");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local33
        marker = new MarkerOptions();
        marker.position(local33);
        marker.title("La Delicia - SAN JUAN DE LURIGANCHO - Las Flores");
        marker.snippet("Telf: 01 633 7460 / 912 465 143");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local34
        marker = new MarkerOptions();
        marker.position(local34);
        marker.title("La Delicia - SAN JUAN DE LURIGANCHO - Cto Grande");
        marker.snippet("Telf: 01 763 5657 / 940 117 088");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local35
        marker = new MarkerOptions();
        marker.position(local35);
        marker.title("La Delicia - CALLAO - Los Nardos");
        marker.snippet("Tel: 01 777 1448 / 912 095 642");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local36
        marker = new MarkerOptions();
        marker.position(local36);
        marker.title("La Delicia - SAN MARTÍN DE PORRES - Entrada Ciudad Nueva");
        marker.snippet("Telf: 01 312 9179 / 950 184 389");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local37
        marker = new MarkerOptions();
        marker.position(local37);
        marker.title("La Delicia - ATE - La Cruz");
        marker.snippet("Telf: Muy pronto...");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local38
        marker = new MarkerOptions();
        marker.position(local38);
        marker.title("La Delicia - ATE - Jr. La Unión");
        marker.snippet("Telf: 01 3483 321 / 942 321 386");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local39
        marker = new MarkerOptions();
        marker.position(local39);
        marker.title("La Delicia - ATE - Salamanca");
        marker.snippet("Telf: 01 775 7351 / 951 788 322");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local40
        marker = new MarkerOptions();
        marker.position(local40);
        marker.title("La Delicia - Santa Elvira");
        marker.snippet("Telf: 01 774 7545 / 973 030 881");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local41
        marker = new MarkerOptions();
        marker.position(local41);
        marker.title("La Delicia - Santa Anita - Flamencos");
        marker.snippet("Telf: 01 362 8106 / 978 740 659");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local42
        marker = new MarkerOptions();
        marker.position(local42);
        marker.title("La Delicia - EL AGUSTINO - Ancash");
        marker.snippet("Telf: 01 281 9505 / 924 282 452");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local43
        marker = new MarkerOptions();
        marker.position(local43);
        marker.title("La Delicia - EL AGUSTINO - Catalan");
        marker.snippet("Telf: 01 684 2912 / 991 708 177");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local44
        marker = new MarkerOptions();
        marker.position(local44);
        marker.title("La Delicia - Manchay - 3 Marías");
        marker.snippet("Telf: 01 691 9034 / 963 792 745");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local45
        marker = new MarkerOptions();
        marker.position(local45);
        marker.title("La Delicia - MANCHAY - Portada 3");
        marker.snippet("Telf: 01 405 4839 / 993 600 986");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Locales Nuevos                                                                                                                   NUEVOS

        // Local46
        marker = new MarkerOptions();
        marker.position(local46);
        marker.title("La Delicia - El AGUSTINO - Nuevo!!");
        marker.snippet("Muy Pronto");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local47
        marker = new MarkerOptions();
        marker.position(local47);
        marker.title("La Delicia - CARAPONGO - Nuevo Horizonte");
        marker.snippet("Telf: 983 435 046");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Local48                                                                                      SIN TELÉFONO NI CELULAR
        marker = new MarkerOptions();
        marker.position(local48);
        marker.title("La Delicia - MANYLSA");
        marker.snippet("Telf: (Muy Pronto)");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);







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
                //.add(angel_01)
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



        // Polígono Local 38 LA UNIÓN
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

        // Polígono Local 42 ANCASH - AGUSTINO (Completo) // POR DEFINIR
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

        // Polígono Local 44 MANCHAY (Completo)
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
                //.add(mancha_01)
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

        // Polígono Local 43 EL AGUSTINO - CATALAN HERMES
        final LatLng aleg_01 = new LatLng(-12.041775741038883, -77.00456354791474);
        final LatLng aleg_02 = new LatLng(-12.046870469134223, -77.00303154459759);
        final LatLng aleg_03 = new LatLng(-12.049512989225867, -77.00674309953604);
        final LatLng aleg_04 = new LatLng(-12.04649572500712, -77.0084233511182);
        final LatLng aleg_05 = new LatLng(-12.046858012751715, -77.00921218714964);
        final LatLng aleg_06 = new LatLng(-12.050148311201234, -77.00952814869667);
        final LatLng aleg_07 = new LatLng(-12.055055960454094, -77.01327610394213);
        final LatLng aleg_08 = new LatLng(-12.059367959729364, -77.00763300226787);
        final LatLng aleg_09 = new LatLng(-12.05494205354007, -77.00421900226797);
        final LatLng aleg_10 = new LatLng(-12.055445604053824, -77.00286270477072);
        final LatLng aleg_11 = new LatLng(-12.05398303834571, -77.00158698812801);
        final LatLng aleg_12 = new LatLng(-12.053710490153835, -77.00211808530331);
        final LatLng aleg_13 = new LatLng(-12.051176259282464, -77.00047072947919);
        final LatLng aleg_14 = new LatLng(-12.04939804312453, -77.00132872947924);
        final LatLng aleg_15 = new LatLng(-12.044053035470128, -76.99767581576246);
        final LatLng aleg_16 = new LatLng(-12.04032440380598, -76.99746120635113);

        PolygonOptions elagus_Loc = new PolygonOptions()
                .add(aleg_01)
                .add(aleg_01)
                .add(aleg_02)
                .add(aleg_03)
                .add(aleg_04)
                .add(aleg_05)
                .add(aleg_06)
                .add(aleg_07)
                .add(aleg_08)
                .add(aleg_09)
                .add(aleg_10)
                .add(aleg_11)
                .add(aleg_12)
                .add(aleg_13)
                .add(aleg_14)
                .add(aleg_15)
                .add(aleg_16)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon elagusLoc = mMap.addPolygon(elagus_Loc);

        // Polígono Local 39 SALAMANCA (Completo)
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
                //.add(sala_01)
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

        // Polígono Local 42 SALAMANCA (Completo)                                                       POR VERSE
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
                //.add(elvi_01)
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

        // Polígono Sin Local - NUEVO HERMES
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
                //.add(agus_01)
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

        // Polígono Local 35 - CALLAO Nardos
        final LatLng callao_01 = new LatLng(-12.021732155791804, -77.1059505868092);
        final LatLng callao_02 = new LatLng(-12.01970940520341, -77.10146505805001);
        final LatLng callao_03 = new LatLng(-12.01674113399767, -77.09821339711239);
        final LatLng callao_04 = new LatLng(-12.013349025089894, -77.0951640897863);
        final LatLng callao_05 = new LatLng(-12.012265349717092, -77.09253879860057);
        final LatLng callao_06 = new LatLng(-12.011605734651669, -77.09008203833514);
        final LatLng callao_07 = new LatLng(-12.006964709971003, -77.08408479209633);
        final LatLng callao_08 = new LatLng(-12.00656422824638, -77.08283232968165);
        final LatLng callao_09 = new LatLng(-12.006297100545137, -77.08221922733289);
        final LatLng callao_10 = new LatLng(-11.99665371059509, -77.0845581538364);
        final LatLng callao_11 = new LatLng(-11.995446931833058, -77.08410561523864);
        final LatLng callao_12 = new LatLng(-11.99154103977366, -77.0818026591946);
        final LatLng callao_13 = new LatLng(-11.990810304176605, -77.09283768143331);
        final LatLng callao_14 = new LatLng(-11.989041070262639, -77.10549890427043);
        final LatLng callao_15 = new LatLng(-12.00087138351484, -77.11670675544639);
        final LatLng callao_16 = new LatLng(-12.001768432144637, -77.11607517145042);
        final LatLng callao_17 = new LatLng(-12.002703378549747, -77.11559727055084);

        PolygonOptions callao_Loc = new PolygonOptions()
                .add(callao_01)
                .add(callao_02)
                .add(callao_03)
                .add(callao_04)
                .add(callao_05)
                .add(callao_06)
                .add(callao_07)
                .add(callao_08)
                .add(callao_09)
                .add(callao_10)
                .add(callao_11)
                .add(callao_12)
                .add(callao_13)
                .add(callao_14)
                .add(callao_15)
                .add(callao_16)
                .add(callao_17)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon callaoLoc = mMap.addPolygon(callao_Loc);



        // CARAPONGO 2, Gisela
        final LatLng carapongo2_01 = new LatLng(-11.997274463955959, -76.84553025624646);
        final LatLng carapongo2_02 = new LatLng(-11.999415331649484, -76.84233306336351);
        final LatLng carapongo2_03 = new LatLng(-12.0028364869597, -76.84759019261297);
        final LatLng carapongo2_04 = new LatLng(-12.003560590943417, -76.85000418071405);
        final LatLng carapongo2_05 = new LatLng(-12.004777448025795, -76.85227203280877);
        final LatLng carapongo2_06 = new LatLng(-12.00610521240137, -76.86185894753069);
        final LatLng carapongo2_07 = new LatLng(-12.007400930287577, -76.86978305115346);
        final LatLng carapongo2_08 = new LatLng(-12.007330254927748, -76.87214342230914);
        final LatLng carapongo2_09 = new LatLng(-12.006474260828123, -76.87249658442109);
        final LatLng carapongo2_10 = new LatLng(-11.999633126566474, -76.87257848268733);
        final LatLng carapongo2_11 = new LatLng(-11.998453836503788, -76.87335008706829);
        final LatLng carapongo2_12 = new LatLng(-11.995749311906605, -76.87442711806158);
        final LatLng carapongo2_13 = new LatLng(-11.992981863222766, -76.87326971164612);
        final LatLng carapongo2_14 = new LatLng(-11.992227099546495, -76.87253025763172);
        final LatLng carapongo2_15 = new LatLng(-11.992368617889262, -76.87166220280132);
        final LatLng carapongo2_16 = new LatLng(-11.991582403934313, -76.87140500137006);
        final LatLng carapongo2_17 = new LatLng(-11.991110674461407, -76.87082629814981);
        final LatLng carapongo2_18 = new LatLng(-11.99016721304091, -76.87061732198691);
        final LatLng carapongo2_19 = new LatLng(-11.990387354272555, -76.86891336234774);
        final LatLng carapongo2_20 = new LatLng(-11.98483659397718, -76.86737015376033);
        final LatLng carapongo2_21 = new LatLng(-11.984066082815907, -76.86487851489527);
        final LatLng carapongo2_22 = new LatLng(-11.98645623271611, -76.86483028962691);
        final LatLng carapongo2_23 = new LatLng(-11.989097952714147, -76.86483028962691);
        final LatLng carapongo2_24 = new LatLng(-11.989428165916353, -76.86370503321604);
        final LatLng carapongo2_25 = new LatLng(-11.995466278666617, -76.86439626193297);
        final LatLng carapongo2_26 = new LatLng(-11.998768314372684, -76.86306202933798);
        final LatLng carapongo2_27 = new LatLng(-11.998768314393, -76.85796622549685);
        final LatLng carapongo2_28 = new LatLng(-11.998752590501407, -76.85627834078731);
        final LatLng carapongo2_29 = new LatLng(-11.996221033235178, -76.85640694155447);
        final LatLng carapongo2_30 = new LatLng(-11.995637650331442, -76.8562538964633);
        final LatLng carapongo2_31 = new LatLng(-11.995097512503328, -76.85563158111849);
        final LatLng carapongo2_32 = new LatLng(-11.995046070748993, -76.85418535531717);
        final LatLng carapongo2_33 = new LatLng(-11.99216531684564, -76.85464990057456);
        final LatLng carapongo2_34 = new LatLng(-11.988521461977726, -76.85396623004445);
        final LatLng carapongo2_35 = new LatLng(-11.98847859280471, -76.85311602457337);
        final LatLng carapongo2_36 = new LatLng(-11.992456823046075, -76.85122278352438);
        final LatLng carapongo2_37 = new LatLng(-11.995371868382172, -76.85066182294054);
        final LatLng carapongo2_38 = new LatLng(-11.997789617343962, -76.8498116173542);
        final LatLng carapongo2_39 = new LatLng(-11.99766958776695, -76.84755024610122);

        PolygonOptions carap2_Loc = new PolygonOptions()
                .add(carapongo2_01)
                .add(carapongo2_02)
                .add(carapongo2_03)
                .add(carapongo2_04)
                .add(carapongo2_05)
                .add(carapongo2_06)
                .add(carapongo2_07)
                .add(carapongo2_08)
                .add(carapongo2_09)
                .add(carapongo2_10)
                .add(carapongo2_11)
                .add(carapongo2_12)
                .add(carapongo2_13)
                .add(carapongo2_14)
                .add(carapongo2_15)
                .add(carapongo2_16)
                .add(carapongo2_17)
                .add(carapongo2_18)
                .add(carapongo2_19)
                .add(carapongo2_20)
                .add(carapongo2_21)
                .add(carapongo2_22)
                .add(carapongo2_23)
                .add(carapongo2_24)
                .add(carapongo2_25)
                .add(carapongo2_26)
                .add(carapongo2_27)
                .add(carapongo2_28)
                .add(carapongo2_29)
                .add(carapongo2_30)
                .add(carapongo2_31)
                .add(carapongo2_32)
                .add(carapongo2_33)
                .add(carapongo2_34)
                .add(carapongo2_35)
                .add(carapongo2_36)
                .add(carapongo2_37)
                .add(carapongo2_38)
                .add(carapongo2_39)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon carap2Loc = mMap.addPolygon(carap2_Loc);

        // LOCAL NUEVO MANYLSA
        final LatLng manylsa_01 = new LatLng(-12.028630629924388, -76.88586295541057);
        final LatLng manylsa_02 = new LatLng(-12.028842324543634, -76.88529551143684);
        final LatLng manylsa_03 = new LatLng(-12.028293060157297, -76.8848743174653);
        final LatLng manylsa_04 = new LatLng(-12.029431619856743, -76.88240562024322);
        final LatLng manylsa_05 = new LatLng(-12.0320184688722, -76.87746176933494);
        final LatLng manylsa_06 = new LatLng(-12.032847420766503, -76.87345991136819);
        final LatLng manylsa_07 = new LatLng(-12.032217824431628, -76.8698764850235);
        final LatLng manylsa_08 = new LatLng(-12.031441311207834, -76.8681491398362);
        final LatLng manylsa_09 = new LatLng(-12.03005621363736, -76.86423313692647);
        final LatLng manylsa_10 = new LatLng(-12.030769740628063, -76.86362158143395);
        final LatLng manylsa_11 = new LatLng(-12.03129441120386, -76.86438332658271);
        final LatLng manylsa_12 = new LatLng(-12.031850565187199, -76.86603556786798);
        final LatLng manylsa_13 = new LatLng(-12.032312268192593, -76.8669046030767);
        final LatLng manylsa_14 = new LatLng(-12.032784459373683, -76.86672221008413);
        final LatLng manylsa_15 = new LatLng(-12.03319368455237, -76.86532744844226);
        final LatLng manylsa_16 = new LatLng(-12.03359241451311, -76.86485537582922);
        final LatLng manylsa_17 = new LatLng(-12.034201021536923, -76.86530598412526);
        final LatLng manylsa_18 = new LatLng(-12.033980673586315, -76.8666471034874);
        final LatLng manylsa_19 = new LatLng(-12.03348749916313, -76.86842810150523);
        final LatLng manylsa_20 = new LatLng(-12.033844263153881, -76.86942589001285);
        final LatLng manylsa_21 = new LatLng(-12.034694205046895, -76.87012327733736);
        final LatLng manylsa_22 = new LatLng(-12.034736175212553, -76.87054170768353);
        final LatLng manylsa_23 = new LatLng(-12.034201021025373, -76.87092794420923);
        final LatLng manylsa_24 = new LatLng(-12.0345053261408, -76.87164675472447);
        final LatLng manylsa_25 = new LatLng(-12.033781304358694, -76.87528382665019);
        final LatLng manylsa_26 = new LatLng(-12.033760319518398, -76.87832008634373);
        final LatLng manylsa_27 = new LatLng(-12.033372047295565, -76.88107741220158);
        final LatLng manylsa_28 = new LatLng(-12.0340436027019, -76.88148510997276);
        final LatLng manylsa_29 = new LatLng(-12.035008961331007, -76.8824507150773);
        final LatLng manylsa_30 = new LatLng(-12.035197842397757, -76.88060474281272);
        final LatLng manylsa_31 = new LatLng(-12.03544442766121, -76.88004147794578);
        final LatLng manylsa_32 = new LatLng(-12.035900874455514, -76.88019168097019);
        final LatLng manylsa_33 = new LatLng(-12.036425521812209, -76.87890422467025);
        final LatLng manylsa_34 = new LatLng(-12.036441255783089, -76.87793863022137);
        final LatLng manylsa_35 = new LatLng(-12.036902944422147, -76.87778842346431);
        final LatLng manylsa_36 = new LatLng(-12.03712329690823, -76.87787425296679);
        final LatLng manylsa_37 = new LatLng(-12.03742234758575, -76.87816929502499);
        final LatLng manylsa_38 = new LatLng(-12.037679425060096, -76.8782551244833);
        final LatLng manylsa_39 = new LatLng(-12.038036180723736, -76.87748264068927);
        final LatLng manylsa_40 = new LatLng(-12.037838274035956, -76.87711111948053);
        final LatLng manylsa_41 = new LatLng(-12.038068940115464, -76.87625614948604);
        final LatLng manylsa_42 = new LatLng(-12.037232754793905, -76.87416295166075);
        final LatLng manylsa_43 = new LatLng(-12.037275997279304, -76.87357331577769);
        final LatLng manylsa_44 = new LatLng(-12.038948331171335, -76.87307210228573);
        final LatLng manylsa_45 = new LatLng(-12.03972683224697, -76.87290993908012);
        final LatLng manylsa_46 = new LatLng(-12.040015167601116, -76.87248388538572);
        final LatLng manylsa_47 = new LatLng(-12.04050533082131, -76.87242491653338);
        final LatLng manylsa_48 = new LatLng(-12.04092341552307, -76.8727344713516);
        final LatLng manylsa_49 = new LatLng(-12.041298244964624, -76.872616539835);
        final LatLng manylsa_50 = new LatLng(-12.04187490146458, -76.87211533965399);
        final LatLng manylsa_51 = new LatLng(-12.043403072937279, -76.8736631285731);
        final LatLng manylsa_52 = new LatLng(-12.04405181724125, -76.87344200662133);
        final LatLng manylsa_53 = new LatLng(-12.044642889947362, -76.87249856807135);
        final LatLng manylsa_54 = new LatLng(-12.044974473575536, -76.87266071594027);
        final LatLng manylsa_55 = new LatLng(-12.045594391596158, -76.87302923683549);
        final LatLng manylsa_56 = new LatLng(-12.045046920024745, -76.87403134749893);
        final LatLng manylsa_57 = new LatLng(-12.044623558229501, -76.87439537302632);
        final LatLng manylsa_58 = new LatLng(-12.044315658716398, -76.87459214314205);
        final LatLng manylsa_59 = new LatLng(-12.043411204243467, -76.8752709957274);
        final LatLng manylsa_60 = new LatLng(-12.042968598758243, -76.87529067255386);
        final LatLng manylsa_61 = new LatLng(-12.042402779414175, -76.87497265649594);
        final LatLng manylsa_62 = new LatLng(-12.041820432734752, -76.87570221565974);
        final LatLng manylsa_63 = new LatLng(-12.041453185986974, -76.87602944349035);
        final LatLng manylsa_64 = new LatLng(-12.04136399516769, -76.87652833275284);
        final LatLng manylsa_65 = new LatLng(-12.042339819501011, -76.87657661651255);
        final LatLng manylsa_66 = new LatLng(-12.042586397852977, -76.87672145730477);
        final LatLng manylsa_67 = new LatLng(-12.04252868511372, -76.87714524725158);
        final LatLng manylsa_68 = new LatLng(-12.041783699990859, -76.87721498001771);
        final LatLng manylsa_69 = new LatLng(-12.041673530516352, -76.87764413426584);
        final LatLng manylsa_70 = new LatLng(-12.041169878459646, -76.8779123579094);
        final LatLng manylsa_71 = new LatLng(-12.04130628580865, -76.8783039600735);
        final LatLng manylsa_72 = new LatLng(-12.04165779415364, -76.87856681595427);
        final LatLng manylsa_73 = new LatLng(-12.041946345674354, -76.87896378320464);
        final LatLng manylsa_74 = new LatLng(-12.042276867795618, -76.87945194688638);
        final LatLng manylsa_75 = new LatLng(-12.042596897705897, -76.87941976087447);
        final LatLng manylsa_76 = new LatLng(-12.042675592305677, -76.88009031725757);
        final LatLng manylsa_77 = new LatLng(-12.042449997750516, -76.87993474715877);
        final LatLng manylsa_78 = new LatLng(-12.042072257376176, -76.88001521217352);
        final LatLng manylsa_79 = new LatLng(-12.042355558104878, -76.88102373060404);
        final LatLng manylsa_80 = new LatLng(-12.04207749846124, -76.8811202884117);
        final LatLng manylsa_81 = new LatLng(-12.041893878351308, -76.88047118858879);
        final LatLng manylsa_82 = new LatLng(-12.04153187890022, -76.88016004950588);
        final LatLng manylsa_83 = new LatLng(-12.041416459411444, -76.87987573452853);
        final LatLng manylsa_84 = new LatLng(-12.041280053886254, -76.87969870827065);
        final LatLng manylsa_85 = new LatLng(-12.040912803063454, -76.88054628517177);
        final LatLng manylsa_86 = new LatLng(-12.04060326023928, -76.88125438785258);
        final LatLng manylsa_87 = new LatLng(-12.03953300166399, -76.8820215008735);
        final LatLng manylsa_88 = new LatLng(-12.038488961835709, -76.88186057063182);
        final LatLng manylsa_89 = new LatLng(-12.036867805936144, -76.88249356933937);
        final LatLng manylsa_90 = new LatLng(-12.035939621658542, -76.88366781765625);
        final LatLng manylsa_91 = new LatLng(-12.03515059624073, -76.88562566498764);
        final LatLng manylsa_92 = new LatLng(-12.033702554499826, -76.88743887722435);
        final LatLng manylsa_93 = new LatLng(-12.033177899394696, -76.89001379736852);
        final LatLng manylsa_94 = new LatLng(-12.032548312598443, -76.89166604149212);
        final LatLng manylsa_95 = new LatLng(-12.032275510229823, -76.89204153849664);
        final LatLng manylsa_96 = new LatLng(-12.030050940443097, -76.89282475150439);
        final LatLng manylsa_97 = new LatLng(-12.029820089057548, -76.89338265254422);
        final LatLng manylsa_98 = new LatLng(-12.028539914519458, -76.89382253363546);
        final LatLng manylsa_99 = new LatLng(-12.0266930887399, -76.89356503941585);
        final LatLng manylsa_100 = new LatLng(-12.023744442422258, -76.89408002497608);
        final LatLng manylsa_101 = new LatLng(-12.022789526976146, -76.88631235382117);
        final LatLng manylsa_102 = new LatLng(-12.02719154322837, -76.88597125041774);
        final LatLng manylsa_103 = new LatLng(-12.027991926257592, -76.88589704753069);

        PolygonOptions maylsa_Loc = new PolygonOptions()
                .add(manylsa_01)
                .add(manylsa_02)
                .add(manylsa_03)
                .add(manylsa_04)
                .add(manylsa_05)
                .add(manylsa_06)
                .add(manylsa_07)
                .add(manylsa_08)
                .add(manylsa_09)
                .add(manylsa_10)
                .add(manylsa_11)
                .add(manylsa_12)
                .add(manylsa_13)
                .add(manylsa_14)
                .add(manylsa_15)
                .add(manylsa_16)
                .add(manylsa_17)
                .add(manylsa_18)
                .add(manylsa_19)
                .add(manylsa_20)
                .add(manylsa_21)
                .add(manylsa_22)
                .add(manylsa_23)
                .add(manylsa_24)
                .add(manylsa_25)
                .add(manylsa_26)
                .add(manylsa_27)
                .add(manylsa_28)
                .add(manylsa_29)
                .add(manylsa_30)
                .add(manylsa_31)
                .add(manylsa_32)
                .add(manylsa_33)
                .add(manylsa_34)
                .add(manylsa_35)
                .add(manylsa_36)
                .add(manylsa_37)
                .add(manylsa_38)
                .add(manylsa_39)
                .add(manylsa_40)
                .add(manylsa_41)
                .add(manylsa_42)
                .add(manylsa_43)
                .add(manylsa_44)
                .add(manylsa_45)
                .add(manylsa_46)
                .add(manylsa_47)
                .add(manylsa_48)
                .add(manylsa_49)
                .add(manylsa_50)
                .add(manylsa_51)
                .add(manylsa_52)
                .add(manylsa_53)
                .add(manylsa_54)
                .add(manylsa_55)
                .add(manylsa_56)
                .add(manylsa_57)
                .add(manylsa_58)
                .add(manylsa_59)
                .add(manylsa_60)
                .add(manylsa_61)
                .add(manylsa_62)
                .add(manylsa_63)
                .add(manylsa_64)
                .add(manylsa_65)
                .add(manylsa_66)
                .add(manylsa_67)
                .add(manylsa_68)
                .add(manylsa_69)
                .add(manylsa_70)
                .add(manylsa_71)
                .add(manylsa_72)
                .add(manylsa_73)
                .add(manylsa_74)
                .add(manylsa_75)
                .add(manylsa_76)
                .add(manylsa_77)
                .add(manylsa_78)
                .add(manylsa_79)
                .add(manylsa_80)
                .add(manylsa_81)
                .add(manylsa_82)
                .add(manylsa_83)
                .add(manylsa_84)
                .add(manylsa_85)
                .add(manylsa_86)
                .add(manylsa_87)
                .add(manylsa_88)
                .add(manylsa_89)
                .add(manylsa_90)
                .add(manylsa_91)
                .add(manylsa_92)
                .add(manylsa_93)
                .add(manylsa_94)
                .add(manylsa_95)
                .add(manylsa_96)
                .add(manylsa_97)
                .add(manylsa_98)
                .add(manylsa_99)
                .add(manylsa_100)
                .add(manylsa_101)
                .add(manylsa_102)
                .add(manylsa_103)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon manylsaLoc = mMap.addPolygon(maylsa_Loc);

        // Local 36 SAN MARTÍN DE PORRES Gisela
        final LatLng smp_01 = new LatLng(-12.000724162725806, -77.11679193341334);
        final LatLng smp_02 = new LatLng(-11.989139967249699, -77.10534598546704);
        final LatLng smp_03 = new LatLng(-11.990841372861045, -77.09275738505411);
        final LatLng smp_04 = new LatLng(-11.991302935559574, -77.08187845918411);
        final LatLng smp_05 = new LatLng(-11.989197728914505, -77.0811119290146);
        final LatLng smp_06 = new LatLng(-11.983545228469474, -77.07825219840333);
        final LatLng smp_07 = new LatLng(-11.981158402646752, -77.07779454038649);
        final LatLng smp_08 = new LatLng(-11.97809546466799, -77.07675889115396);
        final LatLng smp_09 = new LatLng(-11.976658253414973, -77.08318968963981);
        final LatLng smp_10 = new LatLng(-11.976069200078557, -77.0850924254656);
        final LatLng smp_11 = new LatLng(-11.975244537593465, -77.08624850992244);
        final LatLng smp_12 = new LatLng(-11.974278506500445, -77.08716373609582);
        final LatLng smp_13 = new LatLng(-11.974141897083282, -77.08792510199945);
        final LatLng smp_14 = new LatLng(-11.97381653612469, -77.08847226929639);
        final LatLng smp_15 = new LatLng(-11.972233228042104, -77.09360711515959);
        final LatLng smp_16 = new LatLng(-11.970187985192306, -77.09602774023594);
        final LatLng smp_17 = new LatLng(-11.968348113469338, -77.09683151789552);
        final LatLng smp_18 = new LatLng(-11.97238959264832, -77.10228093509598);
        final LatLng smp_19 = new LatLng(-11.977516037422971, -77.10838948528875);
        final LatLng smp_20 = new LatLng(-11.976305178985426, -77.1098362426789);
        final LatLng smp_21 = new LatLng(-11.977893415248078, -77.11129912300635);
        final LatLng smp_22 = new LatLng(-11.976871221602758, -77.11377471642218);
        final LatLng smp_23 = new LatLng(-11.975298777102497, -77.11580010828564);
        final LatLng smp_24 = new LatLng(-11.972814123316812, -77.1185810851522);
        final LatLng smp_25 = new LatLng(-11.968992869733933, -77.12023677917844);
        final LatLng smp_26 = new LatLng(-11.967357396183473, -77.12158707935914);
        final LatLng smp_27 = new LatLng(-11.966508227225013, -77.12239084734962);
        final LatLng smp_28 = new LatLng(-11.96756179155663, -77.12557371906412);
        final LatLng smp_29 = new LatLng(-11.970154571409608, -77.12511116164066);
        final LatLng smp_30 = new LatLng(-11.973009770474826, -77.12499329907091);
        final LatLng smp_31 = new LatLng(-11.980796570308248, -77.12502291988275);
        final LatLng smp_32 = new LatLng(-11.994177852024677, -77.12581899965227);
        final LatLng smp_33 = new LatLng(-11.996263630053326, -77.12583377906134);
        final LatLng smp_34 = new LatLng(-11.997559467944152, -77.12477403465616);
        final LatLng smp_35 = new LatLng(-11.999868499071736, -77.11884889737078);

        PolygonOptions smp_Loc = new PolygonOptions()
                .add(smp_01)
                .add(smp_02)
                .add(smp_03)
                .add(smp_04)
                .add(smp_05)
                .add(smp_06)
                .add(smp_07)
                .add(smp_08)
                .add(smp_09)
                .add(smp_10)
                .add(smp_11)
                .add(smp_12)
                .add(smp_13)
                .add(smp_14)
                .add(smp_15)
                .add(smp_16)
                .add(smp_17)
                .add(smp_18)
                .add(smp_19)
                .add(smp_20)
                .add(smp_21)
                .add(smp_22)
                .add(smp_23)
                .add(smp_24)
                .add(smp_25)
                .add(smp_26)
                .add(smp_27)
                .add(smp_28)
                .add(smp_29)
                .add(smp_30)
                .add(smp_31)
                .add(smp_32)
                .add(smp_33)
                .add(smp_34)
                .add(smp_35)

                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon smpLoc = mMap.addPolygon(smp_Loc);



        // SANTA ANITA - NOCHETO, Gisela
        final LatLng nocheto_02 = new LatLng(-12.04780134563665, -76.98061156955562);
        final LatLng nocheto_03 = new LatLng(-12.048725735380161, -76.98151074483393);
        final LatLng nocheto_04 = new LatLng(-12.047760426136945, -76.98281429701437);
        final LatLng nocheto_05 = new LatLng(-12.04819411949768, -76.98326607720908);
        final LatLng nocheto_06 = new LatLng(-12.047011625001058, -76.98445608931497);
        final LatLng nocheto_07 = new LatLng(-12.046992929301307, -76.98465203511775);
        final LatLng nocheto_08 = new LatLng(-12.046422711570832, -76.98493400490324);
        final LatLng nocheto_09 = new LatLng(-12.046240431861397, -76.98572733979344);
        final LatLng nocheto_10 = new LatLng(-12.045716951370565, -76.98671185018685);
        final LatLng nocheto_11 = new LatLng(-12.045580168830243, -76.98692854735351);
        final LatLng nocheto_12 = new LatLng(-12.045394129737764, -76.98704059880095);
        final LatLng nocheto_13 = new LatLng(-12.045121443692375, -76.98711356332402);
        final LatLng nocheto_14 = new LatLng(-12.044925210108696, -76.98708489862516);
        final LatLng nocheto_15 = new LatLng(-12.044800333921161, -76.98733506066907);
        final LatLng nocheto_16 = new LatLng(-12.044132628723052, -76.98695460426961);
        final LatLng nocheto_17 = new LatLng(-12.043964429242527, -76.98726209596119);
        final LatLng nocheto_18 = new LatLng(-12.044425706403722, -76.98753310234434);
        final LatLng nocheto_19 = new LatLng(-12.043537616274337, -76.98952164201006);
        final LatLng nocheto_20 = new LatLng(-12.042622704928743, -76.989662356883);
        final LatLng nocheto_21 = new LatLng(-12.042707566562227, -76.99035054490037);
        final LatLng nocheto_22 = new LatLng(-12.043435156102127, -76.99020429806866);
        final LatLng nocheto_23 = new LatLng(-12.04352863625666, -76.99031421865253);
        final LatLng nocheto_24 = new LatLng(-12.04376233805309, -76.99137997439496);
        final LatLng nocheto_25 = new LatLng(-12.043776359825294, -76.99225934270187);
        final LatLng nocheto_26 = new LatLng(-12.042519059222851, -76.99243138950804);
        final LatLng nocheto_27 = new LatLng(-12.042299379311737, -76.99315782038313);
        final LatLng nocheto_28 = new LatLng(-12.04019200161387, -76.99381839405514);
        final LatLng nocheto_29 = new LatLng(-12.040449070635674, -76.99529515438243);
        final LatLng nocheto_30 = new LatLng(-12.040425702662152, -76.9956631455236);
        final LatLng nocheto_31 = new LatLng(-12.040143520399315, -76.99674983895008);
        final LatLng nocheto_32 = new LatLng(-12.040156011998773, -76.99717561356555);
        final LatLng nocheto_33 = new LatLng(-12.04022596181032, -76.99739298768813);
        final LatLng nocheto_34 = new LatLng(-12.035476515075857, -76.99726183939029);
        final LatLng nocheto_35 = new LatLng(-12.034584986658666, -76.99756861111956);
        final LatLng nocheto_36 = new LatLng(-12.030607374721296, -76.99943554937924);
        final LatLng nocheto_37 = new LatLng(-12.030156383591022, -76.9992557031738);
        final LatLng nocheto_38 = new LatLng(-12.029487440582372, -76.99771466170749);
        final LatLng nocheto_39 = new LatLng(-12.029306552772685, -76.99697035873048);
        final LatLng nocheto_40 = new LatLng(-12.029677136219274, -76.9955618126342);
        final LatLng nocheto_41 = new LatLng(-12.030221870465873, -76.99459977972141);
        final LatLng nocheto_42 = new LatLng(-12.030941141743957, -76.99393677741672);
        final LatLng nocheto_43 = new LatLng(-12.031713672579347, -76.99379500331483);
        final LatLng nocheto_44 = new LatLng(-12.03256543793873, -76.99360259442963);
        final LatLng nocheto_45 = new LatLng(-12.032931895390647, -76.99343043887258);
        final LatLng nocheto_46 = new LatLng(-12.033238926879584, -76.99300511352399);
        final LatLng nocheto_47 = new LatLng(-12.033308254741094, -76.9923975061403);
        final LatLng nocheto_48 = new LatLng(-12.033308253736141, -76.99217471671638);
        final LatLng nocheto_49 = new LatLng(-12.032555517433273, -76.99065570577905);
        final LatLng nocheto_50 = new LatLng(-12.031842419253344, -76.98759748068916);
        final LatLng nocheto_51 = new LatLng(-12.033813356200874, -76.98602784783166);
        final LatLng nocheto_52 = new LatLng(-12.034566067481196, -76.98563290508531);
        final LatLng nocheto_53 = new LatLng(-12.037121333858098, -76.98765824998698);
        final LatLng nocheto_54 = new LatLng(-12.036913344500082, -76.98835699740029);
        final LatLng nocheto_55 = new LatLng(-12.03944958850212, -76.98781652313765);
        final LatLng nocheto_56 = new LatLng(-12.039598161569748, -76.98661144638864);
        final LatLng nocheto_57 = new LatLng(-12.03988538468407, -76.98509244673588);
        final LatLng nocheto_58 = new LatLng(-12.040222118944545, -76.98394813356043);
        final LatLng nocheto_59 = new LatLng(-12.0409055546365, -76.98425658082418);
        final LatLng nocheto_60 = new LatLng(-12.04127816215036, -76.98425658160096);
        final LatLng nocheto_61 = new LatLng(-12.042676788909528, -76.98342281936945);
        final LatLng nocheto_62 = new LatLng(-12.043319398637678, -76.9831909134257);
        final LatLng nocheto_63 = new LatLng(-12.043416600909485, -76.98317434914765);
        final LatLng nocheto_64 = new LatLng(-12.043935004760781, -76.98449953494904);
        final LatLng nocheto_65 = new LatLng(-12.044329209085577, -76.98477561052958);

        PolygonOptions nocheto_Loc = new PolygonOptions()
                .add(nocheto_02)
                .add(nocheto_03)
                .add(nocheto_04)
                .add(nocheto_05)
                .add(nocheto_06)
                .add(nocheto_07)
                .add(nocheto_08)
                .add(nocheto_09)
                .add(nocheto_10)
                .add(nocheto_11)
                .add(nocheto_12)
                .add(nocheto_13)
                .add(nocheto_14)
                .add(nocheto_15)
                .add(nocheto_16)
                .add(nocheto_17)
                .add(nocheto_18)
                .add(nocheto_19)
                .add(nocheto_20)
                .add(nocheto_21)
                .add(nocheto_22)
                .add(nocheto_23)
                .add(nocheto_24)
                .add(nocheto_25)
                .add(nocheto_26)
                .add(nocheto_27)
                .add(nocheto_28)
                .add(nocheto_29)
                .add(nocheto_30)
                .add(nocheto_31)
                .add(nocheto_32)
                .add(nocheto_33)
                .add(nocheto_34)
                .add(nocheto_35)
                .add(nocheto_36)
                .add(nocheto_37)
                .add(nocheto_38)
                .add(nocheto_39)
                .add(nocheto_40)
                .add(nocheto_41)
                .add(nocheto_42)
                .add(nocheto_43)
                .add(nocheto_44)
                .add(nocheto_45)
                .add(nocheto_46)
                .add(nocheto_47)
                .add(nocheto_48)
                .add(nocheto_49)
                .add(nocheto_50)
                .add(nocheto_51)
                .add(nocheto_52)
                .add(nocheto_53)
                .add(nocheto_54)
                .add(nocheto_55)
                .add(nocheto_56)
                .add(nocheto_57)
                .add(nocheto_58)
                .add(nocheto_59)
                .add(nocheto_60)
                .add(nocheto_61)
                .add(nocheto_62)
                .add(nocheto_63)
                .add(nocheto_64)
                .add(nocheto_65)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon nochetoLoc = mMap.addPolygon(nocheto_Loc);



        // ATE SANTA CLARA San Martín Gisela
        final LatLng claraM_01 = new LatLng(-12.050679619799253, -76.97737144942185);
        final LatLng claraM_02 = new LatLng(-12.0517801349853, -76.9764962029882);
        final LatLng claraM_03 = new LatLng(-12.05265831566437, -76.9759164996238);
        final LatLng claraM_04 = new LatLng(-12.056193252200249, -76.97456384901702);
        final LatLng claraM_05 = new LatLng(-12.059005625228739, -76.97538226359077);
        final LatLng claraM_06 = new LatLng(-12.059783752305597, -76.97658716495755);
        final LatLng claraM_07 = new LatLng(-12.056893551388981, -76.9779966352104);
        final LatLng claraM_08 = new LatLng(-12.056238822590982, -76.98061799426571);
        final LatLng claraM_09 = new LatLng(-12.055316173734465, -76.98120907274266);
        final LatLng claraM_10 = new LatLng(-12.055293936563086, -76.98250489991601);
        final LatLng claraM_11 = new LatLng(-12.055538491758485, -76.98286864395145);
        final LatLng claraM_12 = new LatLng(-12.054337924961844, -76.98427812829676);
        final LatLng claraM_13 = new LatLng(-12.052414770909667, -76.98664242078735);
        final LatLng claraM_14 = new LatLng(-12.05173671358506, -76.98496010433125);
        final LatLng claraM_15 = new LatLng(-12.052236965127255, -76.98360745658691);
        final LatLng claraM_16 = new LatLng(-12.052359254664786, -76.98247077753831);
        final LatLng claraM_17 = new LatLng(-12.052403726403979, -76.98082259552157);
        final LatLng claraM_18 = new LatLng(-12.05273721278283, -76.98075439510941);
        final LatLng claraM_19 = new LatLng(-12.052659398573065, -76.97993598714491);
        final LatLng claraM_20 = new LatLng(-12.051947956491873, -76.97899254780862);
        final LatLng claraM_21 = new LatLng(-12.050202696018802, -76.98104993305914);
        final LatLng claraM_22 = new LatLng(-12.05068194255239, -76.98168758969307);
        final LatLng claraM_23 = new LatLng(-12.050028069909983, -76.9826254956139);
        final LatLng claraM_24 = new LatLng(-12.049692050327488, -76.98319195189076);
        final LatLng claraM_25 = new LatLng(-12.047488666686341, -76.98096040803132);


        PolygonOptions claraM_Loc = new PolygonOptions()
                .add(claraM_01)
                .add(claraM_02)
                .add(claraM_03)
                .add(claraM_04)
                .add(claraM_05)
                .add(claraM_06)
                .add(claraM_07)
                .add(claraM_08)
                .add(claraM_09)
                .add(claraM_10)
                .add(claraM_11)
                .add(claraM_12)
                .add(claraM_13)
                .add(claraM_14)
                .add(claraM_15)
                .add(claraM_16)
                .add(claraM_17)
                .add(claraM_18)
                .add(claraM_19)
                .add(claraM_20)
                .add(claraM_21)
                .add(claraM_22)
                .add(claraM_23)
                .add(claraM_24)
                .add(claraM_25)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        Polygon claraMLoc = mMap.addPolygon(claraM_Loc);







        // Local 37 ATE - La Cruz
        final LatLng lacruz_01 = new LatLng(-12.018037796083133, -76.89525813562176);
        final LatLng lacruz_02 = new LatLng(-12.01724734525544, -76.89295271618059);
        final LatLng lacruz_03 = new LatLng(-12.015403096635843, -76.89364739783618);
        final LatLng lacruz_04 = new LatLng(-12.016320810443075, -76.89724711177378);
        final LatLng lacruz_05 = new LatLng(-12.016091382286747, -76.89852821293918);
        final LatLng lacruz_06 = new LatLng(-12.015500162672097, -76.899673986555);
        final LatLng lacruz_07 = new LatLng(-12.015050128955039, -76.90020627513871);
        final LatLng lacruz_08 = new LatLng(-12.015014832166212, -76.90087389144827);
        final LatLng lacruz_09 = new LatLng(-12.017776792310267, -76.90561937910192);
        final LatLng lacruz_10 = new LatLng(-12.019003340578138, -76.9055201388708);
        final LatLng lacruz_11 = new LatLng(-12.019938690176549, -76.9080913630408);
        final LatLng lacruz_12 = new LatLng(-12.020591668157785, -76.91018442973356);
        final LatLng lacruz_13 = new LatLng(-12.022506472870305, -76.90948974819351);
        final LatLng lacruz_14 = new LatLng(-12.022338817727402, -76.90901159070094);
        final LatLng lacruz_15 = new LatLng(-12.025480128767928, -76.90787483890901);
        final LatLng lacruz_16 = new LatLng(-12.025233060698005, -76.90678319635431);
        final LatLng lacruz_17 = new LatLng(-12.026865470553012, -76.90657569405286);
        final LatLng lacruz_18 = new LatLng(-12.02693670761465, -76.90687166621413);
        final LatLng lacruz_19 = new LatLng(-12.028480044146592, -76.90650751746679);
        final LatLng lacruz_20 = new LatLng(-12.02656810454802, -76.89339762712034);
        final LatLng lacruz_21 = new LatLng(-12.018255937569364, -76.89518395134536);


        PolygonOptions lacruz_Loc = new PolygonOptions()
                .add(lacruz_01)
                .add(lacruz_02)
                .add(lacruz_03)
                .add(lacruz_04)
                .add(lacruz_05)
                .add(lacruz_06)
                .add(lacruz_07)
                .add(lacruz_08)
                .add(lacruz_09)
                .add(lacruz_10)
                .add(lacruz_11)
                .add(lacruz_12)
                .add(lacruz_13)
                .add(lacruz_14)
                .add(lacruz_15)
                .add(lacruz_16)
                .add(lacruz_17)
                .add(lacruz_18)
                .add(lacruz_19)
                .add(lacruz_20)
                .add(lacruz_21)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        Polygon lacruzLoc = mMap.addPolygon(lacruz_Loc);

        // Local 34 SAN JUAN DE LURIGANCHO - PRIALE
        final LatLng cantg_01 = new LatLng(-11.990091185199853, -77.01536974742201);
        final LatLng cantg_02 = new LatLng(-11.989471993014334, -77.01133570512386);
        final LatLng cantg_03 = new LatLng(-11.989692383617662, -77.01078853441888);
        final LatLng cantg_04 = new LatLng(-11.990049206116922, -77.01037010975016);
        final LatLng cantg_05 = new LatLng(-11.99019613289046, -77.00915775132238);
        final LatLng cantg_06 = new LatLng(-11.99019613289046, -77.00906119170531);
        final LatLng cantg_07 = new LatLng(-11.990028216572938, -77.00775227379157);
        final LatLng cantg_08 = new LatLng(-11.989923268821416, -77.00645408471317);
        final LatLng cantg_09 = new LatLng(-11.990269596255738, -77.00526318387271);
        final LatLng cantg_10 = new LatLng(-11.99061592324184, -77.00444779230415);
        final LatLng cantg_11 = new LatLng(-11.992118468964984, -77.00040058719021);
        final LatLng cantg_12 = new LatLng(-11.99119556448689, -76.9998416944998);
        final LatLng cantg_13 = new LatLng(-11.990376974484425, -76.99954128710976);
        final LatLng cantg_14 = new LatLng(-11.989925699446607, -76.99931598156724);
        final LatLng cantg_15 = new LatLng(-11.988674753222577, -76.99817007641684);
        final LatLng cantg_16 = new LatLng(-11.98945182320046, -76.99777191984265);
        final LatLng cantg_17 = new LatLng(-11.989808646012584, -76.99741250385814);
        final LatLng cantg_18 = new LatLng(-11.990013294177178, -76.99704235903828);
        final LatLng cantg_19 = new LatLng(-11.989924088586053, -76.99681168907806);
        final LatLng cantg_20 = new LatLng(-11.989587672457157, -76.9965195895935);
        final LatLng cantg_21 = new LatLng(-11.98976608383237, -76.99601533433163);
        final LatLng cantg_22 = new LatLng(-11.989824807018165, -76.99570150734797);
        final LatLng cantg_23 = new LatLng(-11.987031511019563, -76.99476297769799);
        final LatLng cantg_24 = new LatLng(-11.986704981563257, -76.99506069839137);
        final LatLng cantg_25 = new LatLng(-11.985698915301787, -76.9944833005993);
        final LatLng cantg_26 = new LatLng(-11.984943854651183, -76.99386902530387);
        final LatLng cantg_27 = new LatLng(-11.984770687576573, -76.99397363144861);
        final LatLng cantg_28 = new LatLng(-11.983931088063835, -76.99337281666851);
        final LatLng cantg_29 = new LatLng(-11.983836632939028, -76.9933835454867);
        final LatLng cantg_30 = new LatLng(-11.98366608890921, -76.9936678596237);
        final LatLng cantg_31 = new LatLng(-11.982284221581487, -76.99279156830237);
        final LatLng cantg_32 = new LatLng(-11.978950623081731, -76.99186935057095);
        final LatLng cantg_33 = new LatLng(-11.979158417421758, -76.98948721067526);
        final LatLng cantg_34 = new LatLng(-11.979856011575231, -76.98851614728258);
        final LatLng cantg_35 = new LatLng(-11.97853503387091, -76.98801544269253);
        final LatLng cantg_36 = new LatLng(-11.978356923986345, -76.98833407283453);
        final LatLng cantg_37 = new LatLng(-11.977317542124243, -76.98785428279922);
        final LatLng cantg_38 = new LatLng(-11.975949596599166, -76.98770091153294);
        final LatLng cantg_39 = new LatLng(-11.975843690840895, -76.98724981950845);
        final LatLng cantg_40 = new LatLng(-11.974660597159685, -76.9871515766897);
        final LatLng cantg_41 = new LatLng(-11.973159755003726, -76.98649711773284);
        final LatLng cantg_42 = new LatLng(-11.971921291529826, -76.98706574602576);
        final LatLng cantg_43 = new LatLng(-11.971973768909484, -76.98883600385994);
        final LatLng cantg_44 = new LatLng(-11.971354535180058, -76.98956556466433);
        final LatLng cantg_45 = new LatLng(-11.968124551248845, -76.98701657552832);
        final LatLng cantg_46 = new LatLng(-11.968376446103974, -76.9855145383608);
        final LatLng cantg_47 = new LatLng(-11.966272431506194, -76.98394137931234);
        final LatLng cantg_48 = new LatLng(-11.967331521813911, -76.98219951877626);
        final LatLng cantg_49 = new LatLng(-11.966413641337258, -76.98162212106791);
        final LatLng cantg_50 = new LatLng(-11.965884093490729, -76.98218147509787);
        final LatLng cantg_51 = new LatLng(-11.964295443727764, -76.98126124750019);
        final LatLng cantg_52 = new LatLng(-11.963642329450995, -76.98221756245464);
        final LatLng cantg_53 = new LatLng(-11.962412294429548, -76.98137204788449);
        final LatLng cantg_54 = new LatLng(-11.962622208406422, -76.98095357835932);
        final LatLng cantg_55 = new LatLng(-11.962968570839019, -76.9811681550665);
        final LatLng cantg_56 = new LatLng(-11.96552953990609, -76.97752035104455);
        final LatLng cantg_57 = new LatLng(-11.965770941476944, -76.97689807859375);
        final LatLng cantg_58 = new LatLng(-11.96593887287737, -76.97637236566118);
        final LatLng cantg_59 = new LatLng(-11.965592514255523, -76.97463429416347);
        final LatLng cantg_60 = new LatLng(-11.966075317069212, -76.97394764870052);
        final LatLng cantg_61 = new LatLng(-11.966390188004908, -76.97174823745199);
        final LatLng cantg_62 = new LatLng(-11.966218308882356, -76.97142551741267);
        final LatLng cantg_63 = new LatLng(-11.965375340370468, -76.97083097881973);
        final LatLng cantg_64 = new LatLng(-11.964963447317638, -76.97148805739796);
        final LatLng cantg_65 = new LatLng(-11.965631213011525, -76.97195375386603);
        final LatLng cantg_66 = new LatLng(-11.965437748352766, -76.97354222555832);
        final LatLng cantg_67 = new LatLng(-11.965037884226351, -76.97425130934552);
        final LatLng cantg_68 = new LatLng(-11.96512411923444, -76.97482988627446);
        final LatLng cantg_69 = new LatLng(-11.965348788122885, -76.97627163160769);
        final LatLng cantg_70 = new LatLng(-11.965042988765147, -76.97719026573648);
        final LatLng cantg_71 = new LatLng(-11.958596158430455, -76.98704644496546);
        final LatLng cantg_72 = new LatLng(-11.95590140790285, -76.9919255717829);
        final LatLng cantg_73 = new LatLng(-11.956509999977365, -76.99808575531395);
        final LatLng cantg_74 = new LatLng(-11.956750327389575, -76.99933071873153);
        final LatLng cantg_75 = new LatLng(-11.960056567953558, -77.00144429938055);
        final LatLng cantg_76 = new LatLng(-11.958177788601816, -77.00462003464672);
        final LatLng cantg_77 = new LatLng(-11.95886002844537, -77.00523157838482);
        final LatLng cantg_78 = new LatLng(-11.961394706770582, -77.00680446392661);
        final LatLng cantg_79 = new LatLng(-11.963759135676964, -77.00829943269954);
        final LatLng cantg_80 = new LatLng(-11.962885417178448, -77.00966462512204);
        final LatLng cantg_81 = new LatLng(-11.963521983824286, -77.01012394226397);
        final LatLng cantg_82 = new LatLng(-11.963671763987344, -77.0100729070346);
        final LatLng cantg_83 = new LatLng(-11.964345773694301, -77.01040463602554);
        final LatLng cantg_84 = new LatLng(-11.963422130336179, -77.01189741648481);
        final LatLng cantg_85 = new LatLng(-11.964046214031967, -77.01240776877859);
        final LatLng cantg_86 = new LatLng(-11.9644705901245, -77.01276501541678);
        final LatLng cantg_87 = new LatLng(-11.964445626843514, -77.01365813193087);
        final LatLng cantg_88 = new LatLng(-11.964383218630944, -77.0139005492704);
        final LatLng cantg_89 = new LatLng(-11.965781159139883, -77.01478090697715);
        final LatLng cantg_90 = new LatLng(-11.96683520258675, -77.0143427637304);
        final LatLng cantg_91 = new LatLng(-11.96682986287596, -77.01438278542598);
        final LatLng cantg_92 = new LatLng(-11.967251880975773, -77.01425753506943);
        final LatLng cantg_93 = new LatLng(-11.96741981145623, -77.01397858535012);
        final LatLng cantg_94 = new LatLng(-11.967681397975767, -77.0136106384003);
        final LatLng cantg_95 = new LatLng(-11.967500416285825, -77.01322149477629);
        final LatLng cantg_96 = new LatLng(-11.967806212874457, -77.01283235111352);
        final LatLng cantg_97 = new LatLng(-11.968161934999262, -77.01289614512814);
        final LatLng cantg_98 = new LatLng(-11.968711119098934, -77.01254527792618);
        final LatLng cantg_99 = new LatLng(-11.969322709169342, -77.01270476301796);
        final LatLng cantg_100 = new LatLng(-11.969578357126933, -77.01305147379284);
        final LatLng cantg_101 = new LatLng(-11.970469749888705, -77.0130965829888);
        final LatLng cantg_102 = new LatLng(-11.971579385188534, -77.01196337793807);
        final LatLng cantg_103 = new LatLng(-11.973909338852394, -77.01360535267119);
        final LatLng cantg_104 = new LatLng(-11.974156453971524, -77.01310012967639);
        final LatLng cantg_105 = new LatLng(-11.975480281155011, -77.01055597085777);
        final LatLng cantg_106 = new LatLng(-11.976292225261526, -77.01061010189291);
        final LatLng cantg_107 = new LatLng(-11.976662894585658, -77.00990639843586);
        final LatLng cantg_108 = new LatLng(-11.979045756737232, -77.01149424235426);
        final LatLng cantg_109 = new LatLng(-11.978039661939393, -77.01311817349625);
        final LatLng cantg_110 = new LatLng(-11.976645243709147, -77.01344295970719);
        final LatLng cantg_111 = new LatLng(-11.97622162155523, -77.01438123098326);
        final LatLng cantg_112 = new LatLng(-11.978533884394189, -77.0159871183596);
        final LatLng cantg_113 = new LatLng(-11.977881160401033, -77.01702735020322);
        final LatLng cantg_114 = new LatLng(-11.977608283912113, -77.01755306302853);
        final LatLng cantg_115 = new LatLng(-11.978636817041897, -77.01817533547934);
        final LatLng cantg_116 = new LatLng(-11.981814126959222, -77.01317789439375);
        final LatLng cantg_117 = new LatLng(-11.984235398879644, -77.01453032820729);
        final LatLng cantg_118 = new LatLng(-11.98508408696566, -77.01542344472138);
        final LatLng cantg_119 = new LatLng(-11.987006106083456, -77.01588276186249);
        final LatLng cantg_120 = new LatLng(-11.990196519456312, -77.0153517257748);

        PolygonOptions cantog_Loc = new PolygonOptions()
                .add(cantg_01)
                .add(cantg_02)
                .add(cantg_03)
                .add(cantg_04)
                .add(cantg_05)
                .add(cantg_06)
                .add(cantg_07)
                .add(cantg_08)
                .add(cantg_09)
                .add(cantg_10)
                .add(cantg_11)
                .add(cantg_12)
                .add(cantg_13)
                .add(cantg_14)
                .add(cantg_15)
                .add(cantg_16)
                .add(cantg_17)
                .add(cantg_18)
                .add(cantg_19)
                .add(cantg_20)
                .add(cantg_21)
                .add(cantg_22)
                .add(cantg_23)
                .add(cantg_24)
                .add(cantg_25)
                .add(cantg_26)
                .add(cantg_27)
                .add(cantg_28)
                .add(cantg_29)
                .add(cantg_30)
                .add(cantg_31)
                .add(cantg_32)
                .add(cantg_33)
                .add(cantg_34)
                .add(cantg_35)
                .add(cantg_36)
                .add(cantg_37)
                .add(cantg_38)
                .add(cantg_39)
                .add(cantg_40)
                .add(cantg_41)
                .add(cantg_42)
                .add(cantg_43)
                .add(cantg_44)
                .add(cantg_45)
                .add(cantg_46)
                .add(cantg_47)
                .add(cantg_48)
                .add(cantg_49)
                .add(cantg_50)
                .add(cantg_51)
                .add(cantg_52)
                .add(cantg_53)
                .add(cantg_54)
                .add(cantg_55)
                .add(cantg_56)
                .add(cantg_57)
                .add(cantg_58)
                .add(cantg_59)
                .add(cantg_60)
                .add(cantg_61)
                .add(cantg_62)
                .add(cantg_63)
                .add(cantg_64)
                .add(cantg_65)
                .add(cantg_66)
                .add(cantg_67)
                .add(cantg_68)
                .add(cantg_69)
                .add(cantg_70)
                .add(cantg_71)
                .add(cantg_72)
                .add(cantg_73)
                .add(cantg_74)
                .add(cantg_75)
                .add(cantg_76)
                .add(cantg_77)
                .add(cantg_78)
                .add(cantg_79)
                .add(cantg_80)
                .add(cantg_81)
                .add(cantg_82)
                .add(cantg_83)
                .add(cantg_84)
                .add(cantg_85)
                .add(cantg_86)
                .add(cantg_87)
                .add(cantg_88)
                .add(cantg_89)
                .add(cantg_90)
                .add(cantg_91)
                .add(cantg_92)
                .add(cantg_93)
                .add(cantg_94)
                .add(cantg_95)
                .add(cantg_96)
                .add(cantg_97)
                .add(cantg_98)
                .add(cantg_99)
                .add(cantg_100)
                .add(cantg_101)
                .add(cantg_102)
                .add(cantg_103)
                .add(cantg_104)
                .add(cantg_105)
                .add(cantg_106)
                .add(cantg_107)
                .add(cantg_108)
                .add(cantg_109)
                .add(cantg_110)
                .add(cantg_111)
                .add(cantg_112)
                .add(cantg_113)
                .add(cantg_114)
                .add(cantg_115)
                .add(cantg_116)
                .add(cantg_117)
                .add(cantg_118)
                .add(cantg_119)
                .add(cantg_120)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        Polygon cantogLoc = mMap.addPolygon(cantog_Loc);                                                  //Muestra Canto Grande Rojo





        // San Juan de lurigancho - Metro Ascienda 16/02/2021
        final LatLng metro_01 = new LatLng(-11.992142415615255, -77.00052451197908);
        final LatLng metro_02 = new LatLng(-11.992639587005876, -76.99843686756175);
        final LatLng metro_03 = new LatLng(-11.99389894464779, -76.9983724945496);
        final LatLng metro_04 = new LatLng(-11.995074339807985, -76.9966344232215);
        final LatLng metro_05 = new LatLng(-11.995662035498336, -76.99599069305233);
        final LatLng metro_06 = new LatLng(-11.996795444960213, -76.99446719840195);
        final LatLng metro_07 = new LatLng(-11.997697971291611, -76.99431699470694);
        final LatLng metro_08 = new LatLng(-11.998516539072494, -76.99461740209698);
        final LatLng metro_09 = new LatLng(-11.999335104367924, -76.99429553703622);
        final LatLng metro_10 = new LatLng(-12.00172781949242, -76.99427407950287);
        final LatLng metro_11 = new LatLng(-12.003473134879737, -76.99098077436187);
        final LatLng metro_12 = new LatLng(-12.006649113789683, -76.98870484469097);
        final LatLng metro_13 = new LatLng(-12.008993971388719, -76.98706617532791);
        final LatLng metro_14 = new LatLng(-12.01062645520629, -76.9889779565567);
        final LatLng metro_15 = new LatLng(-12.010893587967743, -76.99064697164872);
        final LatLng metro_16 = new LatLng(-12.010418685097523, -76.99377258173007);
        final LatLng metro_17 = new LatLng(-12.011754347310177, -76.99334774147326);
        final LatLng metro_18 = new LatLng(-12.01273382870418, -76.99019178566294);
        final LatLng metro_19 = new LatLng(-12.016023197387657, -76.9888813054311);
        final LatLng metro_20 = new LatLng(-12.017020472444136, -76.98985791671065);
        final LatLng metro_21 = new LatLng(-12.019979704831128, -76.9905552775021);
        final LatLng metro_22 = new LatLng(-12.019308113183742, -76.99558710153694);
        final LatLng metro_23 = new LatLng(-12.019822300696942, -76.99818347969374);
        final LatLng metro_24 = new LatLng(-12.020567346199401, -76.99789380153923);
        final LatLng metro_25 = new LatLng(-12.022388079360493, -76.99732897485485);
        final LatLng metro_26 = new LatLng(-12.022891779615893, -76.99890614217811);
        final LatLng metro_27 = new LatLng(-12.022178221142545, -77.00492501896782);
        final LatLng metro_28 = new LatLng(-12.022618948655722, -77.0052683416993);
        final LatLng metro_29 = new LatLng(-12.022535000613644, -77.0057618681258);
        final LatLng metro_30 = new LatLng(-12.021936870055592, -77.00645924242411);
        final LatLng metro_31 = new LatLng(-12.023223797891312, -77.00788312797208);
        final LatLng metro_32 = new LatLng(-12.020915222379747, -77.01047950612887);
        final LatLng metro_33 = new LatLng(-12.020642358513916, -77.01362305205572);
        final LatLng metro_34 = new LatLng(-12.019404113140803, -77.01398783245793);
        final LatLng metro_35 = new LatLng(-12.01881646927521, -77.01399856129329);
        final LatLng metro_36 = new LatLng(-12.016707236905216, -77.01315098329718);
        final LatLng metro_37 = new LatLng(-12.01645538716777, -77.0126789145414);
        final LatLng metro_38 = new LatLng(-12.01603563708173, -77.0121853881149);
        final LatLng metro_39 = new LatLng(-12.015626380069678, -77.01222830337501);
        final LatLng metro_40 = new LatLng(-12.015154159722599, -77.01257162610648);
        final LatLng metro_41 = new LatLng(-12.01471341998464, -77.01267891446007);
        final LatLng metro_42 = new LatLng(-12.014482556024408, -77.0129578641794);
        final LatLng metro_43 = new LatLng(-12.014440580737649, -77.01335483108767);
        final LatLng metro_44 = new LatLng(-12.014083790535901, -77.01356940779483);
        final LatLng metro_45 = new LatLng(-12.012688106675075, -77.01351576361805);
        final LatLng metro_46 = new LatLng(-12.012058472490137, -77.01335483108767);
        final LatLng metro_47 = new LatLng(-12.011433263741171, -77.01410669098945);
        final LatLng metro_48 = new LatLng(-12.010444938503282, -77.0148103944465);
        final LatLng metro_49 = new LatLng(-12.010286100180325, -77.015676491009);
        final LatLng metro_50 = new LatLng(-12.01277455647652, -77.01876196001301);
        final LatLng metro_51 = new LatLng(-12.012951041865353, -77.0204400221029);
        final LatLng metro_52 = new LatLng(-12.012100985802412, -77.02024688412884);
        final LatLng metro_53 = new LatLng(-12.011901601368404, -77.01982845954984);
        final LatLng metro_54 = new LatLng(-12.011167025863992, -77.01942076380621);
        final LatLng metro_55 = new LatLng(-12.010789243395758, -77.01987137489128);
        final LatLng metro_56 = new LatLng(-12.010559573438208, -77.01915856419386);
        final LatLng metro_57 = new LatLng(-12.010693139885232, -77.01867303253073);
        final LatLng metro_58 = new LatLng(-12.010218236634923, -77.01811163643673);
        final LatLng metro_59 = new LatLng(-12.00961415133414, -77.01786783365736);
        final LatLng metro_60 = new LatLng(-12.009015132168727, -77.01846749760254);
        final LatLng metro_61 = new LatLng(-12.00837867284576, -77.01728092851953);
        final LatLng metro_62 = new LatLng(-12.007920868413521, -77.01993793462897);
        final LatLng metro_63 = new LatLng(-12.005961867056584, -77.02033242910525);
        final LatLng metro_64 = new LatLng(-12.003706029601691, -77.01917929144894);
        final LatLng metro_65 = new LatLng(-12.003049621444482, -77.02030191808922);
        final LatLng metro_66 = new LatLng(-12.002131862426621, -77.02050039855145);
        final LatLng metro_67 = new LatLng(-12.002184810147225, -77.02145671350591);
        final LatLng metro_68 = new LatLng(-12.001494616904186, -77.0215630616788);
        final LatLng metro_69 = new LatLng(-12.000767626642917, -77.0203289711555);
        final LatLng metro_70 = new LatLng(-12.000886356691938, -77.01935790782925);
        final LatLng metro_71 = new LatLng(-11.99877889054757, -77.01950963647396);
        final LatLng metro_72 = new LatLng(-11.997184197440744, -77.02035184569118);
        final LatLng metro_73 = new LatLng(-11.99554278281804, -77.0195398801638);
        final LatLng metro_74 = new LatLng(-11.99543688475735, -77.02284187330842);
        final LatLng metro_75 = new LatLng(-11.994713246860776, -77.02278774222967);
        final LatLng metro_76 = new LatLng(-11.993954307505598, -77.02150664106426);
        final LatLng metro_77 = new LatLng(-11.993283615087186, -77.02193968935379);
        final LatLng metro_78 = new LatLng(-11.992017728533558, -77.02117062482395);
        final LatLng metro_79 = new LatLng(-11.992017691474766, -77.02212546954833);
        final LatLng metro_80 = new LatLng(-11.98924707754698, -77.02224352018075);
        final LatLng metro_81 = new LatLng(-11.988620771405213, -77.01947830723392);
        final LatLng metro_82 = new LatLng(-11.988542851283874, -77.01937968354748);
        final LatLng metro_83 = new LatLng(-11.988579956111767, -77.01879173504916);
        final LatLng metro_84 = new LatLng(-11.989229289784712, -77.01712271981373);
        final LatLng metro_85 = new LatLng(-11.98909942317731, -77.01547646401843);
        final LatLng metro_86 = new LatLng(-11.990194011204759, -77.01534749461983);
        final LatLng metro_87 = new LatLng(-11.989745045129299, -77.01305639193377);
        final LatLng metro_88 = new LatLng(-11.989453641496498, -77.01137426792233);
        final LatLng metro_89 = new LatLng(-11.990057091569506, -77.01049718557275);
        final LatLng metro_90 = new LatLng(-11.990193523572128, -77.00965765411893);
        final LatLng metro_91 = new LatLng(-11.990120060195364, -77.00855526628582);
        final LatLng metro_92 = new LatLng(-11.989962638602947, -77.0074072807899);
        final LatLng metro_93 = new LatLng(-11.989970509684818, -77.00605276524085);
        final LatLng metro_94 = new LatLng(-11.990398171455306, -77.00496378839077);
        final LatLng metro_95 = new LatLng(-11.992137672131387, -77.00060251655225);

        PolygonOptions metro_Loc = new PolygonOptions()
                .add(metro_01)
                .add(metro_02)
                .add(metro_03)
                .add(metro_04)
                .add(metro_05)
                .add(metro_06)
                .add(metro_07)
                .add(metro_08)
                .add(metro_09)
                .add(metro_10)
                .add(metro_11)
                .add(metro_12)
                .add(metro_13)
                .add(metro_14)
                .add(metro_15)
                .add(metro_16)
                .add(metro_17)
                .add(metro_18)
                .add(metro_19)
                .add(metro_20)
                .add(metro_21)
                .add(metro_22)
                .add(metro_23)
                .add(metro_24)
                .add(metro_25)
                .add(metro_26)
                .add(metro_27)
                .add(metro_28)
                .add(metro_29)
                .add(metro_30)
                .add(metro_31)
                .add(metro_32)
                .add(metro_33)
                .add(metro_34)
                .add(metro_35)
                .add(metro_36)
                .add(metro_37)
                .add(metro_38)
                .add(metro_39)
                .add(metro_40)
                .add(metro_41)
                .add(metro_42)
                .add(metro_43)
                .add(metro_44)
                .add(metro_45)
                .add(metro_46)
                .add(metro_47)
                .add(metro_48)
                .add(metro_49)
                .add(metro_50)
                .add(metro_51)
                .add(metro_52)
                .add(metro_53)
                .add(metro_54)
                .add(metro_55)
                .add(metro_56)
                .add(metro_57)
                .add(metro_58)
                .add(metro_59)
                .add(metro_60)
                .add(metro_61)
                .add(metro_62)
                .add(metro_63)
                .add(metro_64)
                .add(metro_65)
                .add(metro_66)
                .add(metro_67)
                .add(metro_68)
                .add(metro_69)
                .add(metro_70)
                .add(metro_71)
                .add(metro_72)
                .add(metro_73)
                .add(metro_74)
                .add(metro_75)
                .add(metro_76)
                .add(metro_77)
                .add(metro_78)
                .add(metro_79)
                .add(metro_80)
                .add(metro_81)
                .add(metro_82)
                .add(metro_83)
                .add(metro_84)
                .add(metro_85)
                .add(metro_86)
                .add(metro_87)
                .add(metro_88)
                .add(metro_89)
                .add(metro_90)
                .add(metro_91)
                .add(metro_92)
                .add(metro_93)
                .add(metro_94)
                .add(metro_95)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        Polygon metroLoc = mMap.addPolygon(metro_Loc);

        //Cto Grande 16/02/2021
        final LatLng cantg02_01 = new LatLng(-11.990091185199853, -77.01536974742201);
        final LatLng cantg02_02 = new LatLng(-11.989471993014334, -77.01133570512386);
        final LatLng cantg02_03 = new LatLng(-11.989692383617662, -77.01078853441888);
        final LatLng cantg02_04 = new LatLng(-11.990049206116922, -77.01037010975016);
        final LatLng cantg02_05 = new LatLng(-11.99019613289046, -77.00915775132238);
        final LatLng cantg02_06 = new LatLng(-11.99019613289046, -77.00906119170531);
        final LatLng cantg02_07 = new LatLng(-11.990028216572938, -77.00775227379157);
        final LatLng cantg02_08 = new LatLng(-11.989923268821416, -77.00645408471317);
        final LatLng cantg02_09 = new LatLng(-11.990269596255738, -77.00526318387271);
        final LatLng cantg02_10 = new LatLng(-11.99061592324184, -77.00444779230415);
        final LatLng cantg02_11 = new LatLng(-11.992118468964984, -77.00040058719021);
        final LatLng cantg02_12 = new LatLng(-11.99119556448689, -76.9998416944998);
        final LatLng cantg02_13 = new LatLng(-11.990376974484425, -76.99954128710976);
        final LatLng cantg02_14 = new LatLng(-11.989925699446607, -76.99931598156724);
        final LatLng cantg02_15 = new LatLng(-11.988674753222577, -76.99817007641684);
        final LatLng cantg02_16 = new LatLng(-11.98945182320046, -76.99777191984265);
        final LatLng cantg02_17 = new LatLng(-11.989808646012584, -76.99741250385814);
        final LatLng cantg02_18 = new LatLng(-11.990013294177178, -76.99704235903828);
        final LatLng cantg02_19 = new LatLng(-11.989924088586053, -76.99681168907806);
        final LatLng cantg02_20 = new LatLng(-11.989587672457157, -76.9965195895935);
        final LatLng cantg02_21 = new LatLng(-11.98976608383237, -76.99601533433163);
        final LatLng cantg02_22 = new LatLng(-11.989824807018165, -76.99570150734797);
        final LatLng cantg02_23 = new LatLng(-11.987031511019563, -76.99476297769799);
        final LatLng cantg02_24 = new LatLng(-11.986704981563257, -76.99506069839137);
        final LatLng cantg02_25 = new LatLng(-11.985698915301787, -76.9944833005993);
        final LatLng cantg02_26 = new LatLng(-11.984943854651183, -76.99386902530387);
        final LatLng cantg02_27 = new LatLng(-11.984770687576573, -76.99397363144861);
        final LatLng cantg02_28 = new LatLng(-11.983931088063835, -76.99337281666851);
        final LatLng cantg02_29 = new LatLng(-11.983836632939028, -76.9933835454867);
        final LatLng cantg02_30 = new LatLng(-11.98366608890921, -76.9936678596237);
        final LatLng cantg02_31 = new LatLng(-11.982284221581487, -76.99279156830237);
        final LatLng cantg02_32 = new LatLng(-11.978950623081731, -76.99186935057095);
        final LatLng cantg02_33 = new LatLng(-11.979158417421758, -76.98948721067526);
        final LatLng cantg02_34 = new LatLng(-11.979856011575231, -76.98851614728258);
        final LatLng cantg02_35 = new LatLng(-11.97853503387091, -76.98801544269253);
        final LatLng cantg02_36 = new LatLng(-11.978356923986345, -76.98833407283453);
        final LatLng cantg02_37 = new LatLng(-11.977317542124243, -76.98785428279922);
        final LatLng cantg02_38 = new LatLng(-11.975949596599166, -76.98770091153294);
        final LatLng cantg02_39 = new LatLng(-11.975843690840895, -76.98724981950845);
        final LatLng cantg02_40 = new LatLng(-11.974660597159685, -76.9871515766897);
        final LatLng cantg02_41 = new LatLng(-11.973159755003726, -76.98649711773284);
        final LatLng cantg02_42 = new LatLng(-11.971921291529826, -76.98706574602576);
        final LatLng cantg02_43 = new LatLng(-11.971973768909484, -76.98883600385994);
        final LatLng cantg02_44 = new LatLng(-11.971354535180058, -76.98956556466433);
        final LatLng cantg02_45 = new LatLng(-11.968124551248845, -76.98701657552832);
        final LatLng cantg02_46 = new LatLng(-11.968376446103974, -76.9855145383608);
        final LatLng cantg02_47 = new LatLng(-11.966272431506194, -76.98394137931234);
        final LatLng cantg02_48 = new LatLng(-11.967331521813911, -76.98219951877626);
        final LatLng cantg02_49 = new LatLng(-11.966413641337258, -76.98162212106791);
        final LatLng cantg02_50 = new LatLng(-11.965884093490729, -76.98218147509787);
        final LatLng cantg02_51 = new LatLng(-11.964295443727764, -76.98126124750019);
        final LatLng cantg02_52 = new LatLng(-11.963642329450995, -76.98221756245464);
        final LatLng cantg02_53 = new LatLng(-11.962412294429548, -76.98137204788449);
        final LatLng cantg02_54 = new LatLng(-11.962622208406422, -76.98095357835932);
        final LatLng cantg02_55 = new LatLng(-11.962968570839019, -76.9811681550665);
        final LatLng cantg02_56 = new LatLng(-11.96552953990609, -76.97752035104455);
        final LatLng cantg02_57 = new LatLng(-11.965770941476944, -76.97689807859375);
        final LatLng cantg02_58 = new LatLng(-11.96593887287737, -76.97637236566118);
        final LatLng cantg02_59 = new LatLng(-11.965592514255523, -76.97463429416347);
        final LatLng cantg02_60 = new LatLng(-11.966075317069212, -76.97394764870052);
        final LatLng cantg02_61 = new LatLng(-11.966390188004908, -76.97174823745199);
        final LatLng cantg02_62 = new LatLng(-11.966218308882356, -76.97142551741267);
        final LatLng cantg02_63 = new LatLng(-11.965375340370468, -76.97083097881973);
        final LatLng cantg02_64 = new LatLng(-11.964963447317638, -76.97148805739796);
        final LatLng cantg02_65 = new LatLng(-11.965631213011525, -76.97195375386603);
        final LatLng cantg02_66 = new LatLng(-11.965437748352766, -76.97354222555832);
        final LatLng cantg02_67 = new LatLng(-11.965037884226351, -76.97425130934552);
        final LatLng cantg02_68 = new LatLng(-11.96512411923444, -76.97482988627446);
        final LatLng cantg02_69 = new LatLng(-11.965348788122885, -76.97627163160769);
        final LatLng cantg02_70 = new LatLng(-11.965042988765147, -76.97719026573648);
        final LatLng cantg02_71 = new LatLng(-11.958596158430455, -76.98704644496546);
        final LatLng cantg02_72 = new LatLng(-11.95590140790285, -76.9919255717829);
        final LatLng cantg02_73 = new LatLng(-11.956509999977365, -76.99808575531395);
        final LatLng cantg02_74 = new LatLng(-11.960422610979371, -76.99954660384684);
        final LatLng cantg02_75 = new LatLng(-11.964536981681883, -77.00182111700593);
        final LatLng cantg02_76 = new LatLng(-11.963571369698254, -77.00349481532189);
        final LatLng cantg02_77 = new LatLng(-11.963548609148601, -77.00352762334359);
        final LatLng cantg02_78 = new LatLng(-11.964671958238458, -77.00442073985768);
        final LatLng cantg02_79 = new LatLng(-11.964160210898514, -77.00530109756444);
        final LatLng cantg02_80 = new LatLng(-11.964245220847092, -77.0053835113053);
        final LatLng cantg02_81 = new LatLng(-11.964052258302374, -77.00567179573028);
        final LatLng cantg02_82 = new LatLng(-11.964453026510464, -77.00592973442632);
        final LatLng cantg02_83 = new LatLng(-11.964104209770266, -77.00646078468286);
        final LatLng cantg02_84 = new LatLng(-11.963799922459204, -77.00623319171578);
        final LatLng cantg02_85 = new LatLng(-11.963629224549418, -77.00652147614075);
        final LatLng cantg02_86 = new LatLng(-11.96381476575061, -77.00668837764995);
        final LatLng cantg02_87 = new LatLng(-11.96310970850873, -77.00785668821436);
        final LatLng cantg02_88 = new LatLng(-11.963759135676964, -77.00829943269954);
        final LatLng cantg02_89 = new LatLng(-11.962885417178448, -77.00966462512204);
        final LatLng cantg02_90 = new LatLng(-11.963521983824286, -77.01012394226397);
        final LatLng cantg02_91 = new LatLng(-11.963671763987344, -77.0100729070346);
        final LatLng cantg02_92 = new LatLng(-11.964345773694301, -77.01040463602554);
        final LatLng cantg02_93 = new LatLng(-11.963422130336179, -77.01189741648481);
        final LatLng cantg02_94 = new LatLng(-11.964046214031967, -77.01240776877859);
        final LatLng cantg02_95 = new LatLng(-11.9644705901245, -77.01276501541678);
        final LatLng cantg02_96 = new LatLng(-11.964445626843514, -77.01365813193087);
        final LatLng cantg02_97 = new LatLng(-11.964383218630944, -77.0139005492704);
        final LatLng cantg02_98 = new LatLng(-11.965781159139883, -77.01478090697715);
        final LatLng cantg02_99 = new LatLng(-11.96683520258675, -77.0143427637304);
        final LatLng cantg02_100 = new LatLng(-11.96682986287596, -77.01438278542598);
        final LatLng cantg02_101 = new LatLng(-11.967251880975773, -77.01425753506943);
        final LatLng cantg02_102 = new LatLng(-11.96741981145623, -77.01397858535012);
        final LatLng cantg02_103 = new LatLng(-11.967681397975767, -77.0136106384003);
        final LatLng cantg02_104 = new LatLng(-11.967500416285825, -77.01322149477629);
        final LatLng cantg02_105 = new LatLng(-11.967806212874457, -77.01283235111352);
        final LatLng cantg02_106 = new LatLng(-11.968161934999262, -77.01289614512814);
        final LatLng cantg02_107 = new LatLng(-11.968711119098934, -77.01254527792618);
        final LatLng cantg02_108 = new LatLng(-11.969322709169342, -77.01270476301796);
        final LatLng cantg02_109 = new LatLng(-11.969578357126933, -77.01305147379284);
        final LatLng cantg02_110 = new LatLng(-11.970469749888705, -77.0130965829888);
        final LatLng cantg02_111 = new LatLng(-11.971579385188534, -77.01196337793807);
        final LatLng cantg02_112 = new LatLng(-11.973909338852394, -77.01360535267119);
        final LatLng cantg02_113 = new LatLng(-11.974156453971524, -77.01310012967639);
        final LatLng cantg02_114 = new LatLng(-11.975480281155011, -77.01055597085777);
        final LatLng cantg02_115 = new LatLng(-11.976292225261526, -77.01061010189291);
        final LatLng cantg02_116 = new LatLng(-11.976662894585658, -77.00990639843586);
        final LatLng cantg02_117 = new LatLng(-11.979045756737232, -77.01149424235426);
        final LatLng cantg02_118 = new LatLng(-11.978039661939393, -77.01311817349625);
        final LatLng cantg02_119 = new LatLng(-11.976645243709147, -77.01344295970719);
        final LatLng cantg02_120 = new LatLng(-11.97622162155523, -77.01438123098326);
        final LatLng cantg02_121 = new LatLng(-11.978533884394189, -77.0159871183596);
        final LatLng cantg02_122 = new LatLng(-11.977881160401033, -77.01702735020322);
        final LatLng cantg02_123 = new LatLng(-11.977608283912113, -77.01755306302853);
        final LatLng cantg02_124 = new LatLng(-11.978636817041897, -77.01817533547934);
        final LatLng cantg02_125 = new LatLng(-11.981814126959222, -77.01317789439375);
        final LatLng cantg02_126 = new LatLng(-11.984235398879644, -77.01453032820729);
        final LatLng cantg02_127 = new LatLng(-11.98508408696566, -77.01542344472138);
        final LatLng cantg02_128 = new LatLng(-11.987006106083456, -77.01588276186249);
        final LatLng cantg02_129 = new LatLng(-11.990196519456312, -77.0153517257748);

        PolygonOptions cantog02_Loc = new PolygonOptions()
                .add(cantg02_01)
                .add(cantg02_02)
                .add(cantg02_03)
                .add(cantg02_04)
                .add(cantg02_05)
                .add(cantg02_06)
                .add(cantg02_07)
                .add(cantg02_08)
                .add(cantg02_09)
                .add(cantg02_10)
                .add(cantg02_11)
                .add(cantg02_12)
                .add(cantg02_13)
                .add(cantg02_14)
                .add(cantg02_15)
                .add(cantg02_16)
                .add(cantg02_17)
                .add(cantg02_18)
                .add(cantg02_19)
                .add(cantg02_20)
                .add(cantg02_21)
                .add(cantg02_22)
                .add(cantg02_23)
                .add(cantg02_24)
                .add(cantg02_25)
                .add(cantg02_26)
                .add(cantg02_27)
                .add(cantg02_28)
                .add(cantg02_29)
                .add(cantg02_30)
                .add(cantg02_31)
                .add(cantg02_32)
                .add(cantg02_33)
                .add(cantg02_34)
                .add(cantg02_35)
                .add(cantg02_36)
                .add(cantg02_37)
                .add(cantg02_38)
                .add(cantg02_39)
                .add(cantg02_40)
                .add(cantg02_41)
                .add(cantg02_42)
                .add(cantg02_43)
                .add(cantg02_44)
                .add(cantg02_45)
                .add(cantg02_46)
                .add(cantg02_47)
                .add(cantg02_48)
                .add(cantg02_49)
                .add(cantg02_50)
                .add(cantg02_51)
                .add(cantg02_52)
                .add(cantg02_53)
                .add(cantg02_54)
                .add(cantg02_55)
                .add(cantg02_56)
                .add(cantg02_57)
                .add(cantg02_58)
                .add(cantg02_59)
                .add(cantg02_60)
                .add(cantg02_61)
                .add(cantg02_62)
                .add(cantg02_63)
                .add(cantg02_64)
                .add(cantg02_65)
                .add(cantg02_66)
                .add(cantg02_67)
                .add(cantg02_68)
                .add(cantg02_69)
                .add(cantg02_70)
                .add(cantg02_71)
                .add(cantg02_72)
                .add(cantg02_73)
                .add(cantg02_74)
                .add(cantg02_75)
                .add(cantg02_76)
                .add(cantg02_77)
                .add(cantg02_78)
                .add(cantg02_79)
                .add(cantg02_80)
                .add(cantg02_81)
                .add(cantg02_82)
                .add(cantg02_83)
                .add(cantg02_84)
                .add(cantg02_85)
                .add(cantg02_86)
                .add(cantg02_87)
                .add(cantg02_88)
                .add(cantg02_89)
                .add(cantg02_90)
                .add(cantg02_91)
                .add(cantg02_92)
                .add(cantg02_93)
                .add(cantg02_94)
                .add(cantg02_95)
                .add(cantg02_96)
                .add(cantg02_97)
                .add(cantg02_98)
                .add(cantg02_99)
                .add(cantg02_100)
                .add(cantg02_101)
                .add(cantg02_102)
                .add(cantg02_103)
                .add(cantg02_104)
                .add(cantg02_105)
                .add(cantg02_106)
                .add(cantg02_107)
                .add(cantg02_108)
                .add(cantg02_109)
                .add(cantg02_110)
                .add(cantg02_111)
                .add(cantg02_112)
                .add(cantg02_113)
                .add(cantg02_114)
                .add(cantg02_115)
                .add(cantg02_116)
                .add(cantg02_117)
                .add(cantg02_118)
                .add(cantg02_119)
                .add(cantg02_120)
                .add(cantg02_121)
                .add(cantg02_122)
                .add(cantg02_123)
                .add(cantg02_124)
                .add(cantg02_125)
                .add(cantg02_126)
                .add(cantg02_127)
                .add(cantg02_128)
                .add(cantg02_129)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        //Polygon cantog02Loc = mMap.addPolygon(cantog02_Loc);                                          LAPSUS DEL IMBÉCIL DEL CLIENTE



        // TRANSPARENCIA EN LA VICTORIA                                                                 ****************************************
        final LatLng pino_01 = new LatLng(-12.071806852930909, -77.00277266060264);
        final LatLng pino_02 = new LatLng(-12.068788833241095, -76.99738820062302);
        final LatLng pino_03 = new LatLng(-12.067466050468912, -76.99713869874947);
        final LatLng pino_04 = new LatLng(-12.063536271721127, -77.00025116961248);
        final LatLng pino_05 = new LatLng(-12.063048253520426, -77.00244429952642);
        final LatLng pino_06 = new LatLng(-12.067966902657814, -77.00592450006724);
        final LatLng pino_07 = new LatLng(-12.069918987823943, -77.00404653330135);
        final LatLng pino_08 = new LatLng(-12.07077944307271, -77.00337676611966);

        PolygonOptions pino_Loc = new PolygonOptions()
                .add(pino_01)
                .add(pino_02)
                .add(pino_03)
                .add(pino_04)
                .add(pino_05)
                .add(pino_06)
                .add(pino_07)
                .add(pino_08)
                .fillColor(0xBBFFFFFF).strokeColor(Color.RED).strokeWidth(3); // Sin color
        Polygon pinoLoc = mMap.addPolygon(pino_Loc);

/*
        final LatLng carapongo_01 = new LatLng();
        PolygonOptions carap_Loc = new PolygonOptions()
                .add(carapongo_01)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        Polygon carapLoc = mMap.addPolygon(carap_Loc);
*/

    }

    public void ChosicaMap(GoogleMap googleMap)
    {
        // Add a marker in Sydney and move the camera
        LatLng chosica = new LatLng(-11.92580746725925, -76.68585551121954);           //     CHOSICA
        LatLng sydney = new LatLng(-34, 151);

        CameraUpdate zoom = CameraUpdateFactory.zoomTo(15);
        cmarker = new MarkerOptions();
        cmarker.position(chosica);
        cmarker.title("La Delicia - CHOSICA");
        cmarker.snippet("Telf: 962 096 927 / 922 150 517");
        cmarker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));            // android.R.drawable.star_on
        chosica_marker = mMap.addMarker(cmarker);

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
                .add(cho_47);
        //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        choLoc = mMap.addPolygon(cho_loc);
        choLoc.setClickable(true);
        choLoc.setTag("chosica");
        mMap.addPolygon(cho_loc);

        // Evento al presionar el marcador
        mMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
            @Override
            public boolean onMarkerClick(Marker marker) {

                if(marker.equals(chosica_marker)){
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    choLoc.setFillColor(color_Red);
                    choLoc.setStrokeColor(color_Red);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);

                    return true;
                }else if(marker.equals(campoy_marker)){
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(color_Red);
                    campoyLoc.setStrokeColor(color_Red);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if(marker.equals(local01_marker)){
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(color_Red);
                    local01Loc.setStrokeColor(color_Red);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local02_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(color_Red);
                    local02Loc.setStrokeColor(color_Red);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local03_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(color_Red);
                    local03Loc.setStrokeColor(color_Red);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local04_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(color_Red);
                    local04Loc.setStrokeColor(color_Red);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local05_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(color_Red);
                    local05Loc.setStrokeColor(color_Red);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local06_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(color_Red);
                    //local06Loc.setStrokeColor(color_Red);
                    local07Loc.setFillColor(0x0000FF);
                    local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    local11Loc.setFillColor(0x0000FF);
                    local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local07_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(color_Red);
                    //local07Loc.setStrokeColor(color_Red);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    local11Loc.setFillColor(0x0000FF);
                    local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local08_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(color_Red);
                    local08Loc.setStrokeColor(color_Red);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local09_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(color_Red);
                    local09Loc.setStrokeColor(color_Red);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local10_marker) || marker.equals(local11_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(color_Red);
                    local10Loc.setStrokeColor(color_Red);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local11_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(color_Red);
                    //local11Loc.setStrokeColor(color_Red);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local12_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(color_Red);
                    local12Loc.setStrokeColor(color_Red);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local13_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(color_Red);
                    local13Loc.setStrokeColor(color_Red);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local14_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(color_Red);
                    local14Loc.setStrokeColor(color_Red);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local15_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(color_Red);
                    local15Loc.setStrokeColor(color_Red);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local16_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(color_Red);
                    local16Loc.setStrokeColor(color_Red);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local17_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(color_Red);
                    local17Loc.setStrokeColor(color_Red);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local18_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(color_Red);
                    local18Loc.setStrokeColor(color_Red);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local19_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(color_Red);
                    //local19Loc.setStrokeColor(color_Red);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local20_marker) || marker.equals(local21_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(color_Red);
                    local20Loc.setStrokeColor(color_Red);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local21_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(color_Red);
                    local20Loc.setStrokeColor(color_Red);
                    //local21Loc.setFillColor(color_Red);
                    //local21Loc.setStrokeColor(color_Red);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local22_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(color_Red);
                    local22Loc.setStrokeColor(color_Red);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local25_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(color_Red);
                    local25Loc.setStrokeColor(color_Red);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local26_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(color_Red);
                    local26Loc.setStrokeColor(color_Red);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local27_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(color_Red);
                    local27Loc.setStrokeColor(color_Red);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local28_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(color_Red);
                    local28Loc.setStrokeColor(color_Red);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local29_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(color_Red);
                    local28Loc.setStrokeColor(color_Red);
                    //local29Loc.setFillColor(color_Red);
                    //local29Loc.setStrokeColor(color_Red);
                    local30Loc.setFillColor(0x0000FF);
                    local30Loc.setStrokeColor(0x0000FF);
                    return true;
                }else if (marker.equals(local30_marker))
                {
                    Toast.makeText(getContext(), marker.getTitle(), Toast.LENGTH_SHORT).show();
                    choLoc.setFillColor(0x0000FF);
                    choLoc.setStrokeColor(0x0000FF);
                    campoyLoc.setFillColor(0x0000FF);
                    campoyLoc.setStrokeColor(0x0000FF);
                    local01Loc.setFillColor(0x0000FF);
                    local01Loc.setStrokeColor(0x0000FF);
                    local02Loc.setFillColor(0x0000FF);
                    local02Loc.setStrokeColor(0x0000FF);
                    local03Loc.setFillColor(0x0000FF);
                    local03Loc.setStrokeColor(0x0000FF);
                    local04Loc.setFillColor(0x0000FF);
                    local04Loc.setStrokeColor(0x0000FF);
                    local05Loc.setFillColor(0x0000FF);
                    local05Loc.setStrokeColor(0x0000FF);
                    //local06Loc.setFillColor(0x0000FF);
                    //local06Loc.setStrokeColor(0x0000FF);
                    //local07Loc.setFillColor(0x0000FF);
                    //local07Loc.setStrokeColor(0x0000FF);
                    local08Loc.setFillColor(0x0000FF);
                    local08Loc.setStrokeColor(0x0000FF);
                    local09Loc.setFillColor(0x0000FF);
                    local09Loc.setStrokeColor(0x0000FF);
                    local10Loc.setFillColor(0x0000FF);
                    local10Loc.setStrokeColor(0x0000FF);
                    //local11Loc.setFillColor(0x0000FF);
                    //local11Loc.setStrokeColor(0x0000FF);
                    local12Loc.setFillColor(0x0000FF);
                    local12Loc.setStrokeColor(0x0000FF);
                    local13Loc.setFillColor(0x0000FF);
                    local13Loc.setStrokeColor(0x0000FF);
                    local14Loc.setFillColor(0x0000FF);
                    local14Loc.setStrokeColor(0x0000FF);
                    local15Loc.setFillColor(0x0000FF);
                    local15Loc.setStrokeColor(0x0000FF);
                    local16Loc.setFillColor(0x0000FF);
                    local16Loc.setStrokeColor(0x0000FF);
                    local17Loc.setFillColor(0x0000FF);
                    local17Loc.setStrokeColor(0x0000FF);
                    local18Loc.setFillColor(0x0000FF);
                    local18Loc.setStrokeColor(0x0000FF);
                    //local19Loc.setFillColor(0x0000FF);
                    //local19Loc.setStrokeColor(0x0000FF);
                    local20Loc.setFillColor(0x0000FF);
                    local20Loc.setStrokeColor(0x0000FF);
                    //local21Loc.setFillColor(0x0000FF);
                    //local21Loc.setStrokeColor(0x0000FF);
                    local22Loc.setFillColor(0x0000FF);
                    local22Loc.setStrokeColor(0x0000FF);
                    local25Loc.setFillColor(0x0000FF);
                    local25Loc.setStrokeColor(0x0000FF);
                    local26Loc.setFillColor(0x0000FF);
                    local26Loc.setStrokeColor(0x0000FF);
                    local27Loc.setFillColor(0x0000FF);
                    local27Loc.setStrokeColor(0x0000FF);
                    local28Loc.setFillColor(0x0000FF);
                    local28Loc.setStrokeColor(0x0000FF);
                    //local29Loc.setFillColor(0x0000FF);
                    //local29Loc.setStrokeColor(0x0000FF);
                    local30Loc.setFillColor(color_Red);
                    local30Loc.setStrokeColor(color_Red);
                    return true;
                }

                return false;
            }
        });
    }

    public void campoyMap(GoogleMap googleMap){
        mMap = googleMap;
        final LatLng local24 = new LatLng(-12.024076387091215, -76.97699645338558);
        campoy = new MarkerOptions();
        campoy.position(local24);
        campoy.title("La Delicia - CAMPOY");
        campoy.snippet("Telf: 922 671 203");
        campoy.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        campoy_marker = mMap.addMarker(campoy);

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
                //.add(p2401)  Local
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
                .add(p2433);
        //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        campoyLoc = mMap.addPolygon(laland1);
        campoyLoc.setClickable(true);
        campoyLoc.setTag("campoy");
        mMap.addPolygon(laland1);
    }

    public void lurinMap(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local01latlng = new LatLng(-12.275135117790825, -76.87049838784992);          //     Jr. Castilla N° 280 LURÍN
        // Local01
        local01 = new MarkerOptions();
        local01.position(local01latlng);
        local01.title("La Delicia - LURÍN");
        local01.snippet("Telf: 01 405 3039 / 992 395 721");
        local01.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local01_marker = mMap.addMarker(local01);

        // Local 01 LURÍN
        final LatLng lurin_01 = new LatLng(-12.287848942346573, -76.8813775939503);
        final LatLng lurin_02 = new LatLng(-12.283686805817187, -76.890413315754);
        final LatLng lurin_03 = new LatLng(-12.281632112255643, -76.89358667307307);
        final LatLng lurin_04 = new LatLng(-12.277373241794335, -76.89828935922061);
        final LatLng lurin_05 = new LatLng(-12.273562615089327, -76.90272441282318);
        final LatLng lurin_06 = new LatLng(-12.26339458294889, -76.89533628061704);
        final LatLng lurin_07 = new LatLng(-12.257629492868247, -76.8937102292125);
        final LatLng lurin_08 = new LatLng(-12.255673815336722, -76.89250111406889);
        final LatLng lurin_09 = new LatLng(-12.254084816646719, -76.89293889716393);
        final LatLng lurin_10 = new LatLng(-12.25284213154781, -76.89466918254713);
        final LatLng lurin_11 = new LatLng(-12.252433099850922, -76.89634069555582);
        final LatLng lurin_12 = new LatLng(-12.252922579032209, -76.89885905314377);
        final LatLng lurin_13 = new LatLng(-12.250420786972871, -76.90037563323284);
        final LatLng lurin_14 = new LatLng(-12.24778064463158, -76.90105361349285);
        final LatLng lurin_15 = new LatLng(-12.246543324172142, -76.900705774047);
        final LatLng lurin_16 = new LatLng(-12.244530966422762, -76.8991474533296);
        final LatLng lurin_17 = new LatLng(-12.243742335553609, -76.89814567572556);
        final LatLng lurin_18 = new LatLng(-12.244721325245143, -76.8954881823593);
        final LatLng lurin_19 = new LatLng(-12.24423183085316, -76.89349854072906);
        final LatLng lurin_20 = new LatLng(-12.244830101653445, -76.89235762734667);
        final LatLng lurin_21 = new LatLng(-12.245376839135053, -76.89154799532909);
        final LatLng lurin_22 = new LatLng(-12.242184878146324, -76.88889416329756);
        final LatLng lurin_23 = new LatLng(-12.248144836506839, -76.88044783315259);
        final LatLng lurin_24 = new LatLng(-12.24207585813401, -76.87513020492412);
        final LatLng lurin_25 = new LatLng(-12.234986040449083, -76.87033543811218);
        final LatLng lurin_26 = new LatLng(-12.234368007155025, -76.87115040432036);
        final LatLng lurin_27 = new LatLng(-12.22586040690993, -76.86573333265873);
        final LatLng lurin_28 = new LatLng(-12.227761372277188, -76.8624540144105);
        final LatLng lurin_29 = new LatLng(-12.226803036073058, -76.86190746136913);
        final LatLng lurin_30 = new LatLng(-12.227578285386203, -76.86077573760586);
        final LatLng lurin_31 = new LatLng(-12.22654022457413, -76.8596492099122);
        final LatLng lurin_32 = new LatLng(-12.228312265318865, -76.85810425764662);
        final LatLng lurin_33 = new LatLng(-12.228731681533683, -76.85852268214272);
        final LatLng lurin_34 = new LatLng(-12.230423122633901, -76.85652716723963);
        final LatLng lurin_35 = new LatLng(-12.231304884035575, -76.85752249595801);
        final LatLng lurin_36 = new LatLng(-12.232165648255593, -76.85675630763951);
        final LatLng lurin_37 = new LatLng(-12.233411260890268, -76.85746033006663);
        final LatLng lurin_38 = new LatLng(-12.231156930958067, -76.859595368267);
        final LatLng lurin_39 = new LatLng(-12.234522690943008, -76.86119396478435);
        final LatLng lurin_40 = new LatLng(-12.236976208562968, -76.86224539072614);
        final LatLng lurin_41 = new LatLng(-12.239450673356139, -76.86434824257795);
        final LatLng lurin_42 = new LatLng(-12.249106774162192, -76.87097229694183);
        final LatLng lurin_43 = new LatLng(-12.255926343881278, -76.87430287550376);
        final LatLng lurin_44 = new LatLng(-12.259910689151445, -76.87560185716796);
        final LatLng lurin_45 = new LatLng(-12.262776567468558, -76.87357744646077);
        final LatLng lurin_46 = new LatLng(-12.267034587106988, -76.87059038603589);
        final LatLng lurin_47 = new LatLng(-12.270144765389489, -76.87051001067317);
        final LatLng lurin_48 = new LatLng(-12.270977281629564, -76.86739144325207);
        final LatLng lurin_49 = new LatLng(-12.267301624033417, -76.86544635733715);
        final LatLng lurin_50 = new LatLng(-12.263673039942049, -76.86181338703241);
        final LatLng lurin_51 = new LatLng(-12.26625938788515, -76.85701074914918);
        final LatLng lurin_52 = new LatLng(-12.268701277708278, -76.85630238508229);
        final LatLng lurin_53 = new LatLng(-12.2705855551176, -76.85695171849451);
        final LatLng lurin_54 = new LatLng(-12.271546915943725, -76.84929745461808);
        final LatLng lurin_55 = new LatLng(-12.266969068401608, -76.84279224579168);
        final LatLng lurin_56 = new LatLng(-12.259610039693511, -76.83029358547776);
        final LatLng lurin_57 = new LatLng(-12.264011265987543, -76.82692162667406);
        final LatLng lurin_58 = new LatLng(-12.274251920893912, -76.82756643507227);
        final LatLng lurin_59 = new LatLng(-12.281145313626494, -76.83478784807515);
        final LatLng lurin_60 = new LatLng(-12.2848477472161, -76.84590275331425);
        final LatLng lurin_61 = new LatLng(-12.295108505256499, -76.84994453717698);
        final LatLng lurin_62 = new LatLng(-12.300185845840037, -76.84247445414583);
        final LatLng lurin_63 = new LatLng(-12.30670867400682, -76.8354374193915);
        final LatLng lurin_64 = new LatLng(-12.339708173423215, -76.81457892696712);
        final LatLng lurin_65 = new LatLng(-12.341298112149296, -76.8176326241552);
        final LatLng lurin_66 = new LatLng(-12.3386262299233, -76.82097767554535);
        final LatLng lurin_67 = new LatLng(-12.338568563100765, -76.82294535255208);
        final LatLng lurin_68 = new LatLng(-12.339914118985174, -76.824676908318);
        final LatLng lurin_69 = new LatLng(-12.33837634027654, -76.82821872725037);
        final LatLng lurin_70 = new LatLng(-12.336953886924755, -76.82804163631977);
        final LatLng lurin_71 = new LatLng(-12.335665983240304, -76.82886806099414);
        final LatLng lurin_72 = new LatLng(-12.334205069940404, -76.83089476855848);
        final LatLng lurin_73 = new LatLng(-12.331437001431025, -76.83069800085782);
        final LatLng lurin_74 = new LatLng(-12.329591562697916, -76.83244932250959);
        final LatLng lurin_75 = new LatLng(-12.329450435169251, -76.83468187630201);
        final LatLng lurin_76 = new LatLng(-12.326596563324665, -76.83452275372154);
        final LatLng lurin_77 = new LatLng(-12.324793362013768, -76.83569421961374);
        final LatLng lurin_78 = new LatLng(-12.324696143273572, -76.83711570372348);
        final LatLng lurin_79 = new LatLng(-12.324311242706061, -76.83774607181746);
        final LatLng lurin_80 = new LatLng(-12.322386731395028, -76.83757534712534);
        final LatLng lurin_81 = new LatLng(-12.321178033758724, -76.83670979340553);
        final LatLng lurin_82 = new LatLng(-12.320587844741178, -76.83576424126458);
        final LatLng lurin_83 = new LatLng(-12.319202178351269, -76.83564604724697);
        final LatLng lurin_84 = new LatLng(-12.31528891430874, -76.8373795595054);
        final LatLng lurin_85 = new LatLng(-12.31287677486385, -76.83963837869989);
        final LatLng lurin_86 = new LatLng(-12.31260733235808, -76.84159514649009);
        final LatLng lurin_87 = new LatLng(-12.313094894730341, -76.8433155260799);
        final LatLng lurin_88 = new LatLng(-12.311593712949065, -76.84311853605054);
        final LatLng lurin_89 = new LatLng(-12.303619608155865, -76.85136801883974);
        final LatLng lurin_90 = new LatLng(-12.292930548807528, -76.87047873588446);

        PolygonOptions lurin_Loc = new PolygonOptions()
                .add(lurin_01)
                .add(lurin_02)
                .add(lurin_03)
                .add(lurin_04)
                .add(lurin_05)
                .add(lurin_06)
                .add(lurin_07)
                .add(lurin_08)
                .add(lurin_09)
                .add(lurin_10)
                .add(lurin_11)
                .add(lurin_12)
                .add(lurin_13)
                .add(lurin_14)
                .add(lurin_15)
                .add(lurin_16)
                .add(lurin_17)
                .add(lurin_18)
                .add(lurin_19)
                .add(lurin_20)
                .add(lurin_21)
                .add(lurin_22)
                .add(lurin_23)
                .add(lurin_24)
                .add(lurin_25)
                .add(lurin_26)
                .add(lurin_27)
                .add(lurin_28)
                .add(lurin_29)
                .add(lurin_30)
                .add(lurin_31)
                .add(lurin_32)
                .add(lurin_33)
                .add(lurin_34)
                .add(lurin_35)
                .add(lurin_36)
                .add(lurin_37)
                .add(lurin_38)
                .add(lurin_39)
                .add(lurin_40)
                .add(lurin_41)
                .add(lurin_42)
                .add(lurin_43)
                .add(lurin_44)
                .add(lurin_45)
                .add(lurin_46)
                .add(lurin_47)
                .add(lurin_48)
                .add(lurin_49)
                .add(lurin_50)
                .add(lurin_51)
                .add(lurin_52)
                .add(lurin_53)
                .add(lurin_54)
                .add(lurin_55)
                .add(lurin_56)
                .add(lurin_57)
                .add(lurin_58)
                .add(lurin_59)
                .add(lurin_60)
                .add(lurin_61)
                .add(lurin_62)
                .add(lurin_63)
                .add(lurin_64)
                .add(lurin_65)
                .add(lurin_66)
                .add(lurin_67)
                .add(lurin_68)
                .add(lurin_69)
                .add(lurin_70)
                .add(lurin_71)
                .add(lurin_72)
                .add(lurin_73)
                .add(lurin_74)
                .add(lurin_75)
                .add(lurin_76)
                .add(lurin_77)
                .add(lurin_78)
                .add(lurin_79)
                .add(lurin_80)
                .add(lurin_81)
                .add(lurin_82)
                .add(lurin_83)
                .add(lurin_84)
                .add(lurin_85)
                .add(lurin_86)
                .add(lurin_87)
                .add(lurin_88)
                .add(lurin_89)
                .add(lurin_90);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local01Loc = mMap.addPolygon(lurin_Loc);
        local01Loc.setClickable(true);
        local01Loc.setTag("lurin");
        mMap.addPolygon(lurin_Loc);
    }

    public void local02Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local02latlng = new LatLng(-12.015347929575498, -77.09403878938531);          //     Urb. Chávez Mz L lt 29 2da Etapa (Dominicos)
        // Local02
        local02 = new MarkerOptions();
        local02.position(local02latlng);
        local02.title("La Delicia - CALLAO - Los Dominicos");
        local02.snippet("Telf: 01 605 1779 / 928 198 676");
        local02.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local02_marker = mMap.addMarker(local02);

        // Local 02 CALLAO - Los Dominicos
        final LatLng dominic_01 = new LatLng(-12.035964015703545, -77.09877142295882);
        final LatLng dominic_02 = new LatLng(-12.035926633750652, -77.09806405496231);
        final LatLng dominic_03 = new LatLng(-12.035571398653303, -77.09703167240298);
        final LatLng dominic_04 = new LatLng(-12.03473002060378, -77.0966110457961);
        final LatLng dominic_05 = new LatLng(-12.030055752106373, -77.0944697503326);
        final LatLng dominic_06 = new LatLng(-12.031289806061286, -77.08364964047259);
        final LatLng dominic_07 = new LatLng(-12.03185069887068, -77.07753219507867);
        final LatLng dominic_08 = new LatLng(-12.026222891490477, -77.07512349417854);
        final LatLng dominic_09 = new LatLng(-12.02349310997891, -77.07441612653741);
        final LatLng dominic_10 = new LatLng(-12.02289478029796, -77.07439702391784);
        final LatLng dominic_11 = new LatLng(-12.022165572427356, -77.07472203218796);
        final LatLng dominic_12 = new LatLng(-12.019342239304057, -77.0760985023791);
        final LatLng dominic_13 = new LatLng(-12.017771582065086, -77.07340305567303);
        final LatLng dominic_14 = new LatLng(-12.013321502961192, -77.0701341137501);
        final LatLng dominic_15 = new LatLng(-12.012047044959543, -77.06995317591829);
        final LatLng dominic_16 = new LatLng(-12.012047044959543, -77.06995317591829);
        final LatLng dominic_17 = new LatLng(-12.010886108563511, -77.07039048216193);
        final LatLng dominic_18 = new LatLng(-12.011772121162632, -77.07491954426358);
        final LatLng dominic_19 = new LatLng(-12.012428913495468, -77.07963605122337);
        final LatLng dominic_20 = new LatLng(-12.012841403045257, -77.0824159789625);
        final LatLng dominic_21 = new LatLng(-12.01258172168705, -77.08491478969175);
        final LatLng dominic_22 = new LatLng(-12.012062334106853, -77.08728865627603);
        final LatLng dominic_23 = new LatLng(-12.011558259809654, -77.09020915322509);
        final LatLng dominic_24 = new LatLng(-12.011848498395311, -77.0919739274362);
        final LatLng dominic_25 = new LatLng(-12.012398412098939, -77.09330141707306);
        final LatLng dominic_26 = new LatLng(-12.013085817009577, -77.09478508317129);
        final LatLng dominic_27 = new LatLng(-12.014262035402984, -77.09605010310004);
        final LatLng dominic_28 = new LatLng(-12.015132741161157, -77.09676850864929);
        final LatLng dominic_29 = new LatLng(-12.016675532550664, -77.09828341326785);
        final LatLng dominic_30 = new LatLng(-12.01803501443608, -77.09962654306315);
        final LatLng dominic_31 = new LatLng(-12.019440361053118, -77.101313221961);
        final LatLng dominic_32 = new LatLng(-12.02185375270883, -77.10606103946645);
        final LatLng dominic_33 = new LatLng(-12.033432167408314, -77.10011938939213);
        final LatLng dominic_34 = new LatLng(-12.035402542134804, -77.09949470087422);

        PolygonOptions dominic_Loc = new PolygonOptions()
                .add(dominic_01)
                .add(dominic_02)
                .add(dominic_03)
                .add(dominic_04)
                .add(dominic_05)
                .add(dominic_06)
                .add(dominic_07)
                .add(dominic_08)
                .add(dominic_09)
                .add(dominic_10)
                .add(dominic_11)
                .add(dominic_12)
                .add(dominic_13)
                .add(dominic_14)
                .add(dominic_15)
                .add(dominic_16)
                .add(dominic_17)
                .add(dominic_18)
                .add(dominic_19)
                .add(dominic_20)
                .add(dominic_21)
                .add(dominic_22)
                .add(dominic_23)
                .add(dominic_24)
                .add(dominic_25)
                .add(dominic_26)
                .add(dominic_27)
                .add(dominic_28)
                .add(dominic_29)
                .add(dominic_30)
                .add(dominic_31)
                .add(dominic_32)
                .add(dominic_33)
                .add(dominic_34);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local02Loc = mMap.addPolygon(dominic_Loc);
        local02Loc.setClickable(true);
        local01Loc.setTag("local02");
        mMap.addPolygon(dominic_Loc);

    }
    public void local03Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local03latlng = new LatLng(-11.890411417756997, -77.06855592068621);          //     Asoc. de Vivienda Cruz de Motupe Mz. J Lt. 25 (Paradero Establo)
        // Local03
        local03 = new MarkerOptions();
        local03.position(local03latlng);
        local03.title("La Delicia - Puente Piedra");
        local03.snippet("Telf: 01 505 3775 / 976 828 169");
        local03.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local03_marker = mMap.addMarker(local03);

        // Local 03 Puente Piedra
        final LatLng ppiedra_01 = new LatLng(-11.844771677442205, -77.08180666349281);
        final LatLng ppiedra_02 = new LatLng(-11.846289961989484, -77.07845688524131);
        final LatLng ppiedra_03 = new LatLng(-11.845588123506776, -77.07727943141104);
        final LatLng ppiedra_04 = new LatLng(-11.85172445549432, -77.06833907594579);
        final LatLng ppiedra_05 = new LatLng(-11.852053566878073, -77.03366644334935);
        final LatLng ppiedra_06 = new LatLng(-11.854315991735296, -77.03690435809426);
        final LatLng ppiedra_07 = new LatLng(-11.8566884912522, -77.0339005445999);
        final LatLng ppiedra_08 = new LatLng(-11.859312991249334, -77.03245254459976);
        final LatLng ppiedra_09 = new LatLng(-11.859296603927403, -77.03246432286774);
        final LatLng ppiedra_10 = new LatLng(-11.864593293167188, -77.03121842891474);
        final LatLng ppiedra_11 = new LatLng(-11.876469490745905, -77.04041691761067);
        final LatLng ppiedra_12 = new LatLng(-11.884446721972639, -77.04783086388515);
        final LatLng ppiedra_13 = new LatLng(-11.889021381984243, -77.04312221643734);
        final LatLng ppiedra_14 = new LatLng(-11.89499168878666, -77.0360868214646);
        final LatLng ppiedra_15 = new LatLng(-11.92108149409858, -77.05094827343414);
        final LatLng ppiedra_16 = new LatLng(-11.927642499962241, -77.05228945993967);
        final LatLng ppiedra_17 = new LatLng(-11.930020997337524, -77.05343518877484);
        final LatLng ppiedra_18 = new LatLng(-11.924681323521718, -77.06389648255855);
        final LatLng ppiedra_19 = new LatLng(-11.92914809305388, -77.06696682510628);
        final LatLng ppiedra_20 = new LatLng(-11.930909615728405, -77.07228767971493);
        final LatLng ppiedra_21 = new LatLng(-11.929704018848241, -77.07889064600568);
        final LatLng ppiedra_22 = new LatLng(-11.927091218671755, -77.08217459528088);
        final LatLng ppiedra_23 = new LatLng(-11.925796968385253, -77.08421556267066);
        final LatLng ppiedra_24 = new LatLng(-11.920117548666918, -77.08647839122841);
        final LatLng ppiedra_25 = new LatLng(-11.915340996211473, -77.08143173110464);
        final LatLng ppiedra_26 = new LatLng(-11.90161006387876, -77.07057808820443);
        final LatLng ppiedra_27 = new LatLng(-11.893493552499592, -77.07101650333956);
        final LatLng ppiedra_28 = new LatLng(-11.892072820196045, -77.0756697225115);
        final LatLng ppiedra_29 = new LatLng(-11.875577012921479, -77.08045586097055);
        final LatLng ppiedra_30 = new LatLng(-11.853671491638883, -77.0932117311054);

        PolygonOptions ppiedra_Loc = new PolygonOptions()
                .add(ppiedra_01)
                .add(ppiedra_02)
                .add(ppiedra_03)
                .add(ppiedra_04)
                .add(ppiedra_05)
                .add(ppiedra_06)
                .add(ppiedra_07)
                .add(ppiedra_08)
                .add(ppiedra_09)
                .add(ppiedra_10)
                .add(ppiedra_11)
                .add(ppiedra_12)
                .add(ppiedra_13)
                .add(ppiedra_14)
                .add(ppiedra_15)
                .add(ppiedra_16)
                .add(ppiedra_17)
                .add(ppiedra_18)
                .add(ppiedra_19)
                .add(ppiedra_20)
                .add(ppiedra_21)
                .add(ppiedra_22)
                .add(ppiedra_23)
                .add(ppiedra_24)
                .add(ppiedra_25)
                .add(ppiedra_26)
                .add(ppiedra_27)
                .add(ppiedra_28)
                .add(ppiedra_29)
                .add(ppiedra_30);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local03Loc = mMap.addPolygon(ppiedra_Loc);
        local03Loc.setClickable(true);
        local03Loc.setTag("local03");
        mMap.addPolygon(ppiedra_Loc);

    }
    public void local04Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local04latlng = new LatLng(-11.979748861746241, -76.90595133991687);          //     LURIGANCHO, CHOSICA - Cajamarquilla
        // Local04
        local04 = new MarkerOptions();
        local04.position(local04latlng);
        local04.title("La Delicia - LURIGANCHO, CHOSICA - Cajamarquilla");
        local04.snippet("Telf: 926 278 456");
        local04.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local04_marker = mMap.addMarker(local04);

        // Local 04 LURICANCHO CHOSICA CAJAMARQUILLA
        final LatLng lucho_01 = new LatLng(-11.98349144179798, -76.9186673617853);
        final LatLng lucho_02 = new LatLng(-11.982840833844827, -76.9189785961592);
        final LatLng lucho_03 = new LatLng(-11.982379051134616, -76.9187425617853);
        final LatLng lucho_04 = new LatLng(-11.98195924798532, -76.91924681703864);
        final LatLng lucho_05 = new LatLng(-11.981591919694203, -76.91985836064379);
        final LatLng lucho_06 = new LatLng(-11.98056339776539, -76.92084541352509);
        final LatLng lucho_07 = new LatLng(-11.98008062080975, -76.9200943950503);
        final LatLng lucho_08 = new LatLng(-11.980479436592073, -76.91916098638983);
        final LatLng lucho_09 = new LatLng(-11.97847485655811, -76.91862454453924);
        final LatLng lucho_10 = new LatLng(-11.977992075899552, -76.91998710660681);
        final LatLng lucho_11 = new LatLng(-11.975063887724453, -76.92018022566029);
        final LatLng lucho_12 = new LatLng(-11.9745706055527, -76.91940774944545);
        final LatLng lucho_13 = new LatLng(-11.973940882376667, -76.91902151137906);
        final LatLng lucho_14 = new LatLng(-11.973195708055522, -76.91873183282925);
        final LatLng lucho_15 = new LatLng(-11.972586972577798, -76.91666116763994);
        final LatLng lucho_16 = new LatLng(-11.973363634842503, -76.9162963872439);
        final LatLng lucho_17 = new LatLng(-11.973132735483498, -76.91421499321942);
        final LatLng lucho_18 = new LatLng(-11.976155402426988, -76.91350688990634);
        final LatLng lucho_19 = new LatLng(-11.976785120440523, -76.91506257100713);
        final LatLng lucho_20 = new LatLng(-11.977950094943326, -76.91471924823384);
        final LatLng lucho_21 = new LatLng(-11.978201980651153, -76.91410770462872);
        final LatLng lucho_22 = new LatLng(-11.978201980651153, -76.91410770462872);
        final LatLng lucho_23 = new LatLng(-11.979303977891853, -76.91214432769242);
        final LatLng lucho_24 = new LatLng(-11.978233466379455, -76.9126271252754);
        final LatLng lucho_25 = new LatLng(-11.97725740800761, -76.9113933091294);
        final LatLng lucho_26 = new LatLng(-11.977026511976867, -76.90991272987485);
        final LatLng lucho_27 = new LatLng(-11.9755466736388, -76.91017022191912);
        final LatLng lucho_28 = new LatLng(-11.97531577614565, -76.90847506596104);
        final LatLng lucho_29 = new LatLng(-11.975294785454668, -76.90732708059701);
        final LatLng lucho_30 = new LatLng(-11.976407289828996, -76.90674772349742);
        final LatLng lucho_31 = new LatLng(-11.977404341782947, -76.90655460408856);
        final LatLng lucho_32 = new LatLng(-11.977582761210801, -76.90760602993598);
        final LatLng lucho_33 = new LatLng(-11.978149504493897, -76.90739145323242);
        final LatLng lucho_34 = new LatLng(-11.979419424939469, -76.90659751942927);
        final LatLng lucho_35 = new LatLng(-11.978432875689439, -76.90524568619686);
        final LatLng lucho_36 = new LatLng(-11.976565342029074, -76.90103046319572);
        final LatLng lucho_37 = new LatLng(-11.973269544280404, -76.89960515230086);
        final LatLng lucho_38 = new LatLng(-11.96683779177445, -76.8964544346097);
        final LatLng lucho_39 = new LatLng(-11.962638985709, -76.89438074789597);
        final LatLng lucho_40 = new LatLng(-11.960499710473103, -76.89269373419745);
        final LatLng lucho_41 = new LatLng(-11.960625519336435, -76.89010564479565);
        final LatLng lucho_42 = new LatLng(-11.962607001261544, -76.88820878362196);
        final LatLng lucho_43 = new LatLng(-11.964525565118207, -76.88864281103719);
        final LatLng lucho_44 = new LatLng(-11.967733625147105, -76.8880319575786);
        final LatLng lucho_45 = new LatLng(-11.971270598991728, -76.88631538833258);
        final LatLng lucho_46 = new LatLng(-11.973495636356306, -76.88534979301402);
        final LatLng lucho_47 = new LatLng(-11.974146351352035, -76.88418034997964);
        final LatLng lucho_48 = new LatLng(-11.977378912289714, -76.8842983671666);
        final LatLng lucho_49 = new LatLng(-11.977326435960034, -76.88633684585037);
        final LatLng lucho_50 = new LatLng(-11.978585865110155, -76.88776378141395);
        final LatLng lucho_51 = new LatLng(-11.98257401862317, -76.88956622564623);
        final LatLng lucho_52 = new LatLng(-11.983634017927677, -76.89058546523941);
        final LatLng lucho_53 = new LatLng(-11.984368668452673, -76.89243082488998);
        final LatLng lucho_54 = new LatLng(-11.986047862144023, -76.89221624818643);
        final LatLng lucho_55 = new LatLng(-11.985050842149773, -76.89399723482593);
        final LatLng lucho_56 = new LatLng(-11.98690844489392, -76.89663652873202);
        final LatLng lucho_57 = new LatLng(-11.990384176468162, -76.90049483961187);
        final LatLng lucho_58 = new LatLng(-11.992504109509609, -76.90154626545927);
        final LatLng lucho_59 = new LatLng(-11.993171604440448, -76.90053280829122);
        final LatLng lucho_60 = new LatLng(-11.99578475983375, -76.90178808200702);
        final LatLng lucho_61 = new LatLng(-11.996281359946012, -76.90012302302688);
        final LatLng lucho_62 = new LatLng(-11.998012951802572, -76.89800944249684);
        final LatLng lucho_63 = new LatLng(-11.998558663295075, -76.89867463027787);
        final LatLng lucho_64 = new LatLng(-11.997908007158147, -76.89966168311423);
        final LatLng lucho_65 = new LatLng(-12.001077317461787, -76.90279450303112);
        final LatLng lucho_66 = new LatLng(-12.001734507445798, -76.9039075268452);
        final LatLng lucho_67 = new LatLng(-12.00167154153336, -76.90495895269261);
        final LatLng lucho_68 = new LatLng(-12.003455570022535, -76.904862393176);
        final LatLng lucho_69 = new LatLng(-12.004756853980897, -76.90373586538445);
        final LatLng lucho_70 = new LatLng(-12.005774789477346, -76.90353201752046);
        final LatLng lucho_71 = new LatLng(-12.00708655834824, -76.90255567808826);
        final LatLng lucho_72 = new LatLng(-12.009678590817755, -76.9034032560673);
        final LatLng lucho_73 = new LatLng(-12.011378614762425, -76.90424010521117);
        final LatLng lucho_74 = new LatLng(-12.009898964897438, -76.90505549668468);
        final LatLng lucho_75 = new LatLng(-12.00804152058102, -76.90506622551986);
        final LatLng lucho_76 = new LatLng(-12.006729758403553, -76.90483019114595);
        final LatLng lucho_77 = new LatLng(-12.005239588773744, -76.90412208805333);
        final LatLng lucho_78 = new LatLng(-12.004599442942245, -76.90481946237074);
        final LatLng lucho_79 = new LatLng(-12.003959295571539, -76.90561339625769);
        final LatLng lucho_80 = new LatLng(-12.001734509421228, -76.90757677326543);
        final LatLng lucho_81 = new LatLng(-11.99939426642812, -76.9088856912524);
        final LatLng lucho_82 = new LatLng(-11.998575701283473, -76.90971181163074);
        final LatLng lucho_83 = new LatLng(-11.997463288278235, -76.91088125471626);
        final LatLng lucho_84 = new LatLng(-11.99602554013752, -76.91168591740131);
        final LatLng lucho_85 = new LatLng(-11.994293935499114, -76.9089071490268);
        final LatLng lucho_86 = new LatLng(-11.992992601043023, -76.90701887389883);
        final LatLng lucho_87 = new LatLng(-11.99191164910404, -76.90462634346105);
        final LatLng lucho_88 = new LatLng(-11.991114050707846, -76.9035427309247);
        final LatLng lucho_89 = new LatLng(-11.989193508109839, -76.90229818601323);
        final LatLng lucho_90 = new LatLng(-11.987803916887577, -76.90069275392437);
        final LatLng lucho_91 = new LatLng(-11.985752916481514, -76.90027558072546);
        final LatLng lucho_92 = new LatLng(-11.981190112836108, -76.90234017491716);
        final LatLng lucho_93 = new LatLng(-11.980170951474399, -76.90339158867131);
        final LatLng lucho_94 = new LatLng(-11.980722608085985, -76.90539883303859);
        final LatLng lucho_95 = new LatLng(-11.980283152908823, -76.90574293204632);
        final LatLng lucho_96 = new LatLng(-11.98152938846222, -76.90725486076886);
        final LatLng lucho_97 = new LatLng(-11.982941919487384, -76.90917753952323);
        final LatLng lucho_98 = new LatLng(-11.980899318029984, -76.91150202186977);
        final LatLng lucho_99 = new LatLng(-11.981451721206543, -76.91236877799898);
        final LatLng lucho_100 = new LatLng(-11.981618726595558, -76.91343252415756);
        final LatLng lucho_101 = new LatLng(-11.98301899848506, -76.91775317213501);
        final LatLng lucho_102 = new LatLng(-11.983455779056198, -76.91838354022899);

        PolygonOptions lucho_Loc = new PolygonOptions()
                .add(lucho_01)
                .add(lucho_02)
                .add(lucho_03)
                .add(lucho_04)
                .add(lucho_05)
                .add(lucho_06)
                .add(lucho_07)
                .add(lucho_08)
                .add(lucho_09)
                .add(lucho_10)
                .add(lucho_11)
                .add(lucho_12)
                .add(lucho_13)
                .add(lucho_14)
                .add(lucho_15)
                .add(lucho_16)
                .add(lucho_17)
                .add(lucho_18)
                .add(lucho_19)
                .add(lucho_20)
                .add(lucho_21)
                .add(lucho_22)
                .add(lucho_23)
                .add(lucho_24)
                .add(lucho_25)
                .add(lucho_26)
                .add(lucho_27)
                .add(lucho_28)
                .add(lucho_29)
                .add(lucho_30)
                .add(lucho_31)
                .add(lucho_32)
                .add(lucho_33)
                .add(lucho_34)
                .add(lucho_35)
                .add(lucho_36)
                .add(lucho_37)
                .add(lucho_38)
                .add(lucho_39)
                .add(lucho_40)
                .add(lucho_41)
                .add(lucho_42)
                .add(lucho_43)
                .add(lucho_44)
                .add(lucho_45)
                .add(lucho_46)
                .add(lucho_47)
                .add(lucho_48)
                .add(lucho_49)
                .add(lucho_50)
                .add(lucho_51)
                .add(lucho_52)
                .add(lucho_53)
                .add(lucho_54)
                .add(lucho_55)
                .add(lucho_56)
                .add(lucho_57)
                .add(lucho_58)
                .add(lucho_59)
                .add(lucho_60)
                .add(lucho_61)
                .add(lucho_62)
                .add(lucho_63)
                .add(lucho_64)
                .add(lucho_65)
                .add(lucho_66)
                .add(lucho_67)
                .add(lucho_68)
                .add(lucho_69)
                .add(lucho_70)
                .add(lucho_71)
                .add(lucho_72)
                .add(lucho_73)
                .add(lucho_74)
                .add(lucho_75)
                .add(lucho_76)
                .add(lucho_77)
                .add(lucho_78)
                .add(lucho_79)
                .add(lucho_80)
                .add(lucho_81)
                .add(lucho_82)
                .add(lucho_83)
                .add(lucho_84)
                .add(lucho_85)
                .add(lucho_86)
                .add(lucho_87)
                .add(lucho_88)
                .add(lucho_89)
                .add(lucho_90)
                .add(lucho_91)
                .add(lucho_92)
                .add(lucho_93)
                .add(lucho_94)
                .add(lucho_95)
                .add(lucho_96)
                .add(lucho_97)
                .add(lucho_98)
                .add(lucho_99)
                .add(lucho_100)
                .add(lucho_101)
                .add(lucho_102);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local04Loc = mMap.addPolygon(lucho_Loc);
        local04Loc.setClickable(true);
        local04Loc.setTag("local04");
        mMap.addPolygon(lucho_Loc);
    }
    public void local05Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local05latlng = new LatLng(-12.016473502097616, -76.98471346472935);                          //     SAN JUAN DE LURIGANCHO - Jr Killke
        // Local05
        local05 = new MarkerOptions();
        local05.position(local05latlng);
        local05.title("La Delicia - SAN JUAN DE LURIGANCHO - Mangomarca");
        local05.snippet("Telf: 948 351 555 / 951 679 738");
        local05.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local05_marker = mMap.addMarker(local05);

        // Local SAN JUAN DE LURIGANCHO - MANGOMARCA
        final LatLng mgm_01 = new LatLng(-12.018153568570716, -76.98177799758687);
        final LatLng mgm_02 = new LatLng(-12.01456769255247, -76.97995671597273);
        final LatLng mgm_03 = new LatLng(-12.014850067240598, -76.97931616530929);
        final LatLng mgm_04 = new LatLng(-12.01403823922017, -76.97908159749026);
        final LatLng mgm_05 = new LatLng(-12.013870578723122, -76.9771058147117);
        final LatLng mgm_06 = new LatLng(-12.013209478436716, -76.97721309158061);
        final LatLng mgm_07 = new LatLng(-12.012590339365747, -76.97833961929327);
        final LatLng mgm_08 = new LatLng(-12.011037238416307, -76.97803921191934);
        final LatLng mgm_09 = new LatLng(-12.010732913545084, -76.97705215906845);
        final LatLng mgm_10 = new LatLng(-12.00779458675515, -76.9737154912719);
        final LatLng mgm_11 = new LatLng(-12.007269882169682, -76.97369403360118);
        final LatLng mgm_12 = new LatLng(-12.006766164806143, -76.97447723858237);
        final LatLng mgm_13 = new LatLng(-12.007889033471983, -76.97557157978895);
        final LatLng mgm_14 = new LatLng(-12.008455713083123, -76.97676248062176);
        final LatLng mgm_15 = new LatLng(-12.008833498824565, -76.97836107709021);
        final LatLng mgm_16 = new LatLng(-12.008329784384896, -76.97944468946143);
        final LatLng mgm_17 = new LatLng(-12.00837176062418, -76.97985238520506);
        final LatLng mgm_18 = new LatLng(-12.008906957101653, -76.98020643677191);
        final LatLng mgm_19 = new LatLng(-12.009169307927678, -76.98057121717409);
        final LatLng mgm_20 = new LatLng(-12.009631044760845, -76.98071069203375);
        final LatLng mgm_21 = new LatLng(-12.009859077882362, -76.98134658486232);
        final LatLng mgm_22 = new LatLng(-12.008144573497411, -76.98354174094095);
        final LatLng mgm_23 = new LatLng(-12.009153767710968, -76.98495352607992);
        final LatLng mgm_24 = new LatLng(-12.009746546795176, -76.98513852878641);
        final LatLng mgm_25 = new LatLng(-12.011200410000104, -76.98513214942231);
        final LatLng mgm_26 = new LatLng(-12.011400081583117, -76.985546810661);
        final LatLng mgm_27 = new LatLng(-12.011063135700907, -76.98633785671635);
        final LatLng mgm_28 = new LatLng(-12.01146247892245, -76.98659303286323);
        final LatLng mgm_29 = new LatLng(-12.011780705140913, -76.9864654448077);
        final LatLng mgm_30 = new LatLng(-12.01235475930593, -76.98587853966991);
        final LatLng mgm_31 = new LatLng(-12.012613707264963, -76.98618475108744);
        final LatLng mgm_32 = new LatLng(-12.013622644503872, -76.98680975427796);
        final LatLng mgm_33 = new LatLng(-12.014871410280245, -76.98894479251433);
        final LatLng mgm_34 = new LatLng(-12.015228199438171, -76.9895241496237);
        final LatLng mgm_35 = new LatLng(-12.015920780849255, -76.99050042722288);
        final LatLng mgm_36 = new LatLng(-12.016623862219783, -76.98965284924213);
        final LatLng mgm_37 = new LatLng(-12.017809651934124, -76.99007127382113);
        final LatLng mgm_38 = new LatLng(-12.017222004587046, -76.99234578691716);
        final LatLng mgm_39 = new LatLng(-12.016634355937695, -76.9934508572283);
        final LatLng mgm_40 = new LatLng(-12.016823243137283, -76.99523184389784);
        final LatLng mgm_41 = new LatLng(-12.016686824617542, -76.99822518896292);
        final LatLng mgm_42 = new LatLng(-12.017957740606677, -77.0020066566918);
        final LatLng mgm_43 = new LatLng(-12.017910234135346, -77.00238738560314);
        final LatLng mgm_44 = new LatLng(-12.017485942097466, -77.00401094392983);
        final LatLng mgm_45 = new LatLng(-12.01728939482712, -77.00537613631565);
        final LatLng mgm_46 = new LatLng(-12.01865898315617, -77.00769823938735);
        final LatLng mgm_47 = new LatLng(-12.018289885537444, -77.00817898206445);
        final LatLng mgm_48 = new LatLng(-12.018095755453492, -77.00867518322006);
        final LatLng mgm_49 = new LatLng(-12.017725143086185, -77.01223880970129);
        final LatLng mgm_50 = new LatLng(-12.017329036789757, -77.01365873419475);
        final LatLng mgm_51 = new LatLng(-12.017708828964313, -77.0139832026806);
        final LatLng mgm_52 = new LatLng(-12.017827551545583, -77.01548531626341);
        final LatLng mgm_53 = new LatLng(-12.018373262845207, -77.01682640764534);
        final LatLng mgm_54 = new LatLng(-12.01911831232677, -77.01708389969394);
        final LatLng mgm_55 = new LatLng(-12.019747930037529, -77.01592518543877);
        final LatLng mgm_56 = new LatLng(-12.020062738321172, -77.01631142351168);
        final LatLng mgm_57 = new LatLng(-12.02081827669927, -77.01655818672494);
        final LatLng mgm_58 = new LatLng(-12.021059628789635, -77.01604320262771);
        final LatLng mgm_59 = new LatLng(-12.02090222527699, -77.01494886142113);
        final LatLng mgm_60 = new LatLng(-12.020681860204611, -77.01465918286644);
        final LatLng mgm_61 = new LatLng(-12.021101603071505, -77.01358629928572);
        final LatLng mgm_62 = new LatLng(-12.02177317870447, -77.01410128725888);
        final LatLng mgm_63 = new LatLng(-12.02355707401415, -77.01407982958817);
        final LatLng mgm_64 = new LatLng(-12.025361944288447, -77.01354338782023);
        final LatLng mgm_65 = new LatLng(-12.025152076309565, -77.01101138258026);
        final LatLng mgm_66 = new LatLng(-12.02571871957241, -77.010195991093);
        final LatLng mgm_67 = new LatLng(-12.02878276994357, -77.01174094342248);
        final LatLng mgm_68 = new LatLng(-12.031028318879686, -77.01240613121472);
        final LatLng mgm_69 = new LatLng(-12.03209803778218, -77.01205761143447);
        final LatLng mgm_70 = new LatLng(-12.030351040801303, -77.01019482556221);
        final LatLng mgm_71 = new LatLng(-12.029801982156384, -77.00853617995398);
        final LatLng mgm_72 = new LatLng(-12.02885360567609, -77.00432577353037);
        final LatLng mgm_73 = new LatLng(-12.02663239503921, -76.99616013683007);
        final LatLng mgm_74 = new LatLng(-12.026357862103316, -76.98952555632087);
        final LatLng mgm_75 = new LatLng(-12.02620811675303, -76.98753518237517);
        final LatLng mgm_76 = new LatLng(-12.024735616332261, -76.97954816828256);
        final LatLng mgm_77 = new LatLng(-12.024011842001622, -76.97765986479563);
        final LatLng mgm_78 = new LatLng(-12.02421150408045, -76.97602673745557);
        final LatLng mgm_79 = new LatLng(-12.022480078067174, -76.97597008690578);
        final LatLng mgm_80 = new LatLng(-12.021332011701404, -76.97693975626393);
        final LatLng mgm_81 = new LatLng(-12.02129457467223, -76.97877702452149);
        final LatLng mgm_82 = new LatLng(-12.02075797668148, -76.98055049874235);
        final LatLng mgm_83 = new LatLng(-12.021893566514134, -76.98098429819204);
        final LatLng mgm_84 = new LatLng(-12.022866925430627, -76.98086946894598);
        final LatLng mgm_85 = new LatLng(-12.022829488615022, -76.98134154481771);
        final LatLng mgm_86 = new LatLng(-12.023840280807836, -76.98211983206572);
        final LatLng mgm_87 = new LatLng(-12.023029151571402, -76.98266846078153);
        final LatLng mgm_88 = new LatLng(-12.022492557040131, -76.98419951766283);
        final LatLng mgm_89 = new LatLng(-12.022130667100777, -76.98520746344303);
        final LatLng mgm_90 = new LatLng(-12.021481759783706, -76.98518194582832);
        final LatLng mgm_91 = new LatLng(-12.02119474258656, -76.98405917078203);
        final LatLng mgm_92 = new LatLng(-12.020608228201938, -76.98303846615117);

        PolygonOptions mgm_Loc = new PolygonOptions()
                .add(mgm_01)
                .add(mgm_02)
                .add(mgm_03)
                .add(mgm_04)
                .add(mgm_05)
                .add(mgm_06)
                .add(mgm_07)
                .add(mgm_08)
                .add(mgm_09)
                .add(mgm_10)
                .add(mgm_11)
                .add(mgm_12)
                .add(mgm_13)
                .add(mgm_14)
                .add(mgm_15)
                .add(mgm_16)
                .add(mgm_17)
                .add(mgm_18)
                .add(mgm_19)
                .add(mgm_20)
                .add(mgm_21)
                .add(mgm_22)
                .add(mgm_23)
                .add(mgm_24)
                .add(mgm_25)
                .add(mgm_26)
                .add(mgm_27)
                .add(mgm_28)
                .add(mgm_29)
                .add(mgm_30)
                .add(mgm_31)
                .add(mgm_32)
                .add(mgm_33)
                .add(mgm_34)
                .add(mgm_35)
                .add(mgm_36)
                .add(mgm_37)
                .add(mgm_38)
                .add(mgm_39)
                .add(mgm_40)
                .add(mgm_41)
                .add(mgm_42)
                .add(mgm_43)
                .add(mgm_44)
                .add(mgm_45)
                .add(mgm_46)
                .add(mgm_47)
                .add(mgm_48)
                .add(mgm_49)
                .add(mgm_50)
                .add(mgm_51)
                .add(mgm_52)
                .add(mgm_53)
                .add(mgm_54)
                .add(mgm_55)
                .add(mgm_56)
                .add(mgm_57)
                .add(mgm_58)
                .add(mgm_59)
                .add(mgm_60)
                .add(mgm_61)
                .add(mgm_62)
                .add(mgm_63)
                .add(mgm_64)
                .add(mgm_65)
                .add(mgm_66)
                .add(mgm_67)
                .add(mgm_68)
                .add(mgm_69)
                .add(mgm_70)
                .add(mgm_71)
                .add(mgm_72)
                .add(mgm_73)
                .add(mgm_74)
                .add(mgm_75)
                .add(mgm_76)
                .add(mgm_77)
                .add(mgm_78)
                .add(mgm_79)
                .add(mgm_80)
                .add(mgm_81)
                .add(mgm_82)
                .add(mgm_83)
                .add(mgm_84)
                .add(mgm_85)
                .add(mgm_86)
                .add(mgm_87)
                .add(mgm_88)
                .add(mgm_89)
                .add(mgm_90)
                .add(mgm_91)
                .add(mgm_92);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);

        local05Loc = mMap.addPolygon(mgm_Loc);
        local05Loc.setClickable(true);
        local05Loc.setTag("local05");
        mMap.addPolygon(mgm_Loc);
    }
    public void local06Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local06latlng = new LatLng(-12.0402778,-76.9201054);                          //     ATE - Las Garzas de Ate
        // Local06
        local06 = new MarkerOptions();
        local06.position(local06latlng);
        local06.title("La Delicia - ATE - Las Garzas");
        local06.snippet("Telf: 01 308 6822 / 914 396 071");
        local06.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local06_marker = mMap.addMarker(local06);
        /*
        local06Loc = mMap.addPolygon(ppiedra_Loc);
        local06Loc.setClickable(true);
        local06Loc.setTag("local06");
        mMap.addPolygon(ppiedra_Loc);
         */
    }
    public void local07Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local07latlng = new LatLng(-12.0338611,-76.9154109);                          //     ATE - Santa Rosa de Valle                                               Excel Datos
        // Local07
        local07 = new MarkerOptions();
        local07.position(local07latlng);
        local07.title("La Delicia - ATE - Santa Rosa de Valle");
        local07.snippet("Telf: 918 749 455");
        local07.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local07_marker = mMap.addMarker(local07);
        /*
        local07Loc = mMap.addPolygon(ppiedra_Loc);
        local07Loc.setClickable(true);
        local07Loc.setTag("local07");
        mMap.addPolygon(ppiedra_Loc);

         */
    }
    public void local08Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local08latlng = new LatLng(-11.955962627677193, -77.05178168682386);                           //     COMAS - Boulevar España                                                 Excel Datos
        // Local08
        local08 = new MarkerOptions();
        local08.position(local08latlng);
        local08.title("La Delicia - COMAS - Boulevard España");
        local08.snippet("Telf: 01 789 5894 / 947 352 794");
        local08.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local08_marker = mMap.addMarker(local08);
        // Local 08 Comas España
        final LatLng comaspa_01 = new LatLng(-11.976379545540649, -77.05952967531259);
        final LatLng comaspa_02 = new LatLng(-11.974049578059297, -77.05814029113364);
        final LatLng comaspa_03 = new LatLng(-11.973050012347427, -77.05764351058289);
        final LatLng comaspa_04 = new LatLng(-11.972170575964, -77.0574917819392);
        final LatLng comaspa_05 = new LatLng(-11.971406169005814, -77.05746902264151);
        final LatLng comaspa_06 = new LatLng(-11.969163834031516, -77.05749205150552);
        final LatLng comaspa_07 = new LatLng(-11.968410810410122, -77.05730468682331);
        final LatLng comaspa_08 = new LatLng(-11.966255026900043, -77.05599650989825);
        final LatLng comaspa_09 = new LatLng(-11.965528260168552, -77.05568077347733);
        final LatLng comaspa_10 = new LatLng(-11.961030941627126, -77.05404353582469);
        final LatLng comaspa_11 = new LatLng(-11.961244842826268, -77.0520288470269);
        final LatLng comaspa_12 = new LatLng(-11.960648974779312, -77.05165402120404);
        final LatLng comaspa_13 = new LatLng(-11.961703201969037, -77.04778082083574);
        final LatLng comaspa_14 = new LatLng(-11.961626808815193, -77.04757778996836);
        final LatLng comaspa_15 = new LatLng(-11.961932381231794, -77.04648454798505);
        final LatLng comaspa_16 = new LatLng(-11.962436574964336, -77.04548501245746);
        final LatLng comaspa_17 = new LatLng(-11.96098510561652, -77.04490715598058);
        final LatLng comaspa_18 = new LatLng(-11.960790822520117, -77.04192452130998);
        final LatLng comaspa_19 = new LatLng(-11.95723580970938, -77.04049457799046);
        final LatLng comaspa_20 = new LatLng(-11.956274269990335, -77.0400307547007);
        final LatLng comaspa_21 = new LatLng(-11.954383592008549, -77.04363090702066);
        final LatLng comaspa_22 = new LatLng(-11.952741392386066, -77.04862252929433);
        final LatLng comaspa_23 = new LatLng(-11.952179584982385, -77.0484127044718);
        final LatLng comaspa_24 = new LatLng(-11.950731845144889, -77.04976000070072);
        final LatLng comaspa_25 = new LatLng(-11.949720868881009, -77.04922735221007);
        final LatLng comaspa_26 = new LatLng(-11.949879742828202, -77.04749515906848);
        final LatLng comaspa_27 = new LatLng(-11.94806151310867, -77.04733276596299);
        final LatLng comaspa_28 = new LatLng(-11.946790510281117, -77.04711624176582);
        final LatLng comaspa_29 = new LatLng(-11.946375667803675, -77.04675536819809);
        final LatLng comaspa_30 = new LatLng(-11.944557414554959, -77.04604264290185);
        final LatLng comaspa_31 = new LatLng(-11.94378899372684, -77.04595373812099);
        final LatLng comaspa_32 = new LatLng(-11.943939059573543, -77.04447100173611);
        final LatLng comaspa_33 = new LatLng(-11.943513872827515, -77.04426648637958);
        final LatLng comaspa_34 = new LatLng(-11.942186508849375, -77.04421535754047);
        final LatLng comaspa_35 = new LatLng(-11.942159980541557, -77.04376343817965);
        final LatLng comaspa_36 = new LatLng(-11.942009653414834, -77.04328440365721);
        final LatLng comaspa_37 = new LatLng(-11.942124609445582, -77.04277464723519);
        final LatLng comaspa_38 = new LatLng(-11.941192943140706, -77.0424742653053);
        final LatLng comaspa_39 = new LatLng(-11.94107413982453, -77.04294081596238);
        final LatLng comaspa_40 = new LatLng(-11.938741628590265, -77.04209199570805);
        final LatLng comaspa_41 = new LatLng(-11.936034930305832, -77.04117995401889);
        final LatLng comaspa_42 = new LatLng(-11.93518722253725, -77.04449370548949);
        final LatLng comaspa_43 = new LatLng(-11.935100657182783, -77.04505555272674);
        final LatLng comaspa_44 = new LatLng(-11.933984063431303, -77.04681030054111);
        final LatLng comaspa_45 = new LatLng(-11.933719257917966, -77.04665241835554);
        final LatLng comaspa_46 = new LatLng(-11.930003342769657, -77.05362614618956);
        final LatLng comaspa_47 = new LatLng(-11.942269103949391, -77.0604679695192);
        final LatLng comaspa_48 = new LatLng(-11.941675324390651, -77.06262251627432);
        final LatLng comaspa_49 = new LatLng(-11.941734702405101, -77.06438256855316);
        final LatLng comaspa_50 = new LatLng(-11.942269103949391, -77.06668884395302);
        final LatLng comaspa_51 = new LatLng(-11.94592081961816, -77.06635504093461);
        final LatLng comaspa_52 = new LatLng(-11.95450067346869, -77.06453429723155);
        final LatLng comaspa_53 = new LatLng(-11.976101496808514, -77.05974401853892);

        PolygonOptions loca08_Loc = new PolygonOptions()
                .add(comaspa_01)
                .add(comaspa_02)
                .add(comaspa_03)
                .add(comaspa_04)
                .add(comaspa_05)
                .add(comaspa_06)
                .add(comaspa_07)
                .add(comaspa_08)
                .add(comaspa_09)
                .add(comaspa_10)
                .add(comaspa_11)
                .add(comaspa_12)
                .add(comaspa_13)
                .add(comaspa_14)
                .add(comaspa_15)
                .add(comaspa_16)
                .add(comaspa_17)
                .add(comaspa_18)
                .add(comaspa_19)
                .add(comaspa_20)
                .add(comaspa_21)
                .add(comaspa_22)
                .add(comaspa_23)
                .add(comaspa_24)
                .add(comaspa_25)
                .add(comaspa_26)
                .add(comaspa_27)
                .add(comaspa_28)
                .add(comaspa_29)
                .add(comaspa_30)
                .add(comaspa_31)
                .add(comaspa_32)
                .add(comaspa_33)
                .add(comaspa_34)
                .add(comaspa_35)
                .add(comaspa_36)
                .add(comaspa_37)
                .add(comaspa_38)
                .add(comaspa_39)
                .add(comaspa_40)
                .add(comaspa_41)
                .add(comaspa_42)
                .add(comaspa_43)
                .add(comaspa_44)
                .add(comaspa_45)
                .add(comaspa_46)
                .add(comaspa_47)
                .add(comaspa_48)
                .add(comaspa_49)
                .add(comaspa_50)
                .add(comaspa_51)
                .add(comaspa_52)
                .add(comaspa_53);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local08Loc = mMap.addPolygon(loca08_Loc);
        local08Loc.setClickable(true);
        local08Loc.setTag("local08");
        mMap.addPolygon(loca08_Loc);
    }
    public void local09Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local09latlng = new LatLng(-11.964328085989916, -77.0922444287786);                          //     SAN MARTÍN DE PORRES - Vipol de Naranjal
        // Local09
        local09 = new MarkerOptions();
        local09.position(local09latlng);
        local09.title("La Delicia - San Martín de Porres - Vipol");
        local09.snippet("Telf: 01 380 2198 / 940 318 565");
        local09.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local09_marker = mMap.addMarker(local09);
        // Vipol Local 09
        final LatLng vipol_01 = new LatLng(-11.965478962653576, -77.11129345520648);
        final LatLng vipol_02 = new LatLng(-11.964613063779462, -77.11039759745402);
        final LatLng vipol_03 = new LatLng(-11.963295842579717, -77.10875962129705);
        final LatLng vipol_04 = new LatLng(-11.963088550199984, -77.10857454883526);
        final LatLng vipol_05 = new LatLng(-11.96209931735965, -77.10725221986453);
        final LatLng vipol_06 = new LatLng(-11.960758468110948, -77.10577700490177);
        final LatLng vipol_07 = new LatLng(-11.960343879319366, -77.10552755944795);
        final LatLng vipol_08 = new LatLng(-11.960165448500854, -77.10527006735543);
        final LatLng vipol_09 = new LatLng(-11.959952905766894, -77.10499648205378);
        final LatLng vipol_10 = new LatLng(-11.959320524546012, -77.10452709550684);
        final LatLng vipol_11 = new LatLng(-11.958929549500114, -77.10397456039298);
        final LatLng vipol_12 = new LatLng(-11.958661901844236, -77.10363123766149);
        final LatLng vipol_13 = new LatLng(-11.958326029901404, -77.10342470758086);
        final LatLng vipol_14 = new LatLng(-11.957496844245497, -77.10251007432298);
        final LatLng vipol_15 = new LatLng(-11.955962957106708, -77.1011089606611);
        final LatLng vipol_16 = new LatLng(-11.955398895087031, -77.09878751239675);
        final LatLng vipol_17 = new LatLng(-11.955042644784559, -77.09857509229414);
        final LatLng vipol_18 = new LatLng(-11.951762151131513, -77.09473635741395);
        final LatLng vipol_19 = new LatLng(-11.951235717776466, -77.09437404944374);
        final LatLng vipol_20 = new LatLng(-11.950658421774834, -77.09423121199288);
        final LatLng vipol_21 = new LatLng(-11.950238569364014, -77.09423121199288);
        final LatLng vipol_22 = new LatLng(-11.950065380054857, -77.09391471134978);
        final LatLng vipol_23 = new LatLng(-11.951977939444546, -77.09243802381097);
        final LatLng vipol_24 = new LatLng(-11.951453685851085, -77.09174904821437);
        final LatLng vipol_25 = new LatLng(-11.94944914943904, -77.08930139426135);
        final LatLng vipol_26 = new LatLng(-11.950347875918418, -77.08848483059131);
        final LatLng vipol_27 = new LatLng(-11.949811136852079, -77.08794896068287);
        final LatLng vipol_28 = new LatLng(-11.950110712276148, -77.08742584958175);
        final LatLng vipol_29 = new LatLng(-11.94997340691335, -77.08575444554796);
        final LatLng vipol_30 = new LatLng(-11.949648866691012, -77.08343234240292);
        final LatLng vipol_31 = new LatLng(-11.948741650259675, -77.08062393110596);
        final LatLng vipol_32 = new LatLng(-11.957558912786697, -77.07919768171661);
        final LatLng vipol_33 = new LatLng(-11.959242335126435, -77.07602203505958);
        final LatLng vipol_34 = new LatLng(-11.961089647307418, -77.0762644523883);
        final LatLng vipol_35 = new LatLng(-11.969202693031178, -77.0798369184722);
        final LatLng vipol_36 = new LatLng(-11.976516707073088, -77.0832562788888);
        final LatLng vipol_37 = new LatLng(-11.976142274306866, -77.08511906476106);
        final LatLng vipol_38 = new LatLng(-11.974145290787868, -77.08751772054177);
        final LatLng vipol_39 = new LatLng(-11.973995153820113, -77.08820189867095);
        final LatLng vipol_40 = new LatLng(-11.978837816035272, -77.09391784436116);
        final LatLng vipol_41 = new LatLng(-11.977814374040229, -77.09542338362778);
        final LatLng vipol_42 = new LatLng(-11.977365056817256, -77.0951171722515);
        final LatLng vipol_43 = new LatLng(-11.976591230958801, -77.09611235922436);
        final LatLng vipol_44 = new LatLng(-11.976915738846792, -77.09634201775656);
        final LatLng vipol_45 = new LatLng(-11.975842365113927, -77.09749031041753);
        final LatLng vipol_46 = new LatLng(-11.97554281819465, -77.09731168711473);
        final LatLng vipol_47 = new LatLng(-11.975268233226828, -77.09759238087629);
        final LatLng vipol_48 = new LatLng(-11.975118459490385, -77.09749031041753);
        final LatLng vipol_49 = new LatLng(-11.974793949443194, -77.09789859225255);
        final LatLng vipol_50 = new LatLng(-11.975168868770579, -77.09825164795672);
        final LatLng vipol_51 = new LatLng(-11.973892396355739, -77.09976893440398);
        final LatLng vipol_52 = new LatLng(-11.973944009161745, -77.09991342087733);
        final LatLng vipol_53 = new LatLng(-11.972346410527738, -77.1021844885846);
        final LatLng vipol_54 = new LatLng(-11.97242129813975, -77.10236311212309);
        final LatLng vipol_55 = new LatLng(-11.971345368265174, -77.10376395063568);
        final LatLng vipol_56 = new LatLng(-11.971090350580994, -77.10521989870414);
        final LatLng vipol_57 = new LatLng(-11.970616059463357, -77.10532196916289);
        final LatLng vipol_58 = new LatLng(-11.970129286134945, -77.10546231604367);
        final LatLng vipol_59 = new LatLng(-11.969230625379021, -77.10645750301653);
        final LatLng vipol_60 = new LatLng(-11.969317995305879, -77.10706992576905);
        final LatLng vipol_61 = new LatLng(-11.969055885440582, -77.10756751925547);
        final LatLng vipol_62 = new LatLng(-11.967982480431898, -77.10874132968875);
        final LatLng vipol_63 = new LatLng(-11.965623470838654, -77.11119102069885);

        PolygonOptions loca09_Loc = new PolygonOptions()
                .add(vipol_01)
                .add(vipol_02)
                .add(vipol_03)
                .add(vipol_04)
                .add(vipol_05)
                .add(vipol_06)
                .add(vipol_07)
                .add(vipol_08)
                .add(vipol_09)
                .add(vipol_10)
                .add(vipol_11)
                .add(vipol_12)
                .add(vipol_13)
                .add(vipol_14)
                .add(vipol_15)
                .add(vipol_16)
                .add(vipol_17)
                .add(vipol_18)
                .add(vipol_19)
                .add(vipol_20)
                .add(vipol_21)
                .add(vipol_22)
                .add(vipol_23)
                .add(vipol_24)
                .add(vipol_25)
                .add(vipol_26)
                .add(vipol_27)
                .add(vipol_28)
                .add(vipol_29)
                .add(vipol_30)
                .add(vipol_31)
                .add(vipol_32)
                .add(vipol_33)
                .add(vipol_34)
                .add(vipol_35)
                .add(vipol_36)
                .add(vipol_37)
                .add(vipol_38)
                .add(vipol_39)
                .add(vipol_40)
                .add(vipol_41)
                .add(vipol_42)
                .add(vipol_43)
                .add(vipol_44)
                .add(vipol_45)
                .add(vipol_46)
                .add(vipol_47)
                .add(vipol_48)
                .add(vipol_49)
                .add(vipol_50)
                .add(vipol_51)
                .add(vipol_52)
                .add(vipol_53)
                .add(vipol_54)
                .add(vipol_55)
                .add(vipol_56)
                .add(vipol_57)
                .add(vipol_58)
                .add(vipol_59)
                .add(vipol_60)
                .add(vipol_61)
                .add(vipol_62)
                .add(vipol_63);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local09Loc = mMap.addPolygon(loca09_Loc);
        local09Loc.setClickable(true);
        local09Loc.setTag("local09");
        mMap.addPolygon(loca09_Loc);
    }
    public void local10Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local10latlng = new LatLng(-12.074031542415241, -77.00847702886605);          //     LA VICTORIA - Apolo
        // Local10
        local10 = new MarkerOptions();
        local10.position(local10latlng);
        local10.title("La Delicia - LA VICTORIA - Apolo");
        local10.snippet("Telf: 01 308 3871 / 924 032 730");
        local10.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local10_marker = mMap.addMarker(local10);

        // LA VICTORIA - Gral Antonio de la Guerra
        final LatLng lavic_01 = new LatLng(-12.082827951334718, -76.98497214949519);
        final LatLng lavic_02 = new LatLng(-12.083727208778962, -76.9850573006341);
        final LatLng lavic_03 = new LatLng(-12.08474309508707, -76.9857555568963);
        final LatLng lavic_04 = new LatLng(-12.085442557151051, -76.9863175718733);
        final LatLng lavic_05 = new LatLng(-12.086125386242916, -76.98917879434259);
        final LatLng lavic_06 = new LatLng(-12.086608344053898, -76.99251689236901);
        final LatLng lavic_07 = new LatLng(-12.086974705538456, -76.99493532516838);
        final LatLng lavic_08 = new LatLng(-12.08770745436143, -77.00094725856543);
        final LatLng lavic_09 = new LatLng(-12.088579607863712, -77.00759476124493);
        final LatLng lavic_10 = new LatLng(-12.089811918066516, -77.01607623279256);
        final LatLng lavic_11 = new LatLng(-12.090678268598394, -77.02261922052234);
        final LatLng lavic_12 = new LatLng(-12.061569403356305, -77.03472840825529);
        final LatLng lavic_13 = new LatLng(-12.060195046625083, -77.03544414348369);
        final LatLng lavic_14 = new LatLng(-12.059811997669062, -77.03491617696554);
        final LatLng lavic_15 = new LatLng(-12.057528529076395, -77.01739650956965);
        final LatLng lavic_16 = new LatLng(-12.056729116290892, -77.0148418452866);
        final LatLng lavic_17 = new LatLng(-12.055096914433543, -77.01339421043798);
        final LatLng lavic_18 = new LatLng(-12.05922738601238, -77.00777399380632);
        final LatLng lavic_19 = new LatLng(-12.060759589402144, -77.00583248431467);
        final LatLng lavic_20 = new LatLng(-12.061792230519726, -77.00460626310534);
        final LatLng lavic_21 = new LatLng(-12.062258583982958, -77.0039079954217);
        final LatLng lavic_22 = new LatLng(-12.06139315944184, -77.0036573607131);
        final LatLng lavic_23 = new LatLng(-12.061778054913646, -77.00203933797857);
        final LatLng lavic_24 = new LatLng(-12.061621836953208, -77.0019751366983);
        final LatLng lavic_25 = new LatLng(-12.061705837733264, -77.00180724862162);
        final LatLng lavic_26 = new LatLng(-12.061724930962729, -77.00108493840096);
        final LatLng lavic_27 = new LatLng(-12.061445016378583, -76.9999884515652);
        final LatLng lavic_28 = new LatLng(-12.061078333624298, -76.99995360964992);
        final LatLng lavic_29 = new LatLng(-12.061386444616218, -76.99606895947932);
        final LatLng lavic_30 = new LatLng(-12.060048954313645, -76.99586130430764);
        final LatLng lavic_31 = new LatLng(-12.059801720046414, -76.99562901205736);
        final LatLng lavic_32 = new LatLng(-12.059971460922698, -76.9954267705188);
        final LatLng lavic_33 = new LatLng(-12.0601465222024, -76.99364376974175);
        final LatLng lavic_34 = new LatLng(-12.06047148072151, -76.98965992357866);
        final LatLng lavic_35 = new LatLng(-12.061578510626154, -76.98973217974196);
        final LatLng lavic_36 = new LatLng(-12.061613841067043, -76.98931068255418);
        final LatLng lavic_37 = new LatLng(-12.064028096044108, -76.98940744774146);
        final LatLng lavic_38 = new LatLng(-12.063886621277387, -76.9874221656943);
        final LatLng lavic_39 = new LatLng(-12.06337845771447, -76.98748347109971);
        final LatLng lavic_40 = new LatLng(-12.063117028147527, -76.98734761223783);
        final LatLng lavic_41 = new LatLng(-12.062234167704645, -76.98686115276438);
        final LatLng lavic_42 = new LatLng(-12.061771308128415, -76.98643166852457);
        final LatLng lavic_43 = new LatLng(-12.061591305455874, -76.98577429538155);
        final LatLng lavic_44 = new LatLng(-12.061445586604586, -76.98513883416531);
        final LatLng lavic_45 = new LatLng(-12.061681787468723, -76.98430055437944);
        final LatLng lavic_46 = new LatLng(-12.0618360734341, -76.98391489517823);
        final LatLng lavic_47 = new LatLng(-12.062290359053147, -76.9832356068052);
        final LatLng lavic_48 = new LatLng(-12.063128996686343, -76.98267385871327);
        final LatLng lavic_49 = new LatLng(-12.063019633984625, -76.98192900143056);
        final LatLng lavic_50 = new LatLng(-12.066940583064754, -76.98091189604104);
        final LatLng lavic_51 = new LatLng(-12.066976306633952, -76.98045637361979);
        final LatLng lavic_52 = new LatLng(-12.067306039843686, -76.97960134085154);
        final LatLng lavic_53 = new LatLng(-12.072092693574087, -76.98148436712216);
        final LatLng lavic_54 = new LatLng(-12.074743368212506, -76.98275100826953);
        final LatLng lavic_55 = new LatLng(-12.074896450839477, -76.98220908426302);
        final LatLng lavic_56 = new LatLng(-12.079748255235806, -76.98478620313975);
        final LatLng lavic_57 = new LatLng(-12.081008303897082, -76.98629154945995);
        final LatLng lavic_58 = new LatLng(-12.08188950742696, -76.98556774577337);


        PolygonOptions lavic_Loc = new PolygonOptions()
                .add(lavic_01)
                .add(lavic_02)
                .add(lavic_03)
                .add(lavic_04)
                .add(lavic_05)
                .add(lavic_06)
                .add(lavic_07)
                .add(lavic_08)
                .add(lavic_09)
                .add(lavic_10)
                .add(lavic_11)
                .add(lavic_12)
                .add(lavic_13)
                .add(lavic_14)
                .add(lavic_15)
                .add(lavic_16)
                .add(lavic_17)
                .add(lavic_18)
                .add(lavic_19)
                .add(lavic_20)
                .add(lavic_21)
                .add(lavic_22)
                .add(lavic_23)
                .add(lavic_24)
                .add(lavic_25)
                .add(lavic_26)
                .add(lavic_27)
                .add(lavic_28)
                .add(lavic_29)
                .add(lavic_30)
                .add(lavic_31)
                .add(lavic_32)
                .add(lavic_33)
                .add(lavic_34)
                .add(lavic_35)
                .add(lavic_36)
                .add(lavic_37)
                .add(lavic_38)
                .add(lavic_39)
                .add(lavic_40)
                .add(lavic_41)
                .add(lavic_42)
                .add(lavic_43)
                .add(lavic_44)
                .add(lavic_45)
                .add(lavic_46)
                .add(lavic_47)
                .add(lavic_48)
                .add(lavic_49)
                .add(lavic_50)
                .add(lavic_51)
                .add(lavic_52)
                .add(lavic_53)
                .add(lavic_54)
                .add(lavic_55)
                .add(lavic_56)
                .add(lavic_57)
                .add(lavic_58);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local10Loc = mMap.addPolygon(lavic_Loc);
        local10Loc.setClickable(true);
        local10Loc.setTag("local10");
        mMap.addPolygon(lavic_Loc);
    }

    public void local11Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local11latlng = new LatLng(-12.081047339313274, -77.01725123347701);          //     LA VICTORIA - Gral ANtonio de la Guerra
        // Local11
        local11 = new MarkerOptions();
        local11.position(local11latlng);
        local11.title("La Delicia - LA VICTORIA - Gral ANtonio de la Guerra");
        local11.snippet("Telf: 01 329 3054 / 997 035 022");
        local11.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local11_marker = mMap.addMarker(local11);
        /*
        // LA VICTORIA - Gral Antonio de la Guerra
        final LatLng lavic_01 = new LatLng(-12.082827951334718, -76.98497214949519);
        final LatLng lavic_02 = new LatLng(-12.083727208778962, -76.9850573006341);
        final LatLng lavic_03 = new LatLng(-12.08474309508707, -76.9857555568963);
        final LatLng lavic_04 = new LatLng(-12.085442557151051, -76.9863175718733);
        final LatLng lavic_05 = new LatLng(-12.086125386242916, -76.98917879434259);
        final LatLng lavic_06 = new LatLng(-12.086608344053898, -76.99251689236901);
        final LatLng lavic_07 = new LatLng(-12.086974705538456, -76.99493532516838);
        final LatLng lavic_08 = new LatLng(-12.08770745436143, -77.00094725856543);
        final LatLng lavic_09 = new LatLng(-12.088579607863712, -77.00759476124493);
        final LatLng lavic_10 = new LatLng(-12.089811918066516, -77.01607623279256);
        final LatLng lavic_11 = new LatLng(-12.090678268598394, -77.02261922052234);
        final LatLng lavic_12 = new LatLng(-12.061569403356305, -77.03472840825529);
        final LatLng lavic_13 = new LatLng(-12.060195046625083, -77.03544414348369);
        final LatLng lavic_14 = new LatLng(-12.059811997669062, -77.03491617696554);
        final LatLng lavic_15 = new LatLng(-12.057528529076395, -77.01739650956965);
        final LatLng lavic_16 = new LatLng(-12.056729116290892, -77.0148418452866);
        final LatLng lavic_17 = new LatLng(-12.055096914433543, -77.01339421043798);
        final LatLng lavic_18 = new LatLng(-12.05922738601238, -77.00777399380632);
        final LatLng lavic_19 = new LatLng(-12.060759589402144, -77.00583248431467);
        final LatLng lavic_20 = new LatLng(-12.061792230519726, -77.00460626310534);
        final LatLng lavic_21 = new LatLng(-12.062258583982958, -77.0039079954217);
        final LatLng lavic_22 = new LatLng(-12.06139315944184, -77.0036573607131);
        final LatLng lavic_23 = new LatLng(-12.061778054913646, -77.00203933797857);
        final LatLng lavic_24 = new LatLng(-12.061621836953208, -77.0019751366983);
        final LatLng lavic_25 = new LatLng(-12.061705837733264, -77.00180724862162);
        final LatLng lavic_26 = new LatLng(-12.061724930962729, -77.00108493840096);
        final LatLng lavic_27 = new LatLng(-12.061445016378583, -76.9999884515652);
        final LatLng lavic_28 = new LatLng(-12.061078333624298, -76.99995360964992);
        final LatLng lavic_29 = new LatLng(-12.061386444616218, -76.99606895947932);
        final LatLng lavic_30 = new LatLng(-12.060048954313645, -76.99586130430764);
        final LatLng lavic_31 = new LatLng(-12.059801720046414, -76.99562901205736);
        final LatLng lavic_32 = new LatLng(-12.059971460922698, -76.9954267705188);
        final LatLng lavic_33 = new LatLng(-12.0601465222024, -76.99364376974175);
        final LatLng lavic_34 = new LatLng(-12.06047148072151, -76.98965992357866);
        final LatLng lavic_35 = new LatLng(-12.061578510626154, -76.98973217974196);
        final LatLng lavic_36 = new LatLng(-12.061613841067043, -76.98931068255418);
        final LatLng lavic_37 = new LatLng(-12.064028096044108, -76.98940744774146);
        final LatLng lavic_38 = new LatLng(-12.063886621277387, -76.9874221656943);
        final LatLng lavic_39 = new LatLng(-12.06337845771447, -76.98748347109971);
        final LatLng lavic_40 = new LatLng(-12.063117028147527, -76.98734761223783);
        final LatLng lavic_41 = new LatLng(-12.062234167704645, -76.98686115276438);
        final LatLng lavic_42 = new LatLng(-12.061771308128415, -76.98643166852457);
        final LatLng lavic_43 = new LatLng(-12.061591305455874, -76.98577429538155);
        final LatLng lavic_44 = new LatLng(-12.061445586604586, -76.98513883416531);
        final LatLng lavic_45 = new LatLng(-12.061681787468723, -76.98430055437944);
        final LatLng lavic_46 = new LatLng(-12.0618360734341, -76.98391489517823);
        final LatLng lavic_47 = new LatLng(-12.062290359053147, -76.9832356068052);
        final LatLng lavic_48 = new LatLng(-12.063128996686343, -76.98267385871327);
        final LatLng lavic_49 = new LatLng(-12.063019633984625, -76.98192900143056);
        final LatLng lavic_50 = new LatLng(-12.066940583064754, -76.98091189604104);
        final LatLng lavic_51 = new LatLng(-12.066976306633952, -76.98045637361979);
        final LatLng lavic_52 = new LatLng(-12.067306039843686, -76.97960134085154);
        final LatLng lavic_53 = new LatLng(-12.072092693574087, -76.98148436712216);
        final LatLng lavic_54 = new LatLng(-12.074743368212506, -76.98275100826953);
        final LatLng lavic_55 = new LatLng(-12.074896450839477, -76.98220908426302);
        final LatLng lavic_56 = new LatLng(-12.079748255235806, -76.98478620313975);
        final LatLng lavic_57 = new LatLng(-12.081008303897082, -76.98629154945995);
        final LatLng lavic_58 = new LatLng(-12.08188950742696, -76.98556774577337);


        PolygonOptions lavic_Loc = new PolygonOptions()
                .add(lavic_01)
                .add(lavic_02)
                .add(lavic_03)
                .add(lavic_04)
                .add(lavic_05)
                .add(lavic_06)
                .add(lavic_07)
                .add(lavic_08)
                .add(lavic_09)
                .add(lavic_10)
                .add(lavic_11)
                .add(lavic_12)
                .add(lavic_13)
                .add(lavic_14)
                .add(lavic_15)
                .add(lavic_16)
                .add(lavic_17)
                .add(lavic_18)
                .add(lavic_19)
                .add(lavic_20)
                .add(lavic_21)
                .add(lavic_22)
                .add(lavic_23)
                .add(lavic_24)
                .add(lavic_25)
                .add(lavic_26)
                .add(lavic_27)
                .add(lavic_28)
                .add(lavic_29)
                .add(lavic_30)
                .add(lavic_31)
                .add(lavic_32)
                .add(lavic_33)
                .add(lavic_34)
                .add(lavic_35)
                .add(lavic_36)
                .add(lavic_37)
                .add(lavic_38)
                .add(lavic_39)
                .add(lavic_40)
                .add(lavic_41)
                .add(lavic_42)
                .add(lavic_43)
                .add(lavic_44)
                .add(lavic_45)
                .add(lavic_46)
                .add(lavic_47)
                .add(lavic_48)
                .add(lavic_49)
                .add(lavic_50)
                .add(lavic_51)
                .add(lavic_52)
                .add(lavic_53)
                .add(lavic_54)
                .add(lavic_55)
                .add(lavic_56)
                .add(lavic_57)
                .add(lavic_58);
        //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local11Loc = mMap.addPolygon(lavic_Loc);
        local11Loc.setClickable(true);
        local11Loc.setTag("local11");
        mMap.addPolygon(lavic_Loc);

         */
    }
    public void local12Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local12latlng = new LatLng(-11.992188774968882, -76.82175781998149);          //     CHACLACAYO - Huascata
        // Local12
        local12 = new MarkerOptions();
        local12.position(local12latlng);
        local12.title("La Delicia - CHACLACAYO - Huascata");
        local12.snippet("Telf: 917 698 756");
        local12.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local12_marker = mMap.addMarker(local12);
        // Local 12 CHACLACAYO - Huascata
        final LatLng huascata_01 = new LatLng(-11.990420811336266, -76.82271609061307);
        final LatLng huascata_02 = new LatLng(-11.99435973700481, -76.83255404528116);
        final LatLng huascata_03 = new LatLng(-11.996136558913078, -76.83522251010416);
        final LatLng huascata_04 = new LatLng(-11.999470033886336, -76.83906445646377);
        final LatLng huascata_05 = new LatLng(-12.001254684020141, -76.83778648679542);
        final LatLng huascata_06 = new LatLng(-12.004973322209157, -76.83598607681435);
        final LatLng huascata_07 = new LatLng(-12.006529946252833, -76.83529484786872);
        final LatLng huascata_08 = new LatLng(-12.008767053884768, -76.83306898499443);
        final LatLng huascata_09 = new LatLng(-12.008606487957277, -76.83212999924598);
        final LatLng huascata_10 = new LatLng(-12.008859288105008, -76.83161790096337);
        final LatLng huascata_11 = new LatLng(-12.01339409196401, -76.82512303891447);
        final LatLng huascata_12 = new LatLng(-12.009596512688784, -76.82217060070438);
        final LatLng huascata_13 = new LatLng(-12.007314642983282, -76.82675964853168);
        final LatLng huascata_14 = new LatLng(-12.005990198855976, -76.82993844620783);
        final LatLng huascata_15 = new LatLng(-12.004709482769039, -76.83116422437975);
        final LatLng huascata_16 = new LatLng(-12.002405666836223, -76.8322616584177);
        final LatLng huascata_17 = new LatLng(-12.001064025652282, -76.83068052452843);
        final LatLng huascata_18 = new LatLng(-11.998520707217125, -76.82971475990813);
        final LatLng huascata_19 = new LatLng(-11.997430706224682, -76.83077338650962);
        final LatLng huascata_20 = new LatLng(-11.99624986685222, -76.8314512789896);
        final LatLng huascata_21 = new LatLng(-11.995677612065723, -76.82868399187625);
        final LatLng huascata_22 = new LatLng(-11.996486035147306, -76.82722605843925);
        final LatLng huascata_23 = new LatLng(-11.996131782645183, -76.82648316257747);
        final LatLng huascata_24 = new LatLng(-11.99659503582357, -76.82564740473298);
        final LatLng huascata_25 = new LatLng(-11.99676762013751, -76.82476521589714);
        final LatLng huascata_26 = new LatLng(-11.996086365624071, -76.8244401989576);
        final LatLng huascata_27 = new LatLng(-11.995686695508438, -76.82427304738871);
        final LatLng huascata_28 = new LatLng(-11.99499635480024, -76.82400374759149);
        final LatLng huascata_29 = new LatLng(-11.993895166053782, -76.82393470931108);
        final LatLng huascata_30 = new LatLng(-11.99414703688005, -76.82260433374903);
        final LatLng huascata_31 = new LatLng(-11.997337380344566, -76.82147780586224);
        final LatLng huascata_32 = new LatLng(-11.997799137451794, -76.8213597886753);
        final LatLng huascata_33 = new LatLng(-11.997599742434325, -76.82073751623498);
        final LatLng huascata_34 = new LatLng(-11.997179962968163, -76.82032982049822);
        final LatLng huascata_35 = new LatLng(-11.99668672126028, -76.81877413939745);
        final LatLng huascata_36 = new LatLng(-11.996172489582852, -76.81889215658441);
        final LatLng huascata_37 = new LatLng(-11.995700235137669, -76.8186561222105);
        final LatLng huascata_38 = new LatLng(-11.995206990723005, -76.81783000190181);
        final LatLng huascata_39 = new LatLng(-11.995133528711717, -76.81611338827337);
        final LatLng huascata_40 = new LatLng(-11.994346434477766, -76.81594172691052);
        final LatLng huascata_41 = new LatLng(-11.99405258537485, -76.8173042889781);
        final LatLng huascata_42 = new LatLng(-11.993853187586952, -76.81789437491287);
        final LatLng huascata_43 = new LatLng(-11.99353834867435, -76.81786218840735);
        final LatLng huascata_44 = new LatLng(-11.99309757349818, -76.81731501760692);
        final LatLng huascata_45 = new LatLng(-11.99245739886297, -76.81726137343102);
        final LatLng huascata_46 = new LatLng(-11.992016622001398, -76.8192569367741);
        final LatLng huascata_47 = new LatLng(-11.991586339132258, -76.81936422512587);
        final LatLng huascata_48 = new LatLng(-11.99019053875929, -76.81966463251084);
        final LatLng huascata_49 = new LatLng(-11.98801811323129, -76.8140212648255);
        final LatLng huascata_50 = new LatLng(-11.987178523774514, -76.81010523943004);
        final LatLng huascata_51 = new LatLng(-11.987556307057437, -76.8092683529563);
        final LatLng huascata_52 = new LatLng(-11.987398883972627, -76.80814182526264);
        final LatLng huascata_53 = new LatLng(-11.985226435982302, -76.80406486760764);
        final LatLng huascata_54 = new LatLng(-11.983927797089736, -76.80328113677707);
        final LatLng huascata_55 = new LatLng(-11.983371560967585, -76.7998908248609);
        final LatLng huascata_56 = new LatLng(-11.985871747159942, -76.79910363449635);
        final LatLng huascata_57 = new LatLng(-11.98778584833468, -76.79878845039862);
        final LatLng huascata_58 = new LatLng(-11.988762163178963, -76.79893290974596);
        final LatLng huascata_59 = new LatLng(-11.990035900684797, -76.79831112054084);
        final LatLng huascata_60 = new LatLng(-11.990999361246253, -76.79807473250561);
        final LatLng huascata_61 = new LatLng(-11.992039894787702, -76.79862630458784);
        final LatLng huascata_62 = new LatLng(-11.993478650603176, -76.79902028464659);
        final LatLng huascata_63 = new LatLng(-11.993722724489038, -76.79879702927995);
        final LatLng huascata_64 = new LatLng(-11.993799800407094, -76.79853437590747);
        final LatLng huascata_65 = new LatLng(-11.99360711057064, -76.79781207913312);
        final LatLng huascata_66 = new LatLng(-11.993414420596519, -76.79727363971952);
        final LatLng huascata_67 = new LatLng(-11.993208884472379, -76.79575025015909);
        final LatLng huascata_68 = new LatLng(-11.98860997269946, -76.7954219333971);
        final LatLng huascata_69 = new LatLng(-11.987966976406996, -76.7947144981707);
        final LatLng huascata_70 = new LatLng(-11.987119121765575, -76.79472763083933);
        final LatLng huascata_71 = new LatLng(-11.9855133291597, -76.79501654954908);
        final LatLng huascata_72 = new LatLng(-11.97764607668298, -76.78439955908838);
        final LatLng huascata_73 = new LatLng(-11.976171774049918, -76.78462508504516);
        final LatLng huascata_74 = new LatLng(-11.975731468097674, -76.78272822448982);
        final LatLng huascata_75 = new LatLng(-11.974520623028338, -76.77959358204666);
        final LatLng huascata_76 = new LatLng(-11.974599249496332, -76.77878982757403);
        final LatLng huascata_77 = new LatLng(-11.973923061123871, -76.7762178132617);
        final LatLng huascata_78 = new LatLng(-11.971076761280647, -76.77618566308279);
        final LatLng huascata_79 = new LatLng(-11.969378402309331, -76.7769411922514);
        final LatLng huascata_80 = new LatLng(-11.969647424855438, -76.78162366964443);
        final LatLng huascata_81 = new LatLng(-11.968153490674302, -76.78369735618375);
        final LatLng huascata_82 = new LatLng(-11.969159931451355, -76.78487083771375);
        final LatLng huascata_83 = new LatLng(-11.96997766182313, -76.7859317936176);
        final LatLng huascata_84 = new LatLng(-11.970559506927188, -76.78601216906486);
        final LatLng huascata_85 = new LatLng(-11.970984095807077, -76.78893783534514);
        final LatLng huascata_86 = new LatLng(-11.970150642930859, -76.78924326204474);
        final LatLng huascata_87 = new LatLng(-11.970036784169544, -76.79069678146645);
        final LatLng huascata_88 = new LatLng(-11.970750480636983, -76.7908255274886);
        final LatLng huascata_89 = new LatLng(-11.97082394928399, -76.79161946129175);
        final LatLng huascata_90 = new LatLng(-11.969060696243398, -76.79154435944551);
        final LatLng huascata_91 = new LatLng(-11.966408610568475, -76.79574758617353);
        final LatLng huascata_92 = new LatLng(-11.968003950905482, -76.7969921311441);
        final LatLng huascata_93 = new LatLng(-11.968505858791847, -76.7986803059648);
        final LatLng huascata_94 = new LatLng(-11.969397984135233, -76.7990665440312);
        final LatLng huascata_95 = new LatLng(-11.970634937536156, -76.8006214369096);
        final LatLng huascata_96 = new LatLng(-11.971757956582449, -76.80024592767839);
        final LatLng huascata_97 = new LatLng(-11.972734034765997, -76.79881899259973);
        final LatLng huascata_98 = new LatLng(-11.97452874996529, -76.79973094358985);
        final LatLng huascata_99 = new LatLng(-11.974864601777677, -76.80181233761434);
        final LatLng huascata_100= new LatLng(-11.97284948464053, -76.80338947638546);
        final LatLng huascata_101= new LatLng(-11.982096439797788, -76.80079947915812);
        final LatLng huascata_102= new LatLng(-11.98316605557366, -76.80461243420983);
        final LatLng huascata_103= new LatLng(-11.983826496074048, -76.80654144530078);
        final LatLng huascata_104= new LatLng(-11.984046642540566, -76.81356625990796);
        final LatLng huascata_105= new LatLng(-11.984691356157906, -76.81702240414016);
        final LatLng huascata_106= new LatLng(-11.986594616208588, -76.82139623383131);
        final LatLng huascata_107= new LatLng(-11.98795451213502, -76.82375679928093);

        PolygonOptions huascata_Loc = new PolygonOptions()
                .add(huascata_01)
                .add(huascata_02)
                .add(huascata_03)
                .add(huascata_04)
                .add(huascata_05)
                .add(huascata_06)
                .add(huascata_07)
                .add(huascata_08)
                .add(huascata_09)
                .add(huascata_10)
                .add(huascata_11)
                .add(huascata_12)
                .add(huascata_13)
                .add(huascata_14)
                .add(huascata_15)
                .add(huascata_16)
                .add(huascata_17)
                .add(huascata_18)
                .add(huascata_19)
                .add(huascata_20)
                .add(huascata_21)
                .add(huascata_22)
                .add(huascata_23)
                .add(huascata_24)
                .add(huascata_25)
                .add(huascata_26)
                .add(huascata_27)
                .add(huascata_28)
                .add(huascata_29)
                .add(huascata_30)
                .add(huascata_31)
                .add(huascata_32)
                .add(huascata_33)
                .add(huascata_34)
                .add(huascata_35)
                .add(huascata_36)
                .add(huascata_37)
                .add(huascata_38)
                .add(huascata_39)
                .add(huascata_40)
                .add(huascata_41)
                .add(huascata_42)
                .add(huascata_43)
                .add(huascata_44)
                .add(huascata_45)
                .add(huascata_46)
                .add(huascata_47)
                .add(huascata_48)
                .add(huascata_49)
                .add(huascata_50)
                .add(huascata_51)
                .add(huascata_52)
                .add(huascata_53)
                .add(huascata_54)
                .add(huascata_55)
                .add(huascata_56)
                .add(huascata_57)
                .add(huascata_58)
                .add(huascata_59)
                .add(huascata_60)
                .add(huascata_61)
                .add(huascata_62)
                .add(huascata_63)
                .add(huascata_64)
                .add(huascata_65)
                .add(huascata_66)
                .add(huascata_67)
                .add(huascata_68)
                .add(huascata_69)
                .add(huascata_70)
                .add(huascata_71)
                .add(huascata_72)
                .add(huascata_73)
                .add(huascata_74)
                .add(huascata_75)
                .add(huascata_76)
                .add(huascata_77)
                .add(huascata_78)
                .add(huascata_79)
                .add(huascata_80)
                .add(huascata_81)
                .add(huascata_82)
                .add(huascata_83)
                .add(huascata_84)
                .add(huascata_85)
                .add(huascata_86)
                .add(huascata_87)
                .add(huascata_88)
                .add(huascata_89)
                .add(huascata_90)
                .add(huascata_91)
                .add(huascata_92)
                .add(huascata_93)
                .add(huascata_94)
                .add(huascata_95)
                .add(huascata_96)
                .add(huascata_97)
                .add(huascata_98)
                .add(huascata_99)
                .add(huascata_100)
                .add(huascata_101)
                .add(huascata_102)
                .add(huascata_103)
                .add(huascata_104)
                .add(huascata_105)
                .add(huascata_106)
                .add(huascata_107);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local12Loc = mMap.addPolygon(huascata_Loc);
        local12Loc.setClickable(true);
        local12Loc.setTag("local12");
        mMap.addPolygon(huascata_Loc);
    }
    public void local13Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local13latlng = new LatLng(-11.985258248696661, -76.83210924267368);          //     LURIGANCHO - ÑAÑA
        // Local13
        local13 = new MarkerOptions();
        local13.position(local13latlng);
        local13.title("La Delicia - LURIGANCHO - ÑAÑA");
        local13.snippet("Telf: 902 875 197");
        local13.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local13_marker = mMap.addMarker(local13);

        // Local 13 LURIGANCHO ÑAÑA - NESTOR
        final LatLng ñaña_01 = new LatLng(-11.996729758181331, -76.8412396398278);
        final LatLng ñaña_02 = new LatLng(-11.995856222505964, -76.8409244403387);
        final LatLng ñaña_03 = new LatLng(-11.995149687066245, -76.84088503495622);
        final LatLng ñaña_04 = new LatLng(-11.994353233424391, -76.840267787119);
        final LatLng ñaña_05 = new LatLng(-11.99269609494317, -76.83793016119473);
        final LatLng ñaña_06 = new LatLng(-11.991167413430768, -76.83782510013533);
        final LatLng ñaña_07 = new LatLng(-11.990011264146423, -76.83592086158006);
        final LatLng ñaña_08 = new LatLng(-11.98745481818168, -76.8304839340639);
        final LatLng ñaña_09 = new LatLng(-11.98800720120173, -76.8300636744289);
        final LatLng ñaña_10 = new LatLng(-11.988842208856815, -76.82994546197368);
        final LatLng ñaña_11 = new LatLng(-11.988122759171414, -76.82756841501964);
        final LatLng ñaña_12 = new LatLng(-11.987542161284816, -76.82692124545348);
        final LatLng ñaña_13 = new LatLng(-11.987066837185917, -76.82487253142921);
        final LatLng ñaña_14 = new LatLng(-11.986809895113991, -76.82329659639694);
        final LatLng ñaña_15 = new LatLng(-11.986103376290203, -76.82127417435959);
        final LatLng ñaña_16 = new LatLng(-11.985319729699762, -76.82014475824717);
        final LatLng ñaña_17 = new LatLng(-11.984780177082085, -76.8203417571885);
        final LatLng ñaña_18 = new LatLng(-11.983945121823812, -76.81791219672243);
        final LatLng ñaña_19 = new LatLng(-11.984304816654044, -76.81741313856134);
        final LatLng ñaña_20 = new LatLng(-11.983559775511493, -76.81497048757403);
        final LatLng ñaña_21 = new LatLng(-11.983277162366248, -76.81384109949529);
        final LatLng ñaña_22 = new LatLng(-11.983007370131208, -76.81143779494727);
        final LatLng ñaña_23 = new LatLng(-11.983097310298481, -76.80806272159657);
        final LatLng ñaña_24 = new LatLng(-11.981979597230955, -76.80299345320638);
        final LatLng ñaña_25 = new LatLng(-11.981512014851774, -76.80143587582378);
        final LatLng ñaña_26 = new LatLng(-11.9800277102355, -76.7977508539313);
        final LatLng ñaña_27 = new LatLng(-11.97862133836837, -76.79498286342259);
        final LatLng ñaña_28 = new LatLng(-11.977382860910156, -76.7902192441063);
        final LatLng ñaña_29 = new LatLng(-11.976952588001573, -76.78778381219901);
        final LatLng ñaña_30 = new LatLng(-11.97073931372568, -76.7892214936882);
        final LatLng ñaña_31 = new LatLng(-11.970937987504131, -76.79163868579847);
        final LatLng ñaña_32 = new LatLng(-11.968663840950354, -76.79150443279741);
        final LatLng ñaña_33 = new LatLng(-11.96456526158242, -76.78920523743352);
        final LatLng ñaña_34 = new LatLng(-11.961899499996502, -76.78767247441795);
        final LatLng ñaña_35 = new LatLng(-11.960633235672248, -76.78738291184987);
        final LatLng ñaña_36 = new LatLng(-11.958583885470599, -76.78634403759816);
        final LatLng ñaña_37 = new LatLng(-11.956467884395442, -76.78557766784053);
        final LatLng ñaña_38 = new LatLng(-11.955551529011439, -76.78739997285604);
        final LatLng ñaña_39 = new LatLng(-11.955868099009141, -76.78792792562889);
        final LatLng ñaña_40 = new LatLng(-11.955534874206371, -76.78877946469517);
        final LatLng ñaña_41 = new LatLng(-11.958317314633673, -76.79072098453388);
        final LatLng ñaña_42 = new LatLng(-11.959633553845936, -76.79131706930693);
        final LatLng ñaña_43 = new LatLng(-11.961366312402037, -76.7925773839737);
        final LatLng ñaña_44 = new LatLng(-11.962665885970623, -76.79317349518043);
        final LatLng ñaña_45 = new LatLng(-11.96633131070357, -76.79569406641205);
        final LatLng ñaña_46 = new LatLng(-11.965908675708134, -76.79648368567621);
        final LatLng ñaña_47 = new LatLng(-11.966660762792703, -76.79791080254431);
        final LatLng ñaña_48 = new LatLng(-11.967714551802525, -76.79805010404075);
        final LatLng ñaña_49 = new LatLng(-11.968866531180547, -76.79895742270665);
        final LatLng ñaña_50 = new LatLng(-11.96954559495068, -76.7991495591549);
        final LatLng ñaña_51 = new LatLng(-11.968811957547954, -76.80000485481136);
        final LatLng ñaña_52 = new LatLng(-11.968563368157088, -76.80037672281729);
        final LatLng ñaña_53 = new LatLng(-11.968429992393906, -76.80082915354232);
        final LatLng ñaña_54 = new LatLng(-11.968799838308962, -76.80121341777482);
        final LatLng ñaña_55 = new LatLng(-11.96971536174764, -76.80093451886374);
        final LatLng ñaña_56 = new LatLng(-11.969976073355081, -76.80117003710733);
        final LatLng ñaña_57 = new LatLng(-11.970188281026958, -76.80115144438517);
        final LatLng ñaña_58 = new LatLng(-11.970558129270996, -76.80095311464383);
        final LatLng ñaña_59 = new LatLng(-11.970952205633722, -76.80180840733318);
        final LatLng ñaña_60 = new LatLng(-11.971855597337013, -76.80147993012551);
        final LatLng ñaña_61 = new LatLng(-11.971867727776358, -76.80068041050565);
        final LatLng ñaña_62 = new LatLng(-11.971782846871916, -76.80036432148759);
        final LatLng ñaña_63 = new LatLng(-11.972668047554112, -76.79896361551313);
        final LatLng ñaña_64 = new LatLng(-11.974667795992143, -76.79957522662558);
        final LatLng ñaña_65 = new LatLng(-11.974911504316703, -76.80137813863013);
        final LatLng ñaña_66 = new LatLng(-11.975316154070576, -76.80252396289572);
        final LatLng ñaña_67 = new LatLng(-11.972261352284967, -76.80395252125824);
        final LatLng ñaña_68 = new LatLng(-11.971905124935272, -76.80403597407994);
        final LatLng ñaña_69 = new LatLng(-11.971675063783739, -76.80455185200836);
        final LatLng ñaña_70 = new LatLng(-11.971140724129711, -76.80546222193412);
        final LatLng ñaña_71 = new LatLng(-11.97006461013996, -76.80637259308305);
        final LatLng ñaña_72 = new LatLng(-11.968439302852506, -76.80729813456432);
        final LatLng ñaña_73 = new LatLng(-11.966324159680909, -76.80826920377028);
        final LatLng ñaña_74 = new LatLng(-11.966954994622588, -76.80998373688814);
        final LatLng ñaña_75 = new LatLng(-11.967645198293262, -76.81027960624124);
        final LatLng ñaña_76 = new LatLng(-11.967756523575757, -76.81026443434662);
        final LatLng ñaña_77 = new LatLng(-11.970168514000058, -76.80953613477573);
        final LatLng ñaña_78 = new LatLng(-11.973220355912664, -76.80866874576883);
        final LatLng ñaña_79 = new LatLng(-11.973754693541364, -76.80860046811205);
        final LatLng ñaña_80 = new LatLng(-11.974014440759552, -76.80847908543574);
        final LatLng ñaña_81 = new LatLng(-11.974519091926812, -76.80812252300919);
        final LatLng ñaña_82 = new LatLng(-11.975046007089132, -76.80791010150209);
        final LatLng ñaña_83 = new LatLng(-11.975706504137307, -76.80703765524565);
        final LatLng ñaña_84 = new LatLng(-11.976604488397761, -76.80683281283078);
        final LatLng ñaña_85 = new LatLng(-11.97693103250487, -76.80801630635223);
        final LatLng ñaña_86 = new LatLng(-11.975022373958115, -76.80872708592794);
        final LatLng ñaña_87 = new LatLng(-11.979330600994363, -76.81996926426393);
        final LatLng ñaña_88 = new LatLng(-11.97850205584037, -76.82004436589541);
        final LatLng ñaña_89 = new LatLng(-11.978116658380022, -76.82026762495258);
        final LatLng ñaña_90 = new LatLng(-11.977859733348346, -76.82101618676025);
        final LatLng ñaña_91 = new LatLng(-11.978514921672986, -76.82210618956617);
        final LatLng ñaña_92 = new LatLng(-11.979889512059477, -76.82190919347143);
        final LatLng ñaña_93 = new LatLng(-11.980506150572264, -76.82183039382076);
        final LatLng ñaña_94 = new LatLng(-11.981225563155492, -76.82188292037353);
        final LatLng ñaña_95 = new LatLng(-11.981598118641179, -76.82259208702617);
        final LatLng ñaña_96 = new LatLng(-11.982009201468896, -76.82615107067406);
        final LatLng ñaña_97 = new LatLng(-11.982368813398294, -76.82727169536847);
        final LatLng ñaña_98 = new LatLng(-11.984392279384227, -76.83111950245144);
        final LatLng ñaña_99 = new LatLng(-11.983543452017706, -76.83113703881371);
        final LatLng ñaña_100= new LatLng(-11.983311951456928, -76.83080396910746);
        final LatLng ñaña_101= new LatLng(-11.982634600912437, -76.83040954827511);
        final LatLng ñaña_102= new LatLng(-11.981254179269854, -76.83013784415041);
        final LatLng ñaña_103= new LatLng(-11.980259589166964, -76.83018167596344);
        final LatLng ñaña_104= new LatLng(-11.977901695064364, -76.83071633263101);
        final LatLng ñaña_105= new LatLng(-11.976486953358274, -76.83151394350031);
        final LatLng ñaña_106= new LatLng(-11.976752767838336, -76.83317929252503);
        final LatLng ñaña_107= new LatLng(-11.978973479099666, -76.83258325684209);
        final LatLng ñaña_108= new LatLng(-11.978810566892653, -76.83218882986486);
        final LatLng ñaña_109= new LatLng(-11.980456792859515, -76.83180317171364);
        final LatLng ñaña_110= new LatLng(-11.980679722323659, -76.83207488670165);
        final LatLng ñaña_111= new LatLng(-11.980036668308982, -76.83295139643717);
        final LatLng ñaña_112= new LatLng(-11.980431080977658, -76.83417849904967);
        final LatLng ñaña_113= new LatLng(-11.981364788862928, -76.83410844001529);
        final LatLng ñaña_114= new LatLng(-11.98294540659623, -76.83538993122032);
        final LatLng ñaña_115= new LatLng(-11.982854569907827, -76.83608640468796);
        final LatLng ñaña_116= new LatLng(-11.981773581985083, -76.83656000949333);
        final LatLng ñaña_117= new LatLng(-11.980974196907365, -76.83684788470741);
        final LatLng ñaña_118= new LatLng(-11.979938629868425, -76.83721004753457);
        final LatLng ñaña_119= new LatLng(-11.979320921735695, -76.83674573997843);
        final LatLng ñaña_120= new LatLng(-11.978712290601175, -76.83713574457788);
        final LatLng ñaña_121= new LatLng(-11.97670471919748, -76.83756292562538);
        final LatLng ñaña_122= new LatLng(-11.974333771991782, -76.83813865222263);
        final LatLng ñaña_123= new LatLng(-11.972943877632813, -76.83694073800214);
        final LatLng ñaña_124= new LatLng(-11.970981693035652, -76.837962228202);
        final LatLng ñaña_125= new LatLng(-11.970790936303775, -76.83995876349329);
        final LatLng ñaña_126= new LatLng(-11.971444999895311, -76.84185314808765);
        final LatLng ñaña_127= new LatLng(-11.972644109995784, -76.84287461633633);
        final LatLng ñaña_128= new LatLng(-11.973570701796099, -76.84355250351614);
        final LatLng ñaña_129= new LatLng(-11.97556919527716, -76.84436970362958);
        final LatLng ñaña_130= new LatLng(-11.976840965396551, -76.84427682608728);
        final LatLng ñaña_131= new LatLng(-11.978003713885462, -76.8447411376907);
        final LatLng ñaña_132= new LatLng(-11.979520757421465, -76.84324607163123);
        final LatLng ñaña_133= new LatLng(-11.981092288292496, -76.84137026573094);
        final LatLng ñaña_134= new LatLng(-11.98059267169505, -76.84018163091487);
        final LatLng ñaña_135= new LatLng(-11.9818644205086, -76.83954087571293);
        final LatLng ñaña_136= new LatLng(-11.984453312717752, -76.83919729401391);
        final LatLng ñaña_137= new LatLng(-11.985279938934024, -76.83993090435911);
        final LatLng ñaña_138= new LatLng(-11.986996764401535, -76.84123096975972);
        final LatLng ñaña_139= new LatLng(-11.98864999645669, -76.84137955587573);
        final LatLng ñaña_140= new LatLng(-11.98893158848445, -76.84093381030289);
        final LatLng ñaña_141= new LatLng(-11.989967121851512, -76.84092452347159);
        final LatLng ñaña_142= new LatLng(-11.990112460718251, -76.84055307685549);
        final LatLng ñaña_143= new LatLng(-11.991320725958234, -76.84089877653776);
        final LatLng ñaña_144= new LatLng(-11.991960387423147, -76.84192839708871);
        final LatLng ñaña_145= new LatLng(-11.992572830362066, -76.84272149158237);
        final LatLng ñaña_146= new LatLng(-11.994124380804518, -76.84270760794364);
        final LatLng ñaña_147= new LatLng(-11.995167588439571, -76.84233076491233);
        final LatLng ñaña_148= new LatLng(-11.996474136151512, -76.84166293034488);

        PolygonOptions ñaña_Loc = new PolygonOptions()
                .add(ñaña_01)
                .add(ñaña_02)
                .add(ñaña_03)
                .add(ñaña_04)
                .add(ñaña_05)
                .add(ñaña_06)
                .add(ñaña_07)
                .add(ñaña_08)
                .add(ñaña_09)
                .add(ñaña_10)
                .add(ñaña_11)
                .add(ñaña_12)
                .add(ñaña_13)
                .add(ñaña_14)
                .add(ñaña_15)
                .add(ñaña_16)
                .add(ñaña_17)
                .add(ñaña_18)
                .add(ñaña_19)
                .add(ñaña_20)
                .add(ñaña_21)
                .add(ñaña_22)
                .add(ñaña_23)
                .add(ñaña_24)
                .add(ñaña_25)
                .add(ñaña_26)
                .add(ñaña_27)
                .add(ñaña_28)
                .add(ñaña_29)
                .add(ñaña_30)
                .add(ñaña_31)
                .add(ñaña_32)
                .add(ñaña_33)
                .add(ñaña_34)
                .add(ñaña_35)
                .add(ñaña_36)
                .add(ñaña_37)
                .add(ñaña_38)
                .add(ñaña_39)
                .add(ñaña_40)
                .add(ñaña_41)
                .add(ñaña_42)
                .add(ñaña_43)
                .add(ñaña_44)
                .add(ñaña_45)
                .add(ñaña_46)
                .add(ñaña_47)
                .add(ñaña_48)
                .add(ñaña_49)
                .add(ñaña_50)
                .add(ñaña_51)
                .add(ñaña_52)
                .add(ñaña_53)
                .add(ñaña_54)
                .add(ñaña_55)
                .add(ñaña_56)
                .add(ñaña_57)
                .add(ñaña_58)
                .add(ñaña_59)
                .add(ñaña_60)
                .add(ñaña_61)
                .add(ñaña_62)
                .add(ñaña_63)
                .add(ñaña_64)
                .add(ñaña_65)
                .add(ñaña_66)
                .add(ñaña_67)
                .add(ñaña_68)
                .add(ñaña_69)
                .add(ñaña_70)
                .add(ñaña_71)
                .add(ñaña_72)
                .add(ñaña_73)
                .add(ñaña_74)
                .add(ñaña_75)
                .add(ñaña_76)
                .add(ñaña_77)
                .add(ñaña_78)
                .add(ñaña_79)
                .add(ñaña_80)
                .add(ñaña_81)
                .add(ñaña_82)
                .add(ñaña_83)
                .add(ñaña_84)
                .add(ñaña_85)
                .add(ñaña_86)
                .add(ñaña_87)
                .add(ñaña_88)
                .add(ñaña_89)
                .add(ñaña_90)
                .add(ñaña_91)
                .add(ñaña_92)
                .add(ñaña_93)
                .add(ñaña_94)
                .add(ñaña_95)
                .add(ñaña_96)
                .add(ñaña_97)
                .add(ñaña_98)
                .add(ñaña_99)
                .add(ñaña_100)
                .add(ñaña_101)
                .add(ñaña_102)
                .add(ñaña_103)
                .add(ñaña_104)
                .add(ñaña_105)
                .add(ñaña_106)
                .add(ñaña_107)
                .add(ñaña_108)
                .add(ñaña_109)
                .add(ñaña_110)
                .add(ñaña_111)
                .add(ñaña_112)
                .add(ñaña_113)
                .add(ñaña_114)
                .add(ñaña_115)
                .add(ñaña_116)
                .add(ñaña_117)
                .add(ñaña_118)
                .add(ñaña_119)
                .add(ñaña_120)
                .add(ñaña_121)
                .add(ñaña_122)
                .add(ñaña_123)
                .add(ñaña_124)
                .add(ñaña_125)
                .add(ñaña_126)
                .add(ñaña_127)
                .add(ñaña_128)
                .add(ñaña_129)
                .add(ñaña_130)
                .add(ñaña_131)
                .add(ñaña_132)
                .add(ñaña_133)
                .add(ñaña_134)
                .add(ñaña_135)
                .add(ñaña_136)
                .add(ñaña_137)
                .add(ñaña_138)
                .add(ñaña_139)
                .add(ñaña_140)
                .add(ñaña_141)
                .add(ñaña_142)
                .add(ñaña_143)
                .add(ñaña_144)
                .add(ñaña_145)
                .add(ñaña_146)
                .add(ñaña_147)
                .add(ñaña_148);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local13Loc = mMap.addPolygon(ñaña_Loc);
        local13Loc.setClickable(true);
        local13Loc.setTag("local13");
        mMap.addPolygon(ñaña_Loc);
    }
    public void local14Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local14latlng = new LatLng(-11.992164615421363, -76.91830868751566);          //     HUACHIPA - Nievería
        // Local14
        local14 = new MarkerOptions();
        local14.position(local14latlng);
        local14.title("La Delicia - HUACHIPA - Nievería");
        local14.snippet("Telf: 902 419 266");
        local14.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local14_marker = mMap.addMarker(local14);

        // Local 14 HUACHIPA - Nievería Piter
        final LatLng nieve_01 = new LatLng(-12.00252596862311, -76.91929283300192);
        final LatLng nieve_02 = new LatLng(-12.000119697316185, -76.91621231853476);
        final LatLng nieve_03 = new LatLng(-11.997705978992034, -76.91539692701534);
        final LatLng nieve_04 = new LatLng(-11.99635218835626, -76.91369104211448);
        final LatLng nieve_05 = new LatLng(-11.994882950533672, -76.91068696810244);
        final LatLng nieve_06 = new LatLng(-11.995281744450407, -76.91243576796748);
        final LatLng nieve_07 = new LatLng(-11.993655081395563, -76.90884160818293);
        final LatLng nieve_08 = new LatLng(-11.990623170302724, -76.9061139511696);
        final LatLng nieve_09 = new LatLng(-11.988567780719142, -76.90938398577899);
        final LatLng nieve_10 = new LatLng(-11.987013381942837, -76.91349451127437);
        final LatLng nieve_11 = new LatLng(-11.98698768932729, -76.9162786372106);
        final LatLng nieve_12 = new LatLng(-11.98545041764566, -76.91848667554983);
        final LatLng nieve_13 = new LatLng(-11.984498709571705, -76.91888986577324);
        final LatLng nieve_14 = new LatLng(-11.983529850096266, -76.91938947114588);
        final LatLng nieve_15 = new LatLng(-11.983401240178079, -76.9225624029039);
        final LatLng nieve_16 = new LatLng(-11.979602367531905, -76.92267659473093);
        final LatLng nieve_17 = new LatLng(-11.972447397660972, -76.92243546847898);
        final LatLng nieve_18 = new LatLng(-11.972856258182087, -76.9271936949568);
        final LatLng nieve_19 = new LatLng(-11.973060688275615, -76.92884942964335);
        final LatLng nieve_20 = new LatLng(-11.977479484158334, -76.92936383250583);
        final LatLng nieve_21 = new LatLng(-11.984272652224965, -76.92933168215384);
        final LatLng nieve_22 = new LatLng(-11.984760118322038, -76.93021581271982);
        final LatLng nieve_23 = new LatLng(-11.982653000352826, -76.93248240033257);
        final LatLng nieve_24 = new LatLng(-11.979445117484499, -76.93691912525917);
        final LatLng nieve_25 = new LatLng(-11.9726203772119, -76.93460431254714);
        final LatLng nieve_26 = new LatLng(-11.96784984052586, -76.93992205450567);
        final LatLng nieve_27 = new LatLng(-11.96536669790497, -76.9418307012022);
        final LatLng nieve_28 = new LatLng(-11.964019246626707, -76.94246035784435);
        final LatLng nieve_29 = new LatLng(-11.963615009933802, -76.94521510565379);
        final LatLng nieve_30 = new LatLng(-11.966579398313613, -76.94541187335446);
        final LatLng nieve_31 = new LatLng(-11.969543754246388, -76.94466415613716);
        final LatLng nieve_32 = new LatLng(-11.978911319147937, -76.94793403685884);
        final LatLng nieve_33 = new LatLng(-11.981678912108874, -76.95007202405188);
        final LatLng nieve_34 = new LatLng(-11.984069083198515, -76.94999164861522);
        final LatLng nieve_35 = new LatLng(-11.982166382977478, -76.95566615551817);
        final LatLng nieve_36 = new LatLng(-11.9867737249068, -76.95655028543804);
        final LatLng nieve_37 = new LatLng(-11.987465605717091, -76.94775721135842);
        final LatLng nieve_38 = new LatLng(-11.99085704961445, -76.94324122608306);
        final LatLng nieve_39 = new LatLng(-11.991187260642555, -76.94779047639801);
        final LatLng nieve_40 = new LatLng(-11.991564644215758, -76.95356143409533);
        final LatLng nieve_41 = new LatLng(-11.994803831193948, -76.95352928391644);
        final LatLng nieve_42 = new LatLng(-11.996344790025445, -76.94825665423261);
        final LatLng nieve_43 = new LatLng(-11.993561623352894, -76.946777746003);
        final LatLng nieve_44 = new LatLng(-11.99743802504262, -76.9366781589037);
        final LatLng nieve_45 = new LatLng(-12.000315494554565, -76.93413829431304);
        final LatLng nieve_46 = new LatLng(-12.007658405830462, -76.93180740640591);
        final LatLng nieve_47 = new LatLng(-12.008255893029808, -76.92291788177245);

        PolygonOptions nieve_Loc = new PolygonOptions()
                .add(nieve_01)
                .add(nieve_02)
                .add(nieve_03)
                .add(nieve_04)
                .add(nieve_05)
                .add(nieve_06)
                .add(nieve_07)
                .add(nieve_08)
                .add(nieve_09)
                .add(nieve_10)
                .add(nieve_11)
                .add(nieve_12)
                .add(nieve_13)
                .add(nieve_14)
                .add(nieve_15)
                .add(nieve_16)
                .add(nieve_17)
                .add(nieve_18)
                .add(nieve_19)
                .add(nieve_20)
                .add(nieve_21)
                .add(nieve_22)
                .add(nieve_23)
                .add(nieve_24)
                .add(nieve_25)
                .add(nieve_26)
                .add(nieve_27)
                .add(nieve_28)
                .add(nieve_29)
                .add(nieve_30)
                .add(nieve_31)
                .add(nieve_32)
                .add(nieve_33)
                .add(nieve_34)
                .add(nieve_35)
                .add(nieve_36)
                .add(nieve_37)
                .add(nieve_38)
                .add(nieve_39)
                .add(nieve_40)
                .add(nieve_41)
                .add(nieve_42)
                .add(nieve_43)
                .add(nieve_44)
                .add(nieve_45)
                .add(nieve_46)
                .add(nieve_47);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local14Loc = mMap.addPolygon(nieve_Loc);
        local14Loc.setClickable(true);
        local14Loc.setTag("local14");
        mMap.addPolygon(nieve_Loc);
    }
    public void local15Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local15latlng = new LatLng(-12.017001396291684, -76.91662882841742);          //     HUACHIPA - Santa María
        // Local15
        local15 = new MarkerOptions();
        local15.position(local15latlng);
        local15.title("La Delicia - HUACHIPA - Santa María");
        local15.snippet("Telf: 918 488 404");
        local15.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local15_marker = mMap.addMarker(local15);
        // HUACHIPA SANTA MARÍA Local 15
        final LatLng stmar_01 = new LatLng(-12.013426388661722, -76.90177043845402);
        final LatLng stmar_02 = new LatLng(-12.00879855571679, -76.89297279354211);
        final LatLng stmar_03 = new LatLng(-12.007255927070332, -76.89500054339071);
        final LatLng stmar_04 = new LatLng(-12.006689244940766, -76.89750036198713);
        final LatLng stmar_05 = new LatLng(-12.007654702669146, -76.89931353513217);
        final LatLng stmar_06 = new LatLng(-12.00879855571679, -76.90101941992543);
        final LatLng stmar_07 = new LatLng(-12.010561549065892, -76.90165242120092);
        final LatLng stmar_08 = new LatLng(-12.011222668596474, -76.90150221750844);
        final LatLng stmar_09 = new LatLng(-12.011715883697136, -76.90321883113688);
        final LatLng stmar_10 = new LatLng(-12.011199239234465, -76.90436155080697);
        final LatLng stmar_11 = new LatLng(-12.00963035505106, -76.9031870401562);
        final LatLng stmar_12 = new LatLng(-12.007281298205399, -76.9024858397259);
        final LatLng stmar_13 = new LatLng(-12.005943869840223, -76.90381812054115);
        final LatLng stmar_14 = new LatLng(-12.00483791443196, -76.90373923554789);
        final LatLng stmar_15 = new LatLng(-12.003783394610732, -76.90514163632493);
        final LatLng stmar_16 = new LatLng(-12.001399993085226, -76.90347628558949);
        final LatLng stmar_17 = new LatLng(-12.00030259251799, -76.90374800074004);
        final LatLng stmar_18 = new LatLng(-12.00056836962788, -76.90559741676476);
        final LatLng stmar_19 = new LatLng(-11.999651008817246, -76.90554482673562);
        final LatLng stmar_20 = new LatLng(-11.998202086723758, -76.90650021234926);
        final LatLng stmar_21 = new LatLng(-11.99512417325373, -76.90396712594574);
        final LatLng stmar_22 = new LatLng(-11.993446075762623, -76.90762654547605);
        final LatLng stmar_23 = new LatLng(-11.995732654340692, -76.91075212114725);
        final LatLng stmar_24 = new LatLng(-11.996670402882902, -76.91318166495716);
        final LatLng stmar_25 = new LatLng(-11.998006367740409, -76.91467878918034);
        final LatLng stmar_26 = new LatLng(-12.00019014223586, -76.9159263928486);
        final LatLng stmar_27 = new LatLng(-12.006201853524782, -76.91981366293956);
        final LatLng stmar_28 = new LatLng(-12.009027127417003, -76.9214074806964);
        final LatLng stmar_29 = new LatLng(-12.009990520131236, -76.92248435966067);
        final LatLng stmar_30 = new LatLng(-12.008489845869825, -76.9308528941445);
        final LatLng stmar_31 = new LatLng(-12.010651612437082, -76.93972564167154);
        final LatLng stmar_32 = new LatLng(-12.011427938033686, -76.94773127964493);
        final LatLng stmar_33 = new LatLng(-12.014114373315122, -76.94973757212125);
        final LatLng stmar_34 = new LatLng(-12.015625481346538, -76.95047786174851);
        final LatLng stmar_35 = new LatLng(-12.01891001329546, -76.95064952311135);
        final LatLng stmar_36 = new LatLng(-12.019812465564758, -76.95040275977264);
        final LatLng stmar_37 = new LatLng(-12.019613086847118, -76.94502761291302);
        final LatLng stmar_38 = new LatLng(-12.019739010273728, -76.94116523183551);
        final LatLng stmar_39 = new LatLng(-12.020882811993337, -76.9331615202638);
        final LatLng stmar_40 = new LatLng(-12.021166138264688, -76.92874123971734);
        final LatLng stmar_41 = new LatLng(-12.020998241246884, -76.92420294215586);
        final LatLng stmar_42 = new LatLng(-12.020630966148444, -76.92097356240228);
        final LatLng stmar_43 = new LatLng(-12.019791478327743, -76.91631724763442);
        final LatLng stmar_44 = new LatLng(-12.018616190990555, -76.91240122266316);
        final LatLng stmar_45 = new LatLng(-12.017419911086263, -76.90935423311554);
        final LatLng stmar_46 = new LatLng(-12.015667456391894, -76.9058029885244);

        PolygonOptions stmar_Loc = new PolygonOptions()
                .add(stmar_01)
                .add(stmar_02)
                .add(stmar_03)
                .add(stmar_04)
                .add(stmar_05)
                .add(stmar_06)
                .add(stmar_07)
                .add(stmar_08)
                .add(stmar_09)
                .add(stmar_10)
                .add(stmar_11)
                .add(stmar_12)
                .add(stmar_13)
                .add(stmar_14)
                .add(stmar_15)
                .add(stmar_16)
                .add(stmar_17)
                .add(stmar_18)
                .add(stmar_19)
                .add(stmar_20)
                .add(stmar_21)
                .add(stmar_22)
                .add(stmar_23)
                .add(stmar_24)
                .add(stmar_25)
                .add(stmar_26)
                .add(stmar_27)
                .add(stmar_28)
                .add(stmar_29)
                .add(stmar_30)
                .add(stmar_31)
                .add(stmar_32)
                .add(stmar_33)
                .add(stmar_34)
                .add(stmar_35)
                .add(stmar_36)
                .add(stmar_37)
                .add(stmar_38)
                .add(stmar_39)
                .add(stmar_40)
                .add(stmar_41)
                .add(stmar_42)
                .add(stmar_43)
                .add(stmar_44)
                .add(stmar_45)
                .add(stmar_46);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local15Loc = mMap.addPolygon(stmar_Loc);
        local15Loc.setClickable(true);
        local15Loc.setTag("local15");
        mMap.addPolygon(stmar_Loc);
    }

    public void local16Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local16latlng = new LatLng(-12.024919177128233, -76.9199059743698);           //     ATE - Calle Nueva
        // Local16
        local16 = new MarkerOptions();
        local16.position(local16latlng);
        local16.title("La Delicia - ATE - Calle Nueva");
        local16.snippet("Telf: 01 721 2452");
        local16.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local16_marker = mMap.addMarker(local16);

        // Calle Nueva ATE
        final LatLng cn_01 = new LatLng(-12.03141427328969, -76.93149242335625);
        final LatLng cn_02 = new LatLng(-12.033386466607137, -76.93103251657723);
        final LatLng cn_03 = new LatLng(-12.033549109357345, -76.92993817526552);
        final LatLng cn_04 = new LatLng(-12.034456759010968, -76.92866680823485);
        final LatLng cn_05 = new LatLng(-12.032095814246684, -76.926547863133);
        final LatLng cn_06 = new LatLng(-12.038101027546134, -76.92422637575244);
        final LatLng cn_07 = new LatLng(-12.037121638510733, -76.92170768009439);
        final LatLng cn_08 = new LatLng(-12.035947647226255, -76.92008935157527);
        final LatLng cn_09 = new LatLng(-12.035262278558532, -76.91908975465604);
        final LatLng cn_10 = new LatLng(-12.0346582636662, -76.92003007303194);
        final LatLng cn_11 = new LatLng(-12.033901453674112, -76.92141080369895);
        final LatLng cn_12 = new LatLng(-12.032091036786944, -76.92197219964181);
        final LatLng cn_13 = new LatLng(-12.03178555316749, -76.92142229496653);
        final LatLng cn_14 = new LatLng(-12.030704756962027, -76.92173343119194);
        final LatLng cn_15 = new LatLng(-12.030446027827027, -76.92114487019693);
        final LatLng cn_16 = new LatLng(-12.030371829659503, -76.92050760978601);
        final LatLng cn_17 = new LatLng(-12.029273694981963, -76.92034070827187);
        final LatLng cn_18 = new LatLng(-12.028160716081523, -76.92079589420604);
        final LatLng cn_19 = new LatLng(-12.027774882283481, -76.92084141281434);
        final LatLng cn_20 = new LatLng(-12.026854814927654, -76.92109935151038);
        final LatLng cn_21 = new LatLng(-12.026468979275604, -76.92058347402809);
        final LatLng cn_22 = new LatLng(-12.027143659468946, -76.91848971890907);
        final LatLng cn_23 = new LatLng(-12.02789773948574, -76.9172596769008);
        final LatLng cn_24 = new LatLng(-12.029146439042085, -76.9163906410594);
        final LatLng cn_25 = new LatLng(-12.029581045102262, -76.91571250042023);
        final LatLng cn_26 = new LatLng(-12.028276646068418, -76.90527706458117);
        final LatLng cn_27 = new LatLng(-12.026579539256508, -76.90549396429684);
        final LatLng cn_28 = new LatLng(-12.025194392701541, -76.9062594927575);
        final LatLng cn_29 = new LatLng(-12.023235209267376, -76.90678260387028);
        final LatLng cn_30 = new LatLng(-12.02269861514711, -76.90673156864091);
        final LatLng cn_31 = new LatLng(-12.021575507710159, -76.90703778001716);
        final LatLng cn_32 = new LatLng(-12.020219288303737, -76.90840217809918);
        final LatLng cn_33 = new LatLng(-12.02258916751779, -76.91774595120444);
        final LatLng cn_34 = new LatLng(-12.023509249484857, -76.92530203812028);
        final LatLng cn_35 = new LatLng(-12.024013809234944, -76.92876145179005);
        final LatLng cn_36 = new LatLng(-12.02414736900555, -76.93255466790824);
        final LatLng cn_37 = new LatLng(-12.023286649320589, -76.93505819054623);
        final LatLng cn_38 = new LatLng(-12.025972679224008, -76.9344664488318);
        final LatLng cn_39 = new LatLng(-12.027103065423296, -76.93439301119182);
        final LatLng cn_40 = new LatLng(-12.027132371042681, -76.93465327818627);
        final LatLng cn_41 = new LatLng(-12.028883462464902, -76.93444085808365);
        final LatLng cn_42 = new LatLng(-12.028200834961554, -76.93221044700617);
        final LatLng cn_43 = new LatLng(-12.031272645123757, -76.93157318663194);

        PolygonOptions cn_Loc = new PolygonOptions()
                .add(cn_01)
                .add(cn_02)
                .add(cn_03)
                .add(cn_04)
                .add(cn_05)
                .add(cn_06)
                .add(cn_07)
                .add(cn_08)
                .add(cn_09)
                .add(cn_10)
                .add(cn_11)
                .add(cn_12)
                .add(cn_13)
                .add(cn_14)
                .add(cn_15)
                .add(cn_16)
                .add(cn_17)
                .add(cn_18)
                .add(cn_19)
                .add(cn_20)
                .add(cn_21)
                .add(cn_22)
                .add(cn_23)
                .add(cn_24)
                .add(cn_25)
                .add(cn_26)
                .add(cn_27)
                .add(cn_28)
                .add(cn_29)
                .add(cn_30)
                .add(cn_31)
                .add(cn_32)
                .add(cn_33)
                .add(cn_34)
                .add(cn_35)
                .add(cn_36)
                .add(cn_37)
                .add(cn_38)
                .add(cn_39)
                .add(cn_40)
                .add(cn_41)
                .add(cn_42)
                .add(cn_43);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local16Loc = mMap.addPolygon(cn_Loc);
        local16Loc.setClickable(true);
        local16Loc.setTag("local16");
        mMap.addPolygon(cn_Loc);
    }
    public void local17Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local17latlng = new LatLng(-12.035328570906081, -76.90462357686629);          //     ATE - Residencial Las Américas
        // Local17
        local17 = new MarkerOptions();
        local17.position(local17latlng);
        local17.title("La Delicia - ATE - Residencial Las Américas");
        local17.snippet("Telf: 959 775 216 / 976 406 769");
        local17.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local17_marker = mMap.addMarker(local17);

        // Local 17 Residencial Las Américas - ATE
        final LatLng america_01 = new LatLng(-12.02948509995706, -76.91473506444386);
        final LatLng america_02 = new LatLng(-12.030071594990554, -76.91505403450488);
        final LatLng america_03 = new LatLng(-12.03098253149391, -76.9135612540456);
        final LatLng america_04 = new LatLng(-12.031107317075923, -76.91196640312758);
        final LatLng america_05 = new LatLng(-12.03164389441855, -76.91080535165925);
        final LatLng america_06 = new LatLng(-12.0319558574975, -76.9098356823011);
        final LatLng america_07 = new LatLng(-12.03180611526477, -76.90931257119998);
        final LatLng america_08 = new LatLng(-12.03204320709472, -76.90919774193388);
        final LatLng america_09 = new LatLng(-12.033004050790886, -76.91024396413611);
        final LatLng america_10 = new LatLng(-12.033390882997534, -76.91181329743945);
        final LatLng america_11 = new LatLng(-12.033029007724238, -76.91262986110948);
        final LatLng america_12 = new LatLng(-12.032642174996807, -76.91294883129308);
        final LatLng america_13 = new LatLng(-12.032778601904525, -76.91287370119984);
        final LatLng america_14 = new LatLng(-12.034048264875326, -76.91356034671101);
        final LatLng america_15 = new LatLng(-12.033938679035296, -76.91079574956959);
        final LatLng america_16 = new LatLng(-12.034532255628555, -76.90979434045128);
        final LatLng america_17 = new LatLng(-12.036075548605522, -76.9097639947261);
        final LatLng america_18 = new LatLng(-12.037054941469904, -76.90899017858573);
        final LatLng america_19 = new LatLng(-12.038182722739247, -76.90862602981281);
        final LatLng america_20 = new LatLng(-12.038064009144342, -76.90703287893129);
        final LatLng america_21 = new LatLng(-12.041594767610608, -76.90659070923866);
        final LatLng america_22 = new LatLng(-12.042455172854307, -76.9060328097626);
        final LatLng america_23 = new LatLng(-12.044196978913693, -76.907395365235);
        final LatLng america_24 = new LatLng(-12.045288213465277, -76.90750265359611);
        final LatLng america_25 = new LatLng(-12.046198677372011, -76.90539786027563);
        final LatLng america_26 = new LatLng(-12.046922176783886, -76.9039904532627);
        final LatLng america_27 = new LatLng(-12.046410433499238, -76.90319653135796);
        final LatLng america_28 = new LatLng(-12.045016369258965, -76.90303413824108);
        final LatLng america_29 = new LatLng(-12.044781559398897, -76.90223396816033);
        final LatLng america_30 = new LatLng(-12.045417932576871, -76.90180016868017);
        final LatLng america_31 = new LatLng(-12.047164831620405, -76.90188948033216);
        final LatLng america_32 = new LatLng(-12.048699597825234, -76.90067739355463);
        final LatLng america_33 = new LatLng(-12.048751419708273, -76.89965304737257);
        final LatLng america_34 = new LatLng(-12.049050885198797, -76.8985557898639);
        final LatLng america_35 = new LatLng(-12.048545098074579, -76.89668336049894);
        final LatLng america_36 = new LatLng(-12.047998065420625, -76.89623226850762);
        final LatLng america_37 = new LatLng(-12.04561581344708, -76.89659314210068);
        final LatLng america_38 = new LatLng(-12.04538641024068, -76.89525790982631);
        final LatLng america_39 = new LatLng(-12.044892310466253, -76.89428355112504);
        final LatLng america_40 = new LatLng(-12.043568824380806, -76.89446398791706);
        final LatLng america_41 = new LatLng(-12.041362999857089, -76.895456390298);
        final LatLng america_42 = new LatLng(-12.040798305866593, -76.89671944787369);
        final LatLng america_43 = new LatLng(-12.040180670455214, -76.89689988467022);
        final LatLng america_44 = new LatLng(-12.036120045151998, -76.89473254335195);
        final LatLng america_45 = new LatLng(-12.033983176016529, -76.89600706405716);
        final LatLng america_46 = new LatLng(-12.034131570255466, -76.89764573353527);
        final LatLng america_47 = new LatLng(-12.032706982179638, -76.8992844030134);
        final LatLng america_48 = new LatLng(-12.032558587154188, -76.9019851730792);
        final LatLng america_49 = new LatLng(-12.028462852122203, -76.899921663366);
        final LatLng america_50 = new LatLng(-12.028908043734965, -76.89661397867867);
        final LatLng america_51 = new LatLng(-12.030926236467662, -76.89612844698146);
        final LatLng america_52 = new LatLng(-12.03024361415059, -76.89394355434396);
        final LatLng america_53 = new LatLng(-12.029976500598211, -76.89285110802521);
        final LatLng america_54 = new LatLng(-12.026563359626731, -76.89354905983997);
        final LatLng america_55 = new LatLng(-12.028195736778217, -76.90532320347324);
        final LatLng america_56 = new LatLng(-12.029530296483701, -76.91459905514323);

        PolygonOptions america_Loc = new PolygonOptions()
                .add(america_01)
                .add(america_02)
                .add(america_03)
                .add(america_04)
                .add(america_05)
                .add(america_06)
                .add(america_07)
                .add(america_08)
                .add(america_09)
                .add(america_10)
                .add(america_11)
                .add(america_12)
                .add(america_13)
                .add(america_14)
                .add(america_15)
                .add(america_16)
                .add(america_17)
                .add(america_18)
                .add(america_19)
                .add(america_20)
                .add(america_21)
                .add(america_22)
                .add(america_23)
                .add(america_24)
                .add(america_25)
                .add(america_26)
                .add(america_27)
                .add(america_28)
                .add(america_29)
                .add(america_30)
                .add(america_31)
                .add(america_32)
                .add(america_33)
                .add(america_34)
                .add(america_35)
                .add(america_36)
                .add(america_37)
                .add(america_38)
                .add(america_39)
                .add(america_40)
                .add(america_41)
                .add(america_42)
                .add(america_43)
                .add(america_44)
                .add(america_45)
                .add(america_46)
                .add(america_47)
                .add(america_48)
                .add(america_49)
                .add(america_50)
                .add(america_51)
                .add(america_52)
                .add(america_53)
                .add(america_54)
                .add(america_55)
                .add(america_56);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local17Loc = mMap.addPolygon(america_Loc);
        local17Loc.setClickable(true);
        local17Loc.setTag("local17");
        mMap.addPolygon(america_Loc);
    }
    public void local18Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local18latlng = new LatLng(-12.034059405920985, -76.92924131164027);          //     ATE - Arco los Ángeles
        // Local18
        local18 = new MarkerOptions();
        local18.position(local18latlng);
        local18.title("ATE - Arco los Ángeles");
        local18.snippet("Telf: 01 698 4927 / 925 837 610");
        local18.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local18_marker = mMap.addMarker(local18);

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
                //.add(ate_01)
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
                .add(ate_15);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local18Loc = mMap.addPolygon(ate_loc);
        local18Loc.setClickable(true);
        local18Loc.setTag("local18");
        mMap.addPolygon(ate_loc);
    }
    public void local19Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local19latlng = new LatLng(-12.029721529865595, -76.92684393237471);          //     ATE - Asoc. El Porvenir - (H. Solidaridad)
        // Local19
        local19 = new MarkerOptions();
        local19.position(local19latlng);
        local19.title("ATE - Asoc. El Porvenir - (H. Solidaridad)");
        local19.snippet("Telf: 916 782 785");
        local19.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local19_marker = mMap.addMarker(local19);
/*
        local19Loc = mMap.addPolygon(stmar_Loc);
        local19Loc.setClickable(true);
        local19Loc.setTag("local19");
        mMap.addPolygon(stmar_Loc);

 */
    }
    public void local20Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local20latlng = new LatLng(-12.043440758816804, -76.97970122806369);          //     SANTA ANITA - Universal
        // Local20
        local20 = new MarkerOptions();
        local20.position(local20latlng);
        local20.title("La Delicia - SANTA ANITA - Universal");
        local20.snippet("Telf: 01 744 6215 / 910 410 161");
        local20.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local20_marker = mMap.addMarker(local20);

        // Polígono Local 41 (Completo)         FLAMENCOS
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
                //.add(flame_01)
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
                .add(flame_18);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local20Loc = mMap.addPolygon(flamenco_Loc);
        local20Loc.setClickable(true);
        local20Loc.setTag("local20");
        mMap.addPolygon(flamenco_Loc);

        // Posición de Cámara principal
        CameraPosition camera = new CameraPosition.Builder()
                .target(local20latlng)
                .zoom(11)
                .bearing(345)
                .tilt(30)
                .build();

        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(camera));
    }

    public void local21Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local21latlng = new LatLng(-12.03057827906478, -76.96170461848178);           //     EL AGUSTINO - Las Praderas de S. A.
        // Local21
        local21 = new MarkerOptions();
        local21.position(local21latlng);
        local21.title("La Delicia - EL AGUSTINO - Las Praderas de S. A.");
        local21.snippet("Telf: 01 488 6134 / 936 908 669");
        local21.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local21_marker = mMap.addMarker(local21);
        /*
        local21Loc = mMap.addPolygon(flamenco_Loc);
        local21Loc.setClickable(true);
        local21Loc.setTag("local21");
        mMap.addPolygon(flamenco_Loc);

         */
    }
    public void local22Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local22latlng = new LatLng(-11.97497287349915, -76.76823011678594);           //     CHACLACAYO - Nicolas Ayllón
        // Local22
        local22 = new MarkerOptions();
        local22.position(local22latlng);
        local22.title("La Delicia - CHACLACAYO - Nicolas Ayllón");
        local22.snippet("Telef: 918 621 382");
        local22.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local22_marker = mMap.addMarker(local22);
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
                .add(p2502)
                .add(p2503)
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
                .add(p2549);
                //.add(p2550)
                //.add(p2551)
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local22Loc = mMap.addPolygon(laland2);
        local22Loc.setClickable(true);
        local22Loc.setTag("local22");
        mMap.addPolygon(laland2);
    }
    public void local25Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local25latlng = new LatLng(-12.00315408863745, -76.87487700950041);           //     CARAPONGO   1
        // Local25
        local25 = new MarkerOptions();
        local25.position(local25latlng);
        local25.title("La Delicia - CARAPONGO - San Antonio");
        local25.snippet("Telf: 983 435 046 /  994 104 149");
        local25.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local25_marker = mMap.addMarker(local25);

        // CARAPONGO 1 Gisela - Datos
        final LatLng carapongo_01 = new LatLng(-11.998797991494099, -76.85792481576293);
        final LatLng carapongo_02 = new LatLng(-11.998797991494099, -76.85792481576293);
        final LatLng carapongo_03 = new LatLng(-12.007408504918383, -76.86995274342482);
        final LatLng carapongo_04 = new LatLng(-12.007443285551785, -76.87214268128747);
        final LatLng carapongo_05 = new LatLng(-12.01157338542005, -76.8924069998514);
        final LatLng carapongo_06 = new LatLng(-12.014373189618466, -76.90057370436014);
        final LatLng carapongo_07 = new LatLng(-12.012008889585362, -76.90350848760175);
        final LatLng carapongo_08 = new LatLng(-12.011169509637663, -76.90083745993881);
        final LatLng carapongo_09 = new LatLng(-12.007800532924298, -76.89827345978533);
        final LatLng carapongo_10 = new LatLng(-12.006835462088167, -76.89449681576288);
        final LatLng carapongo_11 = new LatLng(-12.007607166572958, -76.89143393176879);
        final LatLng carapongo_12 = new LatLng(-12.003091778810784, -76.89052535254575);
        final LatLng carapongo_13 = new LatLng(-12.002993485760044, -76.88820018877401);
        final LatLng carapongo_14 = new LatLng(-12.003413531736086, -76.88656891760915);
        final LatLng carapongo_15 = new LatLng(-12.002427485782473, -76.88546381576295);
        final LatLng carapongo_16 = new LatLng(-11.999027497071205, -76.88603262925747);
        final LatLng carapongo_17 = new LatLng(-11.997479234082867, -76.8848893564683);
        final LatLng carapongo_18 = new LatLng(-11.998313425767192, -76.88441219574324);
        final LatLng carapongo_19 = new LatLng(-12.000297009127042, -76.88336082273214);
        final LatLng carapongo_20 = new LatLng(-12.002642014366128, -76.88147237527957);
        final LatLng carapongo_21 = new LatLng(-11.997667508069174, -76.88122600226855);
        final LatLng carapongo_22 = new LatLng(-11.997201091648325, -76.87957725556336);
        final LatLng carapongo_23 = new LatLng(-11.999587066401624, -76.87734788149265);
        final LatLng carapongo_24 = new LatLng(-12.000936648163716, -76.87679532152083);
        final LatLng carapongo_25 = new LatLng(-12.000288774462836, -76.87482031708444);
        final LatLng carapongo_26 = new LatLng(-11.995582808723816, -76.87425430969958);
        final LatLng carapongo_27 = new LatLng(-11.990193714501105, -76.87059372921613);
        final LatLng carapongo_28 = new LatLng(-11.984339319140494, -76.86709394224177);
        final LatLng carapongo_29 = new LatLng(-11.984042140329757, -76.86484582122827);
        final LatLng carapongo_30 = new LatLng(-11.986578055706866, -76.86488632776839);
        final LatLng carapongo_31 = new LatLng(-11.989391308899174, -76.863691380563);
        final LatLng carapongo_32 = new LatLng(-11.993967735644402, -76.86429898084025);
        final LatLng carapongo_33 = new LatLng(-11.998682760713182, -76.8635901136992);
        final LatLng carapongo_34 = new LatLng(-11.999574247829049, -76.86055211188848);
        final LatLng carapongo_35 = new LatLng(-11.998682760750292, -76.85785841712101);

        PolygonOptions carap_Loc = new PolygonOptions()
                .add(carapongo_01)
                .add(carapongo_02)
                .add(carapongo_03)
                .add(carapongo_04)
                .add(carapongo_05)
                .add(carapongo_06)
                .add(carapongo_07)
                .add(carapongo_08)
                .add(carapongo_09)
                .add(carapongo_10)
                .add(carapongo_11)
                .add(carapongo_12)
                .add(carapongo_13)
                .add(carapongo_14)
                .add(carapongo_15)
                .add(carapongo_16)
                .add(carapongo_17)
                .add(carapongo_18)
                .add(carapongo_19)
                .add(carapongo_20)
                .add(carapongo_21)
                .add(carapongo_22)
                .add(carapongo_23)
                .add(carapongo_24)
                .add(carapongo_25)
                .add(carapongo_26)
                .add(carapongo_27)
                .add(carapongo_28)
                .add(carapongo_29)
                .add(carapongo_30)
                .add(carapongo_31)
                .add(carapongo_32)
                .add(carapongo_33)
                .add(carapongo_34)
                .add(carapongo_35);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local25Loc = mMap.addPolygon(carap_Loc);
        local25Loc.setClickable(true);
        local25Loc.setTag("local25");
        mMap.addPolygon(carap_Loc);
    }
    public void local26Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local26latlng = new LatLng(-12.010114660998658, -76.85282366809392);          //     ATE - Gloria Grande
        // Local26
        local26 = new MarkerOptions();
        local26.position(local26latlng);
        local26.title("La Delicia - ATE - Gloria Grande");
        local26.snippet("Telf: 01 766 9092 / 975 296 926");
        local26.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local26_marker = mMap.addMarker(local26);

        // Local 26 ATE - Gloria Grande Gisela
        final LatLng gg_01 = new LatLng(-12.010081490462554, -76.87764242865113);
        final LatLng gg_02 = new LatLng(-12.017668540169357, -76.87540010186878);
        final LatLng gg_03 = new LatLng(-12.016776574474246, -76.87343672503123);
        final LatLng gg_04 = new LatLng(-12.016304356127732, -76.87354401332219);
        final LatLng gg_05 = new LatLng(-12.015601273969112, -76.8739302513886);
        final LatLng gg_06 = new LatLng(-12.014478437460069, -76.87432721829016);
        final LatLng gg_07 = new LatLng(-12.01377535053273, -76.87409118391626);
        final LatLng gg_08 = new LatLng(-12.013696264722807, -76.87318945766523);
        final LatLng gg_09 = new LatLng(-12.01452271252853, -76.87300328106447);
        final LatLng gg_10 = new LatLng(-12.014053458577246, -76.86796935220553);
        final LatLng gg_11 = new LatLng(-12.011588110908114, -76.86700266583507);
        final LatLng gg_12 = new LatLng(-12.010516518078118, -76.86709575410488);
        final LatLng gg_13 = new LatLng(-12.010124300023705, -76.8649762048898);
        final LatLng gg_14 = new LatLng(-12.010852704494987, -76.86473274318112);
        final LatLng gg_15 = new LatLng(-12.011188890509542, -76.86364432613053);
        final LatLng gg_16 = new LatLng(-12.010271381854526, -76.8629783867509);
        final LatLng gg_17 = new LatLng(-12.01041145972493, -76.861023532163377);
        final LatLng gg_18 = new LatLng(-12.01175925931547, -76.8601265171763);
        final LatLng gg_19 = new LatLng(-12.011906340253343, -76.85938181077327);
        final LatLng gg_20 = new LatLng(-12.010428523357923, -76.85696867554188);
        final LatLng gg_21 = new LatLng(-12.011857313279858, -76.85496369642841);
        final LatLng gg_22 = new LatLng(-12.013244072762511, -76.85414738339567);
        final LatLng gg_23 = new LatLng(-12.014140559906945, -76.85286562910584);
        final LatLng gg_24 = new LatLng(-12.013643290062689, -76.84899172368237);
        final LatLng gg_25 = new LatLng(-12.011478151893058, -76.84852839648397);
        final LatLng gg_26 = new LatLng(-12.009818231149543, -76.8487360550002);
        final LatLng gg_27 = new LatLng(-12.009713172530384, -76.84815604328247);
        final LatLng gg_28 = new LatLng(-12.00995130533694, -76.84360187690166);
        final LatLng gg_29 = new LatLng(-12.014027546110295, -76.84145368514379);
        final LatLng gg_30 = new LatLng(-12.013712375064328, -76.83868251789013);
        final LatLng gg_31 = new LatLng(-12.012437679483405, -76.83871116044409);
        final LatLng gg_32 = new LatLng(-12.01253573320387, -76.83805954234144);
        final LatLng gg_33 = new LatLng(-12.011758306280363, -76.83761558261027);
        final LatLng gg_34 = new LatLng(-12.011492159597067, -76.83698544635125);
        final LatLng gg_35 = new LatLng(-12.00987423071231, -76.83678993797483);
        final LatLng gg_36 = new LatLng(-12.011146937853853, -76.83550814093297);
        final LatLng gg_37 = new LatLng(-12.011474154329298, -76.83405527841389);
        final LatLng gg_38 = new LatLng(-12.008988386672396, -76.83160771030691);
        final LatLng gg_39 = new LatLng(-12.011810227292294, -76.8277335809145);
        final LatLng gg_40 = new LatLng(-12.013254647720606, -76.82816370467417);
        final LatLng gg_41 = new LatLng(-12.014745805046022, -76.82625682265927);
        final LatLng gg_42 = new LatLng(-12.01353044235431, -76.82511938427263);
        final LatLng gg_43 = new LatLng(-12.009730179735007, -76.82232514661473);
        final LatLng gg_44 = new LatLng(-12.005983062358842, -76.82992258417636);
        final LatLng gg_45 = new LatLng(-12.008651575519425, -76.83169842320285);
        final LatLng gg_46 = new LatLng(-12.008700603073374, -76.83305178387758);
        final LatLng gg_47 = new LatLng(-12.008623559770312, -76.83331672750174);
        final LatLng gg_48 = new LatLng(-12.005149584249914, -76.83583011171497);
        final LatLng gg_49 = new LatLng(-12.00132535779318, -76.83755582570068);
        final LatLng gg_50 = new LatLng(-11.999833474536983, -76.83878745552107);
        final LatLng gg_51 = new LatLng(-11.999161073722453, -76.83941759180297);
        final LatLng gg_52 = new LatLng(-12.003732417683713, -76.84546097725654);
        final LatLng gg_53 = new LatLng(-12.00908556884775, -76.87292103603565);

        PolygonOptions ggp_Loc = new PolygonOptions()
                .add(gg_01)
                .add(gg_02)
                .add(gg_03)
                .add(gg_04)
                .add(gg_05)
                .add(gg_06)
                .add(gg_07)
                .add(gg_08)
                .add(gg_09)
                .add(gg_10)
                .add(gg_11)
                .add(gg_12)
                .add(gg_13)
                .add(gg_14)
                .add(gg_15)
                .add(gg_16)
                .add(gg_17)
                .add(gg_18)
                .add(gg_19)
                .add(gg_20)
                .add(gg_21)
                .add(gg_22)
                .add(gg_23)
                .add(gg_24)
                .add(gg_25)
                .add(gg_26)
                .add(gg_27)
                .add(gg_28)
                .add(gg_29)
                .add(gg_30)
                .add(gg_31)
                .add(gg_32)
                .add(gg_33)
                .add(gg_34)
                .add(gg_35)
                .add(gg_36)
                .add(gg_37)
                .add(gg_38)
                .add(gg_39)
                .add(gg_40)
                .add(gg_41)
                .add(gg_42)
                .add(gg_43)
                .add(gg_44)
                .add(gg_45)
                .add(gg_46)
                .add(gg_47)
                .add(gg_48)
                .add(gg_49)
                .add(gg_50)
                .add(gg_51)
                .add(gg_52)
                .add(gg_53);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local26Loc = mMap.addPolygon(ggp_Loc);
        local26Loc.setClickable(true);
        local26Loc.setTag("local26");
        mMap.addPolygon(ggp_Loc);
    }
    public void local27Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local27latlng = new LatLng(-12.045278114790346, -76.8907195014362);                          //     ATE - Priale                                                                        Excel Datos
        // Local49                                                                                SIN TELÉFONO NI CELULAR
        local27 = new MarkerOptions();
        local27.position(local27latlng);                           // Antes Local 49 PRIALE
        local27.title("La Delicia - ATE - Priale");
        local27.snippet("Telf: 01 505 6300 / 921 414 161");
        local27.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local27_marker = mMap.addMarker(local27);

        // Local 49 Priale ATE 16/02/2021
        final LatLng pria_01 = new LatLng(-12.034964014128443, -76.88565770559275);
        final LatLng pria_02 = new LatLng(-12.036286131651273, -76.88668230944735);
        final LatLng pria_03 = new LatLng(-12.03660092057418, -76.8867198603711);
        final LatLng pria_04 = new LatLng(-12.03678979375092, -76.88690761498987);
        final LatLng pria_05 = new LatLng(-12.036417293747297, -76.88743869234013);
        final LatLng pria_06 = new LatLng(-12.036774054324592, -76.88799659177877);
        final LatLng pria_07 = new LatLng(-12.037109828571841, -76.88825408390943);
        final LatLng pria_08 = new LatLng(-12.037806976311415, -76.88765806712381);
        final LatLng pria_09 = new LatLng(-12.0389716868916, -76.88922959807468);
        final LatLng pria_10 = new LatLng(-12.038698876827027, -76.89091403035623);
        final LatLng pria_11 = new LatLng(-12.039874076370918, -76.891654319996);
        final LatLng pria_12 = new LatLng(-12.040734487118149, -76.89150411630096);
        final LatLng pria_13 = new LatLng(-12.040986314116385, -76.89062435180155);
        final LatLng pria_14 = new LatLng(-12.041196169767893, -76.89015228304577);
        final LatLng pria_15 = new LatLng(-12.041668344384323, -76.89034540208223);
        final LatLng pria_16 = new LatLng(-12.042413329350167, -76.89036685980692);
        final LatLng pria_17 = new LatLng(-12.04483713929054, -76.88931543391163);
        final LatLng pria_18 = new LatLng(-12.04501551407183, -76.88909012823031);
        final LatLng pria_19 = new LatLng(-12.045571622846465, -76.8875880912801);
        final LatLng pria_20 = new LatLng(-12.046434561204316, -76.88660135412162);
        final LatLng pria_21 = new LatLng(-12.046390044980106, -76.88346057117577);
        final LatLng pria_22 = new LatLng(-12.048185526834876, -76.8825501993074);
        final LatLng pria_23 = new LatLng(-12.048942296581219, -76.88327849680209);
        final LatLng pria_24 = new LatLng(-12.048793910524589, -76.88408265861915);
        final LatLng pria_25 = new LatLng(-12.047770044498339, -76.88723861442948);
        final LatLng pria_26 = new LatLng(-12.047859076481725, -76.8881641591623);
        final LatLng pria_27 = new LatLng(-12.048526815477858, -76.88846761648553);
        final LatLng pria_28 = new LatLng(-12.050114543606648, -76.88828554211184);
        final LatLng pria_29 = new LatLng(-12.051405493235087, -76.8875420717289);
        final LatLng pria_30 = new LatLng(-12.05247571203115, -76.8867159828821);
        final LatLng pria_31 = new LatLng(-12.052601620053416, -76.89047107525764);
        final LatLng pria_32 = new LatLng(-12.05134253717238, -76.89197311220785);
        final LatLng pria_33 = new LatLng(-12.05014640296397, -76.89120063606202);
        final LatLng pria_34 = new LatLng(-12.048928223871789, -76.89041927194629);
        final LatLng pria_35 = new LatLng(-12.046603336122384, -76.89192824840642);
        final LatLng pria_36 = new LatLng(-12.044048365446766, -76.89357457768516);
        final LatLng pria_37 = new LatLng(-12.041860191498198, -76.89380914550418);
        final LatLng pria_38 = new LatLng(-12.040660217508647, -76.89507220305013);
        final LatLng pria_39 = new LatLng(-12.039407297834263, -76.89512633408529);
        final LatLng pria_40 = new LatLng(-12.037907315838998, -76.89400762595582);
        final LatLng pria_41 = new LatLng(-12.036350600061393, -76.89379128030666);
        final LatLng pria_42 = new LatLng(-12.035658063299115, -76.89313682134977);
        final LatLng pria_43 = new LatLng(-12.034713720245843, -76.89296514173749);
        final LatLng pria_44 = new LatLng(-12.034293998652535, -76.89267546318281);
        final LatLng pria_45 = new LatLng(-12.033542571683281, -76.89272531746079);
        final LatLng pria_46 = new LatLng(-12.033204467277386, -76.89240535550721);
        final LatLng pria_47 = new LatLng(-12.032160851327081, -76.89182895569353);
        final LatLng pria_48 = new LatLng(-12.032638288381504, -76.89073997875956);
        final LatLng pria_49 = new LatLng(-12.033031779818373, -76.88968318847672);
        final LatLng pria_50 = new LatLng(-12.033330832931295, -76.88816505814658);
        final LatLng pria_51 = new LatLng(-12.033540694561918, -76.88747841268362);
        final LatLng pria_52 = new LatLng(-12.034967749323657, -76.88564914615962);

        PolygonOptions pria_Loc = new PolygonOptions()
                .add(pria_01)
                .add(pria_02)
                .add(pria_03)
                .add(pria_04)
                .add(pria_05)
                .add(pria_06)
                .add(pria_07)
                .add(pria_08)
                .add(pria_09)
                .add(pria_10)
                .add(pria_11)
                .add(pria_12)
                .add(pria_13)
                .add(pria_14)
                .add(pria_15)
                .add(pria_16)
                .add(pria_17)
                .add(pria_18)
                .add(pria_19)
                .add(pria_20)
                .add(pria_21)
                .add(pria_22)
                .add(pria_23)
                .add(pria_24)
                .add(pria_25)
                .add(pria_26)
                .add(pria_27)
                .add(pria_28)
                .add(pria_29)
                .add(pria_30)
                .add(pria_31)
                .add(pria_32)
                .add(pria_33)
                .add(pria_34)
                .add(pria_35)
                .add(pria_36)
                .add(pria_37)
                .add(pria_38)
                .add(pria_39)
                .add(pria_40)
                .add(pria_41)
                .add(pria_42)
                .add(pria_43)
                .add(pria_44)
                .add(pria_45)
                .add(pria_46)
                .add(pria_47)
                .add(pria_48)
                .add(pria_49)
                .add(pria_50)
                .add(pria_51)
                .add(pria_52);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local27Loc = mMap.addPolygon(pria_Loc);
        local27Loc.setClickable(true);
        local27Loc.setTag("local27");
        mMap.addPolygon(pria_Loc);
    }
    public void local28Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local28latlng = new LatLng(-12.020449767580827, -76.89039976296671);          //     ATE - Santa Clara, San Martín
        // Local28 comparte con Local29
        local28 = new MarkerOptions();
        local28.position(local28latlng);
        local28.title("La Delicia - ATE - Santa Clara, San Martín");
        local28.snippet("Telf: 01 576 4966 / 950 736 294");
        local28.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local28_marker = mMap.addMarker(local28);

        // Local 29  ATE SANTA CLARA - BOLIVAR y San Martín
        final LatLng staclara_01 = new LatLng(-12.008926657830354, -76.87022609361198);
        final LatLng staclara_02 = new LatLng(-12.010101980923618, -76.86994713233814);
        final LatLng staclara_03 = new LatLng(-12.010553215290669, -76.86945359820861);
        final LatLng staclara_04 = new LatLng(-12.011046431530701, -76.8693892179319);
        final LatLng staclara_05 = new LatLng(-12.01121434117961, -76.86985055916516);
        final LatLng staclara_06 = new LatLng(-12.012578558357523, -76.86983981144989);
        final LatLng staclara_07 = new LatLng(-12.013692191524312, -76.8744597046247);
        final LatLng staclara_08 = new LatLng(-12.0141224390939, -76.87469573796734);
        final LatLng staclara_09 = new LatLng(-12.014584165403864, -76.87632652287652);
        final LatLng staclara_10 = new LatLng(-12.017816243146449, -76.87541457037351);
        final LatLng staclara_11 = new LatLng(-12.019253881351615, -76.8750068760961);
        final LatLng staclara_12 = new LatLng(-12.019453262067119, -76.87451334625044);
        final LatLng staclara_13 = new LatLng(-12.019211905182859, -76.87369794954812);
        final LatLng staclara_14 = new LatLng(-12.019421777057838, -76.8730434841993);
        final LatLng staclara_15 = new LatLng(-12.018550791254867, -76.87198132878869);
        final LatLng staclara_16 = new LatLng(-12.019138433254907, -76.86976046521058);
        final LatLng staclara_17 = new LatLng(-12.019484719258866, -76.86923474421937);
        final LatLng staclara_18 = new LatLng(-12.021709366863183, -76.86900943493454);
        final LatLng staclara_19 = new LatLng(-12.022265520709226, -76.8685481056758);
        final LatLng staclara_20 = new LatLng(-12.022769212736662, -76.868709034053);
        final LatLng staclara_21 = new LatLng(-12.023188946483385, -76.86774342362335);
        final LatLng staclara_22 = new LatLng(-12.02392348254153, -76.86642374006924);
        final LatLng staclara_23 = new LatLng(-12.024448175656564, -76.86647744936855);
        final LatLng staclara_24 = new LatLng(-12.025172220951566, -76.86589809299922);
        final LatLng staclara_25 = new LatLng(-12.025602449567677, -76.86576934628079);
        final LatLng staclara_26 = new LatLng(-12.02598021123362, -76.86554404029324);
        final LatLng staclara_27 = new LatLng(-12.026525867577776, -76.86623068639939);
        final LatLng staclara_28 = new LatLng(-12.025445046480282, -76.86743231437931);
        final LatLng staclara_29 = new LatLng(-12.024993815256337, -76.86926694334134);
        final LatLng staclara_30 = new LatLng(-12.025476508036125, -76.8695673574724);
        final LatLng staclara_31 = new LatLng(-12.024962354904478, -76.8710264794068);
        final LatLng staclara_32 = new LatLng(-12.024269786532562, -76.87088700217984);
        final LatLng staclara_33 = new LatLng(-12.023587711616944, -76.87089772948003);
        final LatLng staclara_34 = new LatLng(-12.023346358198392, -76.87185259460101);
        final LatLng staclara_35 = new LatLng(-12.023566709871297, -76.87321516108717);
        final LatLng staclara_36 = new LatLng(-12.023829061344578, -76.87465282217931);
        final LatLng staclara_37 = new LatLng(-12.023771255711548, -76.87587556174812);
        final LatLng staclara_38 = new LatLng(-12.023728390684889, -76.87668194156784);
        final LatLng staclara_39 = new LatLng(-12.023496927814714, -76.87686600758414);
        final LatLng staclara_40 = new LatLng(-12.023959855670984, -76.8774094374537);
        final LatLng staclara_41 = new LatLng(-12.024379919060102, -76.87785645373451);
        final LatLng staclara_42 = new LatLng(-12.023796973808013, -76.87808434365012);
        final LatLng staclara_43 = new LatLng(-12.024011291418429, -76.87830346955091);
        final LatLng staclara_44 = new LatLng(-12.024928573069813, -76.87827717682949);
        final LatLng staclara_45 = new LatLng(-12.024782833950042, -76.8791449169423);
        final LatLng staclara_46 = new LatLng(-12.024037007266251, -76.87900467182743);
        final LatLng staclara_47 = new LatLng(-12.023685522023015, -76.8796269869);
        final LatLng staclara_48 = new LatLng(-12.023779817585197, -76.88019671548871);
        final LatLng staclara_49 = new LatLng(-12.023248304961774, -76.88052101703447);
        final LatLng staclara_50 = new LatLng(-12.022751101374137, -76.88238796079361);
        final LatLng staclara_51 = new LatLng(-12.022888263825326, -76.88308039586485);
        final LatLng staclara_52 = new LatLng(-12.023745538300052, -76.88259832203204);
        final LatLng staclara_53 = new LatLng(-12.02431991050113, -76.88123097523375);
        final LatLng staclara_54 = new LatLng(-12.024971432440658, -76.88102938438541);
        final LatLng staclara_55 = new LatLng(-12.025751546858691, -76.88095049700175);
        final LatLng staclara_56 = new LatLng(-12.02605158740143, -76.88114332976856);
        final LatLng staclara_57 = new LatLng(-12.026300194575821, -76.88171305574029);
        final LatLng staclara_58 = new LatLng(-12.026085876332655, -76.8827210326177);
        final LatLng staclara_59 = new LatLng(-12.026077302013672, -76.88309792862529);
        final LatLng staclara_60 = new LatLng(-12.025231402391023, -76.88328480580364);
        final LatLng staclara_61 = new LatLng(-12.025454545463631, -76.88437874587834);
        final LatLng staclara_62 = new LatLng(-12.02641576698652, -76.8842149462865);
        final LatLng staclara_63 = new LatLng(-12.026501589968522, -76.88509243803064);
        final LatLng staclara_64 = new LatLng(-12.027016527745117, -76.88499883929141);
        final LatLng staclara_65 = new LatLng(-12.02753210125243, -76.88508491597631);
        final LatLng staclara_66 = new LatLng(-12.02806992300489, -76.88543006064273);
        final LatLng staclara_67 = new LatLng(-12.028207239571023, -76.88578690632738);
        final LatLng staclara_68 = new LatLng(-12.028044183009216, -76.88589748886206);
        final LatLng staclara_69 = new LatLng(-12.025542229554597, -76.8860735747924);
        final LatLng staclara_70 = new LatLng(-12.018586528610244, -76.89732276120287);
        final LatLng staclara_71 = new LatLng(-12.01816883980998, -76.89760355766356);
        final LatLng staclara_72 = new LatLng(-12.016349320857492, -76.8981826919711);
        final LatLng staclara_73 = new LatLng(-12.016314994995748, -76.89753334842057);
        final LatLng staclara_74 = new LatLng(-12.016091846505335, -76.89632826696455);
        final LatLng staclara_75 = new LatLng(-12.014850220231594, -76.8965037591813);
        final LatLng staclara_76 = new LatLng(-12.014306653364555, -76.89393564327833);
        final LatLng staclara_77 = new LatLng(-12.0143238196867, -76.89264280510433);
        final LatLng staclara_78 = new LatLng(-12.015639829850024, -76.89209290679126);
        final LatLng staclara_79 = new LatLng(-12.015931639181344, -76.89146696374864);
        final LatLng staclara_80 = new LatLng(-12.015873514100432, -76.8903543101475);
        final LatLng staclara_81 = new LatLng(-12.014374395238569, -76.88538771091169);
        final LatLng staclara_82 = new LatLng(-12.014191310111686, -76.88520051167876);
        final LatLng staclara_83 = new LatLng(-12.012343165220582, -76.88576795773295);
        final LatLng staclara_84 = new LatLng(-12.011513490280612, -76.88432302358308);
        final LatLng staclara_85 = new LatLng(-12.009654457806803, -76.87808565441036);
        final LatLng staclara_86 = new LatLng(-12.008741406038064, -76.87133722768911);

        PolygonOptions staclara_Loc = new PolygonOptions()
                .add(staclara_01)
                .add(staclara_02)
                .add(staclara_03)
                .add(staclara_04)
                .add(staclara_05)
                .add(staclara_06)
                .add(staclara_07)
                .add(staclara_08)
                .add(staclara_09)
                .add(staclara_10)
                .add(staclara_11)
                .add(staclara_12)
                .add(staclara_13)
                .add(staclara_14)
                .add(staclara_15)
                .add(staclara_16)
                .add(staclara_17)
                .add(staclara_18)
                .add(staclara_19)
                .add(staclara_20)
                .add(staclara_21)
                .add(staclara_22)
                .add(staclara_23)
                .add(staclara_24)
                .add(staclara_25)
                .add(staclara_26)
                .add(staclara_27)
                .add(staclara_28)
                .add(staclara_29)
                .add(staclara_30)
                .add(staclara_31)
                .add(staclara_32)
                .add(staclara_33)
                .add(staclara_34)
                .add(staclara_35)
                .add(staclara_36)
                .add(staclara_37)
                .add(staclara_38)
                .add(staclara_39)
                .add(staclara_40)
                .add(staclara_41)
                .add(staclara_42)
                .add(staclara_43)
                .add(staclara_44)
                .add(staclara_45)
                .add(staclara_46)
                .add(staclara_47)
                .add(staclara_48)
                .add(staclara_49)
                .add(staclara_50)
                .add(staclara_51)
                .add(staclara_52)
                .add(staclara_53)
                .add(staclara_54)
                .add(staclara_55)
                .add(staclara_56)
                .add(staclara_57)
                .add(staclara_58)
                .add(staclara_59)
                .add(staclara_60)
                .add(staclara_61)
                .add(staclara_62)
                .add(staclara_63)
                .add(staclara_64)
                .add(staclara_65)
                .add(staclara_66)
                .add(staclara_67)
                .add(staclara_68)
                .add(staclara_69)
                .add(staclara_70)
                .add(staclara_71)
                .add(staclara_72)
                .add(staclara_73)
                .add(staclara_74)
                .add(staclara_75)
                .add(staclara_76)
                .add(staclara_77)
                .add(staclara_78)
                .add(staclara_79)
                .add(staclara_80)
                .add(staclara_81)
                .add(staclara_82)
                .add(staclara_83)
                .add(staclara_84)
                .add(staclara_85)
                .add(staclara_86);
        //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local28Loc = mMap.addPolygon(staclara_Loc);
        local28Loc.setClickable(true);
        local28Loc.setTag("local28");
        mMap.addPolygon(staclara_Loc);
        /*
        local28Loc = mMap.addPolygon(flamenco_Loc);
        local28Loc.setClickable(true);
        local28Loc.setTag("local28");
        mMap.addPolygon(flamenco_Loc);

         */
    }
    public void local29Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local29latlng = new LatLng(-12.015921297550893, -76.88288248419425);          //     ATE - Santa Clara, Bolívar
        // Local29
        local29 = new MarkerOptions();
        local29.position(local29latlng);
        local29.title("La Delicia - ATE - Santa Clara, Bolívar");     // BOlivar
        local29.snippet("Telf: 01 284 3510 / 996 250 790");
        local29.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local29_marker = mMap.addMarker(local29);
    }
    public void local30Map(GoogleMap googleMap)
    {
        mMap = googleMap;
        final LatLng local30latlng = new LatLng(-12.045854831823023, -76.97387102281945);          //     SANTA ANITA BOLOGNESI
        // Local30
        local30 = new MarkerOptions();
        local30.position(local30latlng);
        local30.title("La Delicia - SANTA ANITA - Municipalidad de Santa Anita");
        local30.snippet("Telf: 01 362 0609 / 912 179 990");
        local30.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        local30_marker = mMap.addMarker(local30);

        // Local 30 Santa Anita por la Municipalidad de Santa Anita
        final LatLng sam_01 = new LatLng(-12.036912524600526, -76.96275836483072);
        final LatLng sam_02 = new LatLng(-12.032677350983658, -76.96459905387556);
        final LatLng sam_03 = new LatLng(-12.038289415612574, -76.97206897316907);
        final LatLng sam_04 = new LatLng(-12.039690802225193, -76.9740055622443);
        final LatLng sam_05 = new LatLng(-12.040219276517064, -76.9750078041346);
        final LatLng sam_06 = new LatLng(-12.04035399095896, -76.97679838875348);
        final LatLng sam_07 = new LatLng(-12.040334730784089, -76.98002537937477);
        final LatLng sam_08 = new LatLng(-12.040315466878692, -76.98150114229222);
        final LatLng sam_09 = new LatLng(-12.039918336005162, -76.98350465914073);
        final LatLng sam_10 = new LatLng(-12.039477739605564, -76.98452032509056);
        final LatLng sam_11 = new LatLng(-12.039890917833231, -76.98525071721937);
        final LatLng sam_12 = new LatLng(-12.0394917451917, -76.98789298098256);
        final LatLng sam_13 = new LatLng(-12.0404791871343, -76.98757791928207);
        final LatLng sam_14 = new LatLng(-12.04099041607546, -76.98727001436946);
        final LatLng sam_15 = new LatLng(-12.04180277862682, -76.98687618234888);
        final LatLng sam_16 = new LatLng(-12.042719896214237, -76.98606397481817);
        final LatLng sam_17 = new LatLng(-12.050869444296993, -76.97691212719317);
        final LatLng sam_18 = new LatLng(-12.051246315798386, -76.97659901372359);
        final LatLng sam_19 = new LatLng(-12.05218849436048, -76.97590052482408);
        final LatLng sam_20 = new LatLng(-12.052706706971373, -76.97563559819835);
        final LatLng sam_21 = new LatLng(-12.056216314223276, -76.97407002252503);
        final LatLng sam_22 = new LatLng(-12.05744112476, -76.97139647742071);
        final LatLng sam_23 = new LatLng(-12.056404678687958, -76.96881930246767);
        final LatLng sam_24 = new LatLng(-12.051081456874089, -76.95631900113038);
        final LatLng sam_25 = new LatLng(-12.048301782720245, -76.94964723947915);
        final LatLng sam_26 = new LatLng(-12.037961075712273, -76.95400691175068);
        final LatLng sam_27 = new LatLng(-12.034922368971026, -76.95530756009816);
        final LatLng sam_28 = new LatLng(-12.035348459404643, -76.95608305596002);
        final LatLng sam_29 = new LatLng(-12.03529711086874, -76.95796102856733);
        PolygonOptions sam_Loc = new PolygonOptions()
                .add(sam_01)
                .add(sam_02)
                .add(sam_03)
                .add(sam_04)
                .add(sam_05)
                .add(sam_06)
                .add(sam_07)
                .add(sam_08)
                .add(sam_09)
                .add(sam_10)
                .add(sam_11)
                .add(sam_12)
                .add(sam_13)
                .add(sam_14)
                .add(sam_15)
                .add(sam_16)
                .add(sam_17)
                .add(sam_18)
                .add(sam_19)
                .add(sam_20)
                .add(sam_21)
                .add(sam_22)
                .add(sam_23)
                .add(sam_24)
                .add(sam_25)
                .add(sam_26)
                .add(sam_27)
                .add(sam_28)
                .add(sam_29);
                //.fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(3);
        local30Loc = mMap.addPolygon(sam_Loc);
        local30Loc.setClickable(true);
        local30Loc.setTag("local30");
        mMap.addPolygon(sam_Loc);
    }

}