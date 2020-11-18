package com.example.practiceui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.practiceui.drawermenu.DrawerActivity;
import com.example.practiceui.floating.FloatingActivity;

public class ChooseActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn_floating,btn_drawer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);

        Init();
    }
    public void Init(){
        btn_floating = (Button)findViewById(R.id.btn_floating);
        btn_drawer = (Button)findViewById(R.id.btn_drawer);

        btn_floating.setOnClickListener(this);
        btn_drawer.setOnClickListener(this);
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
        }
    }
}