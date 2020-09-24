package com.example.cdsmaster.ssb;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {


    Context context;
    int totalTabs;

    public MyAdapter(Context c, FragmentManager fm,int totalTabs){
        super(fm);
        context=c;
        this.totalTabs=totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){

            case 0:
                Wat watfragment=new Wat();
                return watfragment;


            case 1:
                TAT  tatfragment=new TAT();
                return tatfragment;

            case 2:

                SRT srtfragment =new SRT();
                return srtfragment;

            default:
                return null;

        }

    }


    @Override
    public int getCount() {
        return totalTabs;
    }
}
