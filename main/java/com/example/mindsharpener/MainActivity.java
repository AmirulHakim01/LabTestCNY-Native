package com.example.mindsharpener;

import androidx.appcompat.app.AppCompatActivity;

import android.media.VolumeShaper;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
        TextView Operator,Num1,Num2,Ans ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Operator =findViewById(R.id.operator);
        Num1 = findViewById(R.id.number1);
        Num2 = findViewById(R.id.number2);
        Ans = findViewById(R.id.textInputAnswer);
    }

        void run_reset() {
            Random myRandom = new Random();

            int number1 = myRandom.nextInt(9);
            int number2 = myRandom.nextInt(9);

            Num1.setText("" + number1);
            Num2.setText("" + number2);

        }

        public void Check (View view){
        int number1 = Integer.parseInt(Num1.getText().toString());
        int number2 = Integer.parseInt(Num2.getText().toString());

        }



}