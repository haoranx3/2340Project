package com.example.a2340project.entity;

public class Region {
    private RegionEnum region;
    private int x;
    private int y;
    private int techLevel;
    private int resources;
    private City city;

    public Region(RegionEnum region, int x, int y, int techLevel, int resources, int index) {
        this.region = region;
        this.x = region.getX();
        this.y = region.getY();
        this.techLevel = techLevel;
        this.resources = resources;
        this.city = new City(region.getTowns()[index]);
    }



    public String toString() {
        return String.format("Region: %s, xCoordinate: %d, yCoordinate: %d, techLevel: %d, resources: %d, " +
                "City: %s%n", region.getName(), x, y, techLevel, resources, city.getCityName());
    }

}
