package com.muhammadanugrahfitrah.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity
{
    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://id.menarapeninsulahotel-jakarta.com/cache/e3/ca/e3ca41e8a3a902cf9abf42d18e381bcb.jpg";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}