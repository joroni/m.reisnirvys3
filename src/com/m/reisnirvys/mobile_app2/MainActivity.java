package com.m.reisnirvys.mobile_app2;

import android.os.Bundle;
import org.apache.cordova.*;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      /* super.setIntegerProperty(�splashscreen�, R.drawable.splash); */
        super.loadUrl("file:////android_asset/www/index.html");
    }

    
}


