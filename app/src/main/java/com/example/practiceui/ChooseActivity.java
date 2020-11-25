package com.example.practiceui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.practiceui.bottomNavigation.BottomNavigation;
import com.example.practiceui.cardview.CardMenuActivity;
import com.example.practiceui.dialog.MyDialogFragment;
import com.example.practiceui.drawermenu.DrawerActivity;
import com.example.practiceui.floating.FloatingActivity;
import com.example.practiceui.pager.PagerActivity;

public class ChooseActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_floating,btn_drawer,btn_dialog_fragment,btn_bottom_navigation
            ,btn_viewpager2,btn_card_view,btn_img_event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        Init();
    }
    public void Init(){
        btn_floating = (Button)findViewById(R.id.btn_floating);
        btn_drawer = (Button)findViewById(R.id.btn_drawer);
        btn_dialog_fragment = (Button)findViewById(R.id.btn_dialog_fragment);
        btn_bottom_navigation = (Button)findViewById(R.id.btn_bottom_navigation);
        btn_viewpager2 = (Button)findViewById(R.id.btn_viewpager2);
        btn_card_view = (Button)findViewById(R.id.btn_card_view);
        btn_img_event = (Button)findViewById(R.id.btn_img_event);

        btn_floating.setOnClickListener(this);
        btn_drawer.setOnClickListener(this);
        btn_dialog_fragment.setOnClickListener(this);
        btn_bottom_navigation.setOnClickListener(this);
        btn_viewpager2.setOnClickListener(this);
        btn_card_view.setOnClickListener(this);
        btn_img_event.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btn_floating:
                Intent floating_intent = new Intent(ChooseActivity.this,FloatingActivity.class);
                startActivity(floating_intent);
                break;
            case R.id.btn_drawer:
                Intent drawer_intent = new Intent(ChooseActivity.this, DrawerActivity.class);
                startActivity(drawer_intent);
                break;
            case R.id.btn_dialog_fragment:
                MyDialogFragment m = new MyDialogFragment();
                m.show(getSupportFragmentManager(),null);
                break;
            case R.id.btn_bottom_navigation:
                Intent bottom_navigation_intent = new Intent(ChooseActivity.this, BottomNavigation.class);
                startActivity(bottom_navigation_intent);
                break;
            case R.id.btn_viewpager2:
                Intent viewpager2_intent = new Intent(ChooseActivity.this, PagerActivity.class);
                startActivity(viewpager2_intent);
                break;
            case R.id.btn_card_view:
                Intent card_view_intent = new Intent(ChooseActivity.this, CardMenuActivity.class);
                startActivity(card_view_intent);
                break;
            case R.id.btn_img_event:
                Intent img_event_intent = new Intent(ChooseActivity.this, ImageEventActivity.class);
                startActivity(img_event_intent);
                break;
            default:
                break;
        }
    }
}