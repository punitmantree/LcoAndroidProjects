package com.example.punnit.online_examination;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button login,register,admin;
    MyUserDb obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obj=new MyUserDb(this);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);
        register=(Button)findViewById(R.id.register);
        admin=(Button)findViewById(R.id.admin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String unm=username.getText().toString();
                String psd=password.getText().toString();
                String passwrd=obj.login(unm);
                try{if (psd.equals(passwrd)){
                    cln();
                    Intent i=new Intent(MainActivity.this,TermsCon.class);
                    startActivity(i);
                    Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_SHORT).show();
                }else {
                    cln();
                    Toast.makeText(MainActivity.this, "Enter currect Username & password", Toast.LENGTH_SHORT).show();
                }}catch (Exception e){}
            }

        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Register.class);
                startActivity(i);
                finish();
            }
        });

        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Admin.class);
                startActivity(i);
            }
        });

    }
    public void cln()
    {
        username.setText(null);
        username.requestFocus();
        password.setText(null);

    }
}
