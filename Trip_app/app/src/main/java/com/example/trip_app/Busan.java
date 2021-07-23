package com.example.trip_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Busan extends AppCompatActivity {
    ImageView kam, tae;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busan);
        kam = (ImageView)findViewById(R.id.kam);
        tae = (ImageView)findViewById(R.id.taeJong);

        kam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KamCheon.class);
                startActivity(intent);
            }
        });

        tae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TaeJong.class);
                startActivity(intent);
            }
        });
    }
}