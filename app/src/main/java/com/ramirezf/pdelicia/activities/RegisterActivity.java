package com.ramirezf.pdelicia.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ramirezf.pdelicia.R;

public class RegisterActivity extends AppCompatActivity {
    Button btn_back;
    Button registerUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_back = (Button) findViewById(R.id.btn_back);
        registerUser = (Button) findViewById(R.id.registerUser);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getback = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(getback);
                finish();
            }
        });

        registerUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(RegisterActivity.this, "Se registrará al usuario", Toast.LENGTH_SHORT).show();
            }
        });
    }
}