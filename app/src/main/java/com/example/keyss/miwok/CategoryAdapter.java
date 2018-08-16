package com.example.keyss.miwok;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.content.Context;


public class CategoryAdapter extends FragmentPagerAdapter {





    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */


    private Context mContext;
    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }




    @Override
    public CharSequence getPageTitle ( int position){
        if (position == 0) {
            return mContext.getString(R.string.category_numbers);
        } else if (position == 1) {
            return mContext.getString(R.string.category_family);
        } else if (position == 2) {
            return mContext.getString(R.string.category_colors);
        }else if (position == 3) {
            return mContext.getString(R.string.category_phrases);
        }
        else
        {
            return mContext.getString(R.string.about_app);

        }
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1) {
            return new FamilyFragment();
        } else if (position == 2) {
            return new ColorsFragment();
        } else if (position == 3) {
            return new PhrasesFragment();
        } else {
            return new aboutFragment();
        }    }

    @Override
    public int getCount() {
        return 5;
    }
}