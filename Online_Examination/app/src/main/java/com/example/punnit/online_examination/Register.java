package com.example.punnit.online_examination;

import android.Manifest;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    MyUserDb obj;
    EditText fname,lname,uname,pass,cpass;
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        obj=new MyUserDb(this);
        fname=findViewById(R.id.fn);
        lname=findViewById(R.id.ln);
        uname=findViewById(R.id.un);
        pass=findViewById(R.id.pas);
        cpass=findViewById(R.id.cpas);

        signup=findViewById(R.id.sigup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    obj.addRecord(fname.getText().toString()
                    ,lname.getText().toString(),uname.getText().toString()
                            ,pass.getText().toString());
                    cln();
                    Toast.makeText(Register.this, "Successful Register", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Register.this, MainActivity.class);
                    startActivity(i);
                }catch (Exception t)
                {
                    cln();
                    Toast.makeText(Register.this, "Error="+t, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public void cln(){
        fname.setText(null);
        fname.requestFocus();
        lname.setText(null);
        uname.setText(null);
        pass.setText(null);
        cpass.setText(null);
    }
}
