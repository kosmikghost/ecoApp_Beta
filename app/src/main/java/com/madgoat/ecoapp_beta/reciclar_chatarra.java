package com.madgoat.ecoapp_beta;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class reciclar_chatarra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciclar_chatarra);
    }

    public void volverHome(View view){
        finish();
    }
}
