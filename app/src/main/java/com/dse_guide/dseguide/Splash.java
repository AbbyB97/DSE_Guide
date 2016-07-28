package com.dse_guide.dseguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import com.dse_guide.dseguide.DSE_guide.DSE_guide_dashboard;
import com.flaviofaria.kenburnsview.KenBurnsView;

public class Splash extends AppCompatActivity {
    private KenBurnsView kbv;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash);
        kbv=(KenBurnsView)findViewById(R.id.image);
        kbv.setScaleType(ImageView.ScaleType.CENTER);
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
