package com.example.a2340project.views;

import java.util.Random;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.HorizontalScrollView;
import android.widget.Button;

import com.example.a2340project.R;
import com.example.a2340project.entity.Region;
import com.example.a2340project.entity.RegionEnum;

public class createRegionActivity extends AppCompatActivity {

    private Button exit;
    private HorizontalScrollView map;
    private ImageView background;
    private RelativeLayout screen;

    private MediaPlayer selectFX;

    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_region);

        exit = findViewById(R.id.exitButton);
        map = findViewById(R.id.map);
        background = findViewById(R.id.mapBackground);
        screen = findViewById(R.id.screen);

        random = new Random();

        Region[] regions = new Region[12];

        for (RegionEnum region : RegionEnum.values()) {
            regions[region.ordinal()] = new Region(region, region.getX(), region.getY(), 5, 0, random.nextInt(2));
        }


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                selectFX.setVolume(1f/10f,1f/10f);
                selectFX.start();
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });


        final String TAG = "Display Tag";
        for (Region var: regions) {
            Log.d(TAG, var.toString());
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                map.smoothScrollTo(background.getWidth()/2 - screen.getWidth()/2, 0);
            }
        }, 500);
    }

}
