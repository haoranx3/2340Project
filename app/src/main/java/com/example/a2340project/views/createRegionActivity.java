package com.example.a2340project.views;

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
import com.example.a2340project.entity.City;
import com.example.a2340project.entity.Region;

import java.util.ArrayList;
import java.util.List;

public class createRegionActivity extends AppCompatActivity {

    private Button exit;
    private HorizontalScrollView map;
    private ImageView background;
    private RelativeLayout screen;

    private MediaPlayer selectFX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_region);

        exit = findViewById(R.id.exitButton);
        map = findViewById(R.id.map);
        background = findViewById(R.id.mapBackground);
        screen = findViewById(R.id.screen);

        List<Region> allRegions = new ArrayList<>(12);

        City PalletTown = new City("Pallet",0,0,0,0,0,0,0,0,0);
        City ViridianCity = new City("Viridian",0,0,0,0,0,0,0,0,0);
        City NewBarkTown = new City("NewBark",0,0,0,0,0,0,0,0,0);
        City CherryGroveCity = new City("CherryGrove",0,0,0,0,0,0,0,0,0);
        City LittleRootTown = new City("LittleRoot",0,0,0,0,0,0,0,0,0);
        City OldaleTown = new City("Oldale",0,0,0,0,0,0,0,0,0);
        City PyriteTown = new City("Pyrite",0,0,0,0,0,0,0,0,0);
        City PhenacCity = new City("Phenac",0,0,0,0,0,0,0,0,0);
        City AmbretteTown = new City("Ambrette",0,0,0,0,0,0,0,0,0);
        City AnistarCity = new City("Anistar",0,0,0,0,0,0,0,0,0);
        City CoconaVillage = new City("Cocona",0,0,0,0,0,0,0,0,0);
        City TiltVillage = new City("Tilt",0,0,0,0,0,0,0,0,0);
        City ChicoleVillage = new City("Chicole",0,0,0,0,0,0,0,0,0);
        City VienTown = new City("Vien",0,0,0,0,0,0,0,0,0);
        City NuvemaTown = new City("Nuvema",0,0,0,0,0,0,0,0,0);
        City AccumulaTown = new City("Accumula",0,0,0,0,0,0,0,0,0);
        City FallCity = new City("Fall",0,0,0,0,0,0,0,0,0);
        City RingTown = new City("Ring",0,0,0,0,0,0,0,0,0);
        City TwinleafTown = new City("Twinleaf",0,0,0,0,0,0,0,0,0);
        City SandgemTown = new City("Sandgem",0,0,0,0,0,0,0,0,0);
        City OneIsland = new City("OneIsland",0,0,0,0,0,0,0,0,0);
        City TwoIsland = new City("TwoIsland",0,0,0,0,0,0,0,0,0);
        City ValenciaIsland = new City("Valencia",0,0,0,0,0,0,0,0,0);
        City TangeloIsland = new City("Tangelo",0,0,0,0,0,0,0,0,0);

        allRegions.add(new Region("KANTO",  0,  0,  0,  1, PalletTown, ViridianCity));
        allRegions.add(new Region("JOHTO",  1,  1,  0,  1, NewBarkTown, CherryGroveCity));
        allRegions.add(new Region("HOENN",  2,  2,  0,  1, LittleRootTown, OldaleTown));
        allRegions.add(new Region("ORRE",  3,  3,  0,  1, PyriteTown, PhenacCity));
        allRegions.add(new Region("KALOS",  4,  4,  0,  1, AmbretteTown, AnistarCity));
        allRegions.add(new Region("OBLIVIA",  5,  5,  0,  1, CoconaVillage, TiltVillage));
        allRegions.add(new Region("ALMIA",  6,  6,  0,  1, ChicoleVillage, VienTown));
        allRegions.add(new Region("UNOVA",  7,  7,  0,  1, NuvemaTown, AccumulaTown));
        allRegions.add(new Region("FIORE",  8,  8,  0,  1, FallCity, RingTown));
        allRegions.add(new Region("SINNOH",  9,  9,  0,  1, TwinleafTown, SandgemTown));
        allRegions.add(new Region("SEVII_ISLANDS",  10,  10,  0,  1, OneIsland, TwoIsland));
        allRegions.add(new Region("ORANGE_ISLANDS",  11,  11,  0,  1, ValenciaIsland, TangeloIsland));

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
        for(Region var: allRegions) {
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
