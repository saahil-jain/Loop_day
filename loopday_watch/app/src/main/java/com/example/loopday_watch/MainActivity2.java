package com.example.loopday_watch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends WearableActivity {

    ImageView button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button1 = (ImageView) findViewById(R.id.b1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity1();
            }
        });
    }
    public void openNewActivity1() {
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
        finish();
    }
}