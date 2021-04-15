package com.example.computergraphicsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class crossfade extends AppCompatActivity implements Animation.AnimationListener {
    TextView txtMessage1, txtMessage2;
    Button btnStart;

    // Animation
    Animation animFadeIn, animFadeOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crossfade);

        txtMessage1 = (TextView) findViewById(R.id.txtMessage1);
        txtMessage2 = (TextView) findViewById(R.id.txtMessage2);
        btnStart = (Button) findViewById(R.id.btnStart);

        // load animations
        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_out);

        // set animation listeners
        animFadeIn.setAnimationListener(this);
        animFadeOut.setAnimationListener(this);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage2.setVisibility(View.VISIBLE);
                // start fade in animation
                txtMessage2.startAnimation(animFadeIn);

                // start fade out animation
                txtMessage1.startAnimation(animFadeOut);
            }
        });
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        if (animation == animFadeOut) {

            // hide faded out element
            txtMessage1.setVisibility(View.GONE);
        }

        if(animation == animFadeIn){
            // do something after fade in completed

            // set visibility of fade in element
            txtMessage2.setVisibility(View.VISIBLE);
        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
