package com.dse_guide.dseguide;

import android.app.Application;

import com.backendless.Backendless;

/**
 * Created by Abhijit on 27-Jul-16.
 */
public class init extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        String appversion="v1";
        Backendless.initApp(this,"62AE771A-20C7-C6D1-FF00-E57D4CBAAD00","D58881F0-5ACD-CF72-FF4D-C18756BD4500",appversion);

        }
        }
