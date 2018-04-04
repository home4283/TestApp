package com.a10510323.user.test2;

import android.content.ClipData;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class fg_place extends Fragment{
    private View fragment;
    private RecyclerView rv_place;
    //private CardView cvplace_card_view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragment = inflater.inflate(R.layout.activity_fg_place, container, false);
        rv_place = fragment.findViewById(R.id.rv_place);
        //cvplace_card_view = fragment.findViewById(R.id.place_card_view);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        rv_place.setLayoutManager(new LinearLayoutManager(getActivity()));
        ArrayList<item> itemList = placedata();
        ItemAdapter adapter = new ItemAdapter(getActivity(),itemList);
        rv_place.setAdapter(adapter);
        rv_place.setHasFixedSize(true);
        return fragment;
    }
    private ArrayList<item> placedata(){
        ArrayList<item> place = new ArrayList<>();
        for (int i = 0; i < 4; i++){
            if (i == 0) {
                item Item = new item();
                Item.setPlace_title("野柳地質公園");
                Item.setPlace_context("野柳地質公園原名野柳風景區，位於新北市萬里區沿海地區，因受風化的作用，是北海岸相當著名地質及奇石的風景名勝地，如燭狀石、豆腐石…等，為北海岸旅遊又增添了許多迷人的色彩。");
                Item.setPlace_img(R.drawable.place1);
                Item.setplace_address("新北市萬里區港東路167");
                Item.setDouble1(25.205335);
                Item.setDouble2(121.690318);
                place.add(Item);

            }
            else if (i == 1) {
                item Item = new item();
                Item.setPlace_title("龜吼漁港");
                Item.setPlace_context("「龜吼漁港」是北海岸一處美麗兼具觀光休閒的小漁村，每到9-11月秋季時分，鄰近龜吼漁港的「漁夫市集」就會聚集想搶購「萬里蟹」的人潮，進而成為北海岸最熱鬧的漁港之一。");
                Item.setPlace_img(R.drawable.place2);
                Item.setplace_address("新北市萬里區漁澳路85號");
                Item.setDouble1(25.194847);
                Item.setDouble2(121.687104);
                place.add(Item);
            }
            else if (i == 2) {
                item Item = new item();
                Item.setPlace_title("野柳海洋世界");
                Item.setPlace_context("野柳海洋世界緊鄰野柳風景區，廣大的觀眾席可容納3000人，野柳海洋世界除了有可愛的海豚外，還有擬虎鯨、海獅表演等及不定期更新的外國表演節目，如:高空跳水、水上芭蕾、特技秀等精彩絕倫的表演等著大家來參觀。");
                Item.setPlace_img(R.drawable.place3);
                Item.setplace_address("新北市萬里區港東路167-3號");
                Item.setDouble1(25.205335);
                Item.setDouble2(121.690318);
                place.add(Item);
            }
            else  {
                item Item = new item();
                Item.setPlace_title("翡翠灣海水浴場");
                Item.setPlace_context("翡翠灣海域廣闊，集各項水上娛樂活動的精華，是北海岸規劃完整的遊憩區，不論是住飯店或自帶露營裝備『駐紮』都能享受到不同的風味。");
                Item.setPlace_img(R.drawable.place4);
                Item.setplace_address("新北市萬里區聽濤路");
                Item.setDouble1(25.188113);
                Item.setDouble2(121.685885);
                place.add(Item);
            }
        }
        return place;
    }
    //public void onActivityCreated(Bundle savedInstanceState) {
        //super.onActivityCreated(savedInstanceState);
        //final View v = getView();
        //rv_place = v.findViewById(R.id.rv_place);
        //cvplace_card_view = v.findViewById(R.id.place_card_view);
        //LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        //rv_place.setHasFixedSize(true);
        //ArrayList<item> itemList = placedata();
        //ItemAdapter adapter = new ItemAdapter(getContext(),itemList);
        //rv_place.setAdapter(adapter);

    //}
}

