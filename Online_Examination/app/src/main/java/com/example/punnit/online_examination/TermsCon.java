package com.example.punnit.online_examination;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TermsCon extends AppCompatActivity {
    Button accept;
    RadioGroup radioGroup;
    RadioButton r1,r2,r3;
    CheckBox c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_con);
        accept=findViewById(R.id.acceptbutton);
        radioGroup=findViewById(R.id.rdgp);
        c1=findViewById(R.id.checkBox);
        r1=findViewById(R.id.radioButton1);
        r2=findViewById(R.id.radioButton2);
        r3=findViewById(R.id.radioButton3);
        String t;
        accept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c1.isChecked()){
                    if (r1.isChecked()){
                        String id=r1.getTag().toString();
                        Intent i=new Intent(TermsCon.this,Show_questions.class);
                        i.putExtra("k1",id);
                        startActivity(i);
                    }else if (r2.isChecked()){
                        String id=r2.getTag().toString();
                        Intent i=new Intent(TermsCon.this,Show_questions.class);
                        i.putExtra("k1",id);
                        startActivity(i);
                    }else if (r3.isChecked()){
                        String id=r3.getTag().toString();
                        Intent i=new Intent(TermsCon.this,Show_questions.class);
                        i.putExtra("k1",id);
                        startActivity(i);
                    }
                }else
                {
                    Toast.makeText(TermsCon.this, "Accept T&C", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
