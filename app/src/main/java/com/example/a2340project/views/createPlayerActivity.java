package com.example.a2340project.views;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Gravity;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a2340project.viewmodels.CreatePlayerViewModel;

import com.example.a2340project.R;

/**
 * createPlayerActivity class
 */

public class createPlayerActivity extends AppCompatActivity {

    private CreatePlayerViewModel viewModel;

    private TextView skillPoints;
    private TextView skillPointsShadow;

    private EditText usernameField;

    private TextView sailorPoints;

    private TextView trainerPoints;

    private TextView traderPoints;

    private TextView engineerPoints;

    private int numPoints;

    private MediaPlayer selectFX;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_player);

        skillPoints = findViewById(R.id.pointsText);
        skillPointsShadow = findViewById(R.id.pointsTextShadow);

        usernameField = findViewById(R.id.usernameInput);

        sailorPoints = findViewById(R.id.sailorPoints);
        Button sailorMinus = findViewById(R.id.sailorMinus);
        Button sailorPlus = findViewById(R.id.sailorPlus);

        trainerPoints = findViewById(R.id.trainerPoints);
        Button trainerMinus = findViewById(R.id.trainerMinus);
        Button trainerPlus = findViewById(R.id.trainerPlus);

        traderPoints = findViewById(R.id.traderPoints);
        Button traderMinus = findViewById(R.id.traderMinus);
        Button traderPlus = findViewById(R.id.traderPlus);

        engineerPoints = findViewById(R.id.engineerPoints);
        Button engineerMinus = findViewById(R.id.engineerMinus);
        Button engineerPlus = findViewById(R.id.engineerPlus);

        Button createButton = findViewById(R.id.createButton);

        numPoints = 16;

        sailorMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pts = Integer.parseInt(sailorPoints.getText().toString());
                if ((numPoints != 16) && (pts != 0)) {
                    selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                    selectFX.setVolume(1f/10f,1f/10f);
                    selectFX.start();
                    numPoints++;
                    String totalPoints = numPoints + "pts";
                    sailorPoints.setText(String.valueOf(pts - 1));
                    skillPoints.setText(totalPoints);
                    skillPointsShadow.setText(totalPoints);
                }
            }
        });

        sailorPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pts = Integer.parseInt(sailorPoints.getText().toString());
                if ((numPoints != 0) && (pts != 16)) {
                    selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                    selectFX.setVolume(1f/10f,1f/10f);
                    selectFX.start();
                    numPoints--;
                    String totalPoints = numPoints + "pts";
                    sailorPoints.setText(String.valueOf(pts + 1));
                    skillPoints.setText(totalPoints);
                    skillPointsShadow.setText(totalPoints);
                }
            }
        });

        trainerMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pts = Integer.parseInt(trainerPoints.getText().toString());
                if ((numPoints != 16) && (pts != 0)) {
                    selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                    selectFX.setVolume(1f/10f,1f/10f);
                    selectFX.start();
                    numPoints++;
                    String totalPoints = numPoints + "pts";
                    trainerPoints.setText(String.valueOf(pts - 1));
                    skillPoints.setText(totalPoints);
                    skillPointsShadow.setText(totalPoints);
                }
            }
        });

        trainerPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pts = Integer.parseInt(trainerPoints.getText().toString());
                if ((numPoints != 0) && (pts != 16)) {
                    selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                    selectFX.setVolume(1f/10f,1f/10f);
                    selectFX.start();
                    numPoints--;
                    String totalPoints = numPoints + "pts";
                    trainerPoints.setText(String.valueOf(pts + 1));
                    skillPoints.setText(totalPoints);
                    skillPointsShadow.setText(totalPoints);
                }
            }
        });

        traderMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pts = Integer.parseInt(traderPoints.getText().toString());
                if ((numPoints != 16) && (pts != 0)) {
                    selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                    selectFX.setVolume(1f/10f,1f/10f);
                    selectFX.start();
                    numPoints++;
                    String totalPoints = numPoints + "pts";
                    traderPoints.setText(String.valueOf(pts - 1));
                    skillPoints.setText(totalPoints);
                    skillPointsShadow.setText(totalPoints);
                }
            }
        });

        traderPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pts = Integer.parseInt(traderPoints.getText().toString());
                if ((numPoints != 0) && (pts != 16)) {
                    selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                    selectFX.setVolume(1f/10f,1f/10f);
                    selectFX.start();
                    numPoints--;
                    String totalPoints = numPoints + "pts";
                    traderPoints.setText(String.valueOf(pts + 1));
                    skillPoints.setText(totalPoints);
                    skillPointsShadow.setText(totalPoints);
                }
            }
        });

        engineerMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pts = Integer.parseInt(engineerPoints.getText().toString());
                if ((numPoints != 16) && (pts != 0)) {
                    selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                    selectFX.setVolume(1f/10f,1f/10f);
                    selectFX.start();
                    numPoints++;
                    String totalPoints = numPoints + "pts";
                    engineerPoints.setText(String.valueOf(pts - 1));
                    skillPoints.setText(totalPoints);
                    skillPointsShadow.setText(totalPoints);
                }
            }
        });

        engineerPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pts = Integer.parseInt(engineerPoints.getText().toString());
                if ((numPoints != 0) && (pts != 16)) {
                    selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                    selectFX.setVolume(1f/10f,1f/10f);
                    selectFX.start();
                    numPoints--;
                    String totalPoints = numPoints + "pts";
                    engineerPoints.setText(String.valueOf(pts + 1));
                    skillPoints.setText(totalPoints);
                    skillPointsShadow.setText(totalPoints);
                }
            }
        });

        createButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                selectFX.setVolume(1f/10f,1f/10f);
                selectFX.start();
                int usernameLength = usernameField.getText().toString().trim().length();
                if ((usernameLength == 0) || (numPoints != 0)) {
                    String err = (usernameLength == 0) ? "Must enter a username!"
                            : "Must allocate all points!";
                    Toast toast = Toast.makeText(getApplicationContext(), err, Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0,0);
                    toast.show();
                } else {
                    String username = usernameField.getText().toString();
                    int sailorSkills = Integer.parseInt(sailorPoints.getText().toString());
                    int trainerSkills = Integer.parseInt(trainerPoints.getText().toString());
                    int traderSkills = Integer.parseInt(traderPoints.getText().toString());
                    int engineerSkills = Integer.parseInt(engineerPoints.getText().toString());
                    Intent displayPlayerIntent = new Intent(getApplicationContext(),
                            displayPlayerActivity.class);
                    displayPlayerIntent.putExtra("username", username);
                    displayPlayerIntent.putExtra("sailorPoints", sailorSkills);
                    displayPlayerIntent.putExtra("trainerPoints", trainerSkills);
                    displayPlayerIntent.putExtra("traderPoints", traderSkills);
                    displayPlayerIntent.putExtra("engineerPoints", engineerSkills);
                    displayPlayerIntent.putExtra("diff", getIntent().getStringExtra("diff"));
                    startActivity(displayPlayerIntent);
                }
            }
        });

    }
}