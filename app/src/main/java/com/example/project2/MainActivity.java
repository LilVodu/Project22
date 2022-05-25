package com.example.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonTreug = findViewById(R.id.buttonTreug);
        Button buttonVec = findViewById(R.id.buttonVec);
        Button buttonPoint = findViewById(R.id.buttonPoint);
        Button buttonLine = findViewById(R.id.buttonLine);


        buttonLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ddd1();
            }
        });


        buttonVec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ddd2();
            }
        });


        buttonTreug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ddd3();
            }
        });



        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ddd4();
            }
        });
    }









    public void ddd1(){
        Intent intent = new Intent(this, ActionLine.class);
        startActivity(intent);
    }
    public void ddd2(){
        Intent intent = new Intent(this, ActionVec.class);
        startActivity(intent);
    }public void ddd3(){
        Intent intent = new Intent(this, ActionTreug.class);
        startActivity(intent);
    }public void ddd4(){
        Intent intent = new Intent(this,ActionPoint.class);
        startActivity(intent);
    }
            }
