package com.ramirezf.pdelicia.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.ramirezf.pdelicia.R;

public class MenuActivity extends AppCompatActivity {
    Spinner sp01;
    TextView txt_precio;
    TextView txt_pizza;
    ImageView btn_add;
    ImageView btn_remove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        txt_pizza = findViewById(R.id.txt_pizza);
        txt_precio = findViewById(R.id.txt_precio);
        btn_add = findViewById(R.id.btn_add);
        btn_remove = findViewById(R.id.btn_remove);
        sp01 = findViewById(R.id.sp01);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tamaño, android.R.layout.simple_spinner_item);
        sp01.setAdapter(adapter);
    }
}