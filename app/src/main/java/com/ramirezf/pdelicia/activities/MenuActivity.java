package com.ramirezf.pdelicia.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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

    private List<String> promoMs;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        promoMs = this.getAllNames();

        mRecyclerView = findViewById(R.id.recyclerView2);
        mLayoutManager = new LinearLayoutManager(this);
        //mAdapter = new MyAdapter2
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter = new MyAdapter2(promoMs, R.layout.recycler_view_item2, new MyAdapter2.OnItemClickListener() {
            @Override
            public void OnItemClick(String name, int position) {
                Toast.makeText(MenuActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        });

        mRecyclerView.setAdapter(mAdapter);

    }
    private ArrayList<String> getAllNames()
    {
        return new ArrayList<String>() {
            {
                //add(new promoMs("Americana","Pizza con salsa de tomate, jamón y queso", R.drawable.menu01));
                add("Pizza Americana");
                add("Pizza Continental");
                add("Pizza Hawaiana");
            }
        };
    }
}