package com.madgoat.ecoapp_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class AyudaReciclaje extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda_reciclaje);
    }

    public void volverHome(View view){
        finish();
    }
}
