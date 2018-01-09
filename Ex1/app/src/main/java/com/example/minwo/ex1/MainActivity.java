package com.example.minwo.ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    Button button;
    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        imageView1 = (ImageView) findViewById(R.id.iv_1);
//        imageView2 = (ImageView) findViewById(R.id.iv_2);
//        button = (Button) findViewById(R.id.btn);
    }

//    public void click_click(View v){
//        if(index == 0){
//            imageView1.setVisibility(View.INVISIBLE);
//            imageView2.setVisibility(View.VISIBLE);
//            index = 1;
//        }else{
//            imageView1.setVisibility(View.VISIBLE);
//            imageView2.setVisibility(View.INVISIBLE);
//            index = 0;
//        }
//    }

}
