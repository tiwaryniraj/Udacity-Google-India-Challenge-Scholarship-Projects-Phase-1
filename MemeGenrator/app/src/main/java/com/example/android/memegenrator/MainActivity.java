package com.example.android.memegenrator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.click);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText text = findViewById(R.id.firstText);
                String str = text.getText().toString();
                EditText textSecond = findViewById(R.id.secondText);
                String str2 = textSecond.getText().toString();
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("top",str);
                intent.putExtra("bottom",str2);
                startActivity(intent);

            }
        });

    }



}
