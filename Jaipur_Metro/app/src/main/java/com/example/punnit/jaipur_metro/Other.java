package com.example.punnit.jaipur_metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Other extends AppCompatActivity {
    Button about,parking,hospital,police;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        about=(Button)findViewById(R.id.about);
        parking=(Button)findViewById(R.id.parking);
        hospital=(Button)findViewById(R.id.hospital);
        police=(Button)findViewById(R.id.police);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Other.this,About.class);
                startActivity(i);
            }
        });
        parking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Other.this,Parking.class);
                startActivity(i);
            }
        });
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Other.this,List1.class);
                startActivity(i);
            }
        });
        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Other.this,List2.class);
                startActivity(i);
            }
        });

    }
}
