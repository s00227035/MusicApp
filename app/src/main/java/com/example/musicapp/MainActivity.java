package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TOAST MESSAGES ON BUTTONS
        Button btnHipHop = (Button) findViewById(R.id.buttonHipHop);
        btnHipHop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "You selected Hip Hop", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnPop = (Button) findViewById(R.id.buttonPop);
        btnPop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "You selected Pop", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnRock = (Button) findViewById(R.id.buttonRock);
        btnRock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "You selected Rock", Toast.LENGTH_SHORT).show();
            }
        });
    }
}