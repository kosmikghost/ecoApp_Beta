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
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(santiago, 10));


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
        LatLng point10 = new LatLng(-33.586265, -70.593379);
        mMap.addMarker(new MarkerOptions().position(point10).title("Piguchén 2788").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point11 = new LatLng(-33.58415520, -70.66086440);
        mMap.addMarker(new MarkerOptions().position(point11).title("Domingo Sta Cruz 648-622").snippet("Punto Limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point12 = new LatLng(-33.58051300, -70.66944500);
        mMap.addMarker(new MarkerOptions().position(point12).title("Vecinal Sur 1453-1493").snippet("Vidrio, Papel, Cartón, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point13 = new LatLng(-33.57689550, -70.66980030);
        mMap.addMarker(new MarkerOptions().position(point13).title("Nva Imperial 761").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point14 = new LatLng(-33.57117600, -70.67321200);
        mMap.addMarker(new MarkerOptions().position(point14).title("Av. Padre Hurtado 11694").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point15 = new LatLng(-33.58000300, -70.68189400);
        mMap.addMarker(new MarkerOptions().position(point15).title("Av. Lo Blanco # 550, paradero 39 de Gran Avenida").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point16 = new LatLng(-33.57061340, -70.67979670);
        mMap.addMarker(new MarkerOptions().position(point16).title("Los Boldos 12436").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point17 = new LatLng(-33.57028700, -70.68073500);
        mMap.addMarker(new MarkerOptions().position(point17).title("Av. Central 498").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point18 = new LatLng(-33.57063570, -70.68769710);
        mMap.addMarker(new MarkerOptions().position(point18).title("Gran Avenida Jose Miguel Carrera 12552").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point19 = new LatLng(-33.57145600, -70.68844100);
        mMap.addMarker(new MarkerOptions().position(point19).title("Card José María Caro").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point20 = new LatLng(-33.57439800, -70.69081800);
        mMap.addMarker(new MarkerOptions().position(point20).title("Gran Avenida Jose Miguel Carrera 13065-13119").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point21 = new LatLng(-33.59258590, -70.68711520);
        mMap.addMarker(new MarkerOptions().position(point21).title("María Graham 682-662").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point22 = new LatLng(-33.58930130, -70.69438360);
        mMap.addMarker(new MarkerOptions().position(point22).title("José Miguel Carrera 0227").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point23 = new LatLng(-33.59204410, -70.70084150);
        mMap.addMarker(new MarkerOptions().position(point23).title("Bulnes 343, San Bernardo").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point24 = new LatLng(-33.592009, -70.703339);
        mMap.addMarker(new MarkerOptions().position(point24).title("O'Higgins 432-498").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point25 = new LatLng(-33.592954, -70.704076);
        mMap.addMarker(new MarkerOptions().position(point25).title("Arturo Prat 571").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point26 = new LatLng(-33.589653, -70.697876);
        mMap.addMarker(new MarkerOptions().position(point26).title("José Toribio Medina 197-149").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point27 = new LatLng(-33.594031, -70.699707);
        mMap.addMarker(new MarkerOptions().position(point27).title("Arturo Prat 178").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point28 = new LatLng(-33.595560, -70.700564);
        mMap.addMarker(new MarkerOptions().position(point28).title("José Joaquín Pérez 617").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point29 = new LatLng(-33.595517, -70.700855);
        mMap.addMarker(new MarkerOptions().position(point29).title("Covadonga 234").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point30 = new LatLng(-33.573288, -70.710396);
        mMap.addMarker(new MarkerOptions().position(point30).title("La Quebrada 1274-1364").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point31 = new LatLng(-33.565853, -70.706970);
        mMap.addMarker(new MarkerOptions().position(point31).title("Arturo Gordon 12061-12251").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point32 = new LatLng(-33.55877040, -70.71240560);
        mMap.addMarker(new MarkerOptions().position(point32).title("Av. Las Acacias 184").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point33 = new LatLng(-33.567548, -70.660695);
        mMap.addMarker(new MarkerOptions().position(point33).title("Sta Inés 1317").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point34 = new LatLng(-33.563382, -70.663343);
        mMap.addMarker(new MarkerOptions().position(point34).title("Los Olivos 10974").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point35 = new LatLng(-33.557268, -70.664593);
        mMap.addMarker(new MarkerOptions().position(point35).title("Javiera Carrera 323-327").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point36 = new LatLng(-33.556093, -70.657536);
        mMap.addMarker(new MarkerOptions().position(point36).title("Almirante Riveros 10123-10135").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point37 = new LatLng(-33.554049, -70.676963);
        mMap.addMarker(new MarkerOptions().position(point37).title("Open Plaza El Bosque").snippet("Punto Limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point38 = new LatLng(-33.551917, -70.675822);
        mMap.addMarker(new MarkerOptions().position(point38).title("Luis Barros Borgoño 167-201").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point39 = new LatLng(-33.550363, -70.672121);
        mMap.addMarker(new MarkerOptions().position(point39).title("Gran Avenida Jose Miguel Carrera").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point40 = new LatLng(-33.541989, -70.684320);
        mMap.addMarker(new MarkerOptions().position(point40).title("Dieciocho de Septiembre 1066-1080").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point41 = new LatLng(-33.538255, -70.666586);
        mMap.addMarker(new MarkerOptions().position(point41).title("Av. Ossa 101-149").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point42 = new LatLng(-33.548489, -70.649033);
        mMap.addMarker(new MarkerOptions().position(point42).title("Aníbal Zañartu 9567").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point43 = new LatLng(-33.556080, -70.620081);
        mMap.addMarker(new MarkerOptions().position(point43).title("Las Parcelas 10558-10510").snippet("Celular, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point44 = new LatLng(-33.586265, -70.593379);
        mMap.addMarker(new MarkerOptions().position(point44).title("Piguchén 2788").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point45 = new LatLng(-33.586521, -70.586341);
        mMap.addMarker(new MarkerOptions().position(point45).title("Luis Matte Larraín 2084").snippet("Plastico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point46 = new LatLng(-33.58102300, -70.58122400);
        mMap.addMarker(new MarkerOptions().position(point46).title("Av. Concha Y Toro 3101-3181").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point47 = new LatLng(-33.57854880, -70.58181350);
        mMap.addMarker(new MarkerOptions().position(point47).title("Av. Concha Y Toro 3459").snippet("Pila, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point48 = new LatLng(-33.58018300, -70.57601900);
        mMap.addMarker(new MarkerOptions().position(point48).title("Nemesio Vicuña 3205").snippet("Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point49 = new LatLng(-33.57489800, -70.57947500);
        mMap.addMarker(new MarkerOptions().position(point49).title("Vizcachas 0252").snippet("Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point50 = new LatLng(-33.57852380, -70.56954440);
        mMap.addMarker(new MarkerOptions().position(point50).title("Nonato Coo 3265").snippet("Punto limpio - vidrio, papel, cartón, cartón para bebida, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        LatLng point51 = new LatLng(-33.57572600, -70.56147000);
        mMap.addMarker(new MarkerOptions().position(point51).title("Avenida Gabriela Oriente 1762").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point52 = new LatLng(-33.57245540, -70.58329920);
        mMap.addMarker(new MarkerOptions().position(point52).title("Avenida Concha y Toro 3854").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point53 = new LatLng(-33.57233100, -70.58389300);
        mMap.addMarker(new MarkerOptions().position(point53).title("Avenida Concha y Toro 3854").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point54 = new LatLng(-33.56872830, -70.58339170);
        mMap.addMarker(new MarkerOptions().position(point54).title("Concha Y Toro 3800").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point55 = new LatLng(-33.56844100, -70.58370400);
        mMap.addMarker(new MarkerOptions().position(point55).title("Avenida Concha y Toro 4115").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point56 = new LatLng(-33.56602200, -70.58454500);
        mMap.addMarker(new MarkerOptions().position(point56).title("Avenida Vicuña Mackenna 12321").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point57 = new LatLng(-33.56399500, -70.58248100);
        mMap.addMarker(new MarkerOptions().position(point57).title("José Victorino Lastarria 11501").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point58 = new LatLng(-33.56222500, -70.58499900);
        mMap.addMarker(new MarkerOptions().position(point58).title("Vicuña Mackenna 11324").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point59 = new LatLng(-33.56139330, -70.59174340);
        mMap.addMarker(new MarkerOptions().position(point59).title("Maria Elena 437").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point60 = new LatLng(-33.56390400, -70.59236100);
        mMap.addMarker(new MarkerOptions().position(point60).title("Lientur 4436").snippet("Vidrio, Papel, Cartón, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point61 = new LatLng(-33.56523500, -70.59748800);
        mMap.addMarker(new MarkerOptions().position(point61).title("Rafael Matus 1070").snippet("Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point62 = new LatLng(-33.56189300, -70.59741200);
        mMap.addMarker(new MarkerOptions().position(point62).title("María Elena 861").snippet("Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point63 = new LatLng(-33.56252300, -70.60328700);
        mMap.addMarker(new MarkerOptions().position(point63).title("María Elena 1310").snippet("Cartón para Bebida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point64 = new LatLng(-33.56047000, -70.60196000);
        mMap.addMarker(new MarkerOptions().position(point64).title("Lago Chungará 1301").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point65 = new LatLng(-33.55796100, -70.59234600);
        mMap.addMarker(new MarkerOptions().position(point65).title("Gral Arriagada 600").snippet("Papel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point66 = new LatLng(-33.55556900, -70.60901600);
        mMap.addMarker(new MarkerOptions().position(point66).title("Lapislazuli 1560").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point67 = new LatLng(-33.55397400, -70.60324600);
        mMap.addMarker(new MarkerOptions().position(point67).title("José de la Estrella 1392").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point68 = new LatLng(-33.54518500, -70.60559100);
        mMap.addMarker(new MarkerOptions().position(point68).title("Las Anémonas 1404").snippet("Papel ,Cartón para Bebida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point69 = new LatLng(-33.54512800, -70.60452300);
        mMap.addMarker(new MarkerOptions().position(point69).title("Las Camelias 9843").snippet("Papel ,Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point70 = new LatLng(-33.54505950, -70.60300370);
        mMap.addMarker(new MarkerOptions().position(point70).title("Remanso Quieto 1273").snippet("Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point71 = new LatLng(-33.53829600, -70.60547600);
        mMap.addMarker(new MarkerOptions().position(point71).title("Sotero del Rio 980").snippet("Papel ,Cartón para Bebida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point72 = new LatLng(-33.54156900, -70.59872400);
        mMap.addMarker(new MarkerOptions().position(point72).title("Venus 9487").snippet("Vidrio, Papel ,Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point73 = new LatLng(-33.53944899, -70.59807082);
        mMap.addMarker(new MarkerOptions().position(point73).title("Dr. Sotero del Rio con Valentina Leppe").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point74 = new LatLng(-33.53953900, -70.59662600);
        mMap.addMarker(new MarkerOptions().position(point74).title("Sotero del Rio 520").snippet("Papel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point75 = new LatLng(-33.53943300, -70.59130700);
        mMap.addMarker(new MarkerOptions().position(point75).title("Avenida Vicuña Mackenna 9090").snippet("Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point76 = new LatLng(-33.54657000, -70.59225500);
        mMap.addMarker(new MarkerOptions().position(point76).title("Oblonera 504").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point77 = new LatLng(-33.55335200, -70.58526600);
        mMap.addMarker(new MarkerOptions().position(point77).title("Joaquín Tocornal 10504").snippet("Cartón, Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point78 = new LatLng(-33.55003000, -70.58120700);
        mMap.addMarker(new MarkerOptions().position(point78).title("José Miguel Carrera 550").snippet("Papel, Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point79 = new LatLng(-33.54556700, -70.58203100);
        mMap.addMarker(new MarkerOptions().position(point79).title("Cali 527").snippet("Vidrio, Papel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point80 = new LatLng(-33.54362100, -70.57929400);
        mMap.addMarker(new MarkerOptions().position(point80).title("Tineo 9501").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point81 = new LatLng(-33.54838200, -70.57670600);
        mMap.addMarker(new MarkerOptions().position(point81).title("Central Oriente 875").snippet("Papel, Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point82 = new LatLng(-33.54839600, -70.57580700);
        mMap.addMarker(new MarkerOptions().position(point82).title("El Pelícano 10021").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point83 = new LatLng(-33.55718200, -70.58002500);
        mMap.addMarker(new MarkerOptions().position(point83).title("Blest Gana 10841").snippet("Papel, Cartón para Bebida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point84 = new LatLng(-33.56158100, -70.57234200);
        mMap.addMarker(new MarkerOptions().position(point84).title("Diego Portales 1070").snippet("Plastico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point85 = new LatLng(-33.55780473, -70.57103958);
        mMap.addMarker(new MarkerOptions().position(point85).title("San Jorge 901").snippet("Vidrio, Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point86 = new LatLng(-33.56755100, -70.55594040);
        mMap.addMarker(new MarkerOptions().position(point86).title("Avenida Los Toros 5441").snippet("Punto limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point87 = new LatLng(-33.56655490, -70.55693930);
        mMap.addMarker(new MarkerOptions().position(point87).title("Camilo Henríquez 3767").snippet("Punto limpio - vidrio, papel, cartón").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point88 = new LatLng(-33.55983930, -70.56321606);
        mMap.addMarker(new MarkerOptions().position(point88).title("Los Plátanos 11463").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point89 = new LatLng(-33.55716300, -70.55963400);
        mMap.addMarker(new MarkerOptions().position(point89).title("Valle del Sol 5556").snippet("Plastico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point90 = new LatLng(-33.55259300, -70.56987000);
        mMap.addMarker(new MarkerOptions().position(point90).title("San José de la Estrella 2300").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point91 = new LatLng(-33.55036900, -70.56847400);
        mMap.addMarker(new MarkerOptions().position(point91).title("José Miguel Carrera 1417").snippet("Vidrio, Papel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point92 = new LatLng(-33.55142830, -70.56463330);
        mMap.addMarker(new MarkerOptions().position(point92).title("Lago Todos Los Santos 5223").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point93 = new LatLng(-33.54525000, -70.56884000);
        mMap.addMarker(new MarkerOptions().position(point93).title("Avenida La Florida 9742").snippet("Vidrio, Papel, Cartón, Cartón para Bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point94 = new LatLng(-33.54213900, -70.56167600);
        mMap.addMarker(new MarkerOptions().position(point94).title("Sta Inés 1940").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point95 = new LatLng(-33.53903852, -70.56342746);
        mMap.addMarker(new MarkerOptions().position(point95).title("Sta Florencia 1800").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point96 = new LatLng(-33.53800200, -70.55474900);
        mMap.addMarker(new MarkerOptions().position(point96).title("Sta Victoria 9518").snippet("Vidrio, Papel, Cartón, Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point97 = new LatLng(-33.53450320, -70.55983510);
        mMap.addMarker(new MarkerOptions().position(point97).title("Tamarugal 3490").snippet("Pila, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point98 = new LatLng(-33.53561400, -70.56971000);
        mMap.addMarker(new MarkerOptions().position(point98).title("Rojas Magallanes 2243").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point99 = new LatLng(-33.53536200, -70.57301700);
        mMap.addMarker(new MarkerOptions().position(point99).title("Rojas Magallanes 185").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point100 = new LatLng(-33.53388200, -70.57491300);
        mMap.addMarker(new MarkerOptions().position(point100).title("Los Mapuches 1256").snippet("Papel, Cartón para Bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point101 = new LatLng(-33.5735453, -70.6062057);
        mMap.addMarker(new MarkerOptions().position(point101).title("Calle Creta Nte. 3940").snippet("Punto limpio - vidrio, papel, cartón").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        //Lo Barnnechea
        LatLng point102 = new LatLng(-33.355445, -70.538539);
        mMap.addMarker(new MarkerOptions().position(point102).title("Av. Jose Alcalde Delano 10628-10638").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point103 = new LatLng(-33.353063, -70.520642);
        mMap.addMarker(new MarkerOptions().position(point103).title("El Rodeo 12850").snippet("pila, celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point104 = new LatLng(-33.350845, -70.519394);
        mMap.addMarker(new MarkerOptions().position(point104).title("Avenida La Dehesa 2245").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point105 = new LatLng(-33.351106, -70.506084);
        mMap.addMarker(new MarkerOptions().position(point105).title("Bertait College").snippet("vidrio, papel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point106 = new LatLng(-33.351303, -70.505157);
        mMap.addMarker(new MarkerOptions().position(point106).title("Avenida El Rodeo 13710").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point107 = new LatLng(-33.353633, -70.507911);
        mMap.addMarker(new MarkerOptions().position(point107).title("Avenida Lo Barnechea 1648").snippet("pila, celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point108 = new LatLng(-33.363783, -70.498180);
        mMap.addMarker(new MarkerOptions().position(point108).title("Mons Escrivá de Balaguer Nte").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point109 = new LatLng(-33.366788, -70.500581);
        mMap.addMarker(new MarkerOptions().position(point109).title("El Sauce 14237").snippet("vidrio, papel, cartón, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point110 = new LatLng(-33.368765, -70.502243);
        mMap.addMarker(new MarkerOptions().position(point110).title("Av. las Condes 14141").snippet("vidrio, papel, cartón, cartón para bebida, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point111 = new LatLng(-33.369813, -70.512323);
        mMap.addMarker(new MarkerOptions().position(point111).title("Avenida Las Condes 12916").snippet("pila, celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point112 = new LatLng(-33.371906, -70.514687);
        mMap.addMarker(new MarkerOptions().position(point112).title("Avenida Las Condes 12000").snippet("vidrio, papel, cartón, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point113 = new LatLng(-33.372829, -70.517700);
        mMap.addMarker(new MarkerOptions().position(point113).title("Avenida Las Condes 12000").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point114 = new LatLng(-33.373527, -70.519228);
        mMap.addMarker(new MarkerOptions().position(point114).title("Av. las Condes 12201-12235").snippet("vidrio, papel, cartón, cartón para bebida, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point115 = new LatLng(-33.372815, -70.519922);
        mMap.addMarker(new MarkerOptions().position(point115).title("Av. las Condes 12250").snippet("Punto limpio - vidrio, papel, cartón, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        LatLng point116 = new LatLng(-33.391988, -70.500420);
        mMap.addMarker(new MarkerOptions().position(point116).title("Av Plaza 680").snippet("Punto limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point117 = new LatLng(-33.394015, -70.516663);
        mMap.addMarker(new MarkerOptions().position(point117).title("Francisco Bulnes Correa 1212-1223").snippet("Punto limpio - vidrio, papel, cartón, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point118 = new LatLng(-33.401428, -70.514320);
        mMap.addMarker(new MarkerOptions().position(point118).title("Avenida Camino El Alba 11969").snippet("vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point119 = new LatLng(-33.401404, -70.516546);
        mMap.addMarker(new MarkerOptions().position(point119).title("Camino El Alba 11865").snippet("pila, celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point120 = new LatLng(-33.385056, -70.533424);
        mMap.addMarker(new MarkerOptions().position(point120).title("Avenida Las Condes 10295").snippet("pila, celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point121 = new LatLng(-33.368597, -70.519052);
        mMap.addMarker(new MarkerOptions().position(point121).title("Avenida Raúl Labbé 12099").snippet("Punto limpio - vidrio, papel, cartón, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point122 = new LatLng(-33.378915, -70.551857);
        mMap.addMarker(new MarkerOptions().position(point122).title("Calle Padre de Veuster 2215").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point123 = new LatLng(-33.382218, -70.553743);
        mMap.addMarker(new MarkerOptions().position(point123).title("Calle Lo Beltrán 8751").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point124 = new LatLng(-33.381676, -70.561905);
        mMap.addMarker(new MarkerOptions().position(point124).title("Lo Beltran 2500").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point125 = new LatLng(-33.381524, -70.578679);
        mMap.addMarker(new MarkerOptions().position(point125).title("Borde Río, Monseñor Escriva De Balaguer 6400").snippet("papel, cartón").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point126 = new LatLng(-33.518197, -70.588310);
        mMap.addMarker(new MarkerOptions().position(point126).title("Alonso de Ercilla 6698").snippet("vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point127 = new LatLng(-33.553352, -70.585266);
        mMap.addMarker(new MarkerOptions().position(point127).title("San José de La Estrella 153").snippet("artón, cartón para bebida, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point128 = new LatLng(-33.524506, -70.583748);
        mMap.addMarker(new MarkerOptions().position(point128).title("García Hurtado de Mendoza 7709").snippet("vidrio, papel, cartón, cartón para bebida, plástico, metal.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point129 = new LatLng(-33.504780, -70.609833);
        mMap.addMarker(new MarkerOptions().position(point129).title("Mauricio Rugendas 2151").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point130 = new LatLng(-33.522537, -70.583771);
        mMap.addMarker(new MarkerOptions().position(point130).title("Walker Martinez 1336").snippet("vidrio, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point131 = new LatLng(-33.519509, -70.585236);
        mMap.addMarker(new MarkerOptions().position(point131).title("Rolando Frooden con Real Alicante").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point132 = new LatLng(-33.543621, -70.579294);
        mMap.addMarker(new MarkerOptions().position(point132).title("Santa Amalia con Tineo").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point133 = new LatLng(-33.503606, -70.629967);
        mMap.addMarker(new MarkerOptions().position(point133).title("Salvador Allende 503").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point134 = new LatLng(-33.503423, -70.629995);
        mMap.addMarker(new MarkerOptions().position(point134).title("Pintor Murillo 5295").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point135 = new LatLng(-33.556093, -70.657536);
        mMap.addMarker(new MarkerOptions().position(point135).title("Almirante Riveros 10122").snippet("pila, celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point136 = new LatLng(-33.523926, -70.660767);
        mMap.addMarker(new MarkerOptions().position(point136).title("Gran Avenida Jose Miguel Carrera 7409").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point137 = new LatLng(-33.501784, -70.625697);
        mMap.addMarker(new MarkerOptions().position(point137).title("Gustavo Campaña Gandarillas 4966").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point138 = new LatLng(-33.500923, -70.621955);
        mMap.addMarker(new MarkerOptions().position(point138).title("San Lorenzo 4450").snippet("vidrio, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point139 = new LatLng(-33.504386, -70.601102);
        mMap.addMarker(new MarkerOptions().position(point139).title("Las Codornices 3093").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point140 = new LatLng(-33.518025, -70.658924);
        mMap.addMarker(new MarkerOptions().position(point140).title("Gran Avenida 6610").snippet("vidrio, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point141 = new LatLng(-33.513435, -70.655464);
        mMap.addMarker(new MarkerOptions().position(point141).title("Avenida Centenario 994").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point142 = new LatLng(-33.522377, -70.579007);
        mMap.addMarker(new MarkerOptions().position(point142).title("Avenida Walker Martínez 1786").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point143 = new LatLng(-33.530618, -70.665474);
        mMap.addMarker(new MarkerOptions().position(point143).title("Santa Anselma 240").snippet("pila, celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point144 = new LatLng(-33.548382, -70.576706);
        mMap.addMarker(new MarkerOptions().position(point144).title("Central Oriente 875").snippet("papel, cartón para bebida, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point145 = new LatLng(-33.538255, -70.666586);
        mMap.addMarker(new MarkerOptions().position(point145).title("Avenida Ossa 146").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point146 = new LatLng(-33.528000, -70.575996);
        mMap.addMarker(new MarkerOptions().position(point146).title("Avenida La Florida 8220").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point147 = new LatLng(-33.504647, -70.644734);
        mMap.addMarker(new MarkerOptions().position(point147).title("Montreal 5393").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point148 = new LatLng(-33.574051, -70.604156);
        mMap.addMarker(new MarkerOptions().position(point148).title("Creta Norte 3980").snippet("vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point149 = new LatLng(-33.548396, -70.575807);
        mMap.addMarker(new MarkerOptions().position(point149).title("El Pelícano 10021").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point150 = new LatLng(-33.513822, -70.583720);
        mMap.addMarker(new MarkerOptions().position(point150).title("Reina Luisa 6350").snippet("Punto limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        LatLng point151 = new LatLng(-33.503505, -70.643250);
        mMap.addMarker(new MarkerOptions().position(point151).title("Calle Darío Salas 5201").snippet("Punto limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal, pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point152 = new LatLng(-33.503234, -70.643309);
        mMap.addMarker(new MarkerOptions().position(point152).title("Piramide 633").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point153 = new LatLng(-33.500813, -70.637117);
        mMap.addMarker(new MarkerOptions().position(point153).title("Ureta Cox 470").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point154 = new LatLng(-33.498651, -70.626775);
        mMap.addMarker(new MarkerOptions().position(point154).title("Gabriela Mistral 4624").snippet("vidrio, plástico.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point155 = new LatLng(-33.498394, -70.623692);
        mMap.addMarker(new MarkerOptions().position(point155).title("Ingeniero Budge 158").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point156 = new LatLng(-33.509692, -70.587122);
        mMap.addMarker(new MarkerOptions().position(point156).title("Avenida José Pedro Alessandri 6402").snippet("Punto limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point157 = new LatLng(-33.509613, -70.587099);
        mMap.addMarker(new MarkerOptions().position(point157).title("Avenida José Pedro Alessandri 6402").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point158 = new LatLng(-33.498228, -70.627884);
        mMap.addMarker(new MarkerOptions().position(point158).title("Gabriela Mistral 199").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point159 = new LatLng(-33.506859, -70.589211);
        mMap.addMarker(new MarkerOptions().position(point159).title("Avenida Américo Vespucio 5372").snippet("papel, cartón, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point160 = new LatLng(-33.505611, -70.589790);
        mMap.addMarker(new MarkerOptions().position(point160).title("Avenida Américo Vespucio 5601").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point161 = new LatLng(-33.563995, -70.582481);
        mMap.addMarker(new MarkerOptions().position(point161).title("José Victorino Lastarria 11651").snippet("vidrio, papel, cartón para bebida, plástico.").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point162 = new LatLng(-33.497917, -70.608071);
        mMap.addMarker(new MarkerOptions().position(point162).title("Avenida Vicuña Mackenna 4860").snippet("Punto limpio - vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point163 = new LatLng(-33.531123, -70.669555);
        mMap.addMarker(new MarkerOptions().position(point163).title("Brisas del Maipo 0509").snippet("vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point164 = new LatLng(-33.557268, -70.664593);
        mMap.addMarker(new MarkerOptions().position(point164).title("Javiera Carrera / Mayor Valladares").snippet("vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point165 = new LatLng(-33.500465, -70.598717);
        mMap.addMarker(new MarkerOptions().position(point165).title("Juan Bagynka 3434").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point166 = new LatLng(-33.501242, -70.645133);
        mMap.addMarker(new MarkerOptions().position(point166).title("San Nicolás 753").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point167 = new LatLng(-33.496108, -70.627370);
        mMap.addMarker(new MarkerOptions().position(point167).title("Concepción 4272").snippet("vidrio ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point168 = new LatLng(-33.535614, -70.569710);
        mMap.addMarker(new MarkerOptions().position(point168).title("Rojas Magallanes 2243").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point169 = new LatLng(-33.495568, -70.627246);
        mMap.addMarker(new MarkerOptions().position(point169).title("Concepción 4185").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point170 = new LatLng(-33.562847, -70.663552);
        mMap.addMarker(new MarkerOptions().position(point170).title("Plaza De los Sauces").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point171 = new LatLng(-33.563382, -70.663343);
        mMap.addMarker(new MarkerOptions().position(point171).title("Antonio Varas / Los Olivos").snippet("papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point172 = new LatLng(-33.494438, -70.629091);
        mMap.addMarker(new MarkerOptions().position(point172).title("1 de Septiembre 308").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point173 = new LatLng(-33.493955, -70.625238);
        mMap.addMarker(new MarkerOptions().position(point173).title("Río Cisnes 3772").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point174 = new LatLng(-33.494166, -70.629258);
        mMap.addMarker(new MarkerOptions().position(point174).title("Av. Las Industrias 4119").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point175 = new LatLng(-33.495253, -70.636103);
        mMap.addMarker(new MarkerOptions().position(point175).title("San Gregorio").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point176 = new LatLng(-33.493211, -70.622981);
        mMap.addMarker(new MarkerOptions().position(point176).title("Castelar Sur 150").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point177 = new LatLng(-33.550363, -70.672121);
        mMap.addMarker(new MarkerOptions().position(point177).title("Gran Avenida Jose Miguel Carrera 9863").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point178 = new LatLng(-33.567548, -70.660695);
        mMap.addMarker(new MarkerOptions().position(point178).title("Calle Las Perlas Con Pasaje Aguas Marinas").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point179 = new LatLng(-33.567548, -70.660695);
        mMap.addMarker(new MarkerOptions().position(point179).title("Calle Las Perlas").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point180 = new LatLng(-33.552593, -70.569870);
        mMap.addMarker(new MarkerOptions().position(point180).title("San José de la Estrella 2347").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point181 = new LatLng(-33.492878, -70.620557);
        mMap.addMarker(new MarkerOptions().position(point181).title("Corelli 3671-3693").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point182 = new LatLng(-33.492806, -70.625213);
        mMap.addMarker(new MarkerOptions().position(point182).title("Río Cisnes 3684-3670").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point183 = new LatLng(-33.492746, -70.625200);
        mMap.addMarker(new MarkerOptions().position(point183).title("Pasaje Río Cisne 3693").snippet("vidrio, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point184 = new LatLng(-33.550369, -70.568474);
        mMap.addMarker(new MarkerOptions().position(point184).title("José Miguel Carrera 1420").snippet("vidrio, papel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point185 = new LatLng(-33.491906, -70.619207);
        mMap.addMarker(new MarkerOptions().position(point185).title("San Juan").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point186 = new LatLng(-33.557805, -70.571040);
        mMap.addMarker(new MarkerOptions().position(point186).title("San Jorge 930").snippet("vidrio, cartón para bebida, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point187 = new LatLng(-33.491881, -70.614513);
        mMap.addMarker(new MarkerOptions().position(point187).title("General Baquedano 4192").snippet("Punto limpio - vidrio, papel, cartón, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point188 = new LatLng(-33.561581, -70.572342);
        mMap.addMarker(new MarkerOptions().position(point188).title("Diego Portales 1073").snippet("plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point189 = new LatLng(-33.533188, -70.676704);
        mMap.addMarker(new MarkerOptions().position(point189).title("Avenida Americo Vespucio Sur 1173").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point190 = new LatLng(-33.584889, -70.623267);
        mMap.addMarker(new MarkerOptions().position(point190).title("Avenida Gabriela 2710").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point191 = new LatLng(-33.490426, -70.622138);
        mMap.addMarker(new MarkerOptions().position(point191).title("Arquitecto Brunelleschi 3496").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point192 = new LatLng(-33.539039, -70.563428);
        mMap.addMarker(new MarkerOptions().position(point192).title("Santa Viviana / Santa Florencia").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point193 = new LatLng(-33.519714, -70.567444);
        mMap.addMarker(new MarkerOptions().position(point193).title("Paicavi 2880").snippet("vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point194 = new LatLng(-33.490319, -70.631136);
        mMap.addMarker(new MarkerOptions().position(point194).title("Los Copihues").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point195 = new LatLng(-33.585254, -70.609536);
        mMap.addMarker(new MarkerOptions().position(point195).title("Miguel Angel / La Serena").snippet("plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point196 = new LatLng(-33.551428, -70.564633);
        mMap.addMarker(new MarkerOptions().position(point196).title("Lago Todos Los Santos 5220-5208").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point197 = new LatLng(-33.490581, -70.606429);
        mMap.addMarker(new MarkerOptions().position(point197).title("Escuela Agrícola 2586-2572").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point198 = new LatLng(-33.496283, -70.588640);
        mMap.addMarker(new MarkerOptions().position(point198).title("Campo Lindo 4391-4451").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point199 = new LatLng(-33.542139, -70.561676);
        mMap.addMarker(new MarkerOptions().position(point199).title("Sta Inés 1940").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point200 = new LatLng(-33.53762535, -70.62086102);
        mMap.addMarker(new MarkerOptions().position(point200).title("Cardenal Raúl Silva Henríquez 8283").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point201 = new LatLng(-33.53514861, -70.62267775);
        mMap.addMarker(new MarkerOptions().position(point201).title("2 Poniente 8177").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point202 = new LatLng(-33.53468662, -70.62489821);
        mMap.addMarker(new MarkerOptions().position(point202).title("El Tabo 8143").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point203 = new LatLng(-33.53086100, -70.62314600);
        mMap.addMarker(new MarkerOptions().position(point203).title("Cardenal Raul Silva Henriquez 7940").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point204 = new LatLng(-33.52950870, -70.62226010);
        mMap.addMarker(new MarkerOptions().position(point204).title("Combarbala 575").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point205 = new LatLng(-33.52930134, -70.62156708);
        mMap.addMarker(new MarkerOptions().position(point205).title("Quipue 7897").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point206 = new LatLng(-33.53133354, -70.61304435);
        mMap.addMarker(new MarkerOptions().position(point206).title("Calle 8 6447").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point207 = new LatLng(-33.52827042, -70.62178473);
        mMap.addMarker(new MarkerOptions().position(point207).title("Quipue 7852").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point208 = new LatLng(-33.54287820, -70.63230480);
        mMap.addMarker(new MarkerOptions().position(point208).title("Avenida Americo Vespucio, Municipalidad 2").snippet("Punto Limpio - Vidrio, Papel, Cartón").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point209 = new LatLng(-33.54564914, -70.62997141);
        mMap.addMarker(new MarkerOptions().position(point209).title("Diagonal Sur Oriente 351").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point210 = new LatLng(-33.54930006, -70.61908651);
        mMap.addMarker(new MarkerOptions().position(point210).title("Manuel Plaza 880").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point211 = new LatLng(-33.52976644, -70.63147150);
        mMap.addMarker(new MarkerOptions().position(point211).title("Illapel 7875").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point212 = new LatLng(-33.52655835, -70.61408626);
        mMap.addMarker(new MarkerOptions().position(point212).title("Linares 875").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point213 = new LatLng(-33.53829600, -70.60547600);
        mMap.addMarker(new MarkerOptions().position(point213).title("Sotero del Rio 980").snippet("Papel, Cartón para bebida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point214 = new LatLng(-33.54778869, -70.63048548);
        mMap.addMarker(new MarkerOptions().position(point214).title("Pasaje Pedro Ignacio Gatica").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point215 = new LatLng(-33.55075679, -70.62628688);
        mMap.addMarker(new MarkerOptions().position(point215).title("Canto General 501").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point216 = new LatLng(-33.52403247, -70.62242701);
        mMap.addMarker(new MarkerOptions().position(point216).title("Yungay 641").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point217 = new LatLng(-33.54518500, -70.60559100);
        mMap.addMarker(new MarkerOptions().position(point217).title("Las Anémonas 1404").snippet("Papel, Cartón para bebida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point218 = new LatLng(-33.53310000, -70.60360700);
        mMap.addMarker(new MarkerOptions().position(point218).title("Santa Raquel 8459").snippet("Vidrio, Papel, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point219 = new LatLng(-33.54512800, -70.60452300);
        mMap.addMarker(new MarkerOptions().position(point219).title("Las Camelias 9953").snippet("Papel, Cartón para bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point220 = new LatLng(-33.55066811, -70.63097040);
        mMap.addMarker(new MarkerOptions().position(point220).title("Avenida El Parque 9330").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point221 = new LatLng(-33.52802100, -70.63548200);
        mMap.addMarker(new MarkerOptions().position(point221).title("Avenida Santa Rosa 7668").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point222 = new LatLng(-33.54505950, -70.60300370);
        mMap.addMarker(new MarkerOptions().position(point222).title("Remanso Quieto con Pte. Del Río").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point223 = new LatLng(-33.54505950, -70.60300370);
        mMap.addMarker(new MarkerOptions().position(point223).title("Remanso Quieto con Pte. Del Río").snippet("Cartón para bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point224 = new LatLng(-33.52784900, -70.60433400);
        mMap.addMarker(new MarkerOptions().position(point224).title("Geronimo de Alderete 800").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point225 = new LatLng(-33.52178672, -70.62794081);
        mMap.addMarker(new MarkerOptions().position(point225).title("Presidente Alessandri 616").snippet("Punto Verde").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point226 = new LatLng(-33.52197300, -70.60969500);
        mMap.addMarker(new MarkerOptions().position(point226).title("Los Vilos 1081").snippet("Papel, Cartón para bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point227 = new LatLng(-33.55608030, -70.62008100);
        mMap.addMarker(new MarkerOptions().position(point227).title("Las Parcelas 10520").snippet("Pila, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point228 = new LatLng(-33.54156900, -70.59872400);
        mMap.addMarker(new MarkerOptions().position(point228).title("Venus 9484").snippet("Vidrio, Papel, Cartón para bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point229 = new LatLng(-33.53944899, -70.59807082);
        mMap.addMarker(new MarkerOptions().position(point229).title("Dr. Sotero del Rio con Valentina Leppe").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point230 = new LatLng(-33.51875050, -70.61563470);
        mMap.addMarker(new MarkerOptions().position(point230).title("Punta arenas, Centro de Acopio 6711").snippet("Punto Limpio - Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point231 = new LatLng(-33.53953900, -70.59662600);
        mMap.addMarker(new MarkerOptions().position(point231).title("Sotero del Rio 520").snippet("Papel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point232 = new LatLng(-33.55556900, -70.60901600);
        mMap.addMarker(new MarkerOptions().position(point232).title("Lapislazuli 1560").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point233 = new LatLng(-33.52721650, -70.59919850);
        mMap.addMarker(new MarkerOptions().position(point233).title("Don Pepe 250").snippet("Pila, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point234 = new LatLng(-33.51847800, -70.61124100);
        mMap.addMarker(new MarkerOptions().position(point234).title("Punta Arenas 6711").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point235= new LatLng(-33.52398670,-70.60169170);
        mMap.addMarker(new MarkerOptions().position(point235).title("Avenida Américo Vespucio 7607").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point236= new LatLng(-33.51787550,-70.62922640);
        mMap.addMarker(new MarkerOptions().position(point236).title("Lo Ovalle 347").snippet("Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point237= new LatLng(-33.55397400,-70.60324600);
        mMap.addMarker(new MarkerOptions().position(point237).title("José de la Estrella 1392").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point238= new LatLng(-33.52073300,-70.60420200);
        mMap.addMarker(new MarkerOptions().position(point238).title("Rupanco 120").snippet("Vidrio, Papel, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point239= new LatLng(-33.51617210,-70.62819330);
        mMap.addMarker(new MarkerOptions().position(point239).title("Sebastopol 328").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point240= new LatLng(-33.52913970,-70.59549050);
        mMap.addMarker(new MarkerOptions().position(point240).title("Carrera").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point241= new LatLng(-33.52116330,-70.60097050);
        mMap.addMarker(new MarkerOptions().position(point241).title("Avenida Vicuña Mackenna 7210").snippet("Pila, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point242= new LatLng(-33.51426690,-70.61989360);
        mMap.addMarker(new MarkerOptions().position(point242).title("Vecinal").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point243= new LatLng(-33.52130010,-70.60053602);
        mMap.addMarker(new MarkerOptions().position(point243).title("Avenida Vicuña Mackenna 7320").snippet("Vidrio, Papel, Cartón para bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point244= new LatLng(-33.53943300,-70.59130700);
        mMap.addMarker(new MarkerOptions().position(point244).title("Avenida Vicuña Mackenna 9090").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point245= new LatLng(-33.51810100,-70.60292100);
        mMap.addMarker(new MarkerOptions().position(point245).title("Pudeto 6931").snippet("Vidrio, Papel, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point246= new LatLng(-33.53027850,-70.59243870);
        mMap.addMarker(new MarkerOptions().position(point246).title("Punto Verde - Vidrio").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point247= new LatLng(-33.53342800,-70.59102600);
        mMap.addMarker(new MarkerOptions().position(point247).title("Estados Unidos 8654").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point248= new LatLng(-33.54657000,-70.59225500);
        mMap.addMarker(new MarkerOptions().position(point248).title("La Oblonera 500").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point249= new LatLng(-33.51281300,-70.62539700);
        mMap.addMarker(new MarkerOptions().position(point249).title("Avenida Las Industrias").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point250= new LatLng(-33.51293050,-70.61391200);
        mMap.addMarker(new MarkerOptions().position(point250).title("Av. Estadio 6041").snippet("Vidrio, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point251= new LatLng(-33.51440120,-70.63410210);
        mMap.addMarker(new MarkerOptions().position(point251).title("Berlioz").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point252= new LatLng(-33.54848900,-70.64903300);
        mMap.addMarker(new MarkerOptions().position(point252).title("Anibal Zañartu 9567").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point253= new LatLng(-33.51166980,-70.62248150);
        mMap.addMarker(new MarkerOptions().position(point253).title("Hayden 5910").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point254= new LatLng(-33.51367544,-70.60664330);
        mMap.addMarker(new MarkerOptions().position(point254).title("Avenida Vicuña Mackenna 6331").snippet("Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point255= new LatLng(-33.51144060,-70.62740160);
        mMap.addMarker(new MarkerOptions().position(point255).title("Graciano 334").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point256= new LatLng(-33.52055500,-70.59544330);
        mMap.addMarker(new MarkerOptions().position(point256).title("Julio Vildósola, supermercado Monserrat").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point257= new LatLng(-33.51986200,-70.59570800);
        mMap.addMarker(new MarkerOptions().position(point257).title("Tottus Metro Vicuña Mackena").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point258= new LatLng(-33.56047000,-70.60196000);
        mMap.addMarker(new MarkerOptions().position(point258).title("María Elena 258").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point259= new LatLng(-33.51979400,-70.59551000);
        mMap.addMarker(new MarkerOptions().position(point259).title("Avenida Américo Vespucio 7310").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point260= new LatLng(-33.56267800,-70.63526300);
        mMap.addMarker(new MarkerOptions().position(point260).title("SantaTrinidad 10977").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point261= new LatLng(-33.56441830,-70.63013160);
        mMap.addMarker(new MarkerOptions().position(point261).title("Avenida Santa Rosa 10934").snippet("Pila, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point262= new LatLng(-33.51215700,-70.63424400);
        mMap.addMarker(new MarkerOptions().position(point262).title("Pasaje Aníbal 5973").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point263= new LatLng(-33.50954940,-70.62122120);
        mMap.addMarker(new MarkerOptions().position(point263).title("Piramide 414").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point264= new LatLng(-33.50948800,-70.62080300);
        mMap.addMarker(new MarkerOptions().position(point264).title("Plaza Haydn").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point265= new LatLng(-33.50930410,-70.62421210);
        mMap.addMarker(new MarkerOptions().position(point265).title("Carmen Mena 230").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point266= new LatLng(-33.56252300,-70.60328700);
        mMap.addMarker(new MarkerOptions().position(point266).title("María Elena 1310").snippet("Cartón para bebida").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point267= new LatLng(-33.51451000,-70.60026900);
        mMap.addMarker(new MarkerOptions().position(point267).title("Avenida Froilan Roa / Pje. El Membrillar").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point268= new LatLng(-33.51031100,-70.63196800);
        mMap.addMarker(new MarkerOptions().position(point268).title("Juan Planas 5726").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point269= new LatLng(-33.50969700,-70.63003100);
        mMap.addMarker(new MarkerOptions().position(point269).title("Pedro Sarmiento").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point270= new LatLng(-33.51008180,-70.63212220);
        mMap.addMarker(new MarkerOptions().position(point270).title("Pedro Sarmiento").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point271= new LatLng(-33.53576900,-70.58504060);
        mMap.addMarker(new MarkerOptions().position(point271).title("Avenida Rojas Magallanes por Colombia").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point272= new LatLng(-33.50728200,-70.62318600);
        mMap.addMarker(new MarkerOptions().position(point272).title("Avenida Departamental").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point273= new LatLng(-33.53114700,-70.58462500);
        mMap.addMarker(new MarkerOptions().position(point273).title("Alonso de Ercilla 8597").snippet("Papel, Cartón para bebida, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point274= new LatLng(-33.51873398,-70.64974213);
        mMap.addMarker(new MarkerOptions().position(point274).title("Iquique esq. Fuenzalida Urrejola 6502").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point275= new LatLng(-33.52535200,-70.58681500);
        mMap.addMarker(new MarkerOptions().position(point275).title("Juan de Pineda 7583").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point276= new LatLng(-33.56189300,-70.59741200);
        mMap.addMarker(new MarkerOptions().position(point276).title("María Elena 861").snippet("Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point277= new LatLng(-33.55796100,-70.59234600);
        mMap.addMarker(new MarkerOptions().position(point277).title("General Arriagada 600").snippet("Papel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point278= new LatLng(-33.50687800,-70.63222500);
        mMap.addMarker(new MarkerOptions().position(point278).title("Avenida Departamental 285").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point279= new LatLng(-33.50549700,-70.62401600);
        mMap.addMarker(new MarkerOptions().position(point279).title("Huara 5319").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point280= new LatLng(-33.50620000,-70.61037700);
        mMap.addMarker(new MarkerOptions().position(point280).title("Jorge Quevedo con esquina Alonso Leng").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point281= new LatLng(-33.50496340,-70.61910590);
        mMap.addMarker(new MarkerOptions().position(point281).title("Parque Maihue (Ex Loico) 5307").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point282= new LatLng(-33.50496340,-70.61910590);
        mMap.addMarker(new MarkerOptions().position(point282).title("Pasaje Corelli 3676").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point283= new LatLng(-33.50486720,-70.61889370);
        mMap.addMarker(new MarkerOptions().position(point283).title("Parque Maihue").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point284= new LatLng(-33.56401580,-70.64492780);
        mMap.addMarker(new MarkerOptions().position(point284).title("Avenida Observatorio 1885").snippet("Pila, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point285= new LatLng(-33.522023, -70.564370);
        mMap.addMarker(new MarkerOptions().position(point285).title("Walker Martínez 3142").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point286= new LatLng(-33.488630, -70.628151);
        mMap.addMarker(new MarkerOptions().position(point286).title("Calle Magdalena").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point287= new LatLng(-33.514843, -70.673388);
        mMap.addMarker(new MarkerOptions().position(point287).title("Lincoln").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point288= new LatLng(-33.554049, -70.676963);
        mMap.addMarker(new MarkerOptions().position(point288).title("Avenida Gran Avenida Jose Miguel Carrera 10375").snippet("Punto limpio vidrio, papel, cartón, cartón para bebida, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point289= new LatLng(-33.501900, -70.578606);
        mMap.addMarker(new MarkerOptions().position(point289).title("Avenida Las Torres 5490").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point290= new LatLng(-33.502373, -70.663345);
        mMap.addMarker(new MarkerOptions().position(point290).title("Primera Avenida 1600").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point291= new LatLng(-33.510623, -70.671314);
        mMap.addMarker(new MarkerOptions().position(point291).title("Avenida José Joaquín Prieto esquina Lo Ovalle").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point292= new LatLng(-33.560860, -70.674404);
        mMap.addMarker(new MarkerOptions().position(point292).title("Augusto D'halmar / Mariano Latorre").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point293= new LatLng(-33.522324, -70.678207);
        mMap.addMarker(new MarkerOptions().position(point293).title("Parque Violeta Parra").snippet("vidrio, papel, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point294= new LatLng(-33.574898, -70.579475);
        mMap.addMarker(new MarkerOptions().position(point294).title("Rotonda Av. La Vizcachas").snippet("plastico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point295= new LatLng(-33.499803, -70.660881);
        mMap.addMarker(new MarkerOptions().position(point295).title("Calle Carlos Edwards 1373").snippet("Punto limpio - vidrio, plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point296= new LatLng(-33.534503, -70.559835);
        mMap.addMarker(new MarkerOptions().position(point296).title("Tamarugal 3238-A").snippet("pila, celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point297= new LatLng(-33.522481, -70.678853);
        mMap.addMarker(new MarkerOptions().position(point297).title("Adolfo López Mateo 2000").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point298= new LatLng(-33.493778, -70.651939);
        mMap.addMarker(new MarkerOptions().position(point298).title("Gran Avenida Jose Miguel Carrera 4310").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point299= new LatLng(-33.518510, -70.563369);
        mMap.addMarker(new MarkerOptions().position(point299).title("Ongolmo 7238-7222").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));


        //300

        LatLng point300= new LatLng(-33.486300, -70.623212);
        mMap.addMarker(new MarkerOptions().position(point300).title("Arqto Arturo Bianchi").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point301= new LatLng(-33.502316, -70.575081);
        mMap.addMarker(new MarkerOptions().position(point301).title("Avenida Las Torres 6108").snippet("Punto limpio - vidrio, papel, cartón, plástico, metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point302= new LatLng(-33.578549, -70.581814);
        mMap.addMarker(new MarkerOptions().position(point302).title("Avenida Concha y Toro 3459").snippet("pila, celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point303= new LatLng(-33.516617, -70.678268);
        mMap.addMarker(new MarkerOptions().position(point303).title("Caren 7298-7116").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point304= new LatLng(-33.492180, -70.651815);
        mMap.addMarker(new MarkerOptions().position(point304).title("Gran Avenida Jose Miguel Carrera").snippet("vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));



        LatLng point400= new LatLng(-33.41211900,-70.57155300);
        mMap.addMarker(new MarkerOptions().position(point400).title("UV C7 Plaza del Inca La Capitania N°255").snippet("Vidrio, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point401= new LatLng(-33.43641030,-70.74866440);
        mMap.addMarker(new MarkerOptions().position(point401).title("San Francisco 8586").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point402= new LatLng(-33.40645820,-70.64317300);
        mMap.addMarker(new MarkerOptions().position(point402).title("Recoleta").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point403= new LatLng(-33.41616800,-70.69910600);
        mMap.addMarker(new MarkerOptions().position(point403).title("Plaza Diego Portales").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point404= new LatLng(-33.41486700,-70.56313300);
        mMap.addMarker(new MarkerOptions().position(point404).title("Martin de Zamora 6395").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point405= new LatLng(-33.42089800,-70.54386900);
        mMap.addMarker(new MarkerOptions().position(point405).title("UV C- 15 Colón 8000 Alonso De Camargo Nº 8671").snippet("Vidrio, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point406= new LatLng(-33.41761300,-70.55465600);
        mMap.addMarker(new MarkerOptions().position(point406).title("Rotonda Atenas (costado supermercado Líder)").snippet("Punto limpio - Vidrio, Papel, Cartón, Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
        LatLng point407= new LatLng(-33.41844000,-70.55205300);
        mMap.addMarker(new MarkerOptions().position(point407).title("Avenida IV Centenario 1016").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point408= new LatLng(-33.41853700,-70.55236220);
        mMap.addMarker(new MarkerOptions().position(point408).title("Rotonda Atenas").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Pila").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point409= new LatLng(-33.40993200,-70.66553000);
        mMap.addMarker(new MarkerOptions().position(point409).title("Armando Quesada esq. Hector Boccardo").snippet("Vidrio, Papel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point410= new LatLng(-33.41158000,-70.67466300);
        mMap.addMarker(new MarkerOptions().position(point410).title("Faustino Gazziero").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point411= new LatLng(-33.41172290,-70.67495230);
        mMap.addMarker(new MarkerOptions().position(point411).title("Padre Faustino Gazziero, entre Las Cañas y Nueva Cinco").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point412= new LatLng(-33.42245800,-70.71412200);
        mMap.addMarker(new MarkerOptions().position(point412).title("Plaza Lo Amor").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point413= new LatLng(-33.41743000,-70.69800500);
        mMap.addMarker(new MarkerOptions().position(point413).title("Plazoleta Gonzalo Bulnes").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point414= new LatLng(-33.40795100,-70.63630700);
        mMap.addMarker(new MarkerOptions().position(point414).title("Mexico 260").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point415= new LatLng(-33.41698100,-70.56145500);
        mMap.addMarker(new MarkerOptions().position(point415).title("Avenida Cristobal Colón 6465").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point416= new LatLng(-33.66855710,-70.73940030);
        mMap.addMarker(new MarkerOptions().position(point416).title("Eliodoro Yáñez 1900").snippet("Pila, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point417= new LatLng(-33.42243440,-70.76031460);
        mMap.addMarker(new MarkerOptions().position(point417).title("Federico Errázuriz con Rodoviario").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point418= new LatLng(-33.40671200,-70.73719800);
        mMap.addMarker(new MarkerOptions().position(point418).title("Jose Miguel Infante 6098").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point419= new LatLng(-33.42333380,-70.75896240);
        mMap.addMarker(new MarkerOptions().position(point419).title("Mapocho Sur / Riachuelo").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point420= new LatLng(-33.42948200,-70.76499900);
        mMap.addMarker(new MarkerOptions().position(point420).title("Serrano 1384").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point421= new LatLng(-33.39840460,-70.71915440);
        mMap.addMarker(new MarkerOptions().position(point421).title("Ave. El cerro").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point422= new LatLng(-33.41697280,-70.74906540);
        mMap.addMarker(new MarkerOptions().position(point422).title("Salvador Gutierrez frente al 7950").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point423= new LatLng(-33.41697280,-70.74906540);
        mMap.addMarker(new MarkerOptions().position(point423).title("La Estrella con Mapocho").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point424= new LatLng(-33.38779200,-70.54911700);
        mMap.addMarker(new MarkerOptions().position(point424).title("Padre Hurtado 1150").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point425= new LatLng(-33.38899600,-70.54576900);
        mMap.addMarker(new MarkerOptions().position(point425).title("Avenida Kennedy 9001").snippet("Vidrio, Papel, Cartón, Cartón para bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point426= new LatLng(-33.38779540,-70.54941460);
        mMap.addMarker(new MarkerOptions().position(point426).title("Avenida Padre Hurtado Norte 1150").snippet("Pila, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point427= new LatLng(-33.40941200,-70.73783900);
        mMap.addMarker(new MarkerOptions().position(point427).title("Tocopalma 6215").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point428= new LatLng(-33.62566880,-70.78252160);
        mMap.addMarker(new MarkerOptions().position(point428).title("Paradero 13 de Avenida Calera de Tango").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point429= new LatLng(-33.40494500,-70.72928600);
        mMap.addMarker(new MarkerOptions().position(point429).title("Condell 1370").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point430= new LatLng(-33.37737700,-70.61661500);
        mMap.addMarker(new MarkerOptions().position(point430).title("La Piramide (Universidad Mayor) 5750").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point431= new LatLng(-33.40526160,-70.72895660);
        mMap.addMarker(new MarkerOptions().position(point431).title("Arturo Prat c/ Condell").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point432= new LatLng(-33.38521957,-70.67978668);
        mMap.addMarker(new MarkerOptions().position(point432).title("Avenida Independencia Esq. Calle Vecinal").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point433= new LatLng(-33.38152380,-70.57867920);
        mMap.addMarker(new MarkerOptions().position(point433).title("Borde Río, Monseñor Escriva De Balaguer 6400").snippet("Papel, Cartón").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point434= new LatLng(-33.40313000,-70.72393800);
        mMap.addMarker(new MarkerOptions().position(point434).title("Nueva Uno 1488").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point435= new LatLng(-33.42168000,-70.75225300);
        mMap.addMarker(new MarkerOptions().position(point435).title("La Estrella (Esquina Mapocho Norte)").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point436= new LatLng(-33.40132500,-70.72023800);
        mMap.addMarker(new MarkerOptions().position(point436).title("Avenida José Manuel Balmaceda 4883").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point437= new LatLng(-33.38347626,-70.66376495);
        mMap.addMarker(new MarkerOptions().position(point437).title("Diego Silva , Balneareo Municipal 1309").snippet("Plástico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point438= new LatLng(-33.38006400,-70.64901000);
        mMap.addMarker(new MarkerOptions().position(point438).title("Juan Cristóbal").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point439= new LatLng(-33.56907330,-70.80769730);
        mMap.addMarker(new MarkerOptions().position(point439).title("Buenos Aires Esq. El Manzano").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point440= new LatLng(-33.64125640,-70.76464650);
        mMap.addMarker(new MarkerOptions().position(point440).title("Esquina Santa Inés con Alfonso Ruiz Tagle").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point441= new LatLng(-33.38265810,-70.58632470);
        mMap.addMarker(new MarkerOptions().position(point441).title("Avenida Monsenior Escriba de Balaguer 5960").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point442= new LatLng(-33.40517000,-70.72303800);
        mMap.addMarker(new MarkerOptions().position(point442).title("Calle Dos 5116").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point443= new LatLng(-33.39329900,-70.69644900);
        mMap.addMarker(new MarkerOptions().position(point443).title("Puerto Montt 3594").snippet("Papel, Cartón, Cartón para bebida, Plástico, Metal").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point444= new LatLng(-33.38205500,-70.64835300);
        mMap.addMarker(new MarkerOptions().position(point444).title("Almirante Gomez Carreño").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point445= new LatLng(-33.43275200,-70.76101140);
        mMap.addMarker(new MarkerOptions().position(point445).title("Copiapó 1270").snippet("Pila, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point446= new LatLng(-33.38695160,-70.56799690);
        mMap.addMarker(new MarkerOptions().position(point446).title("Buenaventura 1770").snippet("Pila, Celular").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point447= new LatLng(-33.40210300,-70.71457200);
        mMap.addMarker(new MarkerOptions().position(point447).title("Jose Manuel Balmaceda 4569").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point448= new LatLng(-33.64158000,-70.76154500);
        mMap.addMarker(new MarkerOptions().position(point448).title("Santa Inés, Esquina Alfonso Ruiz Tagle").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point449= new LatLng(-33.38997300,-70.55922000);
        mMap.addMarker(new MarkerOptions().position(point449).title("Avenida Las Hualtatas 7440").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        






    }


        
    }

