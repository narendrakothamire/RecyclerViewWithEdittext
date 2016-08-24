package com.softwares.swamisamarth.recyclerviewwithedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Model> modelList = new ArrayList<>();
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new RecyclerAdapter(this, modelList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        prepareModelData();
    }

    private void prepareModelData() {
        Model model = new Model("Mad Max");
        modelList.add(model);

        model = new Model("Inside Out");
        modelList.add(model);

        model = new Model("Star Wars");
        modelList.add(model);

        model = new Model("Shaun the Sheep");
        modelList.add(model);

        model = new Model("The Martian");
        modelList.add(model);

        model = new Model("Mission Impossible");
        modelList.add(model);

        model = new Model("Up");
        modelList.add(model);

        model = new Model("Star Trek");
        modelList.add(model);

        model = new Model("The LEGO Model");
        modelList.add(model);

        model = new Model("Iron Man");
        modelList.add(model);

        model = new Model("Aliens");
        modelList.add(model);

        model = new Model("Chicken Run");
        modelList.add(model);

        model = new Model("Back to the Future");
        modelList.add(model);

        model = new Model("Raiders of the Lost Ark");
        modelList.add(model);

        model = new Model("Goldfinger");
        modelList.add(model);

        model = new Model("Guardians of the Galaxy");
        modelList.add(model);

        adapter.notifyDataSetChanged();
    }
}
