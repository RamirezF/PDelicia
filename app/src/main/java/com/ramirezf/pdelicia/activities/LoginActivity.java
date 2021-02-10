package com.ramirezf.pdelicia.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ramirezf.pdelicia.R;

public class LoginActivity extends AppCompatActivity {
    private Button btn_login;
    private TextView btn_register;
    private TextView btn_google;
    private  TextView btn_fb;
    private EditText email_txt;
    private EditText pass_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // No Action Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_login);

        email_txt = (EditText) findViewById(R.id.email_txt);
        pass_txt = (EditText) findViewById(R.id.pass_txt); 
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_register = (TextView) findViewById(R.id.btn_register);
        btn_google = (TextView) findViewById(R.id.btn_google);
        btn_fb = (TextView) findViewById(R.id.btn_fb);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Click en Login Principal", Toast.LENGTH_SHORT).show();
                Toast.makeText(LoginActivity.this, "Usuario: "+ email_txt.getText().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(LoginActivity.this, "Clave: "+ pass_txt.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gotoRegister = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(gotoRegister);
                finish();
            }
        });

        btn_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Click para enlazar con Google", Toast.LENGTH_SHORT).show();
            }
        });

        btn_fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Click para enlazar con Facebook", Toast.LENGTH_SHORT).show();
            }
        });

    }
}