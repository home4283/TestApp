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
                Item.setPlace_context("野柳地質公園原名野柳風景區，位於新北市萬里區沿海地區，因受風化的作用，是北海岸相當著名地質及奇石的風景名勝地，屬於北海岸及觀音山國家風景區，風景區內的地形大致上為一個凸出於海面的岬角，長約1700公尺，如同一隻大海龜因此又名『野柳龜』，再歷經長時間的海蝕風化和地殼運動，形成了海蝕洞溝、蜂窩石、燭狀石、豆腐石、蕈狀岩、壺穴、溶蝕盤等等特殊的地質景觀，為北海岸旅遊又增添了許多迷人的色彩。");
                Item.setPlace_img(R.drawable.place1);
                place.add(Item);
            }
            else if (i == 1) {
                item Item = new item();
                Item.setPlace_title("龜吼漁港");
                Item.setPlace_context("「龜吼漁港」是北海岸一處美麗兼具觀光休閒的小漁村，這裡的樓房都彩繪得很漂亮，海水也非常湛藍清澈。每到9-11月秋季時分，鄰近龜吼漁港的「漁夫市集」就會聚集想搶購美味「萬里蟹」的人潮，而現今的「龜吼漁港」也因萬里蟹聲名大噪，成為北海岸最熱鬧的漁港之一。來這裡必點經典菜色「清蒸萬里蟹」，不加任何調味料，把大海的鮮味全留在蟹肉中，是簡單清蒸就能嚐到的極品滋味！");
                Item.setPlace_img(R.drawable.place2);
                place.add(Item);
            }
            else if (i == 2) {
                item Item = new item();
                Item.setPlace_title("野柳海洋世界");
                Item.setPlace_context("野柳海洋世界位於新北市萬里區，緊鄰野柳風景區，全年開放的海洋世界，廣大的觀眾席可容納3000人，每到假日吸引無數遊客前來觀賞。野柳海洋世界其實除了可愛的海豚外，這兒還有擬虎鯨、海獅表演及不定期更新的外國表演節目，如高空跳水、水上芭蕾、特技秀等，樣樣精彩可期，每場表演約60分鐘。");
                Item.setPlace_img(R.drawable.place3);
                place.add(Item);
            }
            else  {
                item Item = new item();
                Item.setPlace_title("翡翠灣海水浴場");
                Item.setPlace_context("美麗的海灣—翡翠灣介於金山與基隆間，集各項水上娛樂活動的精華，是北海岸規劃完整的遊憩區，除海水浴場外有風浪板、衝浪、水上摩托車、沙灘車、拖曳傘、滑翔翼、飛行傘、踏船等，可享盡上天下海的樂趣。更有情趣特殊的休閒旅館和度假小屋，也可以自帶露營裝備『駐紮』享受不同的風味，白天充分投入弄潮之樂，晚上則徜徉於海風的洗禮。或者你不甘寂寞想作都會的選擇：到啤酒屋小酌或跳跳海上斯可。");
                Item.setPlace_img(R.drawable.place4);
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

