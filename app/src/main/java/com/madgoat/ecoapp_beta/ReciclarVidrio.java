package com.madgoat.ecoapp_beta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ReciclarVidrio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciclar_vidrio);
    }

    public void volverHome(View view){
        finish();
    }
}
