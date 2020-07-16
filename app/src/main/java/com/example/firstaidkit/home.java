package com.example.firstaidkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    private Button Btnmove;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Btnmove=(Button)findViewById(R.id.btn);
        button1=(Button)findViewById(R.id.btn1);
        button2=(Button)findViewById(R.id.btn2);
        button3=(Button)findViewById(R.id.btn3);
        button4=(Button)findViewById(R.id.btn4);
        button5=(Button)findViewById(R.id.btn5);
        Btnmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityTow();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityThree();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityFour();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityThree();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityFour();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToActivityFour();
            }
        });

    }
    public void moveToActivityTow(){
        Intent intent1=new Intent(this,cpr.class);
        startActivity(intent1);
    }
    public void moveToActivityThree(){
        Intent intent2=new Intent(this,bites.class);
        startActivity(intent2);
    }
    public void moveToActivityFour(){
        Intent intent3=new Intent(this,heartattack.class);
        startActivity(intent3);
    }
    public void moveToActivityTow(){
        Intent intent4=new Intent(this,heat.class);
        startActivity(intent4);
    }
    public void moveToActivityThree(){
        Intent intent5=new Intent(this,nosebleed.class);
        startActivity(intent5);
    }
    public void moveToActivityFour(){
        Intent intent6=new Intent(this,poison.class);
        startActivity(intent6);
    }

}
