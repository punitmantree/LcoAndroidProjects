package com.example.punnit.jaipur_metro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Hospital_Detail extends AppCompatActivity {
    TextView t,address,mobile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital__detail);
        t=(TextView)findViewById(R.id.hospit);
        address=(TextView)findViewById(R.id.address);
        mobile=(TextView)findViewById(R.id.mobile);
        Intent i=getIntent();
        String name=i.getStringExtra("name");
        if (name.equals("Mansarovar"))
        {
          String hospit_name="Metro Mas Hospital";
          String add="Shipra Path, Near Technology Park, Mansarovar, Jaipur, Rajasthan 302020";
          String mob=" 080039 95454";
          t.setText(hospit_name);
          address.setText(add);
          mobile.setText(mob);
        }
        else if (name.equals("New Aatish Market"))
        {
            String hospit_name= "Rukmani Birla Hospital";
            String add="340, Gopalpura Bypass Rd, Near Triveni Bridge, Shanthi Nagar, Gopal Pura Mode, Jaipur, Rajasthan 302018";
            String mob="  0141 309 0309";
            t.setText(hospit_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals("Vivek Vihar"))
        {
            String hospit_name= "Sanjeevani Hospital And Medical Research Institute";
            String add="New Sanganer Road, Opp. Metro Piller No. 91, Roop Vihar, Goverdhan Colony, Vivek Vihar, Sodala, Jaipur, Rajasthan 302019";
            String mob=" 0141 406 7000";
            t.setText(hospit_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals("Shyam Nagar"))
        {
            String hospit_name= "Bansal Hospital";
            String add=" B-106, Jan Path, Shyam Nagar, Jaipur, Rajasthan 302019";
            String mob=" 0141 229 3838";
            t.setText(hospit_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals(" Ram Nagar"))
        {
            String hospit_name= "Life Line Hospital";
            String add=" Ramnagar Road, Ramnagar, Sodala, Jaipur, Rajasthan 302019";
            String mob=" 0141 229 1791";
            t.setText(hospit_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals("Civil Lines"))
        {
            String hospit_name= "Gautam Hospital & Research Centre";
            String add=" 1, Jacob Road, Near Shiv Mandir, Civil Lines, Jaipur, Rajasthan 302006";
            String mob="098290 53050";
            t.setText(hospit_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals("Railway Station"))
        {
            String hospit_name= "Jyotiba Hospital";
            String add="Amber Tower, 6,Bichun bagh, S.C road Opp, Jaipur, Rajasthan 302001 ";
            String mob="0141 237 6902";
            t.setText(hospit_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals("Sindhi Camp"))
        {
            String hospit_name= "Ratnu Insan Hospital";
            String add="Parik Road Jaipur, Kanti Chandra Road, Pareek College Road, Jaipur, Rajasthan 302016 ";
            String mob="099839 15514";
            t.setText(hospit_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals("Chand Pole"))
        {
            String hospit_name= "Mahesh Hospital";
            String add="Top Khane Ka Rasta, Chandpole, Chandpol Market, Jaipur, Rajasthan 302001 ";
            String mob=" 0141 231 9661";
            t.setText(hospit_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals(" Choti Chaupar"))
        {
            String hospit_name= "Amar Jain Hospital";
            String add=" 4-J-5, Chaura Rasta, Jaipur, Rajasthan 302003 ";
            String mob="0141 231 4022";
            t.setText(hospit_name);
            address.setText(add);
            mobile.setText(mob);
        }
        else if (name.equals("Badi Chaupar"))
        {
            String hospit_name= "RAMA HOSPITAL";
            String add="Ramganj Bazar, Ghoda Nikas, Near National Hospital, Dayanand Marg, Badi Chaupar, Jaipur, Rajasthan 302002";
            String mob=" 0141 264 8689";
            t.setText(hospit_name);
            address.setText(add);
            mobile.setText(mob);
        }




    }
}
