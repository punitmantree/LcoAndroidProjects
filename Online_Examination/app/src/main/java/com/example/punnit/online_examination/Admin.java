package com.example.punnit.online_examination;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Admin extends AppCompatActivity {
    EditText adminuser,adminpass;
    Button adminlogin;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        adminuser=(EditText)findViewById(R.id.adminuser);
        adminpass=(EditText)findViewById(R.id.adminpass);
        adminlogin=(Button)findViewById(R.id.adminlogin);
        adminlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=adminuser.getText().toString();
                String pass=adminpass.getText().toString();
                if (user.equals("punit")&& pass.equals("punit")){
                    Intent i=new Intent(Admin.this,AdminQuations.class);
                    startActivity(i);
                    finish();
                }else
                {
                    Toast.makeText(Admin.this, "Enter currect username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
