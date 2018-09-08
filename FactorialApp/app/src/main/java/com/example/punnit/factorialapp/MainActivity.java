package com.example.punnit.factorialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText ed;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.bottom);
        ed=(EditText)findViewById(R.id.editText);
        t=(TextView)findViewById(R.id.textView);

    }
    public void fact(View v)
    {
        String s=ed.getText().toString();
        int n=Integer.parseInt(s);
        int temp=1;
        for (int i=1;i<=n;i++)
        {
            temp=temp*i;
        }
        String res=String.valueOf(temp);
        t.setText(res);
        ed.setText(null);
    }
}
