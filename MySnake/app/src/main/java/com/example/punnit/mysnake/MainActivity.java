package com.example.punnit.mysnake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b;
    int[] myDices = {
            R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four,
            R.drawable.five,
            R.drawable.six


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random ran = new Random();
                int randomNumber = ran.nextInt(6);

                Log.i("Random", "Random number is " + randomNumber);

                ImageView dice = (ImageView) findViewById(R.id.dice);

                dice.setImageResource(myDices[randomNumber]);
            }
        });
    }
}
