package com.example.practiceui.cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practiceui.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class CardListAdapter extends RecyclerView.Adapter<CardListAdapter.CustomViewHolder> {
    private ArrayList<MenuItem> menuItems;
    private Context context;

    public CardListAdapter(ArrayList<MenuItem> menuItems,Context context) {
        this.menuItems = menuItems;
        this.context = context;
    }

    @NonNull
    @Override
    public CardListAdapter.CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View holder = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new CustomViewHolder(holder);
    }

    @Override
    public void onBindViewHolder(@NonNull CardListAdapter.CustomViewHolder holder, int position) {
        holder.iv_menu.setImageResource(menuItems.get(position).getIv_menu());
        holder.tv_menu.setText(menuItems.get(position).getTv_menu());
    }

    @Override
    public int getItemCount() {
        return menuItems.size();
    }

    public class CustomViewHolder extends RecyclerView.ViewHolder {
        protected TextView tv_menu;
        protected ImageView iv_menu;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_menu = itemView.findViewById(R.id.tv_menu);
            iv_menu = itemView.findViewById(R.id.iv_menu);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context,"누름",Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
