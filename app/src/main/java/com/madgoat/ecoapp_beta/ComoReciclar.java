package com.madgoat.ecoapp_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
}
