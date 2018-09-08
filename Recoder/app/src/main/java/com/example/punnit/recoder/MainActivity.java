package com.example.punnit.recoder;

import android.Manifest;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class MainActivity extends AppCompatActivity {
    Button rec,paus,ply,stp;
    MediaRecorder mr;
    String path;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recorder);
        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.M){
            if(checkPermission()){

            }
            else {
                String[] per ={Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.RECORD_AUDIO};

                requestPermissions(per,1000);
            }

        }
        rec=findViewById(R.id.record);
        paus=findViewById(R.id.pause);
        ply=findViewById(R.id.play);
        stp=findViewById(R.id.stop);
        final File dir=new File(Environment.getExternalStorageDirectory(),"/punitRecorder/");
        if (!dir.exists()) {
            dir.mkdir();

            rec.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    path = dir.getAbsolutePath() + "/" + UUID.randomUUID() + ".mp3";
                    RecorderSetup(path);
                    try {
                        mr.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    mr.start();
                    Toast.makeText(MainActivity.this, "Reccording Start", Toast.LENGTH_SHORT).show();
                }
            });
            ply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp=new MediaPlayer();
                    try {
                        mp.setDataSource(path);
                        mp.prepare();
                        mp.start();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            paus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            stp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rec.setEnabled(true);
                    if (mr != null) {
                        mr.stop();
                        mr.release();
                    }
                    if(mp!=null){
                        mp.stop();
                        mp.release();
                    }
                    Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                }
            });
        }else
        {
            rec.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    path = dir.getAbsolutePath() + "/" + UUID.randomUUID() + ".mp3";
                    RecorderSetup(path);
                    try {
                        mr.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    mr.start();
                    Toast.makeText(MainActivity.this, "Recording Start", Toast.LENGTH_SHORT).show();
                }
            });
            ply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp=new MediaPlayer();
                    try {
                        mp.setDataSource(path);
                        mp.prepare();
                        mp.start();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            paus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
            stp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    rec.setEnabled(true);
                    if (mr != null) {
                        mr.stop();
                        mr.release();
                    }
                    if(mp!=null){
                        mp.stop();
                        mp.release();
                    }
                    Toast.makeText(MainActivity.this, "Stop", Toast.LENGTH_SHORT).show();
                }
            });
        }

    }
    public void RecorderSetup(String p){
        mr=new MediaRecorder();
        mr.setAudioSource(MediaRecorder.AudioSource.MIC);
        mr.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        mr.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
        mr.setOutputFile(p);
    }
    public boolean checkPermission(){
        boolean is=false;
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.M)
        {
            if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)== PackageManager.PERMISSION_GRANTED)
            {
                is= true;
            }
            else {is=false;}

            if (checkSelfPermission(Manifest.permission.RECORD_AUDIO)== PackageManager.PERMISSION_GRANTED)
            {
                is= true;
            }
            else {is=false;}
        }
        return is;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode==1000){
            if (grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED
                    && grantResults[1]==PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this, "All permissions are accepted", Toast.LENGTH_SHORT).show();
            }else {finish();}
        }
    }
}
