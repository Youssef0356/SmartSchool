package com.example.smartschool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.widget.TextView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;

public class login extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);


        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        Button loginButton = (Button) findViewById(R.id.loginButton);
        TextView signup = (TextView) findViewById(R.id.signupText);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Your action when the TextView is clicked
                // For example, you can start a new activity
                Intent intent = new Intent(login.this, sign_up.class);
                startActivity(intent);
            }
        });
        TextView signupButton = findViewById(R.id.loginButton);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Perform sign up process here
                // Show sign up successful message
                Intent intent = new Intent(login.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }}