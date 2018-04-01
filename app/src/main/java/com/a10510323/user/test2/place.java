package com.a10510323.user.test2;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import devlight.io.library.ntb.NavigationTabBar;

public class place extends AppCompatActivity {

    private fg_place Fg_place = new fg_place();
    private fg_hotel Fg_hotel = new fg_hotel();
    private fg_bus Fg_bus = new fg_bus();
    private fg_park Fg_park = new fg_park();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        initUI();
    }

    private void initUI(){
        ViewPager viewPager = findViewById(R.id.ViewPager_place);
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public int getCount() {
                return 4;
            }

            @Override
            public Fragment getItem(int position) {
                switch (position) {
                    case 0:
                        {
                        return Fg_place;
                    }
                    case 1:
                    {
                        return Fg_hotel;
                    }
                    case 2:
                    {
                        return Fg_bus;
                    }
                    case 3:
                    {
                        return Fg_park;
                    }
                }
                    return null;
                }
            });
        String[] colors = getResources().getStringArray(R.array.default_preview);
        final NavigationTabBar navigationTabBar = findViewById(R.id.ntb_horizontal0);
        ArrayList<NavigationTabBar.Model>models = new ArrayList<>();
        models.add(new NavigationTabBar.Model.Builder(
                getResources().getDrawable(R.drawable.u1),
                Color.parseColor(colors[0])).title("景點").badgeTitle("place")
                .build());
        models.add(new NavigationTabBar.Model.Builder(
                getResources().getDrawable(R.drawable.u2),
                Color.parseColor(colors[1])).title("旅館").badgeTitle("hotel")
                .build());
        models.add(new NavigationTabBar.Model.Builder(
                getResources().getDrawable(R.drawable.u3),
                Color.parseColor(colors[2])).title("公車").badgeTitle("bus")
                .build());
        models.add(new NavigationTabBar.Model.Builder(
                getResources().getDrawable(R.drawable.u4),
                Color.parseColor(colors[3])).title("停車場").badgeTitle("park")
                .build());
        navigationTabBar.setModels(models);
        navigationTabBar.setViewPager(viewPager, 0);
        navigationTabBar.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                navigationTabBar.getModels().get(position).hideBadge();

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        navigationTabBar.postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < navigationTabBar.getModels().size(); i++) {
                    final NavigationTabBar.Model model = navigationTabBar.getModels().get(i);
                    navigationTabBar.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            model.showBadge();
                        }
                    }, i * 100);
                }
            }
        }, 500);

    }

}
