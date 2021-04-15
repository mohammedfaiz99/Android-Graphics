package com.example.computergraphicsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class textanimation extends AppCompatActivity {
    Button fadein,fadeout,blink,crossfade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textanimation);

        fadein=(Button)findViewById(R.id.fadein);
        fadein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startfadein();
            }
        });

        fadeout=(Button)findViewById(R.id.fadeout);
        fadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startfadeout();
            }
        });


        blink=(Button)findViewById(R.id.blink);
        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startblink();
            }
        });

        crossfade=(Button)findViewById(R.id.crossfade);
        crossfade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startcrossfade();
            }
        });
    }

    public void startfadein(){
        Intent intent=new Intent(this,fadein.class);
        startActivity(intent);
    }

    public void startfadeout(){
        Intent intent=new Intent(this,fadeout.class);
        startActivity(intent);
    }
    public void startblink(){
        Intent intent=new Intent(this,Blink.class);
        startActivity(intent);
    }
    public void startcrossfade(){
        Intent intent=new Intent(this,crossfade.class);
        startActivity(intent);
    }
}
