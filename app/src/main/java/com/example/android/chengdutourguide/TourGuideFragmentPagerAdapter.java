package com.example.android.chengdutourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
public class TourGuideFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;
    private String tabTitles[] = new String[]{"历史景点", "自然景区", "天府美食", "休闲活动"};

    public TourGuideFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Get the target Fragment Class according to the value of
     * @param position
     * @return a new target Fragment.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new JinliFragment();
        } else if (position == 1) {
            return new ChunxiRoadFragment();
        } else if (position == 2) {
            return new QingchengshanFragment();
        } else {
            return new LuodaiFragment();
        }
    }

    /**
     * Get the number of pages.
     * @return the current value of PAGE_COUNT.
     */
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    /**
     * Get the page title according to the value of
     * @param position
     * @return the current value of the corresponding element in tabTitles.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
