package com.example.a2340project.entity;

import java.util.Random;

public class Region {
    private RegionEnum region;
    private int x;
    private int y;
    private City city;
    private Random random = new Random();

    public Region(RegionEnum region, int x, int y, int index) {
        this.region = region;
        this.x = region.getX();
        this.y = region.getY();
        this.city = new City(region.getTowns()[index], random.nextInt(8), random.nextInt(13));
    }

    public void randomizeCity() {
        city = new City(region.getTowns()[random.nextInt(3)], random.nextInt(8), random.nextInt(13)) ;
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

    public City getCity() {
        return city;
    }

    public String toString() {
        return String.format("Region: %s, xCoordinate: %d, yCoordinate: %d, " +
                "City: %s%n", region.getName(), x, y, city.getCityName());
    }

}
