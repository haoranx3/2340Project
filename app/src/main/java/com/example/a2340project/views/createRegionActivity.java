package com.example.a2340project.views;

import android.icu.util.VersionInfo;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.a2340project.entity.City;
import com.example.a2340project.entity.City;
import com.example.a2340project.entity.Region;

import java.util.ArrayList;
import java.util.List;

public class createRegionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        allRegions.add(new Region("JOHTO",  0,  0,  0,  1, NewBarkTown, CherryGroveCity));
        allRegions.add(new Region("HOENN",  0,  0,  0,  1, LittleRootTown, OldaleTown));
        allRegions.add(new Region("ORRE",  0,  0,  0,  1, PyriteTown, PhenacCity));
        allRegions.add(new Region("KALOS",  0,  0,  0,  1, AmbretteTown, AnistarCity));
        allRegions.add(new Region("OBLIVIA",  0,  0,  0,  1, CoconaVillage, TiltVillage));
        allRegions.add(new Region("ALMIA",  0,  0,  0,  1, ChicoleVillage, VienTown));
        allRegions.add(new Region("UNOVA",  0,  0,  0,  1, NuvemaTown, AccumulaTown));
        allRegions.add(new Region("FIORE",  0,  0,  0,  1, FallCity, RingTown));
        allRegions.add(new Region("SINNOH",  0,  0,  0,  1, TwinleafTown, SandgemTown));
        allRegions.add(new Region("SEVII_ISLANDS",  0,  0,  0,  1, OneIsland, TwoIsland));
        allRegions.add(new Region("ORANGE_ISLANDS",  0,  0,  0,  1, ValenciaIsland, TangeloIsland));

        for (Region a:allRegions) {
            Log.d("RegionCreated", "Region name" + a.toString());
        }
    }
}
