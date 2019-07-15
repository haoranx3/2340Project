package com.example.a2340project.entity;

/**
 * this is City
 */

public class City {
    private final String cityName;
    private int freshWaterPrice;
    private int scarfPrice;
    private int berriesPrice;
    private int nuggetsPrice;
    private int pokeDollPrice;
    private int pokemonPrice;
    private int potionsPrice;
    private int technicalMachinePrice;
    private int bigMushroomPrice;
    private int pokeBallPrice;
    private final int techLevel;
    private final int resources;

    /**
     * this is City
     * @param cityName cityname
     * @param techLevel techlevel
     * @param resources resources
     */

    public City(String cityName, int techLevel, int resources) {
        this.cityName = cityName;
        this.techLevel = techLevel;
        this.resources = resources;
        this.freshWaterPrice = configurePrice(30, 3, 0);
        this.scarfPrice = configurePrice(250, 10, 0);
        this.berriesPrice = configurePrice(100, 5, 1);
        this.nuggetsPrice = configurePrice(350, 20, 2);
        this.pokeDollPrice = configurePrice(250, -10, 3);
        this.pokemonPrice = configurePrice(1250, -75, 3);
        this.potionsPrice = configurePrice(650, -20, 4);
        this.technicalMachinePrice = configurePrice(900, -30, 4);
        this.bigMushroomPrice = configurePrice(3500, -125, 5);
        this.pokeBallPrice = configurePrice(5000, -150, 6);
    }

    private int configurePrice(int base, int IPL, int MTLP) {
        if (MTLP <= techLevel) {
            return base + (IPL * (techLevel - MTLP));
        }
        return -1;
    }

    /**
     * return attribute
     * @return cityname
     */

    public String getCityName() {
        return cityName;
    }

    /**
     * return attribute
     * @return price
     */
    public int getFreshWaterPrice() {
        return freshWaterPrice;
    }

    /**
     * return attribute
     * @param freshWaterPrice price
     */
    public void setFreshWaterPrice(int freshWaterPrice) {
        this.freshWaterPrice = freshWaterPrice;
    }

    /**
     * return attribute
     * @return price
     */
    public int getScarfPrice() {
        return scarfPrice;
    }

    /**
     * return attribute
     * @param scarfPrice price
     */
    public void setScarfPrice(int scarfPrice) {
        this.scarfPrice = scarfPrice;
    }

    /**
     * return attribute
     * @return price
     */
    public int getBerriesPrice() {
        return berriesPrice;
    }

    /**
     * add attribute
     * @param berriesPrice price
     */
    public void setBerriesPrice(int berriesPrice) {
        this.berriesPrice = berriesPrice;
    }

    /**
     * return attribute
     * @return price
     */
    public int getNuggetsPrice() {
        return nuggetsPrice;
    }
    /**
     * return attribute
     * @param nuggetsPrice price
     */
    public void setNuggetsPrice(int nuggetsPrice) {
        this.nuggetsPrice = nuggetsPrice;
    }

    /**
     * return attribute
     * @return price
     */
    public int getPokeDollPrice() {
        return pokeDollPrice;
    }

    /**
     * return attribute
     * @param pokeDollPrice price
     */
    public void setPokeDollPrice(int pokeDollPrice) {
        this.pokeDollPrice = pokeDollPrice;
    }

    /**
     * return attribute
     * @return price
     */
    public int getPokemonPrice() {
        return pokemonPrice;
    }

    /**
     * return attribute
     * @param pokemonPrice price
     */
    public void setPokemonPrice(int pokemonPrice) {
        this.pokemonPrice = pokemonPrice;
    }

    /**
     * return attribute
     * @return price
     */
    public int getPotionsPrice() {
        return potionsPrice;
    }

    /**
     * return attribute
     * @param potionsPrice price
     */
    public void setPotionsPrice(int potionsPrice) {
        this.potionsPrice = potionsPrice;
    }

    /**
     * return attribute
     * @return price
     */
    public int getTechnicalMachinePrice() {
        return technicalMachinePrice;
    }

    /**
     * return attribute
     * @param technicalMachinePrice price
     */
    public void setTechnicalMachinePrice(int technicalMachinePrice) {
        this.technicalMachinePrice = technicalMachinePrice;
    }

    /**
     * return attribute
     * @return price
     */
    public int getBigMushroomPrice() {
        return bigMushroomPrice;
    }

    /**
     * return attribute
     * @param bigMushroomPrice price
     */
    public void setBigMushroomPrice(int bigMushroomPrice) {
        this.bigMushroomPrice = bigMushroomPrice;
    }

    /**
     * return attribute
     * @return price
     */
    public int getPokeBallPrice() {
        return pokeBallPrice;
    }

    /**
     * return attribute
     * @param pokeBallPrice price
     */
    public void setPokeBallPrice(int pokeBallPrice) {
        this.pokeBallPrice = pokeBallPrice;
    }

    /**
     * return attribute
     * @return price
     */
    public int getTechLevel() {
        return techLevel;
    }

    /**
     * return attribute
     * @return price
     */
    public int getResources() {
        return resources;
    }
}
