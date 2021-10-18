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

public class RegisterActivity extends AppCompatActivity {

    private EditText edtemail,edtpassword;
    private Button btnRegister;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);

        initview();
        register();
    }

    private void register(){
       btnRegister.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String emailuser = edtemail.getText().toString().trim();
               String passuser = edtpassword.getText().toString().trim();

               if(emailuser.isEmpty()){
                   edtemail.setError("Email tidak boleh kosong");
               }
               else if(!Patterns.EMAIL_ADDRESS.matcher(emailuser).matches()){
                   edtemail.setError("Email tidak valid");
               }
               else if(passuser.isEmpty()){
                   edtpassword.setError("Password tidak boleh kosong");
               }
               else if(passuser.length() < 6){
                   edtpassword.setError("Password minimal 6 karakter");
               }
               else{
                   auth.createUserWithEmailAndPassword(emailuser, passuser)
                           .addOnCompleteListener(RegisterActivity.this, new OnCompleteListener<AuthResult>() {
                               @Override
                               public void onComplete(@NonNull Task<AuthResult> task) {
                                   if(!task.isSuccessful()){
                                       Toast.makeText(RegisterActivity.this, "Registrasi gagal karena" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                   }
                                   else {
                                       startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
                                   }
                               }
                           });
               }
           }
       });
    }

    private void initview(){
        edtemail = findViewById(R.id.inputEmailRegister);
        edtpassword = findViewById(R.id.inputPasswordRegister);
        btnRegister = findViewById(R.id.btnRegister01);
        auth = FirebaseAuth.getInstance();
    }
}