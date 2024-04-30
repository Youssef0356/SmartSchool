package com.example.smartschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Attendance extends AppCompatActivity {
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        // Initialize the back button
        back = findViewById(R.id.backattendance);

        // Set OnClickListener for the back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to navigate back to MainActivity
                Intent intent = new Intent(Attendance.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
