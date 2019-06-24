package com.example.a2340project.views;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a2340project.R;
import com.example.a2340project.entity.Player;
import com.example.a2340project.viewmodels.CreatePlayerViewModel;

public class displayPlayerActivity extends AppCompatActivity {

    private CreatePlayerViewModel viewModel;

    private ImageView sprite;
    private AnimationDrawable spriteAnimation;
    private TextView stats;
    private TextView name;
    private Button yes;
    private Button no;
    private Button exit;

    String username;
    int sailorPoints;
    int trainerPoints;
    int traderPoints;
    int engineerPoints;
    String diff;

    private Player player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_player);

        sprite = findViewById(R.id.spriteImage);
        stats = findViewById(R.id.statsBox);
        name = findViewById(R.id.confirmText);
        yes = findViewById(R.id.yesButton);
        no = findViewById(R.id.noButton);
        exit = findViewById(R.id.exitButton);

        yes.setVisibility(View.VISIBLE);
        no.setVisibility(View.VISIBLE);
        exit.setVisibility(View.GONE);

        viewModel = ViewModelProviders.of(this).get(CreatePlayerViewModel.class);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            username = (String) bundle.get("username");
            sailorPoints = (int) bundle.get("sailorPoints");
            trainerPoints = (int) bundle.get("trainerPoints");
            traderPoints = (int) bundle.get("traderPoints");
            engineerPoints = (int) bundle.get("engineerPoints");
            diff = (String) bundle.get("diff");
            String message = name.getText().toString() + " " + username + "?";
            name.setText(message);
            String statText = "\n Sailor: " + sailorPoints + "\n"
                    + "\n Trainer: " + trainerPoints + "\n"
                    + "\n Trader: " + traderPoints + "\n"
                    + "\n Engineer: " + engineerPoints;
            stats.setText(statText);
        }

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent createPlayerScreenIntent = new Intent(getApplicationContext(), createPlayerActivity.class);
                //startActivity(createPlayerScreenIntent);
                finish();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                player = new Player(username, diff, sailorPoints, trainerPoints, traderPoints, engineerPoints);
                viewModel.addPlayer(player);
                Log.d("player added", "Player's name: " + player.getUserName() + " pilot points: " +
                        player.getPilot() + " fighter points: " + player.getFighter() + " trader points: " + player.getTrader() +
                        " engineer points: " + player.getEngineering() + " credits: 1000 ship: Gnat");
                yes.setVisibility(View.GONE);
                no.setVisibility(View.GONE);
                exit.setVisibility(View.VISIBLE);
                String err = "Player " + player.getUserName() + " created!";
                Toast toast = Toast.makeText(getApplicationContext(), err, Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0,0);
                toast.show();
                Intent createRegionIntent = new Intent(getApplicationContext(), createRegionActivity.class);
                startActivity(createRegionIntent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        sprite.setBackgroundResource(R.drawable.sprite_animation);
        spriteAnimation = (AnimationDrawable) sprite.getBackground();
        spriteAnimation.start();
    }


}
