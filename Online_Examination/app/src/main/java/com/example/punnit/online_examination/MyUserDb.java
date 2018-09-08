package com.example.punnit.online_examination;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class MyUserDb extends SQLiteOpenHelper {

    public  MyUserDb(Context context)
    {
        super(context, "Exam", null, 1);

    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String tab;
        tab = " CREATE TABLE record( id INTEGER PRIMARY KEY AUTOINCREMENT, fname VARCHAR(100) NOT NULL, lname VARCHAR(100) NOT NULL, uname VARCHAR NOT NULL, password VARCHAR NOT NULL);";
        db.execSQL(tab);

        String Questions="CREATE TABLE QueTable(id INTEGER PRIMARY KEY AUTOINCREMENT,question VARCHAR,opt_one VARCHAR,opt_two VARCHAR,opt_three VARCHAR,opt_four VARCHAR,answer VARCHAR,subject VARCHAR)";
        db.execSQL(Questions);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void addRecord(String f,String l,String u,String ps){

        SQLiteDatabase d=this.getWritableDatabase();
        ContentValues obj=new ContentValues();
        obj.put("fname",f);
        obj.put("lname",l);
        obj.put("uname",u);
        obj.put("password",ps);
        d.insert("record",null,obj);

        d.close();

    }

    public String login(String username){
        String password=null;
        SQLiteDatabase log=this.getWritableDatabase();
        String l="SELECT * FROM record WHERE uname='"+username+"'";
        Cursor c=log.rawQuery(l,null);
        c.moveToFirst();
        password=c.getString(4);
        return password;
    }

    public void  Add_Que(String Que,String Op1,String Op2,String Op3,String Op4,String Ans,String Sub){
        SQLiteDatabase db =this.getWritableDatabase();
        ContentValues inscol = new ContentValues();
        inscol.put("question",Que);
        inscol.put("opt_one",Op1);
        inscol.put("opt_two",Op2);
        inscol.put("opt_three",Op3);
        inscol.put("opt_four",Op4);
        inscol.put("answer",Ans);
        inscol.put("subject",Sub);
        db.insert("QueTable",null,inscol);
        db.close();
    }
    public Cursor Select_Question(String sub)
    {
        SQLiteDatabase b=this.getWritableDatabase();
        String all="SELECT* FROM QueTable WHERE subject='"+sub+"' ";
        Cursor obj=b.rawQuery(all,null);
        return  obj;
    }

}
