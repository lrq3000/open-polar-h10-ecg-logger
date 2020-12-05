package org.circadiaware.open_polar_h10_ecg_logger.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.circadiaware.open_polar_h10_ecg_logger.R;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tabs_status, R.string.tabs_metrics1, R.string.tabs_metrics2};
    private static final int[] TAB_FRAGMENTS = new int[]{R.layout.fragment_status, R.layout.fragment_metrics1, R.layout.fragment_metrics2};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return TabFragment.newInstance(TAB_FRAGMENTS[position]);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // This value should equal the number of tabs
        return 3;
    }
}