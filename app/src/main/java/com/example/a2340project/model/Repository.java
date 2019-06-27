package com.example.a2340project.model;

import android.util.Log;

import com.example.a2340project.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class Repository {

    /***
     * This provides a mechanism to generate simple unique numbers to be used as
     * keys in the application
     */
    private static int next_id = 1;
    private static int getNextUniqueID() {
        return next_id++;
    }

    private List<Player> allPlayers;

    /**
     * Make a new Repository object
     */
    public Repository() {
        allPlayers = new ArrayList<>();
    }

    public List<Player> getAllPlayers() {
        return allPlayers;
    }

    /**
     * add a new player to the system
     * @param player the new player
     */
    public void addPlayer(Player player) {
        player.setId(Repository.getNextUniqueID());

    }

    /**
     * a player can only change the username
     * @param player
     */
    public void updatePlayer(Player player) {
        for (Player player1 : allPlayers) {
            if (player1.getId() == player.getId()) {
                player1.setUserName(player.getUserName());
                return;
            }
        }
        Log.d("APP", "Player not found with id: " + player.getId());
    }
}
