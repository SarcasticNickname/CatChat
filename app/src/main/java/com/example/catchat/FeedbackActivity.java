package com.example.catchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class FeedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        // Setting toolbar
        Toolbar toolbar = findViewById(R.id.feedback_toolbar);
        setSupportActionBar(toolbar);
    }
}