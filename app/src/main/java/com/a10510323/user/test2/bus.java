package com.a10510323.user.test2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import devlight.io.library.ntb.NavigationTabBar;

public class bus extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);
        initUI();



    }
    private void initUI(){
        String[] colors = getResources().getStringArray(R.array.default_preview);
        NavigationTabBar navigationTabBar = findViewById(R.id.ntb_horizontal);
        ArrayList<NavigationTabBar.Model>models = new ArrayList<>();
        models.add(new NavigationTabBar.Model.Builder(
                getResources().getDrawable(R.drawable.u1),
                Color.parseColor(colors[0])).title("景點").badgeTitle("place")
                .build()
        );
        models.add(new NavigationTabBar.Model.Builder(
                getResources().getDrawable(R.drawable.u2),
                Color.parseColor(colors[1])).title("旅館").badgeTitle("hotel")
                .build()
        );
        models.add(new NavigationTabBar.Model.Builder(
                getResources().getDrawable(R.drawable.u3),
                Color.parseColor(colors[2])).title("公車").badgeTitle("bus")
                .build()
        );
        models.add(new NavigationTabBar.Model.Builder(
                getResources().getDrawable(R.drawable.u4),
                Color.parseColor(colors[3])).title("停車場").badgeTitle("park")
                .build()
        );
        navigationTabBar.setModels(models);


    }
}
