package com.example.punnit.primeno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.punnit.leapyear.R;

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

    public String check_Leap(View v)
    {
        String s=ed.getText().toString();
        try{
            int n=Integer.parseInt(s);


                if (n%4==0 && n%100==0 && n%400==0)
                {

                    return "Leap Year";
                }

            }
        catch (Exception e ){return  "Exception arrise";}
        return "Not A Leap Year";

    }
    public void leap(View v)
    {
        String leap = check_Leap(v);

        t.setText(leap);
    }
}
