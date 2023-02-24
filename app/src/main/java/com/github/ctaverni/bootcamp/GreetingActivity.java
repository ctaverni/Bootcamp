package com.github.ctaverni.bootcamp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GreetingActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greeting);

        textView = findViewById(R.id.greetingMessage);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("mainName");
            textView.setText("Hi " + name + "!");
        }
    }

}