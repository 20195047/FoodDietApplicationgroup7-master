package com.health.fooddietapplication.activities;

import static com.health.fooddietapplication.R.id.toolbar;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;
import com.health.fooddietapplication.R;

import pl.droidsonroids.gif.GifImageButton;

public class DailyMealFragment extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private AppBarConfiguration mAppBarConfiguration;
    private DrawerLayout drawerLayout;
    Toolbar toolbar;

    GifImageButton gifImageButton1, gifImageButton2, gifImageButton3;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daily_meal_fragment);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout=findViewById(R.id.drawer_layoutDaily);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        navigationView.setCheckedItem(R.id.nav_daily_meal);

        builder = new AlertDialog.Builder(this);
        gifImageButton1 = findViewById(R.id.running);
        gifImageButton2 = findViewById(R.id.pushUp);
        gifImageButton3 = findViewById(R.id.jumpingJacks);


        gifImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGifbutton1();
            }
        });
        gifImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGifbutton2();
            }
        });
        gifImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGifbutton3();
            }
        });

        infoDialog();
    }

    public void infoDialog(){
        builder.setTitle("INFO")
                .setMessage("Click the Image for more Information")
                .setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                })
                .show();
    }

    //-----------------------------Gif Button---------------------------------//
    public void openGifbutton1(){
        GifDialog1 gifDialog1 = new GifDialog1();
        gifDialog1.show(getSupportFragmentManager(), "Running In Place");

    }
    public void openGifbutton2(){
        GifDialog2 gifDialog2 = new GifDialog2();
        gifDialog2.show(getSupportFragmentManager(), "Push-Ups");
    }
    public void openGifbutton3(){
        GifDialog3 gifDialog3 = new GifDialog3();
        gifDialog3.show(getSupportFragmentManager(), "Jumping Jacks");
    }


    //-----------------------------------------------------------------------//

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
                Intent intentHome = new Intent(DailyMealFragment.this, MainActivity.class);
                startActivity(intentHome);
                break;
            case R.id.nav_daily_meal:
                break;
            case R.id.nav_favourite:
                Intent intentFav = new Intent(DailyMealFragment.this, FavouriteFragment.class);
                startActivity(intentFav);
                break;
            case R.id.nav_meals:
                Intent intentMeal = new Intent(DailyMealFragment.this, MealFragment.class);
                startActivity(intentMeal);
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}
