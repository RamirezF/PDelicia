package com.ramirezf.pdelicia.activities;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.ramirezf.pdelicia.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
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
        mMap = googleMap;

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
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo01));
        mMap.addMarker(marker);

        // Local02
        marker = new MarkerOptions();
        marker.position(local02);
        marker.title("Prueba de Frisco 2");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo02));
        mMap.addMarker(marker);

        // Local03
        marker = new MarkerOptions();
        marker.position(local03);
        marker.title("Prueba de Frisco 3");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo03));
        mMap.addMarker(marker);

        // Local04
        marker = new MarkerOptions();
        marker.position(local04);
        marker.title("Prueba de Frisco 4");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo04));
        mMap.addMarker(marker);

        // Local05
        marker = new MarkerOptions();
        marker.position(local05);
        marker.title("Prueba de Frisco 5");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo01));
        mMap.addMarker(marker);

        // Local06
        marker = new MarkerOptions();
        marker.position(local06);
        marker.title("Prueba de Frisco 6");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo02));
        mMap.addMarker(marker);

        // Local07
        marker = new MarkerOptions();
        marker.position(local07);
        marker.title("Prueba de Frisco 7");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo03));
        mMap.addMarker(marker);

        // Local08
        marker = new MarkerOptions();
        marker.position(local08);
        marker.title("Prueba de Frisco 8");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo04));
        mMap.addMarker(marker);

        // Local09
        marker = new MarkerOptions();
        marker.position(local09);
        marker.title("Prueba de Frisco 9");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo01));
        mMap.addMarker(marker);

        // Local10
        marker = new MarkerOptions();
        marker.position(local10);
        marker.title("Prueba de Frisco 10");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo02));
        mMap.addMarker(marker);

        // Local11
        marker = new MarkerOptions();
        marker.position(local11);
        marker.title("Prueba de Frisco 11");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo03));
        mMap.addMarker(marker);

        // Local12
        marker = new MarkerOptions();
        marker.position(local12);
        marker.title("Prueba de Frisco 12");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo04));
        mMap.addMarker(marker);

        // Local13
        marker = new MarkerOptions();
        marker.position(local13);
        marker.title("Prueba de Frisco 13");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo01));
        mMap.addMarker(marker);

        // Local14
        marker = new MarkerOptions();
        marker.position(local14);
        marker.title("Prueba de Frisco 14");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo02));
        mMap.addMarker(marker);

        // Local15
        marker = new MarkerOptions();
        marker.position(local15);
        marker.title("Prueba de Frisco 15");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo03));
        mMap.addMarker(marker);

        // Local16
        marker = new MarkerOptions();
        marker.position(local16);
        marker.title("Prueba de Frisco 16");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo04));
        mMap.addMarker(marker);

        // Local17
        marker = new MarkerOptions();
        marker.position(local17);
        marker.title("Prueba de Frisco 17");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo01));
        mMap.addMarker(marker);

        // Local18
        marker = new MarkerOptions();
        marker.position(local18);
        marker.title("Prueba de Frisco 18");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo02));
        mMap.addMarker(marker);

        // Local19
        marker = new MarkerOptions();
        marker.position(local19);
        marker.title("Prueba de Frisco 19");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo03));
        mMap.addMarker(marker);

        // Local20
        marker = new MarkerOptions();
        marker.position(local20);
        marker.title("Prueba de Frisco 20");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo04));
        mMap.addMarker(marker);

        // Local21
        marker = new MarkerOptions();
        marker.position(local21);
        marker.title("Prueba de Frisco 21");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo01));
        mMap.addMarker(marker);

        // Local22
        marker = new MarkerOptions();
        marker.position(local22);
        marker.title("Prueba de Frisco 22");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo02));
        mMap.addMarker(marker);

        // Local23
        marker = new MarkerOptions();
        marker.position(local23);
        marker.title("Prueba de Frisco 23");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo03));
        mMap.addMarker(marker);

        // Local24
        marker = new MarkerOptions();
        marker.position(local24);
        marker.title("Prueba de Frisco 24");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo04));
        mMap.addMarker(marker);

        // Local25
        marker = new MarkerOptions();
        marker.position(local25);
        marker.title("Prueba de Frisco 25");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo01));
        mMap.addMarker(marker);

        // Local26
        marker = new MarkerOptions();
        marker.position(local26);
        marker.title("Prueba de Frisco 26");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo02));
        mMap.addMarker(marker);

        // Local27
        marker = new MarkerOptions();
        marker.position(local27);
        marker.title("Prueba de Frisco 27");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo03));
        mMap.addMarker(marker);

        // Local28
        marker = new MarkerOptions();
        marker.position(local28);
        marker.title("Prueba de Frisco 28");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo04));
        mMap.addMarker(marker);

        // Local29
        marker = new MarkerOptions();
        marker.position(local29);
        marker.title("Prueba de Frisco 29");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo01));
        mMap.addMarker(marker);

        // Local30
        marker = new MarkerOptions();
        marker.position(local30);
        marker.title("Prueba de Frisco 30");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo02));
        mMap.addMarker(marker);

        // Local31
        marker = new MarkerOptions();
        marker.position(local31);
        marker.title("Prueba de Frisco 31");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo03));
        mMap.addMarker(marker);

        // Local32
        marker = new MarkerOptions();
        marker.position(local32);
        marker.title("Prueba de Frisco 32");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo04));
        mMap.addMarker(marker);

        // Local33
        marker = new MarkerOptions();
        marker.position(local33);
        marker.title("Prueba de Frisco 33");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo01));
        mMap.addMarker(marker);

        // Local34
        marker = new MarkerOptions();
        marker.position(local34);
        marker.title("Prueba de Frisco 34");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo02));
        mMap.addMarker(marker);

        // Local35
        marker = new MarkerOptions();
        marker.position(local35);
        marker.title("Prueba de Frisco 35");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo03));
        mMap.addMarker(marker);

        // Local36
        marker = new MarkerOptions();
        marker.position(local36);
        marker.title("Prueba de Frisco 36");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo04));
        mMap.addMarker(marker);

        // Local37
        marker = new MarkerOptions();
        marker.position(local37);
        marker.title("Prueba de Frisco 37");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo01));
        mMap.addMarker(marker);

        // Local38
        marker = new MarkerOptions();
        marker.position(local38);
        marker.title("Prueba de Frisco 38");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo02));
        mMap.addMarker(marker);

        // Local39
        marker = new MarkerOptions();
        marker.position(local39);
        marker.title("Prueba de Frisco 39");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo03));
        mMap.addMarker(marker);

        // Local40
        marker = new MarkerOptions();
        marker.position(local40);
        marker.title("Prueba de Frisco 40");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo04));
        mMap.addMarker(marker);

        // Local41
        marker = new MarkerOptions();
        marker.position(local41);
        marker.title("Prueba de Frisco 41");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo01));
        mMap.addMarker(marker);

        // Local42
        marker = new MarkerOptions();
        marker.position(local42);
        marker.title("Prueba de Frisco 42");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo02));
        mMap.addMarker(marker);

        // Local43
        marker = new MarkerOptions();
        marker.position(local43);
        marker.title("Prueba de Frisco 43");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo03));
        mMap.addMarker(marker);

        // Local44
        marker = new MarkerOptions();
        marker.position(local44);
        marker.title("Prueba de Frisco 44");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo04));
        mMap.addMarker(marker);

        // Local45
        marker = new MarkerOptions();
        marker.position(local45);
        marker.title("Prueba de Frisco 45");
        marker.snippet("Funciona papu :'v");
        marker.icon(BitmapDescriptorFactory.fromResource(R.drawable.logo01));
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
                .fillColor(0x33FF0000).strokeColor(Color.RED).strokeWidth(10);

        Polygon actores = mMap.addPolygon(laland);

        // Polígono 2

        final LatLng p01 = new LatLng(-12.024076387091215, -76.97699645338558);
        final LatLng p02 = new LatLng(-12.025680557676722, -76.97724008138084);
        final LatLng p03 = new LatLng(-12.026128210136523, -76.96978114416606);
        final LatLng p04 = new LatLng(-12.020127632211087, -76.9525941634469);
        final LatLng p05 = new LatLng(-12.019997757697451, -76.9523290899433);
        final LatLng p06 = new LatLng(-12.019003644168126, -76.95208180289056);
        final LatLng p07 = new LatLng(-12.019133117127284, -76.95283462984997);
        final LatLng p08 = new LatLng(-12.01884946857254, -76.9533054419027);
        final LatLng p09 = new LatLng(-12.0188811292306, -76.95615582226341);
        final LatLng p10 = new LatLng(-12.017781622890613, -76.95641072902673);
        final LatLng p11 = new LatLng(-12.017715192358535, -76.95754560806326);
        final LatLng p12 = new LatLng(-12.015522244760904, -76.95995373807278);
        final LatLng p13 = new LatLng(-12.006785957705485, -76.95469928275062);
        final LatLng p14 = new LatLng(-12.003427485742813, -76.9557830022685);
        final LatLng p15 = new LatLng(-12.006353363145884, -76.95701236506174);
        final LatLng p16 = new LatLng(-12.00709832193052, -76.96047108097797);
        final LatLng p17 = new LatLng(-12.006678579660223, -76.96422608692784);
        final LatLng p18 = new LatLng(-12.009315172996113, -76.96694836786398);
        final LatLng p19 = new LatLng(-12.012755272311644, -76.96811580162259);
        final LatLng p20 = new LatLng(-12.013510677273741, -76.96894190739138);
        final LatLng p21 = new LatLng(-12.01753737784867, -76.9692837399887);
        final LatLng p22 = new LatLng(-12.016640269794266, -76.97206800064413);
        final LatLng p23 = new LatLng(-12.018466023211136, -76.97558144972099);
        final LatLng p24 = new LatLng(-12.021249867287713, -76.97747694527088);
        final LatLng p25 = new LatLng(-12.021655941560219, -76.97960204711829);
        final LatLng p26 = new LatLng(-12.022820510992632, -76.98160800226827);
        final LatLng p27 = new LatLng(-12.020931562240207, -76.98411854459803);
        final LatLng p28 = new LatLng(-12.021068017226103, -76.98625190042196);
        final LatLng p29 = new LatLng(-12.019982037722558, -76.99055043720492);
        final LatLng p30 = new LatLng(-12.021146738211709, -76.99094236506174);
        final LatLng p31 = new LatLng(-12.022288452063679, -76.99152515039287);
        final LatLng p32 = new LatLng(-12.026532067024165, -76.99130646196787);
        final LatLng p33 = new LatLng(-12.026434921639837, -76.98815682500786);


        PolygonOptions laland1 = new PolygonOptions()
                .add(p01)
                .add(p02)
                .add(p03)
                .add(p04)
                .add(p05)
                .add(p06)
                .add(p07)
                .add(p08)
                .add(p09)
                .add(p10)
                .add(p11)
                .add(p12)
                .add(p13)
                .add(p14)
                .add(p15)
                .add(p16)
                .add(p17)
                .add(p18)
                .add(p19)
                .add(p20)
                .add(p21)
                .add(p22)
                .add(p23)
                .add(p24)
                .add(p25)
                .add(p26)
                .add(p27)
                .add(p28)
                .add(p29)
                .add(p30)
                .add(p31)
                .add(p32)
                .add(p33)
                .fillColor(0x330fff00).strokeColor(Color.BLUE).strokeWidth(10);

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
                .fillColor(0x330013ff).strokeColor(Color.BLUE).strokeWidth(10);

        Polygon actoresss = mMap.addPolygon(laland2);


        // Posición de Cámara principal
        CameraPosition camera = new CameraPosition.Builder()
                .target(local10)
                .zoom(13)
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