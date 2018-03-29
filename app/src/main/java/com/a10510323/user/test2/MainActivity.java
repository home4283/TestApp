package com.a10510323.user.test2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView imb1,imb2,imb3,imb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imb1 = findViewById(R.id.imageView1);
        imb2 = findViewById(R.id.imageView2);
        imb3 = findViewById(R.id.imageView3);
        imb4 = findViewById(R.id.imageView4);
        Banner banner = findViewById(R.id.banner);
        banner.setBannerAnimation(Transformer.ZoomOutSlide);
        banner.setBannerStyle(BannerConfig.NUM_INDICATOR_TITLE);
        List<String> title = new ArrayList<>();
        title.add("2018萬金石馬拉松");
        title.add("2018野柳神明淨港文化祭");
        banner.setBannerTitles(title);
        final List<String> mWeb = new ArrayList<>();
        mWeb.add("http://www.wanjinshi-marathon.com.tw/news/list");
        mWeb.add("https://udn.com/news/story/11322/2995406");
        banner.setOnBannerListener(new OnBannerListener() {
            @Override
            public void OnBannerClick(int position) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(mWeb.get(position)));
                startActivity(intent);
            }
        });
        banner.setImageLoader(new GlideImageLoader());
        List<Integer> images= new ArrayList<>();
        images.add(R.drawable.ba1);
        images.add(R.drawable.bn2);
        banner.setDelayTime(5000);
        banner.setImages(images);
        banner.start();
        imb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, bus.class);
                startActivity(intent);

            }
        });
        imb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        imb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        imb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
