package com.a10510323.user.test2;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{
    private Context context;
    private ArrayList<item>itemList;

    public ItemAdapter(Context context, ArrayList<item> itemList){
        this.context = context;
        this.itemList = itemList;

    }
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.from(parent.getContext())
                .inflate(R.layout.place_cardview_layout, parent, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        item Item = itemList.get(position);
        holder.im_place.setImageResource(Item.getPlace_img());
        holder.tvcontent_place.setText(Item.getPlace_context());
        holder.tvtitle_place.setText(Item.getPlace_title());

    }

    @Override
    public int getItemCount() {
        if (itemList != null) {
            return itemList.size();
        }
        return 0;
    }
    //ViewHolder class
    public static class ItemViewHolder extends RecyclerView.ViewHolder{

        public CardView place_card_view;
        public ImageView im_place;
        public TextView tvtitle_place,tvcontent_place;

        public ItemViewHolder(View itemView) {
            super(itemView);
            place_card_view = itemView.findViewById(R.id.place_card_view);
            im_place = itemView.findViewById(R.id.im_place);
            tvtitle_place = itemView.findViewById(R.id.tvtitle_place);
            tvcontent_place = itemView.findViewById(R.id.tvcontent_place);
        }
    }
}
