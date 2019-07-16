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
        Player p = new Player("Tester", "easy", 4, 6, 2, 4);
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
        assertEquals(4, viewModel.getAllPlayers().get(1).getSailorPoints());
        assertEquals(6, viewModel.getAllPlayers().get(1).getTrainerPoints());
        assertEquals(2, viewModel.getAllPlayers().get(1).getTraderPoints());
        assertEquals(4, viewModel.getAllPlayers().get(1).getEngineerPoints());

    }
    /**
     * test the getters and setters for cargo
     */

    @Test
    public void testSetCargo() {
        assertEquals(10, viewModel.getAllPlayers().get(1).getShip().getCargo(10));
        assertEquals(1, viewModel.getAllPlayers().get(1).getShip().getCargo(1));
        assertEquals(5, viewModel.getAllPlayers().get(1).getShip().getCargo(5));


    }
}
