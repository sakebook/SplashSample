package com.sakebook.android.sample.splashsample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    public final static String ARGS_TITLE = "title";

    public static Intent createIntent(Context context, String title) {
        Intent intent = new Intent(context, SplashActivity.class);
        intent.putExtra(ARGS_TITLE, title);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (getIntent() != null) {
            String title = getIntent().getStringExtra(ARGS_TITLE);
            if (!TextUtils.isEmpty(title)) {
                toolbar.setTitle(title);
                ((TextView)findViewById(R.id.text)).setText(title);
            }
        }
        setSupportActionBar(toolbar);
    }

}
