package com.example.a2340project;

import android.app.Application;

import com.example.a2340project.entity.Player;
import com.example.a2340project.viewmodels.CreatePlayerViewModel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DianaTest {

    private final CreatePlayerViewModel viewModel = new CreatePlayerViewModel(new Application());
    /**
     * runs before to set up the player
     */
    @Before
    public void setUp() {
        Player p = new Player("Tester", "easy", 4, 6, 2, 4,0);
        viewModel.addPlayer(p);
        p.setId(1);

        for (int i = 0; i < 10; i++) {
            p.getShip().setCargo(i, i);
        }
    }

    /**
     * test the getters of the attribute points
     */

    @Test
    public void testGetPlayerAtrributes() {
        assertEquals(4, viewModel.getAllPlayers().get(0).getSailorPoints());
        assertEquals(6, viewModel.getAllPlayers().get(0).getTrainerPoints());
        assertEquals(2, viewModel.getAllPlayers().get(0).getTraderPoints());
        assertEquals(4, viewModel.getAllPlayers().get(0).getEngineerPoints());

    }
    /**
     * test the getters and setters for cargo
     */

    @Test
    public void testSetCargo() {
        assertEquals(9, viewModel.getAllPlayers().get(0).getShip().getCargo(9));
        assertEquals(1, viewModel.getAllPlayers().get(0).getShip().getCargo(1));
        assertEquals(5, viewModel.getAllPlayers().get(0).getShip().getCargo(5));


    }
}