package com.example.arif.doktor;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Deskripsi_Piston extends Fragment {

    public static Deskripsi_Piston newInstance() {return new Deskripsi_Piston();}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_deskripsi__piston, container,false);
        return rootView;
    }
}
