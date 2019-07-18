package com.example.a2340project.views;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.a2340project.R;

/**
 * MainActivity class
 */

public class MainActivity extends AppCompatActivity {

    private MediaPlayer bgm;
    private MediaPlayer selectFX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playButton = findViewById(R.id.playButton);
        TextView olduser = findViewById(R.id.oldplayer);

        bgm = MediaPlayer.create(this, R.raw.title);
        bgm.setLooping(true);
        bgm.setVolume(75,75);
        bgm.start();

        selectFX = MediaPlayer.create(this, R.raw.select);
        selectFX.setVolume(1f/10f,1f/10f);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selectDifficultyIntent = new Intent(getApplicationContext(),
                        selectDifficultyActivity.class);
                startActivity(selectDifficultyIntent);
                bgm.release();
                selectFX.start();

            }
        });

        olduser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(getApplicationContext(), login.class);
                bgm.release();
                startActivity(loginIntent);
            }
        });
    }

}