package com.example.a2340project.views;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a2340project.R;
import com.example.a2340project.entity.Player;
import com.example.a2340project.viewmodels.CreatePlayerViewModel;

public class createPlayerActivity extends AppCompatActivity {

    private CreatePlayerViewModel viewModel;

    private TextView idField;
    private EditText usernameField;
    private EditText pilotField;
    private EditText fighterField;
    private EditText traderField;
    private EditText engineerField;
    private Spinner diffSpinner;
    private Player player;
    private boolean editing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_player);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
            getSupportActionBar().setHomeButtonEnabled(false);
        }
        idField = findViewById(R.id.Player_id_field);
        usernameField = findViewById(R.id.player_name_input);
        pilotField = findViewById(R.id.PilotSkill_spinner);
        fighterField = findViewById(R.id.FighterSkill_spinner);
        traderField = findViewById(R.id.TraderSkill_spinner);
        engineerField = findViewById(R.id.EngineerSkill_spinner);
        diffSpinner = findViewById(R.id.Difficulty_spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, Player.diffList);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        diffSpinner.setAdapter(adapter);

        player = new Player();
        usernameField.setText(player.getUserName());
        idField.setText(String.format("Player ID: %d", player.getId()));
        pilotField.setText(player.getPilot()+"");
        fighterField.setText(player.getFighter()+"");
        traderField.setText(player.getTrader()+"");
        engineerField.setText(player.getEngineering()+"");
        viewModel = ViewModelProviders.of(this).get(CreatePlayerViewModel.class);
    }

    public void onAddPressed(View view) {
        player.setUserName(usernameField.getText().toString());
        player.setDifficulties((String) diffSpinner.getSelectedItem());
        int pilot = Integer.valueOf(pilotField.getText().toString());
        int trade = Integer.valueOf(traderField.getText().toString());
        int engineer = Integer.valueOf(engineerField.getText().toString());
        int fighter = Integer.valueOf(fighterField.getText().toString());
        if (pilot + trade + engineer + fighter != 16) {
            Context context = getApplicationContext();
            CharSequence text = "Skill Points must sum to 16!";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            player.setPilot(pilot);
            player.setFighter(fighter);
            player.setEngineering(engineer);
            player.setTrader(trade);
            viewModel.addPlayer(player);
            Context context = getApplicationContext();
            CharSequence text = "Player # " + player.getId() + " created! ";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    public void onCancelPressed(View view) {
        onBackPressed();
    }
}
