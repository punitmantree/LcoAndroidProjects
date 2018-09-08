package com.example.punnit.minicalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button ad,sb,ml,cl;
    EditText ed,ed1;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ad=(Button)findViewById(R.id.button);
        sb=(Button)findViewById(R.id.button2);
        ml=(Button)findViewById(R.id.button3);
        cl=(Button)findViewById(R.id.button4);
        ed=(EditText)findViewById(R.id.editText);
        ed1=(EditText)findViewById(R.id.editText2);
        t=(TextView)findViewById(R.id.textView);
    }
    public void addition(View v)
    {
        String s=ed.getText().toString();
        String s1=ed1.getText().toString();
        int n1=Integer.parseInt(s);
        int n2=Integer.parseInt(s1);
        int c=n1+n2;
        String res=String.valueOf(c);
        t.setText(res);
        ed.setText(null);
        ed1.setText(null);

    }
    public void subtraction(View v)
    {
        String s=ed.getText().toString();
        String s1=ed1.getText().toString();
        int n1=Integer.parseInt(s);
        int n2=Integer.parseInt(s1);
        int c=n1-n2;
        String res=String.valueOf(c);
        t.setText(res);
        ed.setText(null);
        ed1.setText(null);

    }
    public void multi(View v)
    {
        String s=ed.getText().toString();
        String s1=ed1.getText().toString();
        int n1=Integer.parseInt(s);
        int n2=Integer.parseInt(s1);
        int c=n1*n2;
        String res=String.valueOf(c);
        t.setText(res);
        ed.setText(null);
        ed1.setText(null);

    }
    public void clear(View v)
    {
        t.setText(null);
        ed.setText(null);
        ed1.setText(null);
    }


}
