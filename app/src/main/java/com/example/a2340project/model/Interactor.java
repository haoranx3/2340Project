package com.example.a2340project.model;

import android.util.Log;

import com.example.a2340project.entity.Player;

import java.util.List;

public abstract class Interactor {
    private Repository myRepository;

    protected Interactor(Repository repo) {
        myRepository = repo;
    }

    protected Repository getRepository() {
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
