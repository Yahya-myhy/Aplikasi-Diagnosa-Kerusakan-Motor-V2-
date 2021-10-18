package com.example.arif.doktor;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CFMesin extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor sharedPreferencesEditor;
    TextView txtvw1, txtvw2, txtvw3, txtvw4, txtvw5, txtvw6;
    ProgressBar pgbar1, pgbar2, pgbar3, pgbar4, pgbar5, pgbar6;
    TextView txtvwpcnt1, txtvwpcnt2, txtvwpcnt3, txtvwpcnt4, txtvwpcnt5, txtvwpcnt6;
    LinearLayout layout1, layout2, layout3, layout4, layout5, layout6;
    private Handler pgbarhndlr= new Handler();
    String [][] hasil = new String[6][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cfmesin);
        sharedPreferences = getSharedPreferences("DokTor", Context.MODE_PRIVATE);

        ArrayList kerusakan = new ArrayList();

        layout1 = (LinearLayout) findViewById(R.id.layout1);
        layout2 = (LinearLayout) findViewById(R.id.layout2);
        layout3 = (LinearLayout) findViewById(R.id.layout3);
        layout4 = (LinearLayout) findViewById(R.id.layout4);
        layout5 = (LinearLayout) findViewById(R.id.layout5);
        layout6 = (LinearLayout) findViewById(R.id.layout6);

        txtvw1 = (TextView) findViewById(R.id.textView1);
        txtvw2 = (TextView) findViewById(R.id.textView2);
        txtvw3 = (TextView) findViewById(R.id.textView3);
        txtvw4 = (TextView) findViewById(R.id.textView4);
        txtvw5 = (TextView) findViewById(R.id.textView5);
        txtvw6 = (TextView) findViewById(R.id.textView6);

        pgbar1 = (ProgressBar) findViewById(R.id.progressBar1);
        pgbar2 = (ProgressBar) findViewById(R.id.progressBar2);
        pgbar3 = (ProgressBar) findViewById(R.id.progressBar3);
        pgbar4 = (ProgressBar) findViewById(R.id.progressBar4);
        pgbar5 = (ProgressBar) findViewById(R.id.progressBar5);
        pgbar6 = (ProgressBar) findViewById(R.id.progressBar6);

        txtvwpcnt1 = (TextView) findViewById(R.id.textViewPercent1);
        txtvwpcnt2 = (TextView) findViewById(R.id.textViewPercent2);
        txtvwpcnt3 = (TextView) findViewById(R.id.textViewPercent3);
        txtvwpcnt4 = (TextView) findViewById(R.id.textViewPercent4);
        txtvwpcnt5 = (TextView) findViewById(R.id.textViewPercent5);
        txtvwpcnt6 = (TextView) findViewById(R.id.textViewPercent6);

        pgbar1.setVisibility(View.VISIBLE);
        pgbar1.setMax(100);
        pgbar2.setVisibility(View.VISIBLE);
        pgbar2.setMax(100);
        pgbar3.setVisibility(View.VISIBLE);
        pgbar3.setMax(100);
        pgbar4.setVisibility(View.VISIBLE);
        pgbar4.setMax(100);
        pgbar5.setVisibility(View.VISIBLE);
        pgbar5.setMax(100);
        pgbar6.setVisibility(View.VISIBLE);
        pgbar6.setMax(100);

        Double g1 = Double.parseDouble(sharedPreferences.getString("g1_value", "0.0"));
        Double g2 = Double.parseDouble(sharedPreferences.getString("g2_value", "0.0"));
        Double g3 = Double.parseDouble(sharedPreferences.getString("g3_value", "0.0"));
        Double g4 = Double.parseDouble(sharedPreferences.getString("g4_value", "0.0"));
        Double g5 = Double.parseDouble(sharedPreferences.getString("g5_value", "0.0"));
        Double g6 = Double.parseDouble(sharedPreferences.getString("g6_value", "0.0"));
        Double g7 = Double.parseDouble(sharedPreferences.getString("g7_value", "0.0"));
        Double g8 = Double.parseDouble(sharedPreferences.getString("g8_value", "0.0"));
        Double g9 = Double.parseDouble(sharedPreferences.getString("g9_value", "0.0"));
        Double g10 = Double.parseDouble(sharedPreferences.getString("g10_value", "0.0"));
        Double g11 = Double.parseDouble(sharedPreferences.getString("g11_value", "0.0"));

        Kerusakan1 k1   = new Kerusakan1(g1, g2, g3);
        Double k1Hasil  = k1.getHasil() * 100;
        hasil[0][0]     = k1Hasil.toString();
        hasil[0][1]     = "Piston Head Cylinder";
        hasil[0][2]     = "k1";

        Kerusakan2 k2   = new Kerusakan2(g1, g3, g4);
        Double k2Hasil  = k2.getHasil() * 100;
        hasil[1][0]     = k2Hasil.toString();
        hasil[1][1]     = "Rantai Mesin/Kamprat";
        hasil[1][2]     = "k2";

        Kerusakan3 k3   = new Kerusakan3(g5, g6, g7);
        Double k3Hasil  = k3.getHasil() * 100;
        hasil[2][0]     = k3Hasil.toString();
        hasil[2][1]     = "Transmisi";
        hasil[2][2]     = "k3";

        Kerusakan4 k4   = new Kerusakan4(g2, g8, g9, g10);
        Double k4Hasil  = k4.getHasil() * 100;
        hasil[3][0]     = k4Hasil.toString();
        hasil[3][1]     = "Klep Mesin";
        hasil[3][2]     = "k4";

        Kerusakan5 k5   = new Kerusakan5(g4, g8, g10);
        Double k5Hasil  = k5.getHasil() * 100;
        hasil[4][0]     = k5Hasil.toString();
        hasil[4][1]     = "Karburator";
        hasil[4][2]     = "k5";

        Kerusakan6 k6   = new Kerusakan6(g4, g5, g11);
        Double k6Hasil  = k6.getHasil() * 100;
        hasil[5][0]     = k6Hasil.toString();
        hasil[5][1]     = "Kopling";
        hasil[5][2]     = "k6";

        Arrays.sort(hasil, new Comparator<String[]>() {
            @Override
            public int compare(final String[] entry1, final String[] entry2) {
                final String time1 = entry1[0];
                final String time2 = entry2[0];
                return time2.compareTo(time1);
            }
        });

        new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                pgbarhndlr.post(new Runnable() {
                    public void run() {
                        setProgressBar(pgbar1, txtvw1, hasil[0][1], txtvwpcnt1, Double.valueOf(hasil[0][0]).intValue());
                        setProgressBar(pgbar2, txtvw2, hasil[1][1], txtvwpcnt2, Double.valueOf(hasil[1][0]).intValue());
                        setProgressBar(pgbar3, txtvw3, hasil[2][1], txtvwpcnt3, Double.valueOf(hasil[2][0]).intValue());
                        setProgressBar(pgbar4, txtvw4, hasil[3][1], txtvwpcnt4, Double.valueOf(hasil[3][0]).intValue());
                        setProgressBar(pgbar5, txtvw5, hasil[4][1], txtvwpcnt5, Double.valueOf(hasil[4][0]).intValue());
                        setProgressBar(pgbar6, txtvw6, hasil[5][1], txtvwpcnt6, Double.valueOf(hasil[5][0]).intValue());
                    }
                });
            }
        }).start();

        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("KERUSAKAN", hasil[0][2]);
                startActivity(intent);
            }
        });

        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("KERUSAKAN", hasil[1][2]);
                startActivity(intent);
            }
        });

        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("KERUSAKAN", hasil[2][2]);
                startActivity(intent);
            }
        });
    }
    public void setProgressBar(ProgressBar progress, TextView header, String headerText, TextView percent, Integer value) {
        progress.setProgress(value.intValue());
        percent.setText(value.toString() + " %");
        header.setText(headerText);
    }
}
