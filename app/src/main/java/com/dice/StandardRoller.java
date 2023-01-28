package com.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.security.SecureRandom;

public class StandardRoller extends AppCompatActivity {
    Button roll;
    TextView number;
    SecureRandom random;
    int max_num, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_roller);

        Intent i = getIntent();
        String title = i.getStringExtra("button_pressed");
        setTitle(title);

        roll = findViewById(R.id.btn_roll);
        number = findViewById(R.id.number);
        random = new SecureRandom();

        roll.setOnClickListener(v -> {
            number.setText("");

            switch(title){
                case "coin": max_num = 2; break;
                case "d4": max_num = 4; break;
                case "dice": max_num = 6; break;
                case "d8": max_num = 8; break;
                case "d10": max_num = 10; break;
                case "d12": max_num = 12; break;
                case "d20": max_num = 20; break;
                case "d100": max_num = 100; break;
            }

            result = random.nextInt(max_num)+1;

            if(title.equals("coin")) {
                if(result == 1)
                    number.setText(R.string.head);
                else
                    number.setText(R.string.tails);

                return;
            }
            number.setText("" + result);
        });
    }
}