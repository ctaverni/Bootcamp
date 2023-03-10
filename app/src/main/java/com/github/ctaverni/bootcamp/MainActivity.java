package com.github.ctaverni.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.mainName);
    }

    public void goToGreetingActivity(View view) {
        Intent intent = new Intent(this, GreetingActivity.class);
        intent.putExtra("mainName", textView.getText().toString());
        startActivity(intent);
    }
}