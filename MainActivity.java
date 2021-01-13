package com.example.sms_13033;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText nameEdit, addressEdit;
    private Button saveButton;
    private SharedPreferences sp;
    private SharedPreferences.Editor editor;
    private Button activityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEdit = (EditText) findViewById(R.id.etName);
        addressEdit = (EditText) findViewById(R.id.etAddress);
        saveButton = (Button) findViewById(R.id.buttonSave);
        activityButton = (Button) findViewById(R.id.buttonActivity);

        sp = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE);
        editor = sp.edit();
        checkPrefs();
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nameStr = nameEdit.getText().toString();
                editor.putString("name", nameStr);
                editor.commit();
                String addressStr = addressEdit.getText().toString();
                editor.putString("address", addressStr);
                editor.commit();
                Toast.makeText(MainActivity.this, "¡–œ»« ≈’‘« ≈", Toast.LENGTH_LONG).show();
            }

        });

        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PickActivity.class);
                startActivity(intent);
            }
        });
    }
        private void checkPrefs ()
        {
            String name = sp.getString("name", "");
            String address = sp.getString("address", "");
            nameEdit.setText(name);
            addressEdit.setText(address);
        }

    }

