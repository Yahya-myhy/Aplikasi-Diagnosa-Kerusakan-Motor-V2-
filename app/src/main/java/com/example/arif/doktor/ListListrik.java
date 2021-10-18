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

public class ListListrik extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor sharedPreferencesEditor;

    CheckBox chbxG12, chbxG13, chbxG14, chbxG15, chbxG16, chbxG17, chbxG18, chbxG19, chbxG20, chbxG21,
            chbxG22, chbxG23, chbxG24, chbxG25, chbxG26, chbxG27, chbxG28, chbxG29, chbxG30, chbxG31;

    LinearLayout layoutg12, layoutg13, layoutg14, layoutg15, layoutg16, layoutg17, layoutg18, layoutg19, layoutg20,
            layoutg21, layoutg22, layoutg23, layoutg24, layoutg25, layoutg26, layoutg27, layoutg28, layoutg29, layoutg30, layoutg31;

    Button btnresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_listrik);
        sharedPreferences = getSharedPreferences("DokTor", Context.MODE_PRIVATE);
        sharedPreferences.edit().clear().commit();

        btnresult = (Button) findViewById(R.id.buttonResult);

        chbxG12 = (CheckBox) findViewById(R.id.checkBoxG12);
        chbxG13 = (CheckBox) findViewById(R.id.checkBoxG13);
        chbxG14 = (CheckBox) findViewById(R.id.checkBoxG14);
        chbxG15 = (CheckBox) findViewById(R.id.checkBoxG15);
        chbxG16 = (CheckBox) findViewById(R.id.checkBoxG16);
        chbxG17 = (CheckBox) findViewById(R.id.checkBoxG17);
        chbxG18 = (CheckBox) findViewById(R.id.checkBoxG18);
        chbxG19 = (CheckBox) findViewById(R.id.checkBoxG19);
        chbxG20 = (CheckBox) findViewById(R.id.checkBoxG20);
        chbxG21 = (CheckBox) findViewById(R.id.checkBoxG21);
        chbxG22 = (CheckBox) findViewById(R.id.checkBoxG22);
        chbxG23 = (CheckBox) findViewById(R.id.checkBoxG23);
        chbxG24 = (CheckBox) findViewById(R.id.checkBoxG24);
        chbxG25 = (CheckBox) findViewById(R.id.checkBoxG25);
        chbxG26 = (CheckBox) findViewById(R.id.checkBoxG26);
        chbxG27 = (CheckBox) findViewById(R.id.checkBoxG27);
        chbxG28 = (CheckBox) findViewById(R.id.checkBoxG28);
        chbxG29 = (CheckBox) findViewById(R.id.checkBoxG29);
        chbxG30 = (CheckBox) findViewById(R.id.checkBoxG30);
        chbxG31 = (CheckBox) findViewById(R.id.checkBoxG31);

        layoutg12 = (LinearLayout) findViewById(R.id.layoutG12);
        layoutg13 = (LinearLayout) findViewById(R.id.layoutG13);
        layoutg14 = (LinearLayout) findViewById(R.id.layoutG14);
        layoutg15 = (LinearLayout) findViewById(R.id.layoutG15);
        layoutg16 = (LinearLayout) findViewById(R.id.layoutG16);
        layoutg17 = (LinearLayout) findViewById(R.id.layoutG17);
        layoutg18 = (LinearLayout) findViewById(R.id.layoutG18);
        layoutg19 = (LinearLayout) findViewById(R.id.layoutG19);
        layoutg20 = (LinearLayout) findViewById(R.id.layoutG20);
        layoutg21 = (LinearLayout) findViewById(R.id.layoutG21);
        layoutg22 = (LinearLayout) findViewById(R.id.layoutG22);
        layoutg23 = (LinearLayout) findViewById(R.id.layoutG23);
        layoutg24 = (LinearLayout) findViewById(R.id.layoutG24);
        layoutg25 = (LinearLayout) findViewById(R.id.layoutG25);
        layoutg26 = (LinearLayout) findViewById(R.id.layoutG26);
        layoutg27 = (LinearLayout) findViewById(R.id.layoutG27);
        layoutg28 = (LinearLayout) findViewById(R.id.layoutG28);
        layoutg29 = (LinearLayout) findViewById(R.id.layoutG29);
        layoutg30 = (LinearLayout) findViewById(R.id.layoutG30);
        layoutg31 = (LinearLayout) findViewById(R.id.layoutG31);

        final Intent g12Intent = new Intent(ListListrik.this, G12Activity.class);
        layoutClicked(g12Intent, chbxG12, layoutg12);

        final Intent g13Intent = new Intent(ListListrik.this, G13Activity.class);
        layoutClicked(g13Intent, chbxG13, layoutg13);

        final Intent g14Intent = new Intent(ListListrik.this, G14Activity.class);
        layoutClicked(g14Intent, chbxG14, layoutg14);

        final Intent g15Intent = new Intent(ListListrik.this, G15Activity.class);
        layoutClicked(g15Intent, chbxG15, layoutg15);

        final Intent g16Intent = new Intent(ListListrik.this, G16Activity.class);
        layoutClicked(g16Intent, chbxG16, layoutg16);

        final Intent g17Intent = new Intent(ListListrik.this, G17Activity.class);
        layoutClicked(g17Intent, chbxG17, layoutg17);

        final Intent g18Intent = new Intent(ListListrik.this, G18Activity.class);
        layoutClicked(g18Intent, chbxG18, layoutg18);

        final Intent g19Intent = new Intent(ListListrik.this, G19Activity.class);
        layoutClicked(g19Intent, chbxG19, layoutg19);

        final Intent g20Intent = new Intent(ListListrik.this, G20Activity.class);
        layoutClicked(g20Intent, chbxG20, layoutg20);

        final Intent g21Intent = new Intent(ListListrik.this, G21Activity.class);
        layoutClicked(g21Intent, chbxG21, layoutg21);

        final Intent g22Intent = new Intent(ListListrik.this, G22Activity.class);
        layoutClicked(g22Intent, chbxG22, layoutg22);

        final Intent g23Intent = new Intent(ListListrik.this, G23Activity.class);
        layoutClicked(g23Intent, chbxG23, layoutg23);

        final Intent g24Intent = new Intent(ListListrik.this, G24Activity.class);
        layoutClicked(g24Intent, chbxG24, layoutg24);

        final Intent g25Intent = new Intent(ListListrik.this, G25Activity.class);
        layoutClicked(g25Intent, chbxG25, layoutg25);

        final Intent g26Intent = new Intent(ListListrik.this, G26Activity.class);
        layoutClicked(g26Intent, chbxG26, layoutg26);

        final Intent g27Intent = new Intent(ListListrik.this, G27Activity.class);
        layoutClicked(g27Intent, chbxG27, layoutg27);

        final Intent g28Intent = new Intent(ListListrik.this, G28Activity.class);
        layoutClicked(g28Intent, chbxG28, layoutg28);

        final Intent g29Intent = new Intent(ListListrik.this, G29Activity.class);
        layoutClicked(g29Intent, chbxG29, layoutg29);

        final Intent g30Intent = new Intent(ListListrik.this, G30Activity.class);
        layoutClicked(g30Intent, chbxG30, layoutg30);

        final Intent g31Intent = new Intent(ListListrik.this, G31Activity.class);
        layoutClicked(g31Intent, chbxG31, layoutg31);

        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent resultIntent = new Intent(ListListrik.this, CFListrik.class);
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
