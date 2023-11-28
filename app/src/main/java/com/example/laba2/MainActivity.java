package com.example.laba2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView hello_world;
    private ImageButton startbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hello_world = (TextView) findViewById(R.id.hello_world);
        startbutton = (ImageButton) findViewById(R.id.startbutton);

    }

    public void onStartButtonClick(View view) {
        startbutton.setImageResource(R.drawable.androed);
        hello_world.setVisibility(View.VISIBLE);
        startbutton.setClickable(false);
    }
}