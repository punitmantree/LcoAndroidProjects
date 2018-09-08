package com.example.punnit.jaipur_metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class First extends AppCompatActivity {
    Button b1,b2,other,find;
    EditText from,to;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        other=(Button)findViewById(R.id.other);
        from=(EditText)findViewById(R.id.from);
        to=(EditText)findViewById(R.id.to);
        find=(Button)findViewById(R.id.find);

        from.setText(List.stsname);
        to.setText(To_StationName.to);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(First.this,List.class);
                startActivity(i1);

            }

        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(First.this,To_StationName.class);
                startActivity(i1);

            }

        });
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(First.this,Other.class);
                startActivity(i2);
            }
        });

        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String frm=from.getText().toString();
                String too=to.getText().toString();
                Intent i=new Intent(First.this,Find.class);
                i.putExtra("From",frm);
                i.putExtra("to",too);
                startActivity(i);
            }
        });

    }
}
