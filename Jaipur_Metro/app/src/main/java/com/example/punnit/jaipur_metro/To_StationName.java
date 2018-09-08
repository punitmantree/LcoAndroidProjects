package com.example.punnit.jaipur_metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class To_StationName extends AppCompatActivity {
    ListView lt;
static  String to;
    static String stsname;
    static  int t;
    String station[]={"Mansarovar","New Aatish Market","Vivek Vihar","Shyam Nagar","" +
            " Ram Nagar","Civil Lines","Railway Station","Sindhi Camp","Chand Pole","" +
            " Choti Chaupar","Badi Chaupar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to__station_name);
        lt=(ListView)findViewById(R.id.too);
        ArrayAdapter<String> obj;
        obj=new ArrayAdapter<String>(To_StationName.this,R.layout.support_simple_spinner_dropdown_item,station);
        lt.setAdapter(obj);
        lt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                t=i;
                to=(String) adapterView.getItemAtPosition(i);
                Intent u=new Intent(To_StationName.this,First.class);

                startActivity(u);
            }
        });
    }
}
