package com.example.punnit.jaipur_metro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Parking extends AppCompatActivity {
    String station[]={"Mansarovar","New Aatish Market","Vivek Vihar","Shyam Nagar",
            " Ram Nagar","Civil Lines", "Railway Station","Sindhi Camp","Chand Pole"
            ," Choti Chaupar","Badi Chaupar"};
    String avail[]={"Available","Available","Not-Available","Available","Available",
            "Available","Not-Available","Available","Available","Not-Available","Not-Available"};
        ListView lt1,lt2;
            @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking);
                lt1=(ListView)findViewById(R.id.myList1);
                lt2=(ListView)findViewById(R.id.myList2);

                ArrayAdapter<String> obj1,obj2;
                obj1=new ArrayAdapter<String>(Parking.this,R.layout.support_simple_spinner_dropdown_item,station);
                obj2=new ArrayAdapter<String>(Parking.this,R.layout.support_simple_spinner_dropdown_item,avail);

                lt1.setAdapter(obj1);
                lt2.setAdapter(obj2);
    }
}
