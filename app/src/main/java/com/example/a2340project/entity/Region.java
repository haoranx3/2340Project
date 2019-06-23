package com.example.a2340project.entity;

import java.util.ArrayList;

public class Region {
    private final String name;
    private final double xCoordinate;
    private final double yCoordinate;
    private final int techLevel;
    private final int resources;
    private final ArrayList<City> cityList = new ArrayList<>(2);

    public Region(String name, double xCoordinate, double yCoordinate, int techLevel, int resources, City city1, City city2) {
        this.name = name;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.techLevel = techLevel;
        this.resources = resources;
        cityList.add(city1);
        cityList.add(city2);
    }

    public String getName() {
        return name;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public int getTechLevel() {
        return techLevel;
    }

    public int getResources() {
        return resources;
    }

    public String toString() {
        return String.format("Region: %s, xCoordinate: %d, yCoordinate: %d, techLevel: %d, resources: %d, " +
                "City1: %s, City2: %s\n", name, xCoordinate, yCoordinate, techLevel, resources, cityList.get(0).getCityName(), cityList.get(1).getCityName());
    }

}
