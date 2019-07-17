package com.example.a2340project.model;

import com.example.a2340project.entity.Player;

import java.util.ArrayList;
import java.util.List;

class Repository {

    /***
     * This provides a mechanism to generate simple unique numbers to be used as
     * keys in the application
     */
    private static int next_id = 1;
    private static int getNextUniqueID() {
        int result = next_id;
        next_id++;
        return result;
    }

    private final List<Player> allPlayers;

    /**
     * Make a new Repository object
     */
    public Repository() {
        allPlayers = new ArrayList<>();
    }

    public List<Player> getAllPlayers() {
        //noinspection AssignmentOrReturnOfFieldWithMutableType
        return allPlayers;
    }

    /**
     * add a new player to the system
     * @param player the new player
     */
    public void addPlayer(Player player) {
        allPlayers.add(player);
    }

    /**
     * a player can only change the username
     * @param player player
     */
    public void updatePlayer(Player player) {
        for (Player player1 : allPlayers) {
            if (player1.getId() == player.getId()) {
                player1.setUsername(player.getUsername());
                return;
            }
        }
    }
}
