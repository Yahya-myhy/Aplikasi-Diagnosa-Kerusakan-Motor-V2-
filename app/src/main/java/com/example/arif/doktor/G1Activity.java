package com.example.arif.doktor;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class G1Activity extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor sharedPreferencesEditor;

    RadioGroup rdogrp;
    RadioButton rdobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_g1);
        sharedPreferences = getSharedPreferences("DokTor",Context.MODE_PRIVATE);
        sharedPreferencesEditor = sharedPreferences.edit();


        rdogrp = (RadioGroup) findViewById(R.id.radioGroup);
        rdogrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rdobtn = (RadioButton) findViewById(checkedId);
                sharedPreferencesEditor.putString("g1_value", rdobtn.getTag().toString());
                sharedPreferencesEditor.putInt("g1_selected", checkedId);
                sharedPreferencesEditor.apply();
            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
