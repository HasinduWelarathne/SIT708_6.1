package com.example.personalearn;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.personalearn.R;

public class MainActivity extends AppCompatActivity {

    TextView smallTask;
    Button startQuizButton; // Added button reference
    int categoryId; // Added categoryId variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        smallTask = findViewById(R.id.smallTask);
        startQuizButton = findViewById(R.id.main_start); // Initialize button

        // Retrieve data from Intent
        String name = getIntent().getStringExtra("Name");
        categoryId = getIntent().getIntExtra("CategoryID", -1); // Retrieve category ID

        // Update TextView with the retrieved name
        smallTask.setText(name);

        // Set OnClickListener for the start quiz button
        startQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create intent to navigate to QuizScreen and pass the category ID
                Intent intent = new Intent(MainActivity.this, QuizScreen.class);
                intent.putExtra("CategoryID", categoryId);
                startActivity(intent);
            }
        });
    }
}