package com.a10510323.user.test2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapterPark extends RecyclerView.Adapter<ItemAdapterPark.ItemViewHolder>{

    private Context context;
    private ArrayList<itempark> itemList;
    public ItemAdapterPark(Context context, ArrayList<itempark> itemList){
        this.context = context;
        this.itemList = itemList;

    }
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.from(parent.getContext())
                .inflate(R.layout.park_cardview_layout, parent, false);
        ItemAdapterPark.ItemViewHolder itemViewHolder = new ItemAdapterPark.ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        final itempark Item = itemList.get(position);
        holder.im_park.setImageResource(Item.getPark_img());
        holder.tvcontent_park.setText(Item.getPark_context());
        holder.tvtitle_park.setText(Item.getPark_title());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, park2.class);
                Bundle bundle = new Bundle();
                bundle.putString("title",Item.getPark_title());
                bundle.putString("content",Item.getPark_context());
                bundle.putInt("img",Item.getPark_img());
                bundle.putString("address",Item.getPark_address());
                bundle.putDouble("double1",Item.getDouble1());
                bundle.putDouble("double2",Item.getDouble2());
                intent.putExtras(bundle);
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

        public CardView park_card_view;
        public ImageView im_park;
        public TextView tvtitle_park,tvcontent_park;

        public ItemViewHolder(View itemView) {
            super(itemView);
            park_card_view = itemView.findViewById(R.id.park_card_view);
            im_park = itemView.findViewById(R.id.im_park);
            tvtitle_park = itemView.findViewById(R.id.tvtitle_park);
            tvcontent_park = itemView.findViewById(R.id.tvcontent_park);
        }
    }
}
