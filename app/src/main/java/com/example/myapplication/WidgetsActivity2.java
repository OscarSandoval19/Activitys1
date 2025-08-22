package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WidgetsActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets2);

        Button bm4 = findViewById(R.id.bm4);
        bm4.setOnClickListener(v -> {
            Intent intent = new Intent(WidgetsActivity2.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
