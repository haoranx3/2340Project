package com.example.a2340project.entity;

/**
 * Player class
 */
public class Player {
    private String username;
    private final String difficulty;
    private final int sailorPoints;
    private final int trainerPoints;
    private final int traderPoints;
    private final int engineerPoints;

    private int pokeDollars;
    private Ship ship;

    private Region currentRegion;

    /**
     * a globally unique number for this object
     */
    private int id;

    /**
     * makes player
     * @param name name
     * @param diff diff
     * @param sailor points
     * @param trainer points
     * @param trader points
     * @param engineer points
     * @param id id
     */
    @SuppressWarnings("ConstructorWithTooManyParameters")
    public Player(String name, String diff, int sailor, int trainer, int trader, int engineer,
                  int id) {
        username = name;
        difficulty = diff;
        sailorPoints = sailor;
        trainerPoints = trainer;
        traderPoints = trader;
        engineerPoints = engineer;
        pokeDollars = 1000;
        this.id = id;
        ship = new Ship(ShipEnum.SSAnne);
    }

    /**
     * gets name
     *
     * @return name
     */
    public String getUsername() {
        return username;
    }

    /**
     * gets difficulty
     *
     * @return diff
     */
    public String getDifficulty() {
        return difficulty;
    }

    /**
     * gets money
     *
     * @return money
     */
    public int getPokeDollars() {
        return pokeDollars;
    }

    /**
     * gets ship
     *
     * @return ship
     */
    public Ship getShip() {
        return ship;
    }

    /**
     * gets points
     *
     * @return points
     */

    public int getSailorPoints() {
        return sailorPoints;
    }

    /**
     * gets points
     *
     * @return points
     */
    public int getTrainerPoints() {
        return trainerPoints;
    }

    /**
     * gets points
     *
     * @return points
     */
    public int getTraderPoints() {
        return traderPoints;
    }

    /**
     * gets points
     *
     * @return points
     */
    public int getEngineerPoints() {
        return engineerPoints;
    }

    /**
     * gets id
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * gets region
     *
     * @return region
     */
    public Region getCurrentRegion() {
        return currentRegion;
    }

    /**
     * sets name
     *
     * @param username name
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * sets dollar
     *
     * @param pokeDollars dollar
     */
    public void setPokeDollars(int pokeDollars) {
        this.pokeDollars = pokeDollars;
    }

    /**
     * sets ship
     *
     * @param ship ship
     */
    public void setShip(Ship ship) {
        this.ship = ship;
    }

    /**
     * sets id
     *
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * sets region
     *
     * @param region region
     */
    public void setCurrentRegion(Region region) {
        currentRegion = region;
    }

}
