package com.example.computergraphicsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class bounceanimation extends AppCompatActivity implements Animation.AnimationListener {
    ImageView imgPoster;
    Button btnStart;

    // Animation
    Animation animBounce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bounceanimation);

        imgPoster = (ImageView) findViewById(R.id.imgLogo);
        btnStart = (Button) findViewById(R.id.btnStart);

        // load the animation
        animBounce = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);

        // set animation listener
        animBounce.setAnimationListener(this);

        // button click event
        btnStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // start the animation
                imgPoster.setVisibility(View.VISIBLE);
                imgPoster.startAnimation(animBounce);
            }
        });
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        if (animation == animBounce) {
        }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
