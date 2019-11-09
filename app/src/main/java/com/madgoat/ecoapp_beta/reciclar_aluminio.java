package com.madgoat.ecoapp_beta;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class reciclar_aluminio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciclar_aluminio);
    }

    public void volverHome(View view){
        finish();
    }
}
