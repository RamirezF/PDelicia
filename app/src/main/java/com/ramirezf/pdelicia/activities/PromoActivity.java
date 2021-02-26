package com.ramirezf.pdelicia.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.auth.internal.RecaptchaActivity;
import com.ramirezf.pdelicia.MyAdapter;
import com.ramirezf.pdelicia.R;

import java.util.ArrayList;
import java.util.List;

public class PromoActivity extends AppCompatActivity {

    private List<String> names;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promo);

        names = this.getAllNames();

        mRecyclerView = findViewById(R.id.recyclerView);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new MyAdapter(names, R.layout.recycler_view_item, new MyAdapter.OnItemClickListener() {
            @Override
            public void OnItemFriscoClick(String name, int position) {
                Toast.makeText(PromoActivity.this, name + ": "+ position, Toast.LENGTH_SHORT).show();
            }
        });


    }

    private List<String> getAllNames()
    {
        return new ArrayList<String>() {
            {
                add("Elmer Curio");
                add("Elba Lazo");
                add("Helen Chufe");
                add("Elsa Pito");
                add("Lali Cuadora");
                add("Juan Perez");
            }
        };
    }
}