package com.example.arif.doktor;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuPerawatan extends AppCompatActivity {

    ListView service;
    String[] daftar = new String[]
            {"Piston Head Cylinder","Rantai Mesin/Kamprat","Transmisi","Klep Mesin","Karburator","Kopling",
                    "Busi","Koil","CDI","Sepul","Kiprok","Accu","Dinamo Starter","Suspensi Depan/Belakang",
                    "Rantai/Gear","Rem Depan/Belakang"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_perawatan);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftar);
        service = (ListView) findViewById(R.id.list_service);
        service.setAdapter(adapter);
        service.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView arg0, View arg1, int position, long arg3) {
                int item = position;
                String itemText = (String) service.getItemAtPosition(position);
                Toast.makeText(getBaseContext(), itemText, Toast.LENGTH_LONG).show();

                if (itemText.equals("Piston Head Cylinder")){
                    Intent piston = getIntent();
                    piston = new Intent(MenuPerawatan.this, ListMesin.class);
                    startActivity(piston);
                } else if (itemText.equals("Rantai Mesin/Kamprat")){
                    Intent kamprat = getIntent();
                    //kamprat = new Intent(MenuPerawatan.this, Perawatan_Kamprat.class);
                    startActivity(kamprat);
                } else if (itemText.equals("Transmisi")){
                    Intent transmisi = getIntent();
                    //transmisi = new Intent(MenuPerawatan.this, Perawatan_Transmisi.class);
                    startActivity(transmisi);
                } else if (itemText.equals("Klep Mesin")){
                    Intent klep = getIntent();
                    //klep = new Intent(MenuPerawatan.this, Perawatan_Klep.class);
                    startActivity(klep);
                } else if (itemText.equals("Karburator")){
                    Intent karbu = getIntent();
                    //karbu = new Intent(MenuPerawatan.this, Perawatan_Karburator.class);
                    startActivity(karbu);
                } else if (itemText.equals("Kopling")){
                    Intent kopling = getIntent();
                    //kopling = new Intent(MenuPerawatan.this, Perawatan_Kopling.class);
                    startActivity(kopling);
                } else if (itemText.equals("Busi")){
                    Intent busi = getIntent();
                    //busi = new Intent(MenuPerawatan.this, Perawatan_Busi.class);
                    startActivity(busi);
                } else if (itemText.equals("Koil")){
                    Intent koil = getIntent();
                    //koil = new Intent(MenuPerawatan.this, Perawatan_Koil.class);
                    startActivity(koil);
                } else if (itemText.equals("CDI")){
                    Intent cdi = getIntent();
                    //cdi = new Intent(MenuPerawatan.this, Perawatan_CDI.class);
                    startActivity(cdi);
                } else if (itemText.equals("Sepul")){
                    Intent sepul = getIntent();
                    //sepul = new Intent(MenuPerawatan.this, Perawatan_Sepul.class);
                    startActivity(sepul);
                } else if (itemText.equals("Kiprok")){
                    Intent kiprok = getIntent();
                    //kiprok = new Intent(MenuPerawatan.this, Perawatan_Kiprok.class);
                    startActivity(kiprok);
                } else if (itemText.equals("Accu")){
                    Intent aki = getIntent();
                    //aki = new Intent(MenuPerawatan.this, Perawatan_Accu.class);
                    startActivity(aki);
                } else if (itemText.equals("Dinamo Starter")){
                    Intent dinamo = getIntent();
                    //dinamo = new Intent(MenuPerawatan.this, Perawatan_Dinamo.class);
                    startActivity(dinamo);
                } else if (itemText.equals("Suspensi Depan/Belakang")){
                    Intent suspensi = getIntent();
                    //suspensi = new Intent(MenuPerawatan.this, Perawatan_Suspensi.class);
                    startActivity(suspensi);
                } else if (itemText.equals("Rantai/Gear")){
                    Intent rantai = getIntent();
                    //rantai = new Intent(MenuPerawatan.this, Perawatan_Rantai.class);
                    startActivity(rantai);
                } else if (itemText.equals("Rem Depan/Belakang")){
                    Intent rem = getIntent();
                    //rem = new Intent(MenuPerawatan.this, Perawatan_Rem.class);
                    startActivity(rem);
                }

            }
        });
    }
}
