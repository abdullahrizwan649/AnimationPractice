package com.example.anime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView ihome;
    Button translate_btn;
    Button alpha_btn;
    Button rotate_btn;
    Button scale_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        init();

        translate();
        alpha();
        rotate();
        scale();




    }

    public void init()
    {
        ihome = findViewById(R.id.ihome);
        translate_btn = findViewById(R.id.translate_btn);
        alpha_btn = findViewById(R.id.alpha_btn);
        rotate_btn = findViewById(R.id.rotate_btn);
        scale_btn = findViewById(R.id.scale_btn);
    }

    public void translate()
    {
        translate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation move = AnimationUtils.loadAnimation(MainActivity.this,R.anim.move);
                ihome.startAnimation(move);
            }
        });

    }

    public void alpha()
    {
        alpha_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation alpha = AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
                ihome.startAnimation(alpha);
            }
        });

    }

    public void rotate()
    {
        rotate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation rotate = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate);
                ihome.startAnimation(rotate);
            }
        });

    }

    public void scale()
    {
        scale_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation scale = AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);
                ihome.startAnimation(scale);
            }
        });

    }

}