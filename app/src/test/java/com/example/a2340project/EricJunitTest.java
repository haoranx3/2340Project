package com.example.a2340project;

import com.example.a2340project.entity.Ship;
import com.example.a2340project.entity.ShipEnum;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

public class EricJunitTest {
    Ship ship;
    @Before
    public void setUp() {
        ship = new Ship(ShipEnum.SSAnne);
    }

    @Test
    public void testSetCargo() {
        ship.setCargo(1, 1);
        assertEquals(1, ship.getCargo(1));
    }

    @Test
    public void testSetFuel1() {
        try {
            ship.setFuel(-3);
        } catch (IllegalArgumentException e) {
            assertNotNull(e);
        }
    }

    @Test
    public void testSetFuel2() {
        ship.setFuel(5);
        assertEquals(5, ship.getFuel());
    }
}
