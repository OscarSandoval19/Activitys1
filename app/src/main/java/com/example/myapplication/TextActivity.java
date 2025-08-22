package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class TextActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);

        Button bm1 = findViewById(R.id.bm1);
        bm1.setOnClickListener(v -> {
            Intent intent = new Intent(TextActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // opcional, cierra esta actividad
        });
    }
}
