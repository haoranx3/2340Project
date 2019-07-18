package com.example.a2340project.views;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a2340project.R;
import com.example.a2340project.model.DatabaseHelper;

/**
 * database helper
 */
public class login extends AppCompatActivity {

    private final DatabaseHelper helper = new DatabaseHelper(this);
    private MediaPlayer bgm;
    private MediaPlayer selectFX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginButton = findViewById(R.id.playButton);
        bgm = MediaPlayer.create(this, R.raw.fortree);
        bgm.setLooping(true);
        bgm.setVolume(7f/10f,7f/10f);
        selectFX = MediaPlayer.create(this, R.raw.select);
        selectFX.setVolume(1f/10f,1f/10f);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText username = findViewById(R.id.usernameInput);
                String usernameStr = username.getText().toString();
                int[] info = helper.searchInfo(usernameStr);
                Intent loginIntent = new Intent(getApplicationContext(),
                        createRegionActivity.class);
                loginIntent.putExtra("array", info);
                loginIntent.putExtra("name", usernameStr);
                selectFX.start();
                startActivity(loginIntent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        bgm.start();
    }
}