package com.example.punnit.jaipur_metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Find extends AppCompatActivity {
    TextView t1,t3,t4,t5,t6;
    String station[]={"Mansarovar","New Aatish Market","Vivek Vihar","Shyam Nagar","" +
            "Ram Nagar","Civil Lines","Railway Station","Sindhi Camp","Chand Pole","" +
            "Choti Chaupar","Badi Chaupar"};
    int distance[] = {3,3,3,3,3,3,3,3,3,3,3};
    int fare=2;
    int j,total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        t1=(TextView)findViewById(R.id.textView1);
        t3=(TextView)findViewById(R.id.textView3);
        t4=(TextView)findViewById(R.id.textView4);
        t5=(TextView)findViewById(R.id.textView5);
        t6=(TextView)findViewById(R.id.textView6);
        Intent i=getIntent();
        t1.setText(i.getStringExtra("From"));
        t3.setText(i.getStringExtra("to"));
        int f=List.f;
        int t=To_StationName.t;
        if(f<t) {
            for (j = f; j <= t; j++) {
                t6.append(station[j] + "\n");
            }
            for (j = f; j <= t; j++) {
                total += distance[j];
            }
            t4.setText("" + total);
            t5.setText("" + total * fare);
        }
        if(f>t) {
            for (j = f; j >= t; j--) {
                t6.append(station[j] + "\n");
            }
            for (j = f; j >= t; j--) {
                total += distance[j];
            }
            t4.setText("" + total);
            t5.setText("" + total * fare);
        }

    }
}
