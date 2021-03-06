package com.ramirezf.pdelicia.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.Toast;

import com.ramirezf.pdelicia.CartaM;
import com.ramirezf.pdelicia.MyAdapter;
import com.ramirezf.pdelicia.R;

import java.util.ArrayList;
import java.util.List;

public class PromoActivity extends AppCompatActivity {

    private List<CartaM> cartaM;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo);

        cartaM = this.getAllCartaMs();

        mRecyclerView = findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new MyAdapter(cartaM, R.layout.recycler_view_item, new MyAdapter.OnItemClickListener() {       //recycler_view_item
            @Override
            public void OnItemFriscoClick(CartaM cartaM, int position) {
                //Toast.makeText(PromoActivity.this, name + ": "+ position, Toast.LENGTH_SHORT).show();
                String nombre = cartaM.getNameP();
                String descripcion = cartaM.getDescription();
                int pImage = cartaM.getImgP();
                Toast.makeText(PromoActivity.this, nombre , Toast.LENGTH_SHORT).show();
                Toast.makeText(PromoActivity.this, "Descripción: "+descripcion , Toast.LENGTH_SHORT).show();
                Toast.makeText(PromoActivity.this, "posición: "+position , Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(PromoActivity.this, CantidadActivity.class);
//                intent.putExtra("PizzaName", nombre).putExtra("PizzaDescription", descripcion).putExtra("PizzaImage", pImage);
//                startActivity(intent);
            }
        });
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }

    private ArrayList<CartaM> getAllCartaMs()
    {
        return new ArrayList<CartaM>() {
            {
                add(new CartaM("Americana","Pizza con salsa de tomate, jamón y queso", R.drawable.menu01));
                add(new CartaM("Peperoni","Pizza con salsa de tomate, pepperoni y queso", R.drawable.menu02));
                add(new CartaM("Continental","Pizza con salsa de tomate, aceituna, champiñones y queso", R.drawable.menu03));
                add(new CartaM("Hawaiana","Pizza con salsa de tomate, piña y queso",  R.drawable.menu04));
                add(new CartaM("Vegetariana","Pizza con salsa de tomate, cebolla blanca, aceituna y queso", R.drawable.menu01));
                add(new CartaM("Mozarella","Pizza con salsa de pizza especial y queso mozarella", R.drawable.menu02));
                add(new CartaM("Americana","Pizza con salsa de tomate, jamón y queso", R.drawable.menu01));
                add(new CartaM("Peperoni","Pizza con salsa de tomate, pepperoni y queso", R.drawable.menu02));
                add(new CartaM("Continental","Pizza con salsa de tomate, aceituna, champiñones y queso", R.drawable.menu03));
                add(new CartaM("Hawaiana","Pizza con salsa de tomate, piña y queso",  R.drawable.menu04));
            }
        };
    }
}