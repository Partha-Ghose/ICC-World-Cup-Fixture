package com.ppgstore.iccworldcup2019features;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class PagerViewAdapter extends FragmentPagerAdapter {
    public PagerViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i){
            case 0:
                fragment = new Fragment_Camera();
                break;
            case 1:
                fragment = new Fragment_Chat();
                break;
            case 2:
                fragment = new Fragment_Status();
                break;
            case 3:
                fragment = new Fragment_Call();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
