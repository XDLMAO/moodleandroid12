package vn.edu.usth.moodleandroid1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        Button login =(Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, Mainspace.class));
                }else
                    Toast.makeText(MainActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
            }

        });
    }

    public void openMain2(View view) {
        startActivity(new Intent(MainActivity.this, MainActivity2.class));
    }
}

//package com.example.mysignupapp;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.EditText;
//import android.widget.Toast;
//
//import com.google.android.material.button.MaterialButton;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        EditText username = (EditText) findViewById(R.id.username);
//
//        Button login =(Button) findViewById(R.id.login);
//
//        .setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String username1 = username.getText().toString();
//                Toast.makeText(MainActivity.this,"Username is"+username1,Toast.LENGTH_SHORT).show();
//            }
//        });
//
//    }
//}