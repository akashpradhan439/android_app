package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        setInvisible(findViewById(R.id.button7));
        findViewById(R.id.button2).setEnabled(false);
    }
    private String name;
    private String Sign;
    private int Fn;
    private int Sib;
    private boolean check = false;


    private void setInvisible(View v){
        v.setVisibility(View.INVISIBLE);
    }


    public void openActivity2(View view) {
        if(!check){
            check(findViewById(R.id.button7));
        }else {
            Intent intent = new Intent(this, MainActivity2.class);
            intent.putExtra("Name1", this.name);
            intent.putExtra("Sign1", this.Sign);
            intent.putExtra("Sib1", this.Sib);
            startActivity(intent);
        }
    }
    public void check(View view){
        if(!check )
            view.setVisibility(View.VISIBLE);
        else
            view.setVisibility(View.INVISIBLE);
    }
    public boolean isName = false;
    public boolean isNum = false;
    private boolean isSign = false;
    private boolean isSib = false;

    public void onClick(View v){
        if(findViewById(R.id.name) == v) isName = true;
        if(findViewById(R.id.fn)== v) isNum = true;
        if(findViewById(R.id.sign) == v) isSign = true;
        if(findViewById(R.id.sib) == v) isSib = true;
        if(isNum && isName && isSign && isSib) findViewById(R.id.button2).setEnabled(true);
    }
    public void submit(View v){

        this.check = true;
        check(findViewById(R.id.button7));
        v.setEnabled(false);

        EditText name1 = findViewById(R.id.name);
        EditText sign1 = findViewById(R.id.sign);
        EditText fn1 = findViewById(R.id.fn);
        EditText sib1 = findViewById(R.id.sib);
        this.name = name1.getText().toString();
        this.Sib = Integer.parseInt(sib1.getText().toString());
        this.Fn = (Integer.parseInt(fn1.getText().toString()));
        this.Sign = sign1.getText().toString();


        ((Button)v).setText("submitted");
    }


}