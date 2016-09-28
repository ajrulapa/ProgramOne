package com.example.gpcorser.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Course Grid button */
    public void showGrid(View view) {
        Intent intent = new Intent(this, CourseGridActivity.class);
        startActivity(intent);
    }

    /** Called when the user clicks the Faculty button */
    public void showFaculty(View view) {
        Intent intent = new Intent(this, FacultyActivity.class);
        startActivity(intent);
    }
}
