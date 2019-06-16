package com.example.a2340project.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a2340project.entity.Player;
import com.example.a2340project.viewmodels.CreatePlayerViewModel;

import com.example.a2340project.R;

public class createPlayerActivity extends AppCompatActivity {

    private CreatePlayerViewModel viewModel;

    private TextView skillPoints;
    private TextView skillPointsShadow;

    private EditText usernameField;

    private TextView sailorPoints;
    private Button sailorMinus;
    private Button sailorPlus;

    private TextView trainerPoints;
    private Button trainerMinus;
    private Button trainerPlus;

    private TextView traderPoints;
    private Button traderMinus;
    private Button traderPlus;

    private TextView engineerPoints;
    private Button engineerMinus;
    private Button engineerPlus;

    private Button createButton;
    private Player player;

    private boolean noPointsLeft;
    private int numPoints;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_player);

        skillPoints = findViewById(R.id.pointsText);
        skillPointsShadow = findViewById(R.id.pointsTextShadow);

        usernameField = findViewById(R.id.usernameInput);

        sailorPoints = findViewById(R.id.sailorPoints);
        sailorMinus = findViewById(R.id.sailorMinus);
        sailorPlus = findViewById(R.id.sailorPlus);

        trainerPoints = findViewById(R.id.trainerPoints);
        trainerMinus = findViewById(R.id.trainerMinus);
        trainerPlus = findViewById(R.id.trainerPlus);

        traderPoints = findViewById(R.id.traderPoints);
        traderMinus = findViewById(R.id.traderMinus);
        traderPlus = findViewById(R.id.traderPlus);

        engineerPoints = findViewById(R.id.engineerPoints);
        engineerMinus = findViewById(R.id.engineerMinus);
        engineerPlus = findViewById(R.id.engineerPlus);

        createButton = findViewById(R.id.createButton);

        noPointsLeft = false;
        numPoints = 16;

        sailorMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pts = Integer.parseInt(sailorPoints.getText().toString());
                if (numPoints != 16 && pts != 0) {
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
                if (numPoints != 0 && pts != 16) {
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
                if (numPoints != 16 && pts != 0) {
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
                if (numPoints != 0 && pts != 16) {
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
                if (numPoints != 16 && pts != 0) {
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
                if (numPoints != 0 && pts != 16) {
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
                if (numPoints != 16 && pts != 0) {
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
                if (numPoints != 0 && pts != 16) {
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
                if (usernameField.getText().toString() == "" || numPoints != 0) {
                    Toast.makeText(getApplicationContext(), "Can't do that!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "To be implemented later", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}