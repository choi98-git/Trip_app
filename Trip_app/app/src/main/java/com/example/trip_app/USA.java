package com.example.trip_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class USA extends AppCompatActivity {
    ImageView canyon, las;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u_s);

        canyon = (ImageView)findViewById(R.id.canyon);
        las = (ImageView) findViewById(R.id.las);

        canyon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GrandCanyon.class);
                startActivity(intent);
            }
        });

        las.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LasVegas.class);
                startActivity(intent);
            }
        });
    }
}