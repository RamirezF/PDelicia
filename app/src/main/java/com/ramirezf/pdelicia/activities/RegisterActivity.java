package com.ramirezf.pdelicia.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.ramirezf.pdelicia.R;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class RegisterActivity extends AppCompatActivity {
    Button btn_back;
    Button registerUser;
    private EditText user_surnames;
    private EditText user_name;
    private EditText user_dni;
    private EditText user_email1;
    private EditText user_phone;
    private EditText user_pass1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        user_surnames = findViewById(R.id.user_surnames);
        user_name = findViewById(R.id.user_name);
        user_dni = findViewById(R.id.user_dni);
        user_email1 = findViewById(R.id.user_email1);
        user_phone = findViewById(R.id.user_phone);
        user_pass1 = findViewById(R.id.user_pass1);
        btn_back = (Button) findViewById(R.id.btn_back);
        registerUser = (Button) findViewById(R.id.registerUser);

        registerUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegisterServices("http://192.168.1.76/delicia/register.php");
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getback = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(getback);
                finish();
            }
        });


    }

    private void RegisterServices(String URL ){
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "Operacion exitosa", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros = new HashMap<String, String>();
                parametros.put("apellidos", user_surnames.getText().toString());
                parametros.put("nombres", user_name.getText().toString());
                parametros.put("dni", user_dni.getText().toString());
                parametros.put("email", user_email1.getText().toString());
                parametros.put("celular", user_phone.getText().toString());
                parametros.put("password", user_pass1.getText().toString());
                return parametros;
            }
        };

        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }
}