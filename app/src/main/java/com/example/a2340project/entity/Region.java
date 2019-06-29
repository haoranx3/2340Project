package com.example.a2340project.entity;

import java.util.Random;

public class Region {
    private RegionEnum region;
    private int x;
    private int y;
    private int techLevel;
    private int resources;
    private City city;
    private Random random = new Random();

    public Region(RegionEnum region, int x, int y, int techLevel, int resources, int index) {
        this.region = region;
        this.x = region.getX();
        this.y = region.getY();
        this.techLevel = techLevel;
        this.resources = resources;
        this.city = new City(region.getTowns()[index]);
    }

    public void randomizeCity() {
        city = new City(region.getTowns()[random.nextInt(3)]);
    }

    public RegionEnum getRegion() {
        return region;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getTechLevel() {
        return techLevel;
    }

    public int getResources() {
        return resources;
    }

    public City getCity() {
        return city;
    }

    public String toString() {
        return String.format("Region: %s, xCoordinate: %d, yCoordinate: %d, techLevel: %d, resources: %d, " +
                "City: %s%n", region.getName(), x, y, techLevel, resources, city.getCityName());
    }

}
