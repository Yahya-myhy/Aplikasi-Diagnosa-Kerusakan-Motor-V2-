package com.example.arif.doktor;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Perbaikan_Piston extends Fragment {

    public static Perbaikan_Piston newInstance() {return new Perbaikan_Piston();}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_perbaikan__piston, container,false);
        return rootView;
    }
}
