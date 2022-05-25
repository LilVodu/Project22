package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActionLine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);
        Button button6 = findViewById(R.id.cord6);
        Button button8 = findViewById(R.id.cord8);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                line6();

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           line8();
            }
        });




    }
    public void line6(){
        Intent intent = new Intent(this, ActivityLine6.class);
        startActivity(intent);
    }
    public void line8(){
        Intent intent = new Intent(this, ActivityLine8.class);
        startActivity(intent);
    }
}