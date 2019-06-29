package com.example.a2340project.entity;

public enum ShipEnum {
    SSAnne("S.S. Anne", 25, 15, 1, 0, 1, 1, 14, 2);

    private String name;
    private int hullStrength;
    private int cargoBay;
    private int weaponSlots;
    private int shieldSlots;
    private int gadgetSlots;
    private int crew;
    private int fuel;
    private int fuelCost;

    ShipEnum(String name, int hull, int cargo, int weapon, int shield, int gadget, int crew, int fuel, int cost) {
        this.name = name;
        hullStrength = hull;
        cargoBay = cargo;
        weaponSlots = weapon;
        shieldSlots = shield;
        gadgetSlots = gadget;
        this.crew = crew;
        this.fuel = fuel;
        fuelCost = cost;
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
}
