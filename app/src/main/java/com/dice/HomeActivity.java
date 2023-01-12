package com.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btn_Standard_Rolls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_Standard_Rolls = findViewById(R.id.btn_std_roll);

        btn_Standard_Rolls.setOnClickListener(v -> {
            Intent i = new Intent(HomeActivity.this, Standard_Rolls.class);
            startActivity(i);
        });
    }

}