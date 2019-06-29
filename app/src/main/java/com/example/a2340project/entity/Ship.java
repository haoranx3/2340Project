package com.example.a2340project.entity;

public class Ship {
    private ShipEnum ship;
    private String name;
    private int hullStrength;
    private int cargoBay;
    private int weaponSlots;
    private int shieldSlots;
    private int gadgetSlots;
    private int crew;
    private int fuel;
    private int fuelCost;

    private int cargo;

    public Ship(ShipEnum type) {
        ship = type;
        name = type.getName();
        hullStrength = type.getHullStrength();
        cargoBay = type.getCargoBay();
        weaponSlots = type.getWeaponSlots();
        shieldSlots = type.getShieldSlots();
        gadgetSlots = type.getGadgetSlots();
        crew = type.getCrew();
        fuel = type.getFuel();
        fuelCost = type.getFuelCost();
    }

    public String getName() {
        return name;
    }

    public int getHullStrength() {
        return hullStrength;
    }

    public int getCargoBay() {
        return cargoBay;
    }

    public int getWeaponSlots() {
        return weaponSlots;
    }

    public int getShieldSlots() {
        return shieldSlots;
    }

    public int getGadgetSlots() {
        return gadgetSlots;
    }

    public int getCrew() {
        return crew;
    }

    public int getFuel() {
        return fuel;
    }

    public int getFuelCost() {
        return fuelCost;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }
}
