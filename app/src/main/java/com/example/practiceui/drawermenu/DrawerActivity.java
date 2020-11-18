package com.example.practiceui.drawermenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.practiceui.R;

public class DrawerActivity extends AppCompatActivity implements View.OnClickListener{
    private DrawerLayout drawerLayout;
    private View drawerView;
    private ImageView img_menu;
    private Button btn_close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer);

        Init();
    }
    private void Init(){
        drawerLayout = (DrawerLayout)findViewById(R.id.drawerLayout);
        drawerView = (View)findViewById(R.id.drawerView);
        img_menu = (ImageView)findViewById(R.id.img_menu);
        btn_close = (Button)findViewById(R.id.btn_close);

        img_menu.setOnClickListener(this);
        btn_close.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img_menu:
                drawerLayout.openDrawer(drawerView);
                break;
            case R.id.btn_close:
                drawerLayout.closeDrawer(drawerView);
        }
    }
}