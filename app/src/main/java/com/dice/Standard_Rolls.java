package com.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Standard_Rolls extends AppCompatActivity {
    Button dice, coin, d4, d8, d10, d12, d20, d100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_rolls);

        dice = findViewById(R.id.dice);
        coin = findViewById(R.id.coin);
        d4 = findViewById(R.id.d4);
        d8 = findViewById(R.id.d8);
        d10 = findViewById(R.id.d10);
        d12 = findViewById(R.id.d12);
        d20 = findViewById(R.id.d20);
        d100 = findViewById(R.id.d100);

        Intent i = new Intent(Standard_Rolls.this, StandardRoller.class);

        dice.setOnClickListener(v -> {
            i.putExtra("button_pressed", "dice");
            startActivity(i);
        });

        coin.setOnClickListener(v -> {
            i.putExtra("button_pressed", "coin");
            startActivity(i);
        });

        d4.setOnClickListener(v -> {
            i.putExtra("button_pressed", "d4");
            startActivity(i);
        });

        d8.setOnClickListener(v -> {
            i.putExtra("button_pressed", "d8");
            startActivity(i);
        });

        d10.setOnClickListener(v -> {
            i.putExtra("button_pressed", "d10");
            startActivity(i);
        });

        d12.setOnClickListener(v -> {
            i.putExtra("button_pressed", "d12");
            startActivity(i);
        });

        d20.setOnClickListener(v -> {
            i.putExtra("button_pressed", "d20");
            startActivity(i);
        });

        d100.setOnClickListener(v -> {
            i.putExtra("button_pressed", "d100");
            startActivity(i);
        });
    }
}