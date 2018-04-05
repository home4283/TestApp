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

public class fg_hotel extends Fragment{
    private View fragment;
    private RecyclerView rv_hotel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        fragment = inflater.inflate(R.layout.activity_fg_hotel, container, false);
        rv_hotel = fragment.findViewById(R.id.rv_hotle);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        rv_hotel.setLayoutManager(new LinearLayoutManager(getActivity()));
        ArrayList<itemhotel> itemList = hoteldata();
        ItemAdapterHotel adapter = new ItemAdapterHotel(getActivity(),itemList);
        rv_hotel.setAdapter(adapter);
        rv_hotel.setHasFixedSize(true);
        return fragment;
    }
    private ArrayList<itemhotel> hoteldata(){
        ArrayList<itemhotel> hotel = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            if (i == 0) {
                itemhotel Itemhotel = new itemhotel();
                Itemhotel.setHotel_title("白宮行館");
                Itemhotel.setHotel_context("白宮行舘佔地約1萬2千坪，特聘國內外名師精心設計，採用純白歐式風格的外觀，與碧海藍天相互映襯，再加上南國椰影搖曳，每間客房均採面海設計，打開落地窗，就是碧海白沙，不知不覺就感受到輕鬆悠閒的度假氣氛！");
                Itemhotel.setHotel_img(R.drawable.hotel1);
                Itemhotel.setHotel_address("新北市萬里區瑪鋉路264號");
                Itemhotel.setDouble1(25.180978);
                Itemhotel.setDouble2(121.690252);
                hotel.add(Itemhotel);

            }
            else if (i == 1) {
                itemhotel Itemhotel = new itemhotel();
                Itemhotel.setHotel_title("薆悅酒店野柳渡假館 INHOUSE HOTEL YEHLIU");
                Itemhotel.setHotel_context("薆悅酒店野柳渡假館座落於台灣北海岸觀光風景區，緊鄰地質公園與海洋世界，並禮聘紐約知名團隊Rockwell Group操刀設計，入住薆悅酒店野柳渡假館，不需離開房間便能觀賞基隆嶼海天一色的絕美景觀。");
                Itemhotel.setHotel_img(R.drawable.hotel2);
                Itemhotel.setHotel_address("新北市萬里區港東路162-2號");
                Itemhotel.setDouble1(25.204170);
                Itemhotel.setDouble2(121.690331);
                hotel.add(Itemhotel);
            }
            else if (i == 2) {
                itemhotel Itemhotel = new itemhotel();
                Itemhotel.setHotel_title("The Loft Seaside Hotel 沐舍溫泉渡假酒店");
                Itemhotel.setHotel_context("本館擁有全台灣純淨天然且符合衛生標準的海底溫泉，融合豐富的元素及建築美學，細膩的規劃及巧思的設計空間，提供一個舒適環境，讓國內外旅客都能有著沐浴春風，宛如置身自家般輕鬆自在，賓至如歸。");
                Itemhotel.setHotel_img(R.drawable.hotel3);
                Itemhotel.setHotel_address("新北市萬里區大鵬里萬里加投166-1號");
                Itemhotel.setDouble1(25.215315);
                Itemhotel.setDouble2(121.643385);
                hotel.add(Itemhotel);
            }
            else  {
                itemhotel Itemhotel = new itemhotel();
                Itemhotel.setHotel_title("愛琴海太平洋溫泉會館");
                Itemhotel.setHotel_context("愛琴海太平洋溫泉會館位於台灣北海岸翡翠灣，坐擁倚山面海的壯闊景致，晨曦至日幕皆綻放著變化萬千的絕美姿態。清新的藍白色調，是象徵碧海藍天的浪漫氛圍！而彩虹點綴的跳躍圖畫，則是童心未泯的渡假趣味！");
                Itemhotel.setHotel_img(R.drawable.hotel4);
                Itemhotel.setHotel_address("新北市萬里區翡翠路1號");
                Itemhotel.setDouble1(25.191114);
                Itemhotel.setDouble2(121.683844);
                hotel.add(Itemhotel);
            }
        }
        return hotel;
    }
}
