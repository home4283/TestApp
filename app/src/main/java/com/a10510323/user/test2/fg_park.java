package com.a10510323.user.test2;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class fg_park extends Fragment{
    private View fragment;
    private RecyclerView rv_park;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.activity_fg_park, container, false);
        rv_park = fragment.findViewById(R.id.rv_park);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        rv_park.setLayoutManager(new LinearLayoutManager(getActivity()));
        ArrayList<itempark> itemList = parkdata();
        ItemAdapterPark adapter = new ItemAdapterPark(getActivity(),itemList);
        rv_park.setAdapter(adapter);
        rv_park.setHasFixedSize(true);
        return fragment;
    }
    private ArrayList<itempark> parkdata(){
        ArrayList<itempark> park = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            if (i == 0) {
                itempark Itempark = new itempark();
                Itempark.setPark_title("龜吼停車場");
                Itempark.setPark_context("總車位數:76"+"\n"+"類型:平面式臨時路外停車場"+"\n"+"收費方式:小型車50元/次"+"\n"+"小型車1500元/月");
                Itempark.setPark_img(R.drawable.park1);
                Itempark.setPark_address("新北市萬里區龜吼里漁澳81號");
                Itempark.setDouble1(25.195961);
                Itempark.setDouble2(121.686389);
                park.add(Itempark);

            }
            else if (i == 1) {
                itempark Itempark = new itempark();
                Itempark.setPark_title("野柳停車場");
                Itempark.setPark_context("總車位數:314"+"\n"+"類型:平面式臨時路外停車場"+"\n"+"收費方式:大型車150元/次"+"\n"+"小型車50元/次"+"\n"+"小型車1500元/月");
                Itempark.setPark_img(R.drawable.park2jpg);
                Itempark.setPark_address("新北市萬里區野柳里港東路167-1號");
                Itempark.setDouble1(25.203897);
                Itempark.setDouble2(121.688475);
                park.add(Itempark);
            }
            else if (i == 2) {
                itempark Itempark = new itempark();
                Itempark.setPark_title("野柳海洋世界停車場");
                Itempark.setPark_context("總車位數:149"+"\n"+"類型:平面式臨時路外停車場"+"\n"+"收費方式:小型車20元/時"+"\n"+"小型車100元/次");
                Itempark.setPark_img(R.drawable.park3);
                Itempark.setPark_address("新北市萬里區野柳里港東路167-3號");
                Itempark.setDouble1(25.203904);
                Itempark.setDouble2(121.688477);
                park.add(Itempark);
            }
            else  {
                itempark Itempark = new itempark();
                Itempark.setPark_title("萬里行政大樓B1停車場");
                Itempark.setPark_context("總車位數:35"+"\n"+"類型:立體式建築附設停車空間"+"\n"+"收費方式:小型車20元/時"+"\n"+"小型車1000元/月");
                Itempark.setPark_img(R.drawable.park4);
                Itempark.setPark_address("新北市萬里區瑪鍊路123號B1");
                Itempark.setDouble1(25.177423);
                Itempark.setDouble2(121.689086);
                park.add(Itempark);
            }
        }
        return park;
    }
}
