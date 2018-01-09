package com.example.minwo.class_4e;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.iv_like).setOnClickListener(this);
        findViewById(R.id.iv_share).setOnClickListener(this);
        findViewById(R.id.iv_photo).setOnTouchListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.iv_like:
                Toast.makeText(this, "i love twice", Toast.LENGTH_SHORT).show();
                break;
            case R.id.iv_share:
                Toast.makeText(this, "everyone tiwce", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()){
            case MotionEvent.ACTION_DOWN:
                Toast.makeText(this, "down tiwce", Toast.LENGTH_SHORT).show();
                break;
            case MotionEvent.ACTION_UP:
                Toast.makeText(this, "up tiwce", Toast.LENGTH_SHORT).show();
                break;
        }
        return false;
    }
}
