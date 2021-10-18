package com.example.arif.doktor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class Pewaratan extends AppCompatActivity {
    private TextView text_merekmotor,text_platmotor,text_pemilikmotor;
    private EditText edt_merkmotor,edt_platmotor,edt_pemilikmotor;
    private CheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5,checkBox6,
        checkBox7,checkBox8,checkBox9,checkBox10,checkBox11,checkBox12;
    private Button btn_simpan;
    private FirebaseAuth firebaseAuth;

    List<Perawatan> perawatans;
    DatabaseReference databasePerawatans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pewaratan);
        databasePerawatans = FirebaseDatabase.getInstance().getReference("perawatans");
        initview();
        perawatans = new ArrayList<>();
        addPerawatan();
    }

    private void addPerawatan(){
        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String platnomor = edt_platmotor.getText().toString();
                String merkmotor = edt_merkmotor.getText().toString();
                String namapemilik = edt_pemilikmotor.getText().toString();
                String jenisperawatan = " ";

                if (!checkBox1.isChecked() && !checkBox2.isChecked() && !checkBox3.isChecked() &&
                        !checkBox4.isChecked() && !checkBox5.isChecked() && !checkBox6.isChecked() &&
                        !checkBox7.isChecked() && !checkBox8.isChecked() && !checkBox9.isChecked() &&
                        !checkBox10.isChecked() && !checkBox11.isChecked() && !checkBox12.isChecked() )
                {
                    Toast.makeText(getApplicationContext(), "Pilih Kerusakan yang terjadi",Toast.LENGTH_SHORT).show();
                }else{
                    String a = "";
                    if (checkBox1.isChecked()){
                        a += checkBox1.getText().toString().trim() +", ";
                    }
                    String b = "";
                    if(checkBox2.isChecked()){
                        b += checkBox2.getText().toString().trim() +", ";
                    }
                    String c = "";
                    if (checkBox3.isChecked()){
                        c += checkBox3.getText().toString().trim() +", ";
                    }
                    String d = "";
                    if (checkBox4.isChecked()){
                        d += checkBox4.getText().toString().trim() +", ";
                    }
                    String e = "";
                    if (checkBox5.isChecked()){
                        e += checkBox5.getText().toString().trim() +", ";
                    }
                    String f = "";
                    if(checkBox6.isChecked()){
                        f += checkBox6.getText().toString().trim() +", ";
                    }
                    String g = "";
                    if (checkBox7.isChecked()){
                        g += checkBox7.getText().toString().trim() +", ";
                    }
                    String h = "";
                    if (checkBox8.isChecked()){
                        h += checkBox8.getText().toString().trim() +", ";
                    }
                    String i = "";
                    if (checkBox9.isChecked()){
                        i += checkBox9.getText().toString().trim() +", ";
                    }
                    String j = "";
                    if(checkBox10.isChecked()){
                        j += checkBox10.getText().toString().trim() +", ";
                    }
                    String k = "";
                    if (checkBox11.isChecked()){
                        k += checkBox11.getText().toString().trim() +", ";
                    }
                    String l = "";
                    if (checkBox12.isChecked()){
                        l += checkBox12.getText().toString().trim() +", ";
                    }
                    jenisperawatan = a + b + c + d +
                            e + f + g + h + i + j + k + l;
                }

                String id = databasePerawatans.push().getKey();
                Perawatan perawatan = new Perawatan(id,platnomor,merkmotor,jenisperawatan,namapemilik);
                databasePerawatans.child(id).setValue(perawatan);

                Toast.makeText(Pewaratan.this, "History Berhasil ditambahkan",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Pewaratan.this, HistoryKerusakan.class);
                startActivity(intent);
            }
        });

    }

    private void initview(){
        text_merekmotor = findViewById(R.id.text_merk_motor);
        text_pemilikmotor = findViewById(R.id.text_pemilik_motor);
        text_platmotor = findViewById(R.id.text_plat_motor);
        edt_merkmotor = findViewById(R.id.edt_merk_motor);
        edt_pemilikmotor = findViewById(R.id.edt_pemilik_motor);
        edt_platmotor = findViewById(R.id.edt_plat_motor);
        //CheckBox
        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);
        checkBox4 = findViewById(R.id.checkbox4);
        checkBox5 = findViewById(R.id.checkbox5);
        checkBox6 = findViewById(R.id.checkbox6);
        checkBox7 = findViewById(R.id.checkbox7);
        checkBox8 = findViewById(R.id.checkbox8);
        checkBox9 = findViewById(R.id.checkbox9);
        checkBox10 = findViewById(R.id.checkbox10);
        checkBox11 = findViewById(R.id.checkbox11);
        checkBox12 = findViewById(R.id.checkbox12);
        //End CheckBox
        btn_simpan = findViewById(R.id.btn_simpan);
    }
}