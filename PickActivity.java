package com.example.sms_13033;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PickActivity extends AppCompatActivity {
private Button bt1,bt2,bt3,bt4,bt5,bt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ActivityCompat.requestPermissions(PickActivity.this,new String[]{Manifest.permission.SEND_SMS}, PackageManager.PERMISSION_GRANTED);

        SharedPreferences sp= getApplicationContext().getSharedPreferences("UserPrefs", Context.MODE_PRIVATE);
        String name=sp.getString("name","");
        String address=sp.getString("address","");
        String number="13033";
        bt1=(Button)findViewById(R.id.button1);
        bt2=(Button)findViewById(R.id.button2);
        bt3=(Button)findViewById(R.id.button3);
        bt4=(Button)findViewById(R.id.button4);
        bt5=(Button)findViewById(R.id.button5);
        bt6=(Button)findViewById(R.id.button6);



        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String message="1 "+name+" "+address;
            SmsManager myManager=SmsManager.getDefault();
            myManager.sendTextMessage(number,null,message,null,null);
            Toast.makeText(PickActivity.this,"лгмула естакг",Toast.LENGTH_LONG).show();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message="2 "+name+" "+address;
                SmsManager myManager=SmsManager.getDefault();
                myManager.sendTextMessage(number,null,message,null,null);
                Toast.makeText(PickActivity.this,"лгмула естакг",Toast.LENGTH_LONG).show();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message="3 "+name+" "+address;
                SmsManager myManager=SmsManager.getDefault();
                myManager.sendTextMessage(number,null,message,null,null);
                Toast.makeText(PickActivity.this,"лгмула естакг",Toast.LENGTH_LONG).show();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message="4 "+name+" "+address;
                SmsManager myManager=SmsManager.getDefault();
                myManager.sendTextMessage(number,null,message,null,null);
                Toast.makeText(PickActivity.this,"лгмула естакг",Toast.LENGTH_LONG).show();
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message="5 "+name+" "+address;
                SmsManager myManager=SmsManager.getDefault();
                myManager.sendTextMessage(number,null,message,null,null);
                Toast.makeText(PickActivity.this,"лгмула естакг",Toast.LENGTH_LONG).show();
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message="6 "+name+" "+address;
                SmsManager myManager=SmsManager.getDefault();
                myManager.sendTextMessage(number,null,message,null,null);
                Toast.makeText(PickActivity.this,"лгмула естакг",Toast.LENGTH_LONG).show();
            }
        });
    }

}
