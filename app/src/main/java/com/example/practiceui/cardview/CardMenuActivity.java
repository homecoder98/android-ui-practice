package com.example.practiceui.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.os.Bundle;

import com.example.practiceui.R;

import java.util.ArrayList;

public class CardMenuActivity extends AppCompatActivity {
    private ArrayList<MenuItem> menuItems;
    private CardListAdapter adapter;
    private RecyclerView rv_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_menu);

        Init();

        setCard();
    }
    private void Init(){
        rv_menu = findViewById(R.id.rv_menu);

        menuItems = new ArrayList<MenuItem>();

        rv_menu.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        rv_menu.setHasFixedSize(true);

    }
    private void setCard(){
        menuItems.add(new MenuItem("back",R.drawable.ic_baseline_arrow_back_24));
        menuItems.add(new MenuItem("down",R.drawable.ic_baseline_arrow_downward_24));
        menuItems.add(new MenuItem("go",R.drawable.ic_baseline_arrow_forward_24));

        adapter = new CardListAdapter(menuItems,this);
        rv_menu.setAdapter(adapter);

        SnapHelper helper = new LinearSnapHelper();
        helper.attachToRecyclerView(rv_menu);
    }
}