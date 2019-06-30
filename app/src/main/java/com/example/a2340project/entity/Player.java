package com.example.a2340project.entity;

public class Player {
    private String username;
    private String difficulty;
    private int sailorPoints;
    private int trainerPoints;
    private int traderPoints;
    private int engineerPoints;

    private int pokeDollars;
    private Ship ship;

    private Region currentRegion;

    /** a globally unique number for this object */
    private int id;

    public Player(String name, String diff, int sailor, int trainer, int trader, int engineer) {
        username = name;
        difficulty = diff;
        sailorPoints = sailor;
        trainerPoints = trainer;
        traderPoints = trader;
        engineerPoints = engineer;
        pokeDollars = 1000;
        ship = new Ship(ShipEnum.SSAnne);
    }

    public String getUsername() {
        return username;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public int getPokeDollars() {
        return pokeDollars;
    }

    public Ship getShip() {
        return ship;
    }

    public int getSailorPoints() {
        return sailorPoints;
    }

    public int getTrainerPoints() {
        return trainerPoints;
    }

    public int getTraderPoints() {
        return traderPoints;
    }

    public int getEngineerPoints() {
        return engineerPoints;
    }

    public int getId() {
        return id;
    }

    public Region getCurrentRegion() {
        return currentRegion;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPokeDollars(int pokeDollars) {
        this.pokeDollars = pokeDollars;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCurrentRegion(Region region) {
        currentRegion = region;
    }

    public void sell(int indexForItem, Ship ship) {
        if (ship.getCargo(indexForItem) > 0) {
            ship.setCargo(indexForItem, ship.getCargo(indexForItem) - 1);
            pokeDollars = pokeDollars + indexForItem + 1;
            ship.setNumberOfCargo(ship.getNumberOfCargo() - 1);
        } else {
            throw new RuntimeException("You can not sell something you dont have");
        }
    }

    public void buy(int indexForItem, Ship ship) {
        if (ship.getNumberOfCargo() == ship.getCargoBay()) {
            throw new RuntimeException("Your bag is full, can not buy more stuff");
        } else if (pokeDollars >= (indexForItem + 1)) {
            pokeDollars = pokeDollars - (indexForItem + 1);
            ship.setCargo(indexForItem, ship.getCargo(indexForItem) + 1);
            ship.setNumberOfCargo(ship.getNumberOfCargo() + 1);
        } else {
            throw new RuntimeException("You dont have enough money");
        }
    }

    @Override
    public String toString() {
        return String.format("Player: %s, game difficulties: %s, pilot skills: %d, trader skills: %d, fighter skills: %d, " +
                "engineering skills: %d ID: %d%n", username, difficulty, sailorPoints, trainerPoints, traderPoints, engineerPoints, id);
    }



}
