package com.android.nikunj.shopave;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by nikunjgoel on 09-08-2017.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<Integer> mImages;

    public ViewPagerAdapter(FragmentManager fm, List<Integer> images) {
        super(fm);
        mImages = images;
    }

    @Override
    public Fragment getItem(int position) {
        return PagerFragment.getInstance(mImages.get(position));
    }

    @Override
    public int getCount() {
        return mImages.size();
    }
}
