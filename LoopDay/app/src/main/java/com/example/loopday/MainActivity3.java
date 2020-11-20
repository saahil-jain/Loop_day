package com.example.loopday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    Button button2_1;
    Button button2_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button2_1 = (Button) findViewById(R.id.b2_1);
        button2_2 = (Button) findViewById(R.id.b2_2);
        button2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity2();
            }
        });
        button2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity6();
            }
        });
    }
    public void openNewActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openNewActivity6(){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
}