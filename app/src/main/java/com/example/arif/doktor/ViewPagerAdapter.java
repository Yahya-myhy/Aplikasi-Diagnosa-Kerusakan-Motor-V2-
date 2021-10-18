package com.example.arif.doktor;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import android.util.Log;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 3;
    final Context context;
    String kerusakan;

    public ViewPagerAdapter(FragmentManager fm, Context context, String kerusakan) {
        super(fm);
        this.context = context;
        this.kerusakan = kerusakan;
        Log.w("WKWKWKWKWK", this.kerusakan);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
            switch (position) {
                case 0:

                    if (this.kerusakan.equals("k1")) {
                        fragment = Deskripsi_Piston.newInstance();
                    } else if ( this.kerusakan.equals("k9") ) {
                        fragment = Deskripsi.newInstance();
                    } else if (this.kerusakan.equals("k8")) {
                        fragment = Deskripsi2.newInstance();
                    }
                    break;
                case 1:
                    if (this.kerusakan.equals("k1")){
                        fragment = Penyebab_Piston.newInstance();
                    } else if ( this.kerusakan.equals("k9")) {
                        fragment = Penyebab.newInstance();
                    } else if (this.kerusakan.equals("k8")) {
                        fragment = Deskripsi2.newInstance();
                    }
                    break;
                case 2:
                    if (this.kerusakan.equals("k1")){
                        fragment = Perbaikan_Piston.newInstance();
                    } else if (this.kerusakan.equals("k9")) {
                        fragment = Perbaikan.newInstance();
                    }
                    break;
            }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Deskripsi";
            case 1:
                return "Penyebab";
            case 2:
                return "Perbaikan";
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
