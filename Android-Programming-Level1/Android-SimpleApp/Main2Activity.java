package com.example.jonathanmoreno.simpleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {



    TextView namePlaceHolder ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        namePlaceHolder = (TextView)findViewById(R.id.textView3);

        String fullName = getIntent().getStringExtra("yourName");
        namePlaceHolder.setText(fullName);


    }
}
