package com.example.arif.doktor;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Perbaikan extends Fragment {

    public static Perbaikan newInstance() {return new Perbaikan();}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_perbaikan, container,false);
        return rootView;
    }
}
