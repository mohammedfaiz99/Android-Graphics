package com.example.computergraphicsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class fadein extends AppCompatActivity implements Animation.AnimationListener {

    TextView txtMessage;
    Button btnStart;
    Animation animFadein;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fadein);

        txtMessage = (TextView) findViewById(R.id.txtMessage);
        btnStart = (Button) findViewById(R.id.btnStart);

        // load the animation
        animFadein = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);

        animFadein.setAnimationListener(this);

        btnStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                txtMessage.setVisibility(View.VISIBLE);

                // start the animation
                txtMessage.startAnimation(animFadein);
            }
        });

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        if (animation == animFadein) {
            Toast.makeText(this,"Animation Stopped",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
