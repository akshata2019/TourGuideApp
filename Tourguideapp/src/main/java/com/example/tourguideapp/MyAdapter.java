package com.example.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.tourguideapp.Fragments.CurrentFragment;
import com.example.tourguideapp.Fragments.PastFragment;
import com.example.tourguideapp.Fragments.PendingFragment;

public class MyAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                PendingFragment homeFragment = new PendingFragment();
                return homeFragment;
            case 1:
                CurrentFragment sportFragment = new CurrentFragment();
                return sportFragment;
            case 2:
               PastFragment movieFragment = new PastFragment();
                return movieFragment;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}