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

public class CFListrik extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor sharedPreferencesEditor;
    TextView txtvw7, txtvw8, txtvw9, txtvw10, txtvw11, txtvw12, txtvw13, txtvw14, txtvw15, txtvw16;
    ProgressBar pgbar7, pgbar8, pgbar9, pgbar10, pgbar11, pgbar12, pgbar13, pgbar14, pgbar15, pgbar16;
    TextView txtvwpcnt7, txtvwpcnt8, txtvwpcnt9, txtvwpcnt10, txtvwpcnt11, txtvwpcnt12, txtvwpcnt13, txtvwpcnt14, txtvwpcnt15, txtvwpcnt16;
    LinearLayout layout7, layout8, layout9, layout10, layout11, layout12, layout13, layout14, layout15,layout16;
    private Handler pgbarhndlr= new Handler();
    String [][] hasil = new String[10][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cflistrik);
        sharedPreferences = getSharedPreferences("DokTor", Context.MODE_PRIVATE);

        ArrayList kerusakan = new ArrayList();

        layout7 = (LinearLayout)findViewById(R.id.layout7);
        layout8 = (LinearLayout)findViewById(R.id.layout8);
        layout9 = (LinearLayout)findViewById(R.id.layout9);
        layout10 = (LinearLayout)findViewById(R.id.layout10);
        layout11 = (LinearLayout)findViewById(R.id.layout11);
        layout12 = (LinearLayout)findViewById(R.id.layout12);
        layout13 = (LinearLayout)findViewById(R.id.layout13);
        layout14 = (LinearLayout)findViewById(R.id.layout14);
        layout15 = (LinearLayout)findViewById(R.id.layout15);
        layout16 = (LinearLayout)findViewById(R.id.layout16);

        txtvw7 = (TextView) findViewById(R.id.textView7);
        txtvw8 = (TextView) findViewById(R.id.textView8);
        txtvw9 = (TextView) findViewById(R.id.textView9);
        txtvw10 = (TextView) findViewById(R.id.textView10);
        txtvw11 = (TextView) findViewById(R.id.textView11);
        txtvw12 = (TextView) findViewById(R.id.textView12);
        txtvw13 = (TextView) findViewById(R.id.textView13);
        txtvw14 = (TextView) findViewById(R.id.textView14);
        txtvw15 = (TextView) findViewById(R.id.textView15);
        txtvw16 = (TextView) findViewById(R.id.textView16);

        pgbar7 = (ProgressBar) findViewById(R.id.progressBar7);
        pgbar8 = (ProgressBar) findViewById(R.id.progressBar8);
        pgbar9 = (ProgressBar) findViewById(R.id.progressBar9);
        pgbar10 = (ProgressBar) findViewById(R.id.progressBar10);
        pgbar11 = (ProgressBar) findViewById(R.id.progressBar11);
        pgbar12 = (ProgressBar) findViewById(R.id.progressBar12);
        pgbar13 = (ProgressBar) findViewById(R.id.progressBar13);
        pgbar14 = (ProgressBar) findViewById(R.id.progressBar14);
        pgbar15 = (ProgressBar) findViewById(R.id.progressBar15);
        pgbar16 = (ProgressBar) findViewById(R.id.progressBar16);

        txtvwpcnt7 = (TextView) findViewById(R.id.textViewPercent7);
        txtvwpcnt8 = (TextView) findViewById(R.id.textViewPercent8);
        txtvwpcnt9 = (TextView) findViewById(R.id.textViewPercent9);
        txtvwpcnt10 = (TextView) findViewById(R.id.textViewPercent10);
        txtvwpcnt11 = (TextView) findViewById(R.id.textViewPercent11);
        txtvwpcnt12 = (TextView) findViewById(R.id.textViewPercent12);
        txtvwpcnt13 = (TextView) findViewById(R.id.textViewPercent13);
        txtvwpcnt14 = (TextView) findViewById(R.id.textViewPercent14);
        txtvwpcnt15 = (TextView) findViewById(R.id.textViewPercent15);
        txtvwpcnt16 = (TextView) findViewById(R.id.textViewPercent16);

        pgbar7.setVisibility(View.VISIBLE);
        pgbar7.setMax(100);
        pgbar8.setVisibility(View.VISIBLE);
        pgbar8.setMax(100);
        pgbar9.setVisibility(View.VISIBLE);
        pgbar9.setMax(100);
        pgbar10.setVisibility(View.VISIBLE);
        pgbar10.setMax(100);
        pgbar11.setVisibility(View.VISIBLE);
        pgbar11.setMax(100);
        pgbar12.setVisibility(View.VISIBLE);
        pgbar12.setMax(100);
        pgbar13.setVisibility(View.VISIBLE);
        pgbar13.setMax(100);
        pgbar14.setVisibility(View.VISIBLE);
        pgbar14.setMax(100);
        pgbar15.setVisibility(View.VISIBLE);
        pgbar15.setMax(100);
        pgbar16.setVisibility(View.VISIBLE);
        pgbar16.setMax(100);

        Double g12 = Double.parseDouble(sharedPreferences.getString("g12_value", "0.0"));
        Double g13 = Double.parseDouble(sharedPreferences.getString("g13_value", "0.0"));
        Double g14 = Double.parseDouble(sharedPreferences.getString("g14_value", "0.0"));
        Double g15 = Double.parseDouble(sharedPreferences.getString("g15_value", "0.0"));
        Double g16 = Double.parseDouble(sharedPreferences.getString("g16_value", "0.0"));
        Double g17 = Double.parseDouble(sharedPreferences.getString("g17_value", "0.0"));
        Double g18 = Double.parseDouble(sharedPreferences.getString("g18_value", "0.0"));
        Double g19 = Double.parseDouble(sharedPreferences.getString("g19_value", "0.0"));
        Double g20 = Double.parseDouble(sharedPreferences.getString("g20_value", "0.0"));
        Double g21 = Double.parseDouble(sharedPreferences.getString("g21_value", "0.0"));
        Double g22 = Double.parseDouble(sharedPreferences.getString("g22_value", "0.0"));
        Double g23 = Double.parseDouble(sharedPreferences.getString("g23_value", "0.0"));
        Double g24 = Double.parseDouble(sharedPreferences.getString("g24_value", "0.0"));
        Double g25 = Double.parseDouble(sharedPreferences.getString("g25_value", "0.0"));
        Double g26 = Double.parseDouble(sharedPreferences.getString("g26_value", "0.0"));
        Double g27 = Double.parseDouble(sharedPreferences.getString("g27_value", "0.0"));
        Double g28 = Double.parseDouble(sharedPreferences.getString("g28_value", "0.0"));
        Double g29 = Double.parseDouble(sharedPreferences.getString("g29_value", "0.0"));
        Double g30 = Double.parseDouble(sharedPreferences.getString("g30_value", "0.0"));
        Double g31 = Double.parseDouble(sharedPreferences.getString("g31_value", "0.0"));

        Kerusakan7 k7   = new Kerusakan7(g12, g13, g14);
        Double k7Hasil  = k7.getHasil() * 100;
        hasil[0][0]     = k7Hasil.toString();
        hasil[0][1]     = "Busi";
        hasil[0][2]     = "k7";

        Kerusakan8 k8   = new Kerusakan8(g12, g14, g15);
        Double k8Hasil  = k8.getHasil() * 100;
        hasil[1][0]     = k8Hasil.toString();
        hasil[1][1]     = "Koil";
        hasil[1][2]     = "k8";

        Kerusakan9 k9   = new Kerusakan9(g12, g16, g17);
        Double k9Hasil  = k9.getHasil() * 100;
        hasil[2][0]     = k9Hasil.toString();
        hasil[2][1]     = "CDI (Capacitor Discharge Ignition)";
        hasil[2][2]     = "k9";

        Kerusakan10 k10 = new Kerusakan10(g18, g19);
        Double k10Hasil = k10.getHasil() * 100;
        hasil[3][0]     = k10Hasil.toString();
        hasil[3][1]     = "Spul";
        hasil[3][2]     = "k10";

        Kerusakan11 k11 = new Kerusakan11(g20, g21);
        Double k11Hasil = k11.getHasil() * 100;
        hasil[4][0]     = k11Hasil.toString();
        hasil[4][1]     = "Kiprok";
        hasil[4][2]     = "k11";

        Kerusakan12 k12 = new Kerusakan12(g19, g22, g23);
        Double k12Hasil = k12.getHasil() * 100;
        hasil[5][0]     = k12Hasil.toString();
        hasil[5][1]     = "Aki";
        hasil[5][2]     = "k12";

        Kerusakan13 k13 = new Kerusakan13(g22, g24);
        Double k13Hasil = k13.getHasil() * 100;
        hasil[6][0]     = k13Hasil.toString();
        hasil[6][1]     = "Dinamo Starter";
        hasil[6][2]     = "k13";

        Kerusakan14 k14 = new Kerusakan14(g25, g26, g27);
        Double k14Hasil = k14.getHasil() * 100;
        hasil[7][0]     = k14Hasil.toString();
        hasil[7][1]     = "Suspensi";
        hasil[7][2]     = "k14";

        Kerusakan15 k15 = new Kerusakan15(g27, g28, g29);
        Double k15Hasil = k15.getHasil() * 100;
        hasil[8][0]     = k15Hasil.toString();
        hasil[8][1]     = "Rantai / Gear";
        hasil[8][2]     = "k15";

        Kerusakan16 k16 = new Kerusakan16(g30, g31);
        Double k16Hasil = k16.getHasil() * 100;
        hasil[9][0]     = k16Hasil.toString();
        hasil[9][1]     = "Rem Depan / Belakang";
        hasil[9][2]     = "k16";

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
                try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
                pgbarhndlr.post(new Runnable() {
                    public void run() {
                        setProgressBar(pgbar7, txtvw7, hasil[0][1], txtvwpcnt7, Double.valueOf(hasil[0][0]).intValue());
                        setProgressBar(pgbar8, txtvw8, hasil[1][1], txtvwpcnt8, Double.valueOf(hasil[1][0]).intValue());
                        setProgressBar(pgbar9, txtvw9, hasil[2][1], txtvwpcnt9, Double.valueOf(hasil[2][0]).intValue());
                        setProgressBar(pgbar10, txtvw10, hasil[3][1], txtvwpcnt10, Double.valueOf(hasil[3][0]).intValue());
                        setProgressBar(pgbar11, txtvw11, hasil[4][1], txtvwpcnt11, Double.valueOf(hasil[4][0]).intValue());
                        setProgressBar(pgbar12, txtvw12, hasil[5][1], txtvwpcnt12, Double.valueOf(hasil[5][0]).intValue());
                        setProgressBar(pgbar13, txtvw13, hasil[6][1], txtvwpcnt13, Double.valueOf(hasil[6][0]).intValue());
                        setProgressBar(pgbar14, txtvw14, hasil[7][1], txtvwpcnt14, Double.valueOf(hasil[7][0]).intValue());
                        setProgressBar(pgbar16, txtvw16, hasil[8][1], txtvwpcnt16, Double.valueOf(hasil[8][0]).intValue());
                        setProgressBar(pgbar15, txtvw15, hasil[9][1], txtvwpcnt15, Double.valueOf(hasil[9][0]).intValue());
                    }
                });
            }
        }).start();

        layout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("KERUSAKAN", hasil[0][2]);
                startActivity(intent);
            }
        });
        layout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("KERUSAKAN", hasil[1][2]);
                startActivity(intent);
            }
        });
        layout9.setOnClickListener(new View.OnClickListener() {
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
