package com.example.a2340project.entity;

/**
 * ShipEnum enum
 */
public enum ShipEnum {
    SSAnne("S.S. Anne", 25, 15, 1, 0, 1, 1, 14, 2),
    Ship("ship", 100, 100, 100, 100, 100, 100, 100, 100);

    private final String name;
    private final int hullStrength;
    private final int cargoBay;
    private final int fuel;

    /**
     * make ShipEnum
     * @param name name
     * @param hull hull
     * @param cargo cargo
     * @param weapon weapon
     * @param shield shield
     * @param gadget gadget
     * @param crew crew
     */
    @SuppressWarnings("ConstructorWithTooManyParameters")
    ShipEnum(String name, int hull, int cargo, int weapon, int shield, int gadget, int crew,
             int fuel, int cost) {
        this.name = name;
        hullStrength = hull;
        cargoBay = cargo;
        this.fuel = fuel;
    }

    /**
     * get name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * get hull
     * @return hull
     */
    public int getHullStrength() {
        return hullStrength;
    }

    /**
     * get cargo
     * @return cargo
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
}
