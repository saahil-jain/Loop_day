package com.example.loopday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button button3;
    Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button3 = (Button) findViewById(R.id.b3);
        button4 = (Button) findViewById(R.id.b4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity3();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity4();
            }
        });
    }
    public void openNewActivity3(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
    public void openNewActivity4(){
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}