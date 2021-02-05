package com.example.pdelicia;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private MarkerOptions marker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {


        pizzeriaDelicia(googleMap);
    }

    public void pizzeriaDelicia(GoogleMap googleMap) {
        CircleOptions circulo = new CircleOptions();
        mMap = googleMap;
        // La Delicia Comas
        final LatLng pizzeria = new LatLng(-11.9559148, -77.0591945);
        mMap.addMarker(new MarkerOptions().position(pizzeria).title("Pizzería la Delicia COMAS"));
        mMap.addCircle(
                circulo.center(pizzeria)
                        .radius(500.0)
                        .fillColor(Color.argb(70,150,50,50))
                        .strokeColor(android.R.color.holo_red_dark)
                        .strokeWidth(3f));



        // Prueba de Francisco
        //final LatLng francisco = new LatLng(-11.9559148, -77.068);

        // Pruebas
        final LatLng pb1 = new LatLng(-12.077994422913617, -77.09627866744997);                  // Prueba 1
        final LatLng pb2 = new LatLng(-12.078067862276772, -77.09527015686037);                  // Prueba 2
        final LatLng pb3 = new LatLng(-12.078655376456977, -77.09616065025331);                  // Prueba 3
        final LatLng pb4 = new LatLng(-12.078718324328394, -77.09557056427003);                  // Prueba 4
        final LatLng pb5 = new LatLng(-12.079137976426315, -77.09618210792543);                  // Prueba 5
        final LatLng pb6 = new LatLng(-12.079358293514403, -77.0954203605652);                   // Prueba 6
        final LatLng pb7 = new LatLng(-12.079861874749236, -77.0960855484009);                   // Prueba 7
        final LatLng pb8 = new LatLng(-12.079945804862946, -77.09545254707338);                  // Prueba 8

        PolygonOptions poly = new PolygonOptions()
                .add(pb1)
                .add(pb2)
                .add(pb4)
                .add(pb6)
                .add(pb8)
                .add(pb7)
                .add(pb5)
                .add(pb3).fillColor(0x331FFF00).strokeColor(Color.GREEN).strokeWidth(10);


        Polygon polygon = mMap.addPolygon(poly);

        // POLYGON  **************************************************************************************
        final LatLng pt1 = new LatLng(-12.073776871410592,-77.08709478378297);
        final LatLng pt2 = new LatLng(-12.074616190436025,-77.08381175994873);
        final LatLng pt3 = new LatLng(-12.073126397356944,-77.08325386047365);
        final LatLng pt4 = new LatLng(-12.07425948017158,-77.07915544509889);
        final LatLng pt5 = new LatLng(-12.075014866051749,-77.07954168319704);
        final LatLng pt6 = new LatLng(-12.075707301237022,-77.07640886306764);
        final LatLng pt7 = new LatLng(-12.07625285497054,-77.07424163818361);
        final LatLng pt8 = new LatLng(-12.08420522357817,-77.07739591598512);
        final LatLng pt9 = new LatLng(-12.081960119698053,-77.08226680755617);
        final LatLng pt10 = new LatLng(-12.081582436821027,-77.08670854568483);
        final LatLng pt11 = new LatLng(-12.080931981728103,-77.08838224411011);
        final LatLng pt12 = new LatLng(-12.078204249612078,-77.08707332611085);
        final LatLng pt13 = new LatLng(-12.077994422913617,-77.08889722824098);
        final LatLng central = new LatLng(-12.076987252472195,-77.08239555358888);
        final LatLng central2 = new LatLng(-12.079987769909938,-77.07825422286987);
        final LatLng central3 = new LatLng(-12.076966269714395,-77.07668781280519);
        final LatLng central4 = new LatLng(-12.075434523953495,-77.08626866340637);

        PolygonOptions policia = new PolygonOptions()
                .add(pt1)
                .add(pt2)
                .add(pt3)
                .add(pt4)
                .add(pt5)
                .add(pt6)
                .add(pt7)
                .add(pt8)
                .add(pt9)
                .add(pt10)
                .add(pt11)
                .add(pt12)
                .add(pt13)
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(10);


        Polygon polygons = mMap.addPolygon(policia);

        // Prueba San micky
        marker = new MarkerOptions();
        marker.position(central);
        marker.title("Prueba de Frisco 1");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Prueba San micky
        marker = new MarkerOptions();
        marker.position(central2);
        marker.title("Prueba de Frisco 1");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Prueba San micky
        marker = new MarkerOptions();
        marker.position(central3);
        marker.title("Prueba de Frisco 1");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Prueba San micky
        marker = new MarkerOptions();
        marker.position(central4);
        marker.title("Prueba de Frisco 1");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

    // ****************************************************************************************************

        // Prueba 1
        marker = new MarkerOptions();
        marker.position(pb1);
        marker.title("Prueba de ícono 1");
        marker.snippet("Esto es prueba c:");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Prueba 2
        marker = new MarkerOptions();
        marker.position(pb2);
        marker.title("Prueba de ícono 2");
        marker.snippet("Esto es prueba c:");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Prueba 3
        marker = new MarkerOptions();
        marker.position(pb3);
        marker.title("Prueba de ícono 3");
        marker.snippet("Esto es prueba c:");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Prueba 4
        marker = new MarkerOptions();
        marker.position(pb4);
        marker.title("Prueba de ícono 4");
        marker.snippet("Esto es prueba c:");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Prueba 5
        marker = new MarkerOptions();
        marker.position(pb5);
        marker.title("Prueba de ícono 5");
        marker.snippet("Esto es prueba c:");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Prueba 6
        marker = new MarkerOptions();
        marker.position(pb6);
        marker.title("Prueba de ícono 6");
        marker.snippet("Esto es prueba c:");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Prueba 7
        marker = new MarkerOptions();
        marker.position(pb7);
        marker.title("Prueba de ícono 7");
        marker.snippet("Esto es prueba c:");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Prueba 8
        marker = new MarkerOptions();
        marker.position(pb8);
        marker.title("Prueba de ícono 8");
        marker.snippet("Esto es prueba c:");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.delicia));
        mMap.addMarker(marker);

        // Posición de Cámara principal
        CameraPosition camera = new CameraPosition.Builder()
                .target(central)
                .zoom(15)
                .bearing(90)
                .tilt(30)
                .build();

        //mMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.mipmap.ic_launcher)).anchor(0.0f,1.0f).position(francisco));

        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(camera));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(pizzeria));
    }

    public void prueba01(GoogleMap googleMap)
    {
        mMap = googleMap;
        LatLng Lima = new LatLng(-11.9559148, -77.068);
        mMap.addMarker(new MarkerOptions().position(Lima).title("Hola desde Lima"));
    }
}