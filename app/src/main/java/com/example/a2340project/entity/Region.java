package com.example.a2340project.entity;

import java.util.Random;

/**
 * Region class
 */
public class Region {
    private final RegionEnum region;
    private final int x;
    private final int y;
    private City city;
    private final Random random = new Random();

    /**
     * makes region
     * @param region region
     * @param index index
     */
    public Region(RegionEnum region, int index) {
        this.region = region;
        this.x = region.getX();
        this.y = region.getY();
        this.city = new City(region.getTowns()[index], random.nextInt(8), random.nextInt(13));
    }

    /**
     * randomize city
     */
    public void randomizeCity() {
        city = new City(region.getTowns()[random.nextInt(3)], random.nextInt(8),
                random.nextInt(13));
    }

    /**
     * return region
     * @return region
     */
    public RegionEnum getRegion() {
        return region;
    }

    /**
     * return x
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * return y
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * return city
     * @return city
     */
    public City getCity() {
        return city;
    }

}
