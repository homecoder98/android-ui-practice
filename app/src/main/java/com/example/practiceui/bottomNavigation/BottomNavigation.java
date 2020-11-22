package com.example.practiceui.bottomNavigation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.example.practiceui.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigation extends AppCompatActivity {
    FrameLayout frame_navigation;
    BottomNavigationView bottom_navigation;
    FirstFragment firstFragment;
    SecondFragment secondFragment;
    ThirdFragment thirdFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        Init();
    }
    public void Init(){
        frame_navigation = (FrameLayout)findViewById(R.id.frame_navigation);
        bottom_navigation = (BottomNavigationView)findViewById(R.id.bottom_navigation);
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        thirdFragment = new ThirdFragment();

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.frame_navigation,firstFragment);
        transaction.commit();

        //바텀 네비게이션 아이템 선택 리스너
        bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.action_first:
                        setFrag(0);
                        break;
                    case R.id.action_second:
                        setFrag(1);
                        break;
                    case R.id.action_third:
                        setFrag(2);
                        break;
                }
                return false;
            }
        });
    }
    //프래그먼트 교체 메서드
    private void setFrag(int i){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        switch(i){
            case 0:
                transaction.replace(R.id.frame_navigation,firstFragment);
                transaction.commit();
                break;
            case 1:
                transaction.replace(R.id.frame_navigation,secondFragment);
                transaction.commit();
                break;
            case 2:
                transaction.replace(R.id.frame_navigation,thirdFragment);
                transaction.commit();
                break;
        }
    }

}