package com.madgoat.ecoapp_beta;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class ReciclajeCreativo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciclaje_creativo);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

    public void volverHome(View view){
        finish();
    }

    //  Menu

    @Override
    public boolean onCreateOptionsMenu(Menu menus) {
        getMenuInflater().inflate(R.menu.menu,menus);
        return super.onCreateOptionsMenu(menus);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if(id==R.id.help){
            Toast.makeText(this,"Ayuda", Toast.LENGTH_SHORT).show();
            Intent abriayudahome = new Intent(this, AyudaReciclaje.class );
            startActivity(abriayudahome);
        }

        return super.onOptionsItemSelected(item);
    }



    //AbrirReciclajeCreativo

    public void abrirMacetero(View view){
        Intent maceter = new Intent(this, Macetero.class );
        startActivity(maceter);
    }



}
