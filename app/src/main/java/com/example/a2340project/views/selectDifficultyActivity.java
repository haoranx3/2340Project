package com.example.a2340project.views;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.a2340project.R;

/**
 * selectDifficultyActivity screen
 */
public class selectDifficultyActivity extends AppCompatActivity {

    private MediaPlayer bgm;
    private MediaPlayer selectFX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_difficulty);

        Button easyButton = findViewById(R.id.easyButton);
        Button normalButton = findViewById(R.id.normalButton);
        Button hardButton = findViewById(R.id.hardButton);
        Button impossibleButton = findViewById(R.id.impossibleButton);

        bgm = MediaPlayer.create(this, R.raw.fortree);
        bgm.setLooping(true);
        bgm.setVolume(7f/10f,7f/10f);

        selectFX = MediaPlayer.create(this, R.raw.select);
        selectFX.setVolume(1f/10f,1f/10f);

        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFX.start();
                Intent createPlayerScreenIntent = new Intent(getApplicationContext(),
                        createPlayerActivity.class);
                createPlayerScreenIntent.putExtra("diff", "Easy");
                startActivity(createPlayerScreenIntent);
            }
        });

        normalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFX.start();
                Intent createPlayerScreenIntent = new Intent(getApplicationContext(),
                        createPlayerActivity.class);
                createPlayerScreenIntent.putExtra("diff", "Normal");
                startActivity(createPlayerScreenIntent);
            }
        });

        hardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFX.start();
                Intent createPlayerScreenIntent = new Intent(getApplicationContext(),
                        createPlayerActivity.class);
                createPlayerScreenIntent.putExtra("diff", "Hard");
                startActivity(createPlayerScreenIntent);
            }
        });

        impossibleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFX.start();
                Intent createPlayerScreenIntent = new Intent(getApplicationContext(),
                        createPlayerActivity.class);
                createPlayerScreenIntent.putExtra("diff", "Impossible");
                startActivity(createPlayerScreenIntent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        bgm.start();
    }
}
