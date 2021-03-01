package com.ramirezf.pdelicia.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.ramirezf.pdelicia.CartaM;
import com.ramirezf.pdelicia.MyAdapter;
import com.ramirezf.pdelicia.MyAdapter2;
import com.ramirezf.pdelicia.PromoM;
import com.ramirezf.pdelicia.R;

import java.util.ArrayList;
import java.util.List;

public class MenuActivity extends AppCompatActivity {

    private List<PromoM> promoMs;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        promoMs = this.getAllPromo();

        mRecyclerView = findViewById(R.id.recyclerView2);
        mLayoutManager = new LinearLayoutManager(this);
        //mAdapter = new MyAdapter2
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter = new MyAdapter2(promoMs, R.layout.recycler_view_item2, new MyAdapter2.OnItemClickListener() {
            @Override
            public void OnItemClick(PromoM promoM, int position) {
                String nombre = promoM.getNameP();
                String descripcion = promoM.getDescription();
                int pImage = promoM.getImgP();
                Toast.makeText(MenuActivity.this, nombre , Toast.LENGTH_SHORT).show();
                Toast.makeText(MenuActivity.this, "Descripción: "+descripcion , Toast.LENGTH_SHORT).show();
                Toast.makeText(MenuActivity.this, "posición: "+position , Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent(MenuActivity.this, CantidadActivity.class);
//                intent.putExtra("PizzaName",nombre).putExtra("PizzaDescription", descripcion).putExtra("PizzaImage", pImage);
//                startActivity(intent);
            }
        });

        mRecyclerView.setAdapter(mAdapter);

    }
    private ArrayList<PromoM> getAllPromo()
    {
        return new ArrayList<PromoM>() {
            {
                //add(new promoMs("Americana","Pizza con salsa de tomate, jamón y queso", R.drawable.menu01));
                add(new PromoM("Pizza Americana","Deliciosa pizza con salsa de tomate, jamón y queso.", R.drawable.menu01));
                add(new PromoM("Pizza Pepperoni", "Deliciosa pizza clásica con salsa de tomate, queso y bastante pepperoni.", R.drawable.menu02));
                add(new PromoM("Pizza Continental", "Delisiosa pizza continental que lleva salsa de tomate, aceituna negra, cebolla blanca y champiñones.", R.drawable.menu03));
                add(new PromoM("Pizza Hawaiana", "Deliciosa pizza hawaiana que lleva salsa de tomate, queso y riquísimos trozos de piña.", R.drawable.menu04));
                add(new PromoM("Pizza Americana","Deliciosa pizza con salsa de tomate, jamón y queso.", R.drawable.menu01));
                add(new PromoM("Pizza Pepperoni", "Deliciosa pizza clásica con salsa de tomate, queso y bastante pepperoni.", R.drawable.menu02));
            }
        };
    }
}