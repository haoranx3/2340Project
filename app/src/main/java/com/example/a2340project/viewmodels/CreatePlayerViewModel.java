package com.example.a2340project.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import java.util.List;

import com.example.a2340project.entity.Player;
import com.example.a2340project.model.Model;
import com.example.a2340project.model.PlayerInteractor;

public class CreatePlayerViewModel extends AndroidViewModel {
    private PlayerInteractor interactor;

    public CreatePlayerViewModel(@NonNull Application application) {
        super(application);
        interactor = Model.getInstance().getPlayerInteractor();
    }

    public void updatePlayer(Player p) {
        interactor.addPlayer(p);
    }

    public void addPlayer(Player p) {
        interactor.addPlayer(p);
    }

    public List<Player> getAllPlayers() {
        return interactor.getAllPlayers();
    }
}
