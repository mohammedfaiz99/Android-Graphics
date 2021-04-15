package com.example.computergraphicsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Blink extends AppCompatActivity implements Animation.AnimationListener {
    TextView txtMessage;
    Button btnStart;

    // Animation
    Animation animBlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blink);

        txtMessage = (TextView) findViewById(R.id.txtMessage);
        btnStart = (Button) findViewById(R.id.btnStart);

        // load the animation
        animBlink = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);

        // set animation listener
        animBlink.setAnimationListener(this);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMessage.setVisibility(View.VISIBLE);

                // start the animation
                txtMessage.startAnimation(animBlink);
            }
        });
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        if (animation == animBlink) {
            Toast.makeText(this,"Animation Stopped",Toast.LENGTH_LONG).show();
        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
