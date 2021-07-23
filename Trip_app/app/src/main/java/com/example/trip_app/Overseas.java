package com.example.trip_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;


public class Overseas extends AppCompatActivity {

    Button search, cancel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overseas);

        String[] continent = {"아시아", "북아메리카", "유럽", "남아메리카", "아프리카", "오세아니아"};
        String[] nAmericaCountry = {"미국", "캐나다", "멕시코"};

        search = (Button)findViewById(R.id.search);
        cancel = (Button)findViewById(R.id.cancel);

        AutoCompleteTextView Continent = (AutoCompleteTextView) findViewById(R.id.continent);
        AutoCompleteTextView Country = (AutoCompleteTextView) findViewById(R.id.country);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,continent);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,nAmericaCountry);
        Continent.setAdapter(adapter1);
        Country.setAdapter(adapter2);


        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Continent.getText().toString().equals("북아메리카") && Country.getText().toString().equals("미국")){
                    Intent intent = new Intent(getApplicationContext(), USA.class);
                    startActivity(intent);
                }
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Continent.setText("");
                Country.setText("");
                Continent.requestFocus();
            }
        });
    }
}