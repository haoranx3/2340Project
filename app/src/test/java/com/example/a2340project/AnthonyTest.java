package com.example.a2340project;

import android.app.Application;

import com.example.a2340project.entity.Player;
import com.example.a2340project.entity.Ship;
import com.example.a2340project.entity.ShipEnum;
import com.example.a2340project.viewmodels.CreatePlayerViewModel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Anthony's JUnit's for PokéTraders
 */
public class AnthonyTest {

    private final CreatePlayerViewModel viewModel = new CreatePlayerViewModel(new Application());

    /**
     * Sets up and populates ViewModel
     */
    @Before
    public void setUp() {
        for (int i = 0; i < 10; i++) {
            Player p = new Player("Player", "diff", 0, 0, 0,0,0);
            viewModel.addPlayer(p);
            p.setId(i);
        }
    }

    /**
     * Tests the updatePlayer method
     */
    @Test
    public void test_updatePlayer() {
        Player p = new Player("Anthony", "diff", 0, 0, 0, 0,0);
        p.setId(2);
        viewModel.updatePlayer(p);
        assertEquals(p.getUsername(), viewModel.getAllPlayers().get(2).getUsername());
    }

    /**
     * Tests the setHullStrength method for setting the strength below 0
     */
    @Test
    public void test_setHullStrength() {
        Ship testShip = new Ship(ShipEnum.Ship);
        int i = 0;
        while (testShip.getHullStrength() > 0) {
            testShip.setHullStrength(testShip.getHullStrength() - 33);
            i -= 33;
            if (i > 0) {
                assertEquals(i, testShip.getHullStrength());
            }
        }
        assertEquals(0, testShip.getHullStrength());
    }
}