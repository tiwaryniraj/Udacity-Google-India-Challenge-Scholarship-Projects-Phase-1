package com.niraj.chatapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    EditText message;
    Button send1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final DatabaseReference myRef = database.getReference("message");

        message = findViewById(R.id.messageEditText);
        send1 = findViewById(R.id.sendButton);

        send1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg;
                if(message.getText()!= null){
                    msg = message.getText().toString();
                    MessageModel messageModel = new MessageModel(msg);
                    myRef.push().
                 }
            }
        });
    }
}
