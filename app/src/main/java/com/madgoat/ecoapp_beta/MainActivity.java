package com.madgoat.ecoapp_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirRegiones(View view){
        Intent abriregion = new Intent(this, MapsActivity.class );
        startActivity(abriregion);
    }

    public void abrirAcercaDe(View view){
        Intent abriacerca = new Intent(this, Acerca_de.class );
        startActivity(abriacerca);
    }

    public void abrirReciclajeCreativo(View view){
        Intent abrirReciclaje = new Intent(this, ReciclajeCreativo.class );
        startActivity(abrirReciclaje);
    }

    public void abrirReciclar(View view){
        Intent abrirReciclaje = new Intent(this, ComoReciclar.class );
        startActivity(abrirReciclaje);
    }

    // Menu Funcion

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
