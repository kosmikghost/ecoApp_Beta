package com.madgoat.ecoapp_beta;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ComoReciclar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_como_reciclar);
    }

    public void plasticos(View view){
        Intent plasticos = new Intent(this, ReciclarPlasticos.class );
        startActivity(plasticos);
    }

    public void vidrios(View view){
        Intent plasticos = new Intent(this, ReciclarVidrio.class );
        startActivity(plasticos);
    }

    public void papeles(View view){
        Intent plasticos = new Intent(this, ReciclarPapeles.class );
        startActivity(plasticos);
    }

    public void chatarra(View view){
        Intent plasticos = new Intent(this, reciclar_chatarra.class );
        startActivity(plasticos);
    }

    public void aluminio(View view){
        Intent plasticos = new Intent(this, reciclar_aluminio.class );
        startActivity(plasticos);
    }

    public void pilas(View view){
        Intent plasticos = new Intent(this, reciclar_pilasytapas.class );
        startActivity(plasticos);
    }

    public void volverHome(View view){
        finish();
    }
}
