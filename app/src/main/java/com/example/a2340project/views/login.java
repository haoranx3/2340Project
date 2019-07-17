package com.example.a2340project.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a2340project.R;
import com.example.a2340project.model.DatabaseHelper;

public class login extends AppCompatActivity {

    private Button loginButton;
    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.playButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText username = (EditText) findViewById(R.id.usernameInput);
                String usernameStr = username.getText().toString();
                int[] info = helper.searchInfo(usernameStr);
                Intent loginIntent = new Intent(getApplicationContext(), createRegionActivity.class);
                loginIntent.putExtra("array", info);
                loginIntent.putExtra("name", usernameStr);
                startActivity(loginIntent);
            }
        });
    }
}