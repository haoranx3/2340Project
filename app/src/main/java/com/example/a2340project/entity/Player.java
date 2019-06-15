package com.example.a2340project.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
    private String userName;
    private final int MAX_SKILLPOINTS = 16;
    private String difficulties;
    private int pilot;
    private int fighter;
    private int trader;
    private int engineering;
    private static List<String> diffList = Arrays.asList("Beginners", "Easy", "Normal", "Hard", "Impossible");
    public Player() {
        this("default_player", "Beginner", 4, 4, 4, 4);
    }

    public Player(String name, String difficulties, int p, int f, int t, int e) {
        userName = name;
        this.difficulties = difficulties;
        pilot = p;
        fighter = f;
        trader = t;
        engineering = e;
    }


}
