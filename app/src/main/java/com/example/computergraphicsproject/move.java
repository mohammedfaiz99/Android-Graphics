package com.example.computergraphicsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class move extends AppCompatActivity implements Animation.AnimationListener {
    ImageView imgLogo;
    Button btnStart;

    // Animation
    Animation animMove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        imgLogo = (ImageView) findViewById(R.id.imgLogo);
        btnStart = (Button) findViewById(R.id.btnStart);

        // load the animation
        animMove = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move);

        // set animation listener
        animMove.setAnimationListener(this);

        // button click event
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // start the animation
                imgLogo.startAnimation(animMove);
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
