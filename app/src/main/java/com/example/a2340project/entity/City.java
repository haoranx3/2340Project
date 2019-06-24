package com.example.a2340project.entity;

public class City {
    private final String cityName;
    private int freshWaterPrice;
    private int berriesPrice;
    private int nuggetsPrice;
    private int pokeDollPrice;
    private int pokemonPrice;
    private int potionsPrice;
    private int technicalMachinePrice;
    private int bigMushroomPrice;
    private int pokeBallPrice;

    public City(String cityName, int freshWaterPrice, int berriesPrice, int nuggetsPrice, int pokeDollPrice, int pokemonPrice, int potionsPrice, int technicalMachinePrice, int bigMushroomPrice, int pokeBallPrice) {
        this.cityName = cityName;
        this.freshWaterPrice = freshWaterPrice;
        this.berriesPrice = berriesPrice;
        this.nuggetsPrice = nuggetsPrice;
        this.pokeDollPrice = pokeDollPrice;
        this.pokemonPrice = pokemonPrice;
        this.potionsPrice = potionsPrice;
        this.technicalMachinePrice = technicalMachinePrice;
        this.bigMushroomPrice = bigMushroomPrice;
        this.pokeBallPrice = pokeBallPrice;
    }

    public String getCityName() {return cityName;}
    public int getFreshWaterPrice() {return freshWaterPrice;}
    public int getBerriesPrice() {return berriesPrice;}
    public int getNuggetsPrice() {return nuggetsPrice;}
    public int getPokeDollPrice() {return pokeDollPrice;}
    public int getPokemonPrice() {return pokemonPrice;}
    public int getPotionsPrice() {return potionsPrice;}
    public int getTechnicalMachinePrice() {return technicalMachinePrice;}
    public int getBigMushroomPrice() {return bigMushroomPrice;}
    public int getPokeBallPrice() {return pokeBallPrice;}

    public void setFreshWaterPrice(int freshWaterPrice) {this.freshWaterPrice = freshWaterPrice;}
    public void setBerriesPrice(int berriesPrice) {this.berriesPrice = berriesPrice;}
    public void setNuggetsPrice(int nuggetsPrice) {this.nuggetsPrice = nuggetsPrice;}
    public void setPokeDollPrice(int pokeDollPrice) {this.pokeDollPrice = pokeDollPrice;}
    public void setPokemonPrice(int pokemonPrice) {this.pokemonPrice = pokemonPrice;}
    public void setPotionsPrice(int potionsPrice) {this.potionsPrice = potionsPrice;}
    public void setTechnicalMachinePrice(int technicalMachinePrice) {this.technicalMachinePrice = technicalMachinePrice;}
    public void setBigMushroomPrice(int bigMushroomPrice) {this.bigMushroomPrice = bigMushroomPrice;}
    public void setPokeBallPrice(int pokeBallPrice) {this.pokeBallPrice = pokeBallPrice;}
}
