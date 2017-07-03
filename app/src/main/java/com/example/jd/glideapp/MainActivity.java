package com.example.jd.glideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=(ImageView)findViewById(R.id.img1);
        Glide.with(this).load("http://api.androidhive.info/images/glide/medium/deadpool.jpg").placeholder(R.mipmap.ic_launcher).error(R.drawable.not_found).into(imageView);
//
      ImageView imageView1=(ImageView)findViewById(R.id.img2);
        Picasso.with(this).load("http://api.androidhive.info/images/glide/medium/deadpool.jpg").placeholder(R.mipmap.ic_launcher).error(R.drawable.not_found).into(imageView1);
    }

}
