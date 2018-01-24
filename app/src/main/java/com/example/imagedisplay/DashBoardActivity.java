package com.example.imagedisplay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class DashBoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        ImageView imageView = (ImageView) findViewById(R.id.photo);
        Picasso.with(DashBoardActivity.this).load("http://i.imgur.com/DvpvklR.png").into(imageView);
    }
}
