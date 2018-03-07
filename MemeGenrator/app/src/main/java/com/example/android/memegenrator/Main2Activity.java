package com.example.android.memegenrator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView topText = findViewById(R.id.topLine);
        TextView bottomText = findViewById(R.id.bottomLine);

        Intent intent = getIntent();
        String topL = intent.getStringExtra("top");
        topText.setText(topL);

        String botL = intent.getStringExtra("bottom");
        bottomText.setText(botL);


    }




}
