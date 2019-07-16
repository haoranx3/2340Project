package com.example.a2340project.views;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a2340project.R;
import com.example.a2340project.entity.Player;
import com.example.a2340project.model.DatabaseHelper;
import com.example.a2340project.viewmodels.CreatePlayerViewModel;

public class displayPlayerActivity extends AppCompatActivity {

    private CreatePlayerViewModel viewModel;

    private ImageView sprite;
    private AnimationDrawable spriteAnimation;
    private TextView stats;
    private TextView name;
    private Button yes;
    private Button no;

    String username;
    int sailorPoints;
    int trainerPoints;
    int traderPoints;
    int engineerPoints;
    String diff;

    private Player player;

    private MediaPlayer selectFX;

    DatabaseHelper helper = new DatabaseHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_player);

        sprite = findViewById(R.id.spriteImage);
        stats = findViewById(R.id.statsBox);
        name = findViewById(R.id.confirmText);
        yes = findViewById(R.id.yesButton);
        no = findViewById(R.id.noButton);

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
                selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                selectFX.setVolume(1f/10f,1f/10f);
                selectFX.start();
                finish();
            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = helper.getProfilesCount();
                helper.close();
                selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                selectFX.setVolume(1f/10f,1f/10f);
                selectFX.start();
                player = new Player(username, diff, sailorPoints, trainerPoints, traderPoints, engineerPoints, count + 1);
                viewModel.addPlayer(player);

                Log.d("player added", "Player's name: " + player.getUsername() + " sailor points: " +
                        player.getSailorPoints() + " trainer points: " + player.getTrainerPoints() + " trader points: "
                        + player.getTraderPoints() +
                        " engineer points: "
                        + player.getEngineerPoints() + " credits: " + player.getPokeDollars() + " ship: "
                        + player.getShip().getName());

                helper.insertPlayer(player);

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
