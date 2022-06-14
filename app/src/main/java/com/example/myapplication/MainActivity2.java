package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent in = getIntent();
        String name2 = in.getStringExtra("Name1");
        int sib2 = Integer.parseInt(in.getStringExtra("Sib1"));
        String sign2 = in.getStringExtra("Sign1");
        ((TextView)findViewById(R.id.name3)).setText(("Your name is " + name2));
        ((TextView)findViewById(R.id.sign3)).setText(("Your zodiac sign is " + sign2));
        ((TextView)findViewById(R.id.sibling)).setText(("Your have " + sib2 + " siblings"));
    }
    public void back(View v)
    {
        finish();
    }
}