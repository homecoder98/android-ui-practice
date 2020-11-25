package com.example.practiceui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ImageEventActivity extends AppCompatActivity {
    private ImageView iv_event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_event);

        iv_event = (ImageView)findViewById(R.id.iv_event);
    }
}