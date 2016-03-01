package com.juanjo3ns.fastnine;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by juanjo.3ns on 08/02/2016.
 */
public class Levels_Adapter extends FragmentPagerAdapter {
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titles = new ArrayList<>();



    public Levels_Adapter(FragmentManager fm){
        super(fm);


        fragments.add(Easy.newInstance());
        titles.add("easy");
        fragments.add(Hard.newInstance());
        titles.add("hard");
        fragments.add(Colored.newInstance());
        titles.add("colored");
        fragments.add(Insane.newInstance());
        titles.add("insane");


    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}
