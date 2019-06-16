package com.example.a2340project.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Gravity;
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
                int usernameLength = usernameField.getText().toString().trim().length();
                if (usernameLength == 0 || numPoints != 0) {
                    String err = (usernameLength == 0) ? "Must enter a username!" : "Must allocate all points!";
                    Toast toast = Toast.makeText(getApplicationContext(), err, Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER, 0,0);
                    toast.show();
                } else {
                    String username = usernameField.getText().toString();
                    int sailorSkills = Integer.parseInt(sailorPoints.getText().toString());
                    int trainerSkills = Integer.parseInt(trainerPoints.getText().toString());
                    int traderSkills = Integer.parseInt(traderPoints.getText().toString());
                    int engineerSkills = Integer.parseInt(engineerPoints.getText().toString());
                    Intent displayPlayerIntent = new Intent(getApplicationContext(), displayPlayerActivity.class);
                    displayPlayerIntent.putExtra("username", username);
                    displayPlayerIntent.putExtra("sailorPoints", sailorSkills);
                    displayPlayerIntent.putExtra("trainerPoints", trainerSkills);
                    displayPlayerIntent.putExtra("traderPoints", traderSkills);
                    displayPlayerIntent.putExtra("engineerPoints", engineerSkills);
                    startActivity(displayPlayerIntent);
                }
            }
        });

    }
}




//        if (getSupportActionBar() != null) {
//            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
//            getSupportActionBar().setHomeButtonEnabled(false);
//        }
//        idField = findViewById(R.id.Player_id_field);
//        usernameField = findViewById(R.id.player_name_input);
//        pilotField = findViewById(R.id.PilotSkill_spinner);
//        fighterField = findViewById(R.id.FighterSkill_spinner);
//        traderField = findViewById(R.id.TraderSkill_spinner);
//        engineerField = findViewById(R.id.EngineerSkill_spinner);
//        diffSpinner = findViewById(R.id.Difficulty_spinner);
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Player.diffList);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        diffSpinner.setAdapter(adapter);
//
//        player = new Player();
//        usernameField.setText(player.getUserName());
//        idField.setText(String.format("Player ID: %d", player.getId()));
//        pilotField.setText(player.getPilot()+"");
//        fighterField.setText(player.getFighter()+"");
//        traderField.setText(player.getTrader()+"");
//        engineerField.setText(player.getEngineering()+"");
//        viewModel = ViewModelProviders.of(this).get(CreatePlayerViewModel.class);




//
//    public void onAddPressed(View view) {
//        player.setUserName(usernameField.getText().toString());
//        player.setDifficulties((String) diffSpinner.getSelectedItem());
//        int pilot = Integer.valueOf(pilotField.getText().toString());
//        int trade = Integer.valueOf(traderField.getText().toString());
//        int engineer = Integer.valueOf(engineerField.getText().toString());
//        int fighter = Integer.valueOf(fighterField.getText().toString());
//        if (pilot + trade + engineer + fighter != 16) {
//            Context context = getApplicationContext();
//            CharSequence text = "Skill Points must sum to 16!";
//            int duration = Toast.LENGTH_SHORT;
//            Toast toast = Toast.makeText(context, text, duration);
//            toast.show();
//        } else {
//            player.setPilot(pilot);
//            player.setFighter(fighter);
//            player.setEngineering(engineer);
//            player.setTrader(trade);
//            viewModel.addPlayer(player);
//            Context context = getApplicationContext();
//            CharSequence text = "Player # " + player.getId() + " created! ";
//            int duration = Toast.LENGTH_SHORT;
//            Toast toast = Toast.makeText(context, text, duration);
//            toast.show();
//        }
//    }
//
//    public void onCancelPressed(View view) {
//        onBackPressed();
//    }
