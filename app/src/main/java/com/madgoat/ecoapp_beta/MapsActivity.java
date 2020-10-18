package com.madgoat.ecoapp_beta;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {


    private static final int REQUEST_CODE=101;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



    }





    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng santiago = new LatLng(-33.448760060942966, -70.6524823222668);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(santiago,10));


        LatLng point1 = new LatLng(-33.586319, -70.629181);
        mMap.addMarker(new MarkerOptions().position(point1).title("Av. Santa Rosa 13015").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point2 = new LatLng(-33.584889, -70.623267);
        mMap.addMarker(new MarkerOptions().position(point2).title("Avenida Gabriela 02710").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point3 = new LatLng(-33.586719, -70.636233);
        mMap.addMarker(new MarkerOptions().position(point3).title("Ciudad de México 1589").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point4 = new LatLng(-33.564418, -70.630132);
        mMap.addMarker(new MarkerOptions().position(point4).title("Avenida Santa Rosa 10934").snippet("Pila, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point5 = new LatLng(-33.577687, -70.642512);
        mMap.addMarker(new MarkerOptions().position(point5).title("Iquique 1130").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point6 = new LatLng(-33.585254, -70.609536);
        mMap.addMarker(new MarkerOptions().position(point6).title("Miguel Angel / La Serena").snippet("Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point7 = new LatLng(-33.574051, -70.604156);
        mMap.addMarker(new MarkerOptions().position(point7).title("Creta Norte 3980").snippet("Vidrio, Papel, Metal, Plástico, Cartón, Cartón para Bebida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point8 = new LatLng(-33.562678, -70.635263);
        mMap.addMarker(new MarkerOptions().position(point8).title("SantaTrinidad 10977").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point9 = new LatLng(-33.564016, -70.644928);
        mMap.addMarker(new MarkerOptions().position(point9).title("Avenida Observatorio 1885").snippet("Pila, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point10 = new LatLng(-33.586265,  -70.593379);
        mMap.addMarker(new MarkerOptions().position(point10).title("Piguchén 2788").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point11 = new LatLng(-33.58415520,  -70.66086440);
        mMap.addMarker(new MarkerOptions().position(point11).title("Domingo Sta Cruz 648-622").snippet("Punto Limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point12 = new LatLng(-33.58051300,  -70.66944500);
        mMap.addMarker(new MarkerOptions().position(point12).title("Vecinal Sur 1453-1493").snippet("Vidrio, Papel, Cartón, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point13 = new LatLng(-33.57689550,  -70.66980030);
        mMap.addMarker(new MarkerOptions().position(point13).title("Nva Imperial 761").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point14 = new LatLng(-33.57117600,  -70.67321200);
        mMap.addMarker(new MarkerOptions().position(point14).title("Av. Padre Hurtado 11694").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point15 = new LatLng(-33.58000300,  -70.68189400);
        mMap.addMarker(new MarkerOptions().position(point15).title("Av. Lo Blanco # 550, paradero 39 de Gran Avenida").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point16 = new LatLng(-33.57061340,  -70.67979670);
        mMap.addMarker(new MarkerOptions().position(point16).title("Los Boldos 12436").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point17 = new LatLng(-33.57028700,  -70.68073500);
        mMap.addMarker(new MarkerOptions().position(point17).title("Av. Central 498").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point18 = new LatLng(-33.57063570,  -70.68769710);
        mMap.addMarker(new MarkerOptions().position(point18).title("Gran Avenida Jose Miguel Carrera 12552").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point19 = new LatLng(-33.57145600,  -70.68844100);
        mMap.addMarker(new MarkerOptions().position(point19).title("Card José María Caro").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point20 = new LatLng(-33.57439800,  -70.69081800);
        mMap.addMarker(new MarkerOptions().position(point20).title("Gran Avenida Jose Miguel Carrera 13065-13119").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point21 = new LatLng(-33.59258590,  -70.68711520);
        mMap.addMarker(new MarkerOptions().position(point21).title("María Graham 682-662").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point22 = new LatLng(-33.58930130,  -70.69438360);
        mMap.addMarker(new MarkerOptions().position(point22).title("José Miguel Carrera 0227").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point23 = new LatLng(-33.59204410,  -70.70084150);
        mMap.addMarker(new MarkerOptions().position(point23).title("Bulnes 343, San Bernardo").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point24 = new LatLng(-33.592009,   -70.703339);
        mMap.addMarker(new MarkerOptions().position(point24).title("O'Higgins 432-498").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point25 = new LatLng(-33.592954,   -70.704076);
        mMap.addMarker(new MarkerOptions().position(point25).title("Arturo Prat 571").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point26 = new LatLng(-33.589653,-70.697876);
        mMap.addMarker(new MarkerOptions().position(point26).title("José Toribio Medina 197-149").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point27 = new LatLng(-33.594031,   -70.699707);
        mMap.addMarker(new MarkerOptions().position(point27).title("Arturo Prat 178").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point28 = new LatLng(-33.595560,   -70.700564);
        mMap.addMarker(new MarkerOptions().position(point28).title("José Joaquín Pérez 617").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point29 = new LatLng(-33.595517,   -70.700855);
        mMap.addMarker(new MarkerOptions().position(point29).title("Covadonga 234").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point30 = new LatLng(-33.573288,   -70.710396);
        mMap.addMarker(new MarkerOptions().position(point30).title("La Quebrada 1274-1364").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point31 = new LatLng(-33.565853, -70.706970);
        mMap.addMarker(new MarkerOptions().position(point31).title("Arturo Gordon 12061-12251").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point32 = new LatLng(-33.55877040,   -70.71240560);
        mMap.addMarker(new MarkerOptions().position(point32).title("Av. Las Acacias 184").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point33 = new LatLng(-33.567548,   -70.660695);
        mMap.addMarker(new MarkerOptions().position(point33).title("Sta Inés 1317").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point34 = new LatLng(-33.563382,   -70.663343);
        mMap.addMarker(new MarkerOptions().position(point34).title("Los Olivos 10974").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point35 = new LatLng(-33.557268,   -70.664593);
        mMap.addMarker(new MarkerOptions().position(point35).title("Javiera Carrera 323-327").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point36 = new LatLng(-33.556093, -70.657536);
        mMap.addMarker(new MarkerOptions().position(point36).title("Almirante Riveros 10123-10135").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point37 = new LatLng(-33.554049,   -70.676963);
        mMap.addMarker(new MarkerOptions().position(point37).title("Open Plaza El Bosque").snippet("Punto Limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point38 = new LatLng(-33.551917,   -70.675822);
        mMap.addMarker(new MarkerOptions().position(point38).title("Luis Barros Borgoño 167-201").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point39 = new LatLng(-33.550363,   -70.672121);
        mMap.addMarker(new MarkerOptions().position(point39).title("Gran Avenida Jose Miguel Carrera").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point40 = new LatLng(-33.541989,   -70.684320);
        mMap.addMarker(new MarkerOptions().position(point40).title("Dieciocho de Septiembre 1066-1080").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point41= new LatLng(-33.538255, -70.666586);
        mMap.addMarker(new MarkerOptions().position(point41).title("Av. Ossa 101-149").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point42 = new LatLng(-33.548489,   -70.649033);
        mMap.addMarker(new MarkerOptions().position(point42).title("Aníbal Zañartu 9567").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point43 = new LatLng(-33.556080,    -70.620081);
        mMap.addMarker(new MarkerOptions().position(point43).title("Las Parcelas 10558-10510").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point44 = new LatLng(-33.586265,   -70.593379);
        mMap.addMarker(new MarkerOptions().position(point44).title("Piguchén 2788").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point45 = new LatLng(-33.586521,   -70.586341);
        mMap.addMarker(new MarkerOptions().position(point45).title("Luis Matte Larraín 2084").snippet("Plastico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point46= new LatLng(-33.58102300, -70.58122400);
        mMap.addMarker(new MarkerOptions().position(point46).title("Av. Concha Y Toro 3101-3181").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point47 = new LatLng(-33.57854880,   -70.58181350);
        mMap.addMarker(new MarkerOptions().position(point47).title("Av. Concha Y Toro 3459").snippet("Pila, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point48 = new LatLng(-33.58018300,    -70.57601900);
        mMap.addMarker(new MarkerOptions().position(point48).title("Nemesio Vicuña 3205").snippet("Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point49 = new LatLng(-33.57489800,   -70.57947500);
        mMap.addMarker(new MarkerOptions().position(point49).title("Vizcachas 0252").snippet("Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point50= new LatLng(-33.57852380,   -70.56954440);
        mMap.addMarker(new MarkerOptions().position(point50).title("Nonato Coo 3265").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point51= new LatLng(-33.57572600, -70.56147000);
        mMap.addMarker(new MarkerOptions().position(point51).title("Avenida Gabriela Oriente 1762").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point52 = new LatLng(-33.57245540,   -70.58329920);
        mMap.addMarker(new MarkerOptions().position(point52).title("Avenida Concha y Toro 3854").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point53 = new LatLng(-33.57233100,    -70.58389300);
        mMap.addMarker(new MarkerOptions().position(point53).title("Avenida Concha y Toro 3854").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point54 = new LatLng(-33.56872830,   -70.58339170);
        mMap.addMarker(new MarkerOptions().position(point54).title("Concha Y Toro 3800").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point55= new LatLng(-33.56844100,   -70.58370400);
        mMap.addMarker(new MarkerOptions().position(point55).title("Avenida Concha y Toro 4115").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point56= new LatLng(-33.56602200, -70.58454500);
        mMap.addMarker(new MarkerOptions().position(point56).title("Avenida Vicuña Mackenna 12321").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point57 = new LatLng(-33.56399500,   -70.58248100);
        mMap.addMarker(new MarkerOptions().position(point57).title("José Victorino Lastarria 11501").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point58 = new LatLng(-33.56222500,    -70.58499900);
        mMap.addMarker(new MarkerOptions().position(point58).title("Vicuña Mackenna 11324").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point59 = new LatLng(-33.56139330,   -70.59174340);
        mMap.addMarker(new MarkerOptions().position(point59).title("Maria Elena 437").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point60= new LatLng(-33.56390400,   -70.59236100);
        mMap.addMarker(new MarkerOptions().position(point60).title("Lientur 4436").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point61= new LatLng(-33.56523500, -70.59748800);
        mMap.addMarker(new MarkerOptions().position(point61).title("Rafael Matus 1070").snippet("Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point62 = new LatLng(-33.56189300,   -70.59741200);
        mMap.addMarker(new MarkerOptions().position(point62).title("María Elena 861").snippet("Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point63 = new LatLng(-33.56252300,    -70.60328700);
        mMap.addMarker(new MarkerOptions().position(point63).title("María Elena 1310").snippet("Cartón para Bebida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point64 = new LatLng(-33.56047000,   -70.60196000);
        mMap.addMarker(new MarkerOptions().position(point64).title("Lago Chungará 1301").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point65= new LatLng(-33.55796100,   -70.59234600);
        mMap.addMarker(new MarkerOptions().position(point65).title("Gral Arriagada 600").snippet("Papel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point66= new LatLng(-33.55556900, -70.60901600);
        mMap.addMarker(new MarkerOptions().position(point66).title("Lapislazuli 1560").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point67 = new LatLng(-33.55397400,   -70.60324600);
        mMap.addMarker(new MarkerOptions().position(point67).title("José de la Estrella 1392").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point68 = new LatLng(-33.54518500,    -70.60559100);
        mMap.addMarker(new MarkerOptions().position(point68).title("Las Anémonas 1404").snippet("Papel ,Cartón para Bebida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point69 = new LatLng(-33.54512800,   -70.60452300);
        mMap.addMarker(new MarkerOptions().position(point69).title("Las Camelias 9843").snippet("Papel ,Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point70= new LatLng(-33.54505950,   -70.60300370);
        mMap.addMarker(new MarkerOptions().position(point70).title("Remanso Quieto 1273").snippet("Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point71= new LatLng(-33.53829600, -70.60547600);
        mMap.addMarker(new MarkerOptions().position(point71).title("Sotero del Rio 980").snippet("Papel ,Cartón para Bebida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point72 = new LatLng(-33.54156900,   -70.59872400);
        mMap.addMarker(new MarkerOptions().position(point72).title("Venus 9487").snippet("Vidrio, Papel ,Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point73 = new LatLng(-33.53944899,    -70.59807082);
        mMap.addMarker(new MarkerOptions().position(point73).title("Dr. Sotero del Rio con Valentina Leppe").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point74 = new LatLng(-33.53953900,   -70.59662600);
        mMap.addMarker(new MarkerOptions().position(point74).title("Sotero del Rio 520").snippet("Papel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point75= new LatLng(-33.53943300,   -70.59130700);
        mMap.addMarker(new MarkerOptions().position(point75).title("Avenida Vicuña Mackenna 9090").snippet("Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point76= new LatLng(-33.54657000,-70.59225500);
        mMap.addMarker(new MarkerOptions().position(point76).title("Oblonera 504").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point77 = new LatLng(-33.55335200,-70.58526600);
        mMap.addMarker(new MarkerOptions().position(point77).title("Joaquín Tocornal 10504").snippet("Cartón, Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point78 = new LatLng(-33.55003000,-70.58120700);
        mMap.addMarker(new MarkerOptions().position(point78).title("José Miguel Carrera 550").snippet("Papel, Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point79 = new LatLng(-33.54556700,-70.58203100);
        mMap.addMarker(new MarkerOptions().position(point79).title("Cali 527").snippet("Vidrio, Papel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point80= new LatLng(-33.54362100,-70.57929400);
        mMap.addMarker(new MarkerOptions().position(point80).title("Tineo 9501").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point81= new LatLng(-33.54838200,-70.57670600);
        mMap.addMarker(new MarkerOptions().position(point81).title("Central Oriente 875").snippet("Papel, Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point82 = new LatLng(-33.54839600,-70.57580700);
        mMap.addMarker(new MarkerOptions().position(point82).title("El Pelícano 10021").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point83 = new LatLng(-33.55718200,-70.58002500);
        mMap.addMarker(new MarkerOptions().position(point83).title("Blest Gana 10841").snippet("Papel, Cartón para Bebida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point84 = new LatLng(-33.56158100,-70.57234200);
        mMap.addMarker(new MarkerOptions().position(point84).title("Diego Portales 1070").snippet("Plastico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point85= new LatLng(-33.55780473,-70.57103958);
        mMap.addMarker(new MarkerOptions().position(point85).title("San Jorge 901").snippet("Vidrio, Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point86= new LatLng(-33.56755100,-70.55594040);
        mMap.addMarker(new MarkerOptions().position(point86).title("Avenida Los Toros 5441").snippet("Vidrio, Papel , Cartón, Cartón para Bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point87 = new LatLng(-33.56655490,-70.55693930);
        mMap.addMarker(new MarkerOptions().position(point87).title("Camilo Henríquez 3767").snippet("Vidrio, Papel, Cartón, Cartón para Bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point88 = new LatLng(-33.55983930,-70.56321606);
        mMap.addMarker(new MarkerOptions().position(point88).title("Los Plátanos 11463").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point89 = new LatLng(-33.55716300,-70.55963400);
        mMap.addMarker(new MarkerOptions().position(point89).title("Valle del Sol 5556").snippet("Plastico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point90= new LatLng(-33.55259300,-70.56987000);
        mMap.addMarker(new MarkerOptions().position(point90).title("San José de la Estrella 2300").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point91= new LatLng(-33.55036900,-70.56847400);
        mMap.addMarker(new MarkerOptions().position(point91).title("José Miguel Carrera 1417").snippet("Vidrio, Papel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point92 = new LatLng(-33.55142830,-70.56463330);
        mMap.addMarker(new MarkerOptions().position(point92).title("Lago Todos Los Santos 5223").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point93 = new LatLng(-33.54525000,-70.56884000);
        mMap.addMarker(new MarkerOptions().position(point93).title("Avenida La Florida 9742").snippet("Vidrio, Papel, Cartón, Cartón para Bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point94 = new LatLng(-33.54213900,-70.56167600);
        mMap.addMarker(new MarkerOptions().position(point94).title("Sta Inés 1940").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point95= new LatLng(-33.53903852,-70.56342746);
        mMap.addMarker(new MarkerOptions().position(point95).title("Sta Florencia 1800").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point96= new LatLng(-33.53800200,-70.55474900);
        mMap.addMarker(new MarkerOptions().position(point96).title("Sta Victoria 9518").snippet("Vidrio, Papel, Cartón, Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point97 = new LatLng(-33.53450320,-70.55983510);
        mMap.addMarker(new MarkerOptions().position(point97).title("Tamarugal 3490").snippet("Pila, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point98 = new LatLng(-33.53561400,-70.56971000);
        mMap.addMarker(new MarkerOptions().position(point98).title("Rojas Magallanes 2243").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point99 = new LatLng(-33.53536200,-70.57301700);
        mMap.addMarker(new MarkerOptions().position(point99).title("Rojas Magallanes 185").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point100= new LatLng(-33.53388200,-70.57491300);
        mMap.addMarker(new MarkerOptions().position(point100).title("Los Mapuches 1256").snippet("Papel, Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));








    }
}
