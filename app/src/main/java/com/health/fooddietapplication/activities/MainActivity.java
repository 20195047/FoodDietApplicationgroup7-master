package com.health.fooddietapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.health.fooddietapplication.R;
import com.health.fooddietapplication.adapters.HomeHorAdapter;
import com.health.fooddietapplication.models.HomeHorModel;
import com.health.fooddietapplication.ui.MealsFragment;
import com.health.fooddietapplication.ui.home.HomeFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private AppBarConfiguration mAppBarConfiguration;
    private DrawerLayout drawerLayout;
    private HomeHorAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout=findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        recyclerView =findViewById(R.id.home_hor_rec);
        adapter = new HomeHorAdapter(this, new ArrayList<HomeHorModel>());
        recyclerView.setAdapter(adapter);

        navigationView.setCheckedItem(R.id.nav_home);
    }

    // Passing each menu ID as a set of Ids because each
    // menu should be considered as top level destinations.

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                break;
            case R.id.nav_daily_meal:
                Intent intent = new Intent(MainActivity.this, DailyMealFragment.class);
                startActivity(intent);
                break;
            case R.id.nav_favourite:
                Intent intentFav = new Intent(MainActivity.this, FavouriteFragment.class);
                startActivity(intentFav);
                break;
            case R.id.nav_meals:
                Intent intentMeal = new Intent(MainActivity.this, MealFragment.class);
                startActivity(intentMeal);
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}