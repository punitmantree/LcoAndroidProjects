 package com.example.punnit.primeno;

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
        b=(Button)findViewById(R.id.button);
        ed=(EditText)findViewById(R.id.editText);
        t=(TextView)findViewById(R.id.textView);

    }

    public String check_Prime(View v)
    {
        String s=ed.getText().toString();
        try{
        int n=Integer.parseInt(s);

        for (int c=2;c<n;c++)
        {
            if (n % c == 0 )
            {

                return "not prime";
            }

        }}
        catch (Exception e ){return  "Exception arrise";}
        return "prime";

    }
    public void prime(View v)
    {
        String prime = check_Prime(v);

        t.setText(prime);
    }
}
