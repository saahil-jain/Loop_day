package com.example.loopday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {

    Button button2;
    Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button2 = (Button) findViewById(R.id.b2);
        button5 = (Button) findViewById(R.id.b5);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity2();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity5();
            }
        });
    }
    public void openNewActivity2(){
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }
    public void openNewActivity5(){
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }
}