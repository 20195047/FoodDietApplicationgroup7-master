package com.health.fooddietapplication.activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;
import com.health.fooddietapplication.R;
import com.health.fooddietapplication.adapters.HomeHorAdapter;
import com.health.fooddietapplication.models.HomeHorModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView recyclerView;
    private HomeHorAdapter homeHorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_home);
        recyclerView =findViewById(R.id.home_hor_rec);

        homeHorAdapter = new HomeHorAdapter(this, new ArrayList<HomeHorModel>());
        recyclerView.setAdapter(homeHorAdapter);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
