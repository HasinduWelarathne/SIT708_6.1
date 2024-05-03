package com.example.personalearn;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.personalearn.R;

public class MainActivity extends AppCompatActivity {

    TextView textViewName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        textViewName = findViewById(R.id.text_view_name);

        // Retrieve data from Intent
        String name = getIntent().getStringExtra("Name");

        // Update TextView with the retrieved name
        textViewName.setText(name);
    }
}
