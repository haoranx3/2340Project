package com.example.a2340project.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.a2340project.R;

public class MainActivity extends AppCompatActivity {

    private Button playButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent selectDifficultyIntent = new Intent(getApplicationContext(), selectDifficultyActivity.class);
                startActivity(selectDifficultyIntent);
            }
        });
    }
}
