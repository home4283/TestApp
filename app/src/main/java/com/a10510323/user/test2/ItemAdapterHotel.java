package com.a10510323.user.test2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

import java.util.ArrayList;

public class ItemAdapterHotel extends RecyclerView.Adapter<ItemAdapterHotel.ItemViewHolder>{
    private Context context;
    private ArrayList<itemhotel> itemList;

    public ItemAdapterHotel(Context context, ArrayList<itemhotel> itemList){
        this.context = context;
        this.itemList = itemList;

    }
    @Override
    public ItemAdapterHotel.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.from(parent.getContext())
                .inflate(R.layout.hotel_cardview_layout, parent, false);
        ItemAdapterHotel.ItemViewHolder itemViewHolder = new ItemAdapterHotel.ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapterHotel.ItemViewHolder holder, int position) {
        final itemhotel Item = itemList.get(position);
        holder.im_hotel.setImageResource(Item.getHotel_img());
        holder.tvcontent_hotel.setText(Item.getHotel_context());
        holder.tvtitle_hotel.setText(Item.getHotel_title());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, hotel2.class);
                Bundle bundle = new Bundle();
                bundle.putString("title",Item.getHotel_title());
                bundle.putString("content",Item.getHotel_context());
                bundle.putString("url", Item.getHotel_booking());
                bundle.putInt("img",Item.getHotel_img());
                bundle.putString("address",Item.getHotel_address());
                bundle.putDouble("double1",Item.getDouble1());
                bundle.putDouble("double2",Item.getDouble2());
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
        holder.btroad_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double endLatitude = Item.getDouble1();
                double endLongitude = Item.getDouble2();
                Uri uri = Uri.parse("google.navigation:q="+endLatitude+","+endLongitude);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                intent.setPackage("com.google.android.apps.maps");
                context.startActivity(intent);

            }
        });
        holder.btbooking_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(Item.getHotel_booking()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (itemList != null) {
            return itemList.size();
        }
        return 0;
    }
    public static class ItemViewHolder extends RecyclerView.ViewHolder{

        public CardView hotel_card_view;
        public ImageView im_hotel;
        public TextView tvtitle_hotel,tvcontent_hotel;
        public Button btroad_hotel, btbooking_hotel;

        public ItemViewHolder(View itemView) {
            super(itemView);
            hotel_card_view = itemView.findViewById(R.id.hotel_card_view);
            im_hotel = itemView.findViewById(R.id.im_hotel);
            tvtitle_hotel = itemView.findViewById(R.id.tvtitle_hotel);
            tvcontent_hotel = itemView.findViewById(R.id.tvcontent_hotel);
            btroad_hotel = itemView.findViewById(R.id.btroad_hotel);
            btbooking_hotel = itemView.findViewById(R.id.btbooking_hotel);
        }
    }
}
