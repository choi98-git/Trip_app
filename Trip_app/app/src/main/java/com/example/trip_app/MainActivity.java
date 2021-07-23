package com.example.trip_app;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    CheckBox domestic, overseas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        domestic = (CheckBox)findViewById(R.id.domestic);
        overseas = (CheckBox)findViewById(R.id.overseas);

        domestic.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(domestic.isChecked() == true);
                domestic.setChecked(false);
                Intent intent = new Intent(getApplicationContext(), Domestic.class);
                startActivity(intent);
            }
        });

        overseas.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(overseas.isChecked() == true);
                overseas.setChecked(false);
                Intent intent = new Intent(getApplicationContext(), Overseas.class);
                startActivity(intent);
            }
        });
    }
}