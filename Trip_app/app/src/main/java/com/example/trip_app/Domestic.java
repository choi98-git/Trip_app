package com.example.trip_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class Domestic extends AppCompatActivity{

    Button search, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_domestic);

        String[] local = {"서울", "경기도", "충청도", "경상도", "강원도", "전라도", "제주도"};
        String[] city = {"부산", "대구", "울산", "경주", "포항"};
        search = (Button)findViewById(R.id.search);
        cancel = (Button)findViewById(R.id.cancel);

        AutoCompleteTextView Local = (AutoCompleteTextView) findViewById(R.id.local);
        AutoCompleteTextView City = (AutoCompleteTextView) findViewById(R.id.city);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,local);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,city);

        Local.setAdapter(adapter1);
        City.setAdapter(adapter2);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Local.getText().toString().equals("경상도") && City.getText().toString().equals("부산")){
                    Intent intent = new Intent(getApplicationContext(), Busan.class);
                    startActivity(intent);
                }
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Local.setText("");
                City.setText("");
                Local.requestFocus();
            }
        });
    }
}