package com.example.punnit.online_examination;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class spalsh extends AppCompatActivity {
    TextView tv1,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);
        tv1=findViewById(R.id.textView2);
        tv2=findViewById(R.id.textView3);
        Thread th=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);

                }catch (Exception e){}
                Intent i=new Intent(spalsh.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        th.start();
        YoYo.with(Techniques.FlipInY).duration(4000).playOn(tv1);
        YoYo.with(Techniques.FlipInX).duration(4000).playOn(tv2);
    }
}
