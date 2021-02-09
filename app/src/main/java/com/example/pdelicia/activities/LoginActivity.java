package com.example.pdelicia.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pdelicia.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient;

public class LoginActivity extends AppCompatActivity {
    private Button btn_login;
    private TextView btn_register;
    private TextView btn_google;
    private  TextView btn_fb;
    private EditText user_txt;
    private EditText pass_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // No Action Bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_login);
        
        user_txt = (EditText) findViewById(R.id.user_txt);
        pass_txt = (EditText) findViewById(R.id.pass_txt); 
        btn_login = (Button) findViewById(R.id.btn_login);
        btn_register = (TextView) findViewById(R.id.btn_register);
        btn_google = (TextView) findViewById(R.id.btn_google);
        btn_fb = (TextView) findViewById(R.id.btn_fb);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Click en Login Principal", Toast.LENGTH_SHORT).show();
                Toast.makeText(LoginActivity.this, "Usuario: "+ user_txt.getText().toString(), Toast.LENGTH_SHORT).show();
                Toast.makeText(LoginActivity.this, "Clave: "+ pass_txt.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Click en Registrar", Toast.LENGTH_SHORT).show();
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