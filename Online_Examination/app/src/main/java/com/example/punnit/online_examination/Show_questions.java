package com.example.punnit.online_examination;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Show_questions extends AppCompatActivity {
    Button next;
    CheckBox c1,c2,c3,c4;
    TextView q;
    MyUserDb obj;
    int totalrow=0;
    int  frrow=0;
    float marks=0,percentage=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_questions);
        obj=new MyUserDb(this);
        next=findViewById(R.id.next);

        c1=findViewById(R.id.checkBox2);
        c2=findViewById(R.id.checkBox3);
        c3=findViewById(R.id.checkBox4);
        c4=findViewById(R.id.checkBox5);
        q=findViewById(R.id.q);
        next.setEnabled(false);
        obj=new MyUserDb(this);
        Intent rc=getIntent();
        String r=rc.getStringExtra("k1");
        try {
            final Cursor newobj = obj.Select_Question(r);
            totalrow=newobj.getCount();
            frrow++;
            q.setText(newobj.getString(1));
            c1.setText(newobj.getString(2));
            c2.setText(newobj.getString(3));
            c3.setText(newobj.getString(4));
            c4.setText(newobj.getString(5));}catch (Exception e){}
    }
}
