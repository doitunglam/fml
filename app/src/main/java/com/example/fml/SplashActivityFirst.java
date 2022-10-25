package com.example.fml;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivityFirst extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Sets the layout of welcome_screen.xml
        setContentView(R.layout.app_welcome);
        Thread timer = new Thread() {
            public void run() {
                try {
                    //Display for 3 seconds
                    sleep(1000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                    e.printStackTrace();
                } finally {
                    finish();
                }
            }
        };
        timer.start();
    }


    //Destroy Welcome_screen.java after it goes to next activity
    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();

    }
}
