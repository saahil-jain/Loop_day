package com.example.loopday_watch;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    Button button2;
    Button buttonout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = (Button) findViewById(R.id.b2);
        buttonout = (Button) findViewById(R.id.bout);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity2();
            }
        });
        buttonout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivityout();
            }
        });

//         Enables Always-on
        setAmbientEnabled();
    }
    public void openNewActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
    public void openNewActivityout(){
        finish();
    }
}
