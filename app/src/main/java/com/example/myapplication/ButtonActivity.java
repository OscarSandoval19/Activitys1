package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ButtonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        Button bm2 = findViewById(R.id.bm2);
        bm2.setOnClickListener(v -> {
            Intent intent = new Intent(ButtonActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
