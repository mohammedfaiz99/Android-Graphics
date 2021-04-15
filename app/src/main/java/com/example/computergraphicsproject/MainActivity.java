package com.example.computergraphicsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button textanimation,imageanimation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textanimation=(Button)findViewById(R.id.textanimation);
        textanimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                starttextanimation();
            }
        });
        imageanimation=(Button)findViewById(R.id.imageanimation);
        imageanimation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startimageanimation();
            }
        });
    }

    public void starttextanimation(){
        Intent intent=new Intent(this,textanimation.class);
        startActivity(intent);
    }
    public void startimageanimation(){
        Intent intent=new Intent(this,imageanimation.class);
        startActivity(intent);
    }
}
