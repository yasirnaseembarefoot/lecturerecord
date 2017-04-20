package com.example.lecturerecoder.lecturesrecorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        ImageButton audiorecorderBtn = (ImageButton) findViewById(R.id.audiorecordImage);
        ImageButton videorecordBtn = (ImageButton) findViewById(R.id.videorecorderImage);

        audiorecorderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,AudioRecorderActivity.class);
                startActivity(intent);
            }
        });
        videorecordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
            }
        });
    }
}
