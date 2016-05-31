package com.sakebook.android.sample.splashsample;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

public class DelaySplashActivity extends AppCompatActivity {

    private final static int SPLASH_TIME = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delay_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = SplashActivity.createIntent(DelaySplashActivity.this, DelaySplashActivity.class.getSimpleName());
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME);
    }

    /**
     * バックキー無効。
     * */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }
}
