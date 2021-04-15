package com.example.computergraphicsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class sideup extends AppCompatActivity implements Animation.AnimationListener {

    ImageView imgPoster;
    Button btnStart;

    // Animation
    Animation animSlideUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sideup);

        imgPoster = (ImageView) findViewById(R.id.imgLogo);
        btnStart = (Button) findViewById(R.id.btnStart);

        // load the animation
        animSlideUp = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up);

        // set animation listener
        animSlideUp.setAnimationListener(this);

        // button click event
        btnStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // start the animation
                imgPoster.setVisibility(View.VISIBLE);
                imgPoster.startAnimation(animSlideUp);
            }
        });
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
