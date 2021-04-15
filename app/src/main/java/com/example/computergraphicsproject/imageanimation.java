package com.example.computergraphicsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class imageanimation extends AppCompatActivity {
    Button bounce,move,rotate,slided,slideu,together,zoomin,zoomup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imageanimation);

        bounce=(Button)findViewById(R.id.bounce);
        move=(Button)findViewById(R.id.move);
        rotate=(Button)findViewById(R.id.rotate);
        slided=(Button)findViewById(R.id.slidedown);
        slideu=(Button)findViewById(R.id.slideup);
        together=(Button)findViewById(R.id.together);
        zoomin=(Button)findViewById(R.id.zoomin);
        zoomup=(Button)findViewById(R.id.zoomout);

        bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startbounce();
            }
        });

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startmove();
            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startrotate();
            }
        });

        slided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startslided();
            }
        });

        slideu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startslideu();
            }
        });

        together.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                starttogether();
            }
        });

        zoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startzoomin();
            }
        });

        zoomup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startzoomup();
            }
        });

    }

    public void startbounce(){
        Intent intent=new Intent(this, bounceanimation.class);
        startActivity(intent);
    }
    public void startmove(){
        Intent intent=new Intent(this, move.class);
        startActivity(intent);
    }
    public void startrotate(){
        Intent intent=new Intent(this, rotate.class);
        startActivity(intent);
    }
    public void startslided(){
        Intent intent=new Intent(this, sidedown.class);
        startActivity(intent);
    }
    public void startslideu(){
        Intent intent=new Intent(this, sideup.class);
        startActivity(intent);
    }
    public void starttogether(){
        Intent intent=new Intent(this, together.class);
        startActivity(intent);
    }
    public void startzoomin(){
        Intent intent=new Intent(this, zoomin.class);
        startActivity(intent);
    }
    public void startzoomup(){
        Intent intent=new Intent(this, zoomout.class);
        startActivity(intent);
    }
}
