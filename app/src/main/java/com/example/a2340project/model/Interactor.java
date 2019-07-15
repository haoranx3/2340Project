package com.example.a2340project.model;

import android.util.Log;

import com.example.a2340project.entity.Player;

import java.util.List;

abstract class Interactor {
    private final Repository myRepository;

    Interactor(Repository repo) {
        myRepository = repo;
    }

    Repository getRepository() {
        return myRepository;
    }

    public List<Player> getAllPlayers() {
        return getRepository().getAllPlayers();
    }

    public void addPlayer (Player s) {
        getRepository().addPlayer(s);
    }

    public void updatePlayer(Player s) {
        getRepository().updatePlayer(s);
        Log.d("APP", "Interactor: updating player: " + s);
    }
}
