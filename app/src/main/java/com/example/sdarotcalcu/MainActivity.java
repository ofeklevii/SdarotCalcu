package com.example.sdarotcalcu;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Switch sw;
    ListView lv;
    EditText eTNum, eTDiff;
    TextView tVDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
            lv = findViewById(R.id.lv);
            sw = findViewById(R.id.sw);
            eTDiff = findViewById(R.id.eTDiff);
            eTNum = findViewById(R.id.eTNum);
            tVDisplay = findViewById(R.id.tVDisplay);

        });
    }

    public void display(View view) {
    }
}