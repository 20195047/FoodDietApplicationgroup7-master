package com.health.fooddietapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.health.fooddietapplication.R;

public class FavouriteFragment extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout drawerLayout;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favourite_fragment);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout=findViewById(R.id.drawerFav);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setCheckedItem(R.id.nav_favourite);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                Intent intentHome = new Intent(FavouriteFragment.this, MainActivity.class);
                startActivity(intentHome);
                break;
            case R.id.nav_daily_meal:
                Intent intentDail = new Intent(FavouriteFragment.this, DailyMealFragment.class);
                startActivity(intentDail);
                break;
            case R.id.nav_favourite:
                break;
            case R.id.nav_meals:
                Intent intentMeal = new Intent(FavouriteFragment.this, MealFragment.class);
                startActivity(intentMeal);
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
