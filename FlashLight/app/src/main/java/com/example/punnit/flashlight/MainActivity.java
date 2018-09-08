package com.example.punnit.flashlight;

import android.Manifest;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    ToggleButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.flash);
        boolean feature_camera_flash=getPackageManager().hasSystemFeature(getPackageManager().FEATURE_CAMERA_FLASH);
        boolean camera_light = ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)== PackageManager.PERMISSION_GRANTED;
        ActivityCompat.requestPermissions(this,new String []{Manifest.permission.CAMERA},60);

        final CameraManager cameraManager= (CameraManager) getSystemService(CAMERA_SERVICE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String cameraID;
                    cameraID = CameraManager.getCameraIdList()[0];
                    if (button.isChecked()){
                        cameraManager.setTorchMode(cameraID,true);
                    }else
                    {
                        cameraManager.setTorchMode(cameraID,false);
                    }
                }catch (Exception e){e.printStackTrace();}
            }
        });
    }

}
