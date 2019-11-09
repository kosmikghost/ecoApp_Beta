package com.madgoat.ecoapp_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Regiones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regiones);
    }

    public void mapaSantiago(View view){
        Intent santiago = new Intent(this,MapsActivity.class);
        startActivity(santiago);
    }

    public void mapaValparaiso(View view){
        Intent valparaiso = new Intent(this,ValparaisoActivity.class);
        startActivity(valparaiso);
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
            Intent abriayudahome = new Intent(this, ayudaMapa.class );
            startActivity(abriayudahome);
        }

        return super.onOptionsItemSelected(item);
    }
}
