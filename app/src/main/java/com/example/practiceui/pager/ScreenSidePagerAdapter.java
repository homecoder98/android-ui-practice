package com.example.practiceui.pager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.practiceui.bottomNavigation.FirstFragment;

public class ScreenSidePagerAdapter extends FragmentStateAdapter {
    public ScreenSidePagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    //프래그먼트 교체시 여기서 교체
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position == 1){
            return new FirstFragment();
        }
        return new ScreenSlidePageFragment();
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
