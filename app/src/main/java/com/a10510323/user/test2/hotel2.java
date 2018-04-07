package com.a10510323.user.test2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class hotel2 extends AppCompatActivity implements OnMapReadyCallback {

    private String title;
    private Double double1;
    private Double double2;
    private GoogleMap gmap;
    private MapView mapView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel2);
        ImageView hotelImg = findViewById(R.id.hotelimg);
        TextView tvTitle = findViewById(R.id.hoteltitle);
        TextView tvContent = findViewById(R.id.hotelcontext);
        TextView tvAddress = findViewById(R.id.hoteladdress);
        mapView = findViewById(R.id.placemapViewhotel);
        Button car = findViewById(R.id.buttoncarhotel);

        Bundle bundle = getIntent().getExtras();
        title = bundle.getString("title");
        double1 = bundle.getDouble("double1");
        double2 = bundle.getDouble("double2");
        String content = bundle.getString("content");
        String address = bundle.getString("address");
        Integer img = bundle.getInt("img");

        tvTitle.setText(title);
        tvContent.setText("　　"+content);
        hotelImg.setImageResource(img);
        tvAddress.setText("地址："+address);
        Bundle mapViewBundle = null;
        mapView.onCreate(mapViewBundle);
        mapView.getMapAsync(this);
        car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double endLatitude = double1;
                double endLongitude = double2;
                Uri uri = Uri.parse("google.navigation:q="+endLatitude+","+endLongitude);

                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps");
                startActivity(intent);
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        gmap = googleMap;
        gmap.setMinZoomPreference(15);
        LatLng sydeny = new LatLng(double1, double2);
        googleMap.addMarker(new MarkerOptions().position(sydeny).title(title));
        gmap.setMaxZoomPreference(64);
        UiSettings uiSettings = gmap.getUiSettings();
        uiSettings.setMyLocationButtonEnabled(true);
        uiSettings.setMapToolbarEnabled(true);
        uiSettings.setCompassEnabled(true);
        uiSettings.setZoomControlsEnabled(true);
        gmap.moveCamera(CameraUpdateFactory.newLatLng(sydeny));
    }
}
