package com.example.minwo.class_3c;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class CallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        String message = getIntent().getStringExtra("message");
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
