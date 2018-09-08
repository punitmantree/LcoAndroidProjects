package com.example.punnit.jaipur_metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class List1 extends AppCompatActivity {
    ListView lt;
    String station[]={"Mansarovar","New Aatish Market","Vivek Vihar","Shyam Nagar","" +
            " Ram Nagar","Civil Lines","Railway Station","Sindhi Camp","Chand Pole","" +
            " Choti Chaupar","Badi Chaupar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list1);
        lt=(ListView)findViewById(R.id.station_list);
        ArrayAdapter<String> obj;
        obj=new ArrayAdapter<String>(List1.this,R.layout.support_simple_spinner_dropdown_item,station);
        lt.setAdapter(obj);
        lt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item=(String) adapterView.getItemAtPosition(i);
                Intent u=new Intent(List1.this,Hospital_Detail.class);
                u.putExtra("name",item);
                startActivity(u);

            }
        });
    }
}
