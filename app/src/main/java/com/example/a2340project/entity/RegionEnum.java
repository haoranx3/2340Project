package com.example.a2340project.entity;

public enum RegionEnum {
    KANTO("Kanto", new String[] {"Pallet Town", "Cinnabar Island"}, 0, 0),
    JOHTO("Johto",new String[] {"New Bark Town", "Goldenrod City"}, -1, 1),
    HOENN("Hoenn",new String[] {"Slateport City", "Lilycove City"}, -1, -1),
    SINNOH("Sinnoh",new String[] {"Jubilife City", "Canalave City"}, -1, -2),
    UNOVA("Unova",new String[] {"Castelia City", "Nimbasa City"}, 2, -1),
    KALOS("Kalos",new String[] {"Lumiose City", "Coumarine City"}, -1, 2),
    OBLIVIA("Oblivia",new String[] {"Cocona Village", "Tilt Village"}, -2, 1),
    SEVIIISLANDS("Sevii Islands",new String[] {"Treasure Beach", "Cape Brink"}, -2, -2),
    ORRE("Orre",new String[] {"Pyrite Town", "Gateon Port"}, -1, 3),
    ALMIA("Almia",new String[] {"Chicole Village", "Pueltown"}, 1, 1),
    FIORE("Fiore",new String[] {"Fall City", "Wintown"}, 1, -2),
    ORANGEISLANDS("Orange Islands",new String[] {"Tangelo Island", "Mandarin Island"}, 2, -2);

    String name;
    String[] towns;
    int x;
    int y;

    RegionEnum(String name, String[] towns, int x, int y) {
        this.name = name;
        this.towns = towns;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public String[] getTowns() {
        return towns;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
