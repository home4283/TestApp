package com.a10510323.user.test2;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Place2 extends AppCompatActivity implements OnMapReadyCallback{

    private String title;
    private Double double1;
    private Double double2;
    private GoogleMap gmap;
    private MapView mapView;

    private static final String MAP_VIEW_BUNDLE_KEY = "MapViewBundleKey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place2);
        ImageView placeImg = findViewById(R.id.placeimg);
        TextView tvTitle = findViewById(R.id.placetitle);
        TextView tvContent = findViewById(R.id.placecontext);
        TextView tvAddress = findViewById(R.id.placeaddress);
        mapView = findViewById(R.id.placemapView);

        Bundle bundle = getIntent().getExtras();
        title = bundle.getString("title");
        double1 = bundle.getDouble("double1");
        double2 = bundle.getDouble("double2");
        String content = bundle.getString("content");
        String address = bundle.getString("address");
        Integer img = bundle.getInt("img");

        tvTitle.setText("景點:"+title);
        tvContent.setText("簡介:"+content);
        placeImg.setImageResource(img);
        tvAddress.setText("地址:"+address);
        Bundle mapViewBundle = null;
        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle(MAP_VIEW_BUNDLE_KEY);
        }
        mapView.onCreate(mapViewBundle);
        mapView.getMapAsync(this);


    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Bundle mapViewBundle = outState.getBundle(MAP_VIEW_BUNDLE_KEY);
        if (mapViewBundle == null) {
            mapViewBundle = new Bundle();
            outState.putBundle(MAP_VIEW_BUNDLE_KEY, mapViewBundle);
        }

        mapView.onSaveInstanceState(mapViewBundle);
    }
    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mapView.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }
    @Override
    protected void onPause() {
        mapView.onPause();
        super.onPause();
    }
    @Override
    protected void onDestroy() {
        mapView.onDestroy();
        super.onDestroy();
    }
    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
        gmap = googleMap;
        gmap.setMinZoomPreference(18);
        LatLng sydeny = new LatLng(double1, double2);
        googleMap.addMarker(new MarkerOptions().position(sydeny).title(title));

        gmap.moveCamera(CameraUpdateFactory.newLatLng(sydeny));
    }
}
