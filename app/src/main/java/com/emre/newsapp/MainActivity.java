package com.emre.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    TabItem mhome,mscience,mhealth,mtech,mentertainment,msport;
    PagerAdapter pagerAdapter;
    Toolbar mtoolbar;
    ViewPager viewPager;
    String api = "350360717163473fa50709f9bd299045";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        identify();

    }
    public void identify(){
        mtoolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mtoolbar);
        mhome = findViewById(R.id.science);
        msport = findViewById(R.id.sports);
        mtech = findViewById(R.id.technology);
        mentertainment = findViewById(R.id.entertainment);
        mhealth = findViewById(R.id.health);
        viewPager = findViewById(R.id.fragmentcontainer);
        tabLayout = findViewById(R.id.include);
        pagerAdapter = new PagerAdapter(getSupportFragmentManager(),6);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0 || tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5){
                    pagerAdapter.notifyDataSetChanged();//Kullanıcı herhangi bir sekmeye tıklarsa adaptörü bilgilendirir
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));//Swipe Up
    }
}