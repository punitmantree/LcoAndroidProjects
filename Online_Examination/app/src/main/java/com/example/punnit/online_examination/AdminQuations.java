package com.example.punnit.online_examination;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AdminQuations extends AppCompatActivity {
    EditText que, optA, optB, optC, optD, ans;
    Button add, submit;
    RadioButton rb;
    RadioGroup rg;
    MyUserDb obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_quations);
        que = findViewById(R.id.question);
        optA = findViewById(R.id.a);
        optB = findViewById(R.id.b);
        optC = findViewById(R.id.c);
        optD = findViewById(R.id.d);
        ans = findViewById(R.id.answer);
        rg = (RadioGroup)findViewById(R.id.rgq);
        add = findViewById(R.id.ad);
        submit = findViewById(R.id.sub);

        obj = new MyUserDb(this);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdminQuations.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int idd =rg.getCheckedRadioButtonId();
                rb = (RadioButton) findViewById(idd);
                String Sub = rb.getText().toString();
                obj.Add_Que(que.getText().toString(),optA.getText().toString(), optB.getText().toString(), optC.getText().toString(), optD.getText().toString(), ans.getText().toString(),Sub);
                Toast.makeText(AdminQuations.this, "Add Successfully", Toast.LENGTH_SHORT).show();
                cln();
            }
        });
    }

    public void cln() {
        que.setText(null);
        que.requestFocus();
        optA.setText(null);
        optB.setText(null);
        optC.setText(null);
        optD.setText(null);
        ans.setText(null);
    }
}
