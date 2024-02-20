package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class easy extends AppCompatActivity {

    TextView easy;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        easy = findViewById(R.id.easy);
        btn   = findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new CountDownTimer(60000,1000)
                {

                    @Override
                    public void onTick(long millisUntilFinished) {
                        easy.setText(""+millisUntilFinished/1000);

                    }

                    @Override
                    public void onFinish() {

                        Intent intent = new Intent(getApplicationContext(), Easyyoga.class);
                        startActivity(intent);

                    }
                }.start();
            }
        });

    }
}