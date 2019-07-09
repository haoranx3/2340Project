package com.example.a2340project.entity;

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
    private int techLevel;
    private int resources;

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
            return base + IPL * (techLevel - MTLP);
        }
        return -1;
    }

    public String getCityName() {
        return cityName;
    }

    public int getFreshWaterPrice() {
        return freshWaterPrice;
    }

    public void setFreshWaterPrice(int freshWaterPrice) {
        this.freshWaterPrice = freshWaterPrice;
    }

    public int getScarfPrice() {
        return scarfPrice;
    }

    public void setScarfPrice(int scarfPrice) {
        this.scarfPrice = scarfPrice;
    }

    public int getBerriesPrice() {
        return berriesPrice;
    }

    public void setBerriesPrice(int berriesPrice) {
        this.berriesPrice = berriesPrice;
    }

    public int getNuggetsPrice() {
        return nuggetsPrice;
    }

    public void setNuggetsPrice(int nuggetsPrice) {
        this.nuggetsPrice = nuggetsPrice;
    }

    public int getPokeDollPrice() {
        return pokeDollPrice;
    }

    public void setPokeDollPrice(int pokeDollPrice) {
        this.pokeDollPrice = pokeDollPrice;
    }

    public int getPokemonPrice() {
        return pokemonPrice;
    }

    public void setPokemonPrice(int pokemonPrice) {
        this.pokemonPrice = pokemonPrice;
    }

    public int getPotionsPrice() {
        return potionsPrice;
    }

    public void setPotionsPrice(int potionsPrice) {
        this.potionsPrice = potionsPrice;
    }

    public int getTechnicalMachinePrice() {
        return technicalMachinePrice;
    }

    public void setTechnicalMachinePrice(int technicalMachinePrice) {
        this.technicalMachinePrice = technicalMachinePrice;
    }

    public int getBigMushroomPrice() {
        return bigMushroomPrice;
    }

    public void setBigMushroomPrice(int bigMushroomPrice) {
        this.bigMushroomPrice = bigMushroomPrice;
    }

    public int getPokeBallPrice() {
        return pokeBallPrice;
    }

    public void setPokeBallPrice(int pokeBallPrice) {
        this.pokeBallPrice = pokeBallPrice;
    }

    public int getTechLevel() {
        return techLevel;
    }

    public int getResources() {
        return resources;
    }
}
