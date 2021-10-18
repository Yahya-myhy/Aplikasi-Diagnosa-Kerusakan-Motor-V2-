package com.example.arif.doktor;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Deskripsi2 extends Fragment {

    public static Deskripsi2 newInstance() {return new Deskripsi2();}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_deskripsi2, container,false);
        return rootView;
    }
}
