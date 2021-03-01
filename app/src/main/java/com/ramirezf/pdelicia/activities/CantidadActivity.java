package com.ramirezf.pdelicia.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.ramirezf.pdelicia.R;

public class CantidadActivity extends AppCompatActivity {

    private TextView pizza_name;
    private TextView txt_description;
    private ImageView imagePizza;

    private TextView btn_add;
    private TextView btn_remove;
    private TextView text_cantidad;

    private Spinner sp01;
    private TextView text_total;

    private int cantidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cantidad);
        getData();

        btn_add = findViewById(R.id.text_add);
        btn_remove = findViewById(R.id.text_remove);
        text_cantidad = findViewById(R.id.text_cantidad);

        text_total = findViewById(R.id.text_total);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantidad = cantidad + 1;
            }
        });

    }

    private void getData()
    {
        Bundle extras = getIntent().getExtras();
        String pizzaName = extras.getString("PizzaName");
        String pizzaDescripction = extras.getString("PizzaDescription");
        int pizzaImage = extras.getInt("PizzaImage");

        pizza_name.setText(pizzaName);
        txt_description.setText(pizzaDescripction);
        imagePizza.setImageResource(pizzaImage);
    }
}