package com.example.punnit.jaipur_metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PoliceStation extends AppCompatActivity {
    TextView t,address,mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_station);
        t=(TextView)findViewById(R.id.station);
        address=(TextView)findViewById(R.id.address);
        mobile=(TextView)findViewById(R.id.mobile);
        Intent i=getIntent();
        String name=i.getStringExtra("name");
        if (name.equals("Mansarovar"))
        {
            String station_name="Mansarovar Police Station";
            String add=" Mansarover, Varun Path, Mansarovar, Jaipur, Rajasthan 302020";
            String mob=" 0141 239 9379";
            t.setText(station_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals("New Aatish Market"))
        {
            String station_name= "Mahesh Nagar Police Station";
            String add="15A, Shri Gopal Nagar, Gopal Pura bypass, Jaipur, Rajasthan 302007";
            String mob="0141 250 2331";
            t.setText(station_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals("Vivek Vihar"))
        {
            String station_name= "Mahesh Nagar Police Station";
            String add="15A, Shri Gopal Nagar, Gopal Pura bypass, Jaipur, Rajasthan 302007";
            String mob="0141 250 2331";
            t.setText(station_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals("Shyam Nagar"))
        {
            String station_name= "Shyam Nagar Police Station";
            String add=" Kings Rd, Nirman Nagar, Jaipur, Rajasthan 302019";
            String mob="8765567788";
            t.setText(station_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals(" Ram Nagar"))
        {
            String station_name= "Sodala Police Station";
            String add="  Hawa Sadak Rd, Ramnagar Extension, Civil Lines, Jaipur, Rajasthan 302019";
            String mob=" 0141 229 5866";
            t.setText(station_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals("Civil Lines"))
        {
            String station_name= "Police Station Civil Lines";
            String add=" Jacob Rd, Devi Niketan Compound, Madrampur, Civil Lines, Jaipur, Rajasthan 302006";
            String mob="0141 222 3097";
            t.setText(station_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals("Railway Station"))
        {
            String station_name= "Bajaj Nagar Police Station";
            String add="No.1, Near Central School, Shaheed Abhimanyu Singh Marg, Bajaj Nagar, Jaipur, Rajasthan 302015";
            String mob="0141 270 5971";
            t.setText(station_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals("Sindhi Camp"))
        {
            String station_name= "Police Station Sindhi Camp";
            String add="Near Bus Stand, 302006, Station Rd, Sindhi Camp, Jaipur, Rajasthan";
            String mob="0141 220 6201";
            t.setText(station_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals("Chand Pole"))
        {
            String station_name= "Police Station Kotwali";
            String add="Kishanpole Bazar Road, Chandpol, Pink City, Jaipur, Rajasthan 302001 ";
            String mob=" 0141 232 2444";
            t.setText(station_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals(" Choti Chaupar"))
        {
            String station_name= "Police Station Kotwali";
            String add="Kishanpole Bazar Road, Chandpol, Pink City, Jaipur, Rajasthan 302001 ";
            String mob=" 0141 232 2444";
            t.setText(station_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals("Badi Chaupar"))
        {
            String station_name= "Police Thana Manak Chowk";
            String add="Manak Chowk, Badi Chopad, Jaipur, Rajasthan 302003 ";
            String mob=" 0141 260 1366";
            t.setText(station_name);
            address.setText(add);
            mobile.setText(mob);
        }


    }
}
