package com.example.smartschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {
    private Button Assignment;
    private Button TimeTable;
    private Button logout;
    private Button attendance;
    private Button classroom;
    private Button comingsoon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Assignment=findViewById(R.id.assignment);
        TimeTable = findViewById(R.id.timetable);
        classroom = findViewById(R.id.classroom);
        attendance = findViewById(R.id.attendance);
        comingsoon = findViewById(R.id.exams);
        attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start Attendance activity
                Intent intent = new Intent(MainActivity.this, Attendance.class);
                startActivity(intent);
            }
        });
        comingsoon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent intent = new Intent(MainActivity.this , comingsoon.class);
                startActivity(intent);
            }
        });
        logout = findViewById(R.id.logout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start Attendance activity
                Intent intent = new Intent(MainActivity.this, login.class);
                startActivity(intent);
            }
        });
        Assignment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start Attendance activity
                Intent intent = new Intent(MainActivity.this, comingsoon.class);
                startActivity(intent);
            }
        });
        TimeTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent to start Attendance activity
                Intent intent = new Intent(MainActivity.this, comingsoon.class);
                startActivity(intent);
            }
        });
        // Set OnClickListener for the classroom button
        classroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://classroom.google.com/"; // Replace this with your classroom URL
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
}
