package com.devi.tablayout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;
import android.widget.Toolbar;


import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    androidx.appcompat.widget.Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    private Toolbar supportActionBar;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=(androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        tabLayout=(TabLayout) findViewById(R.id.tablayout);
        viewPager=(ViewPager)findViewById(R.id.mywebpager);
        setSupportActionBar(toolbar);


        setipviewpager(viewPager);
        tabLayout.setupWithViewPager(viewPager);


    }

    public void setSupportActionBar(Toolbar supportActionBar) {
        this.supportActionBar = supportActionBar;
    }

    public  void  setipviewpager(ViewPager viewPager)
    {
        pagerAdapter pagerAdapter = new pagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new chatfragment(),"chat");
        pagerAdapter.addFragment(new callfragment(),"Call");
        pagerAdapter.addFragment(new statusfragment(),"Status");
        pagerAdapter.addFragment(new Camera(),"Camera");
        viewPager.setAdapter(pagerAdapter);

    }
}
