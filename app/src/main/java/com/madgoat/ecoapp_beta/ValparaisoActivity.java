package com.madgoat.ecoapp_beta;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class ValparaisoActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valparaiso);
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
        LatLng valparaiso = new LatLng(-33.035797689490316, -71.59346043455926);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(valparaiso,10));

        LatLng point1 = new LatLng(-33.02947151359029, -71.58326560287887);
        mMap.addMarker(new MarkerOptions().position(point1).title("José miguel Carrera 1951, Balmaceda").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point2 = new LatLng(-33.0328612099215, -71.57889774669778);
        mMap.addMarker(new MarkerOptions().position(point2).title("Manuel Rodriguez, entre Camino Real y 18 de Septiembre").snippet("Papel").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point3 = new LatLng(-33.03282162798363, -71.57897837329301);
        mMap.addMarker(new MarkerOptions().position(point3).title("Manuel Antonio Matta con Manuel Rodriguez").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point4 = new LatLng(-33.03427831158736, -71.58263730631205);
        mMap.addMarker(new MarkerOptions().position(point4).title("Barros Arana / Galvarino.(Block A sector C)").snippet("Pilas").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point5 = new LatLng(-33.03415460578728, -71.58361390722823);
        mMap.addMarker(new MarkerOptions().position(point5).title("Barros Arana con Tolson").snippet("Plastico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point6 = new LatLng(-33.03337521584565, -71.57108951323309);
        mMap.addMarker(new MarkerOptions().position(point6).title("Calle del agua entre pasaje 9 y pasaje 15").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point7 = new LatLng(-33.03418505293602, -71.58349224172456);
        mMap.addMarker(new MarkerOptions().position(point7).title("Barros Arana con Tolson").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point8 = new LatLng(-33.03419875416675, -71.58338619273678);
        mMap.addMarker(new MarkerOptions().position(point8).title("Barros Arana con Tolson").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point9 = new LatLng(-33.035334938689864, -71.57914233672449);
        mMap.addMarker(new MarkerOptions().position(point9).title("Camino real / Del agua").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));
        LatLng point10 = new LatLng(-33.03231222133856, -71.57400348193137);
        mMap.addMarker(new MarkerOptions().position(point10).title("Calle Nueve con París").snippet("Vidrio").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng point11 = new LatLng(-33.03251024215084, -71.57400957332557);
        mMap.addMarker(new MarkerOptions().position(point11).title("Calle Nueve con París").snippet("Plástico ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

    }
}
