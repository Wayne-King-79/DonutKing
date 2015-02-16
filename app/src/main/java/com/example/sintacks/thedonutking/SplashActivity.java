package com.example.sintacks.thedonutking;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.easyandroidanimations.library.Animation;
import com.easyandroidanimations.library.AnimationListener;
import com.easyandroidanimations.library.FadeInAnimation;


public class SplashActivity extends ActionBarActivity {

    ImageView splashIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        final Intent mainIntent = new Intent(this, MainActivity.class);

        splashIV = (ImageView)findViewById(R.id.splash_image_view);

        new FadeInAnimation(splashIV)
                .setDuration(4000)
                .setListener(new AnimationListener() {
                    @Override
                    public void onAnimationEnd(Animation animation) {
                        startActivity(mainIntent);
                    }
                })
                .animate();
    }
}
