package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WidgetsActivity1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets1);

        Button bm3 = findViewById(R.id.bm3);
        bm3.setOnClickListener(v -> {
            Intent intent = new Intent(WidgetsActivity1.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
