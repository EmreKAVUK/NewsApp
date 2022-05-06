package com.emre.newsapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int tabcount;
    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {//Pager ADapter : Fragment yonetıcı
        super(fm, behavior);
        tabcount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new HomeFragment();
            case 1:
                return new SportsFragment();
            case 2:
                return new HealthFragment();
            case 3:
                return new ScienceFragment();
            case 4:
                return new EntertainmentFragment();
            case 5:
                return new TechFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;//İstenen Başlığın konumu
    }
}
