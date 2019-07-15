package com.example.a2340project.entity;

/**
 * RegionEnum enum
 */
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

    private final String name;
    private final String[] towns;
    private final int x;
    private final int y;

    RegionEnum(String name, String[] towns, int x, int y) {
        this.name = name;
        this.towns = towns;
        this.x = x;
        this.y = y;
    }

    /**
     * get name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * get towns
     * @return towns
     */
    public String[] getTowns() {
        //noinspection AssignmentOrReturnOfFieldWithMutableType
        return towns;
    }

    /**
     * get x
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * get y
     * @return y
     */
    public int getY() {
        return y;
    }
}
