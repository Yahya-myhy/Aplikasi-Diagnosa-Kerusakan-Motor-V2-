package com.example.arif.doktor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {
    private EditText edtemail,edtpassword;
    private Button btnLogin, btnRegister;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login1);
        initview();
        login();
    }

    private void login(){
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailuser = edtemail.getText().toString().trim();
                String passworduser = edtpassword.getText().toString().trim();

                if(emailuser.isEmpty()){
                    edtemail.setError("Email tidak boleh kosong");
                }
                else if(!Patterns.EMAIL_ADDRESS.matcher(emailuser).matches()){
                    edtemail.setError("Email tidak valid");
                }
                else if(passworduser.isEmpty()){
                    edtpassword.setError("Password tidak boleh kosong");
                }
                else if(passworduser.length() < 6){
                    edtpassword.setError("Password tidak boleh kurang dari 6 karakter");
                }
                else {
                    auth.signInWithEmailAndPassword(emailuser,passworduser)
                            .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if(!task.isSuccessful()){
                                        Toast.makeText(LoginActivity.this, "Gagal Login Karena" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                    }
                                    else {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("email", emailuser);
                                        startActivity(new Intent(LoginActivity.this, MenuUtama.class).putExtra("email", bundle));
                                    }
                                }
                            });
                }
            }
        });
    }

    private void initview(){
        edtemail = findViewById(R.id.inputEmail);
        edtpassword = findViewById(R.id.inputPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);
        auth = FirebaseAuth.getInstance();
    }
}