package com.example.practiceui.pager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.practiceui.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class PagerActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ScreenSidePagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);

        tabLayout = findViewById(R.id.tabLayout);
        adapter = new ScreenSidePagerAdapter(this);
        ViewPager2 pager = findViewById(R.id.vp);
        pager.setAdapter(adapter);

        TabLayoutMediator mediator = new TabLayoutMediator(tabLayout, pager, true, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Frist");
                        break;
                    case 1:
                        tab.setText("Second");
                        break;
                    case 2:
                        tab.setText("Third");
                        break;
                }
            }
        });
        mediator.attach();
    }
}