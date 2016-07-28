package com.dse_guide.dseguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dse_guide.dseguide.DSE_guide.DSE_guide_dashboard;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        //creating thread for splash screen
        Thread startTimer = new Thread() {
            public void run() {
                try {
                    sleep(1000);

                        Intent gotologin=new Intent(getApplicationContext(),user_type_selection.class);
                        startActivity(gotologin);
                        overridePendingTransition(R.anim.fadin, R.anim.fadout);
                        finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        };
        startTimer.start();


    }
}
