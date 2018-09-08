package com.example.punnit.jaipur_metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread th=new Thread(){
          public void run(){
              try{
                  sleep(4000);
              }catch (Exception y)
              {

              }finally {
                  Intent oj=new Intent(Splash.this,First.class);
                  startActivity(oj);

                  finish();

              }

          }

        };
        th.start();
    }
}
