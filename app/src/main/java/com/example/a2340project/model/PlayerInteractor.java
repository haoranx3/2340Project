package com.example.a2340project.model;

import android.util.Log;

import com.example.a2340project.entity.Player;

import java.util.List;

public class PlayerInteractor extends Interactor{
    public PlayerInteractor(Repository myRepository) {
        super(myRepository);
    }

    public List<Player> getAllPlayers() {
        return getRepository().getAllPlayers();
    }

    public void addPlayer(Player p) {
        getRepository().addPlayer(p);
    }

    public void updatePlayer(Player p) {
        getRepository().updatePlayer(p);
        Log.d("APP", "Interactor: updating player: " + p);
    }
}
