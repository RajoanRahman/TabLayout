package com.example.rifat.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rifat on 7/2/2018.
 */

public class ViewPageAdapter extends FragmentPagerAdapter {

    //This one for Fragment Item list
    private final List<Fragment>fragmentList=new ArrayList<>();
    //This one for layout item list
    private final List<String>fragmentTitleList=new ArrayList<>();

    public ViewPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentTitleList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);
    }

     public void addFragment(Fragment fragment,String title){

        fragmentList.add(fragment);
        fragmentTitleList.add(title);

     }
}
