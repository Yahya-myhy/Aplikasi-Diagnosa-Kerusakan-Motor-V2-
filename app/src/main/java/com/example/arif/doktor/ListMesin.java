package com.example.arif.doktor;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class ListMesin extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor sharedPreferencesEditor;

    CheckBox chbxG1, chbxG2, chbxG3, chbxG4, chbxG5, chbxG6, chbxG7, chbxG8, chbxG9, chbxG10, chbxG11;
    Button btnresult;
    LinearLayout layoutg1, layoutg2, layoutg3, layoutg4, layoutg5, layoutg6, layoutg7, layoutg8, layoutg9, layoutg10, layoutg11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mesin);
        sharedPreferences = getSharedPreferences("DokTor", Context.MODE_PRIVATE);
        sharedPreferences.edit().clear().commit();

        btnresult = (Button) findViewById(R.id.buttonResult);

        chbxG1 = (CheckBox) findViewById(R.id.checkBoxG1);
        chbxG2 = (CheckBox) findViewById(R.id.checkBoxG2);
        chbxG3 = (CheckBox) findViewById(R.id.checkBoxG3);
        chbxG4 = (CheckBox) findViewById(R.id.checkBoxG4);
        chbxG5 = (CheckBox) findViewById(R.id.checkBoxG5);
        chbxG6 = (CheckBox) findViewById(R.id.checkBoxG6);
        chbxG7 = (CheckBox) findViewById(R.id.checkBoxG7);
        chbxG8 = (CheckBox) findViewById(R.id.checkBoxG8);
        chbxG9 = (CheckBox) findViewById(R.id.checkBoxG9);
        chbxG10 = (CheckBox) findViewById(R.id.checkBoxG10);
        chbxG11 = (CheckBox) findViewById(R.id.checkBoxG11);

        layoutg1 = (LinearLayout) findViewById(R.id.layoutG1);
        layoutg2 = (LinearLayout) findViewById(R.id.layoutG2);
        layoutg3 = (LinearLayout) findViewById(R.id.layoutG3);
        layoutg4 = (LinearLayout) findViewById(R.id.layoutG4);
        layoutg5 = (LinearLayout) findViewById(R.id.layoutG5);
        layoutg6 = (LinearLayout) findViewById(R.id.layoutG6);
        layoutg7 = (LinearLayout) findViewById(R.id.layoutG7);
        layoutg8 = (LinearLayout) findViewById(R.id.layoutG8);
        layoutg9 = (LinearLayout) findViewById(R.id.layoutG9);
        layoutg10 = (LinearLayout) findViewById(R.id.layoutG10);
        layoutg11 = (LinearLayout) findViewById(R.id.layoutG11);

        final Intent g1Intent = new Intent(ListMesin.this, G1Activity.class);
        layoutClicked(g1Intent, chbxG1, layoutg1);

        final Intent g2Intent = new Intent(ListMesin.this, G2Activity.class);
        layoutClicked(g2Intent, chbxG2, layoutg2);

        final Intent g3Intent = new Intent(ListMesin.this, G3Activity.class);
        layoutClicked(g3Intent, chbxG3, layoutg3);

        final Intent g4Intent = new Intent(ListMesin.this, G4Activity.class);
        layoutClicked(g4Intent, chbxG4, layoutg4);

        final Intent g5Intent = new Intent(ListMesin.this, G5Activity.class);
        layoutClicked(g5Intent, chbxG5, layoutg5);

        final Intent g6Intent = new Intent(ListMesin .this, G6Activity.class);
        layoutClicked(g6Intent, chbxG6, layoutg6);

        final Intent g7Intent = new Intent(ListMesin.this, G7Activity.class);
        layoutClicked(g7Intent, chbxG7, layoutg7);

        final Intent g8Intent = new Intent(ListMesin.this, G8Activity.class);
        layoutClicked(g8Intent, chbxG8, layoutg8);

        final Intent g9Intent = new Intent(ListMesin.this, G9Activity.class);
        layoutClicked(g9Intent, chbxG9, layoutg9);

        final Intent g10Intent = new Intent(ListMesin.this, G10Activity.class);
        layoutClicked(g10Intent, chbxG10, layoutg10);

        final Intent g11Intent = new Intent(ListMesin.this, G11Activity.class);
        layoutClicked(g11Intent, chbxG11, layoutg11);

        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent resultIntent = new Intent(ListMesin.this, CFMesin.class);
                startActivity(resultIntent);
            }
        });

    }


    public void layoutClicked(final Intent intent, final CheckBox checkbox, LinearLayout linearLayout) {
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkbox.isChecked()) {
                    checkbox.toggle();
                } else {
                    checkbox.toggle();
                    startActivity(intent);
                }
            }
        });
    }
}

