package com.example.a2340project.views;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a2340project.R;

public class displayPlayerActivity extends AppCompatActivity {

    private ImageView sprite;
    private AnimationDrawable spriteAnimation;
    private TextView stats;
    private TextView name;
    private Button yes;
    private Button no;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_player);

        sprite = findViewById(R.id.spriteImage);
        stats = findViewById(R.id.statsBox);
        name = findViewById(R.id.confirmText);
        yes = findViewById(R.id.yesButton);
        no = findViewById(R.id.noButton);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String username = (String) bundle.get("username");
            int sailorPoints = (int) bundle.get("sailorPoints");
            int trainerPoints = (int) bundle.get("trainerPoints");
            int traderPoints = (int) bundle.get("traderPoints");
            int engineerPoints = (int) bundle.get("engineerPoints");
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
                Intent createPlayerScreenIntent = new Intent(getApplicationContext(), createPlayerActivity.class);
                startActivity(createPlayerScreenIntent);
            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "To be implemented!", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0,0);
                toast.show();
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
