package com.example.a2340project.entity;

/**
 * ship class
 */
public class Ship {
    private int hullStrength;
    private final int cargoBay;
    private int fuel;

    private final int[] cargo = {0,0,0,0,0,0,0,0,0,0};
    private int numberOfCargo;

    /**
     * makes ship
     * @param type type
     */
    public Ship(ShipEnum type) {
        //noinspection unused
        hullStrength = type.getHullStrength();
        cargoBay = type.getCargoBay();
        fuel = type.getFuel();
    }

    /**
     * get hull
     * @return hull
     */
    public int getHullStrength() {
        return hullStrength;
    }

    /**
     * get bay
     * @return bay
     */
    public int getCargoBay() {
        return cargoBay;
    }

    /**
     * get fuel
     * @return fuel
     */
    public int getFuel() {
        return fuel;
    }

    /**
     * get cargo
     * @param indexForItem index
     * @return cargo
     */
    public int getCargo(int indexForItem) {
        return cargo[indexForItem];
    }

    /**
     * set cargo
     * @param indexForItem index
     * @param quantityOfItem number
     */
    public void setCargo(int indexForItem, int quantityOfItem) {
        cargo[indexForItem] = quantityOfItem;
    }

    /**
     * get cargo number
     * @return cargo number
     */
    public int getNumberOfCargo() { return numberOfCargo; }

    /**
     * set cargo number
     * @param numberOfCargo cargo number
     */
    public void setNumberOfCargo(int numberOfCargo) {
        this.numberOfCargo = numberOfCargo;
    }

    /**
     * set fuel
     * @param fuel fuel
     */
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    /**
     * set hull
     * @param hullStrength hull
     */
    public void setHullStrength(int hullStrength) {
        this.hullStrength = (hullStrength < 0) ? 0 : hullStrength;
    }

}
