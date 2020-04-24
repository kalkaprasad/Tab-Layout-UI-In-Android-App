package com.devi.tablayout;

import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class pagerAdapter extends FragmentPagerAdapter {

private  final ArrayList<Fragment> fragmentlist= new ArrayList<>();
private  final ArrayList<String> fragmentTitle= new ArrayList<>();



    public pagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public pagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentlist.get(position);
    }

    @Override
    public int getCount() {
        return fragmentlist.size();
    }

    public  void  addFragment(Fragment fragment,String title)
    {
fragmentlist.add(fragment);
fragmentTitle.add(title);

    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }
}
