package com.example.punnit.jaipur_metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List extends AppCompatActivity {
    ListView lt;

    static String stsname;static  int f;
    String station[]={"Mansarovar","New Aatish Market","Vivek Vihar","Shyam Nagar","" +
            " Ram Nagar","Civil Lines","Railway Station","Sindhi Camp","Chand Pole","" +
            " Choti Chaupar","Badi Chaupar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lt=(ListView)findViewById(R.id.station_list);
        ArrayAdapter<String> obj;
        obj=new ArrayAdapter<String>(List.this,R.layout.support_simple_spinner_dropdown_item,station);
        lt.setAdapter(obj);
        lt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                f=i;
                stsname=(String) adapterView.getItemAtPosition(i);
                Intent u=new Intent(List.this,First.class);

                startActivity(u);
            }
        });
    }
}
