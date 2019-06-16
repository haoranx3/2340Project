package com.example.a2340project.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.a2340project.R;

public class selectDifficultyActivity extends AppCompatActivity {

    private Button easyButton;
    private Button normalButton;
    private Button hardButton;
    private Button impossibleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_difficulty);

        easyButton = findViewById(R.id.easyButton);
        normalButton = findViewById(R.id.normalButton);
        hardButton = findViewById(R.id.hardButton);
        impossibleButton = findViewById(R.id.impossibleButton);

        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createPlayerScreenIntent = new Intent(getApplicationContext(), createPlayerActivity.class);
                startActivity(createPlayerScreenIntent);
            }
        });

        normalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createPlayerScreenIntent = new Intent(getApplicationContext(), createPlayerActivity.class);
                startActivity(createPlayerScreenIntent);
            }
        });

        hardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createPlayerScreenIntent = new Intent(getApplicationContext(), createPlayerActivity.class);
                startActivity(createPlayerScreenIntent);
            }
        });

        impossibleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createPlayerScreenIntent = new Intent(getApplicationContext(), createPlayerActivity.class);
                startActivity(createPlayerScreenIntent);
            }
        });
    }
}
