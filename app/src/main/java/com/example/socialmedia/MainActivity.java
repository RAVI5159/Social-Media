package com.example.socialmedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ImageView logo;
    private TextView name;
    private static int Timeout=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logo=(ImageView) findViewById(R.id.img);
        name=(TextView)findViewById(R.id.txt);

        Animation fade= AnimationUtils.loadAnimation(MainActivity.this,R.anim.fade);
        logo.startAnimation(fade);
        name.startAnimation(fade);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(i);
                finish();

            }
        },Timeout);
    }
}