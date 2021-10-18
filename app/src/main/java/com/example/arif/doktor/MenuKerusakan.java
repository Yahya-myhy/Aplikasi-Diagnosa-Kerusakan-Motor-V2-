package com.example.arif.doktor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;

public class MenuKerusakan extends AppCompatActivity {

    private ImageButton listrik, mesin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_kerusakan);

        mesin = (ImageButton) findViewById(R.id.imgbtn_mesin );
        mesin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ListMesin.class);
                startActivity(i);
            }
        });

        listrik = (ImageButton) findViewById(R.id.imgbtn_listrik );
        listrik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ListListrik.class);
                startActivity(i);
            }
        });

    }
}
