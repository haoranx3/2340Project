package com.example.a2340project.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.a2340project.entity.Player;

@SuppressWarnings("ALL")
public class DatabaseHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 6;
    private static final String DATABASE_NAME = "players.database";
    private static final String TABLE_NAME = "players";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_USERNAME = "username";
    private static final String COLUMN_SAILORPOINTS = "sailorpoints";
    private static final String COLUMN_TRAINERPOINTS = "trainerpoints";
    private static final String COLUMN_TRADERPOINTS = "traderpoints";
    private static final String COLUMN_ENGINEERPOINTS= "engineerpoints";
    private static final String COLUMN_FRESHWATER = "freshwater";
    private static final String COLUMN_SCARF = "scarf";
    private static final String COLUMN_BERRIES = "berries";
    private static final String COLUMN_NUGGETS = "nuggets";
    private static final String COLUMN_POKEDOLL = "pokedoll";
    private static final String COLUMN_POKEMON = "pokemon";
    private static final String COLUMN_POTION = "potion";
    private static final String COLUMN_TM = "tm";
    private static final String COLUMN_BIGMUSHROOM = "bigmushroom";
    private static final String COLUMN_POKEBALL = "pokeball";
    private static final String COLUMN_POKEDOLLARS = "pokedollars";
    private SQLiteDatabase db;

    private static final String TABLE_CREATE = "create table players (id integer primary key   ," +
            "username text , sailorpoints int , trainerpoints int , traderpoints int , "
            + "engineerpoints int, freshwater int, scarf int, berries int," +
            "nuggets int, pokedoll int, pokemon int, potion int, tm int, bigmushroom int," +
            " pokeball int," +
            "pokedollars int );";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
        this.db = db;
    }

    public void insertPlayer(Player player) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        String query = "select * from players";
        Cursor cursor = db.rawQuery(query, null);
        int count = cursor.getCount();

        values.put(COLUMN_ID, count);
        values.put(COLUMN_USERNAME, player.getUsername());
        values.put(COLUMN_SAILORPOINTS, player.getSailorPoints());
        values.put(COLUMN_TRAINERPOINTS, player.getTrainerPoints());
        values.put(COLUMN_TRADERPOINTS, player.getTraderPoints());
        values.put(COLUMN_ENGINEERPOINTS, player.getEngineerPoints());
        values.put(COLUMN_FRESHWATER, 0);
        values.put(COLUMN_SCARF, 0);
        values.put(COLUMN_BERRIES, 0);
        values.put(COLUMN_NUGGETS, 0);
        values.put(COLUMN_POKEDOLL, 0);
        values.put(COLUMN_POKEMON, 0);
        values.put(COLUMN_POTION, 0);
        values.put(COLUMN_TM, 0);
        values.put(COLUMN_BIGMUSHROOM, 0);
        values.put(COLUMN_POKEBALL, 0);
        values.put(COLUMN_POKEDOLLARS, player.getPokeDollars());

        db.insert(TABLE_NAME, null, values);
        db.close();
        cursor.close();
    }

    public void upDatePlayer(int id, int freshwater, int scarf, int berries, int nuggets,
                             int pokedoll, int pokemon, int potion, int tm,
                             int bigmushroom, int pokeball, int pokedollars) {
        db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COLUMN_FRESHWATER, freshwater);
        values.put(COLUMN_SCARF, scarf);
        values.put(COLUMN_BERRIES, berries);
        values.put(COLUMN_NUGGETS, nuggets);
        values.put(COLUMN_POKEDOLL, pokedoll);
        values.put(COLUMN_POKEMON, pokemon);
        values.put(COLUMN_POTION, potion);
        values.put(COLUMN_TM, tm);
        values.put(COLUMN_BIGMUSHROOM, bigmushroom);
        values.put(COLUMN_POKEBALL, pokeball);
        values.put(COLUMN_POKEDOLLARS, pokedollars);

        db.update(TABLE_NAME, values, "id = "+id, null);
        db.close();
    }

    public int[] searchInfo(String username) {
        db = this.getReadableDatabase();
        String query = "select username, sailorpoints, trainerpoints, traderpoints, " +
                "engineerpoints, freshwater, scarf, berries, nuggets, pokedoll," +
                "pokemon, potion, tm, bigmushroom, pokeball, pokedollars, id from " + TABLE_NAME;
        Cursor cursor = db.rawQuery(query, null);
        int sailor;
        int trainer;
        int trader;
        int engineer;
        int freshwater;
        int scarf;
        int berries;
        int nuggets;
        int pokedoll;
        int pokemon;
        int potion;
        int tm;
        int bigmushroom;
        int pokeball;
        int pokedollars;
        String uname;
        int id;
        int[] arr = new int[16];
        if(cursor.moveToFirst()) {
            do{
                uname = cursor.getString(cursor.getColumnIndex("username"));
                if(uname.equals(username)) {
                    sailor = cursor.getInt(cursor.getColumnIndex("sailorpoints"));
                    arr[0] = sailor;
                    trainer = cursor.getInt(cursor.getColumnIndex("trainerpoints"));
                    arr[1] = trainer;
                    trader = cursor.getInt(cursor.getColumnIndex("traderpoints"));
                    arr[2] = trader;
                    engineer = cursor.getInt(cursor.getColumnIndex("engineerpoints"));
                    arr[3] = engineer;
                    freshwater = cursor.getInt(cursor.getColumnIndex("freshwater"));
                    arr[4] = freshwater;
                    scarf = cursor.getInt(cursor.getColumnIndex("scarf"));
                    arr[5] = scarf;
                    berries = cursor.getInt(cursor.getColumnIndex("berries"));
                    arr[6] = berries;
                    nuggets = cursor.getInt(cursor.getColumnIndex("nuggets"));
                    arr[7] = nuggets;
                    pokedoll = cursor.getInt(cursor.getColumnIndex("pokedoll"));
                    arr[8] = pokedoll;
                    pokemon = cursor.getInt(cursor.getColumnIndex("pokemon"));
                    arr[9] = pokemon;
                    potion = cursor.getInt(cursor.getColumnIndex("potion"));
                    arr[10] = potion;
                    tm = cursor.getInt(cursor.getColumnIndex("tm"));
                    arr[11] = tm;
                    bigmushroom = cursor.getInt(cursor.getColumnIndex("bigmushroom"));
                    arr[12] = bigmushroom;
                    pokeball = cursor.getInt(cursor.getColumnIndex("pokeball"));
                    arr[13] = pokeball;
                    pokedollars = cursor.getInt(cursor.getColumnIndex("pokedollars"));
                    arr[14] = pokedollars;
                    id = cursor.getInt(cursor.getColumnIndex("id"));
                    arr[15] = id;
                }
            } while(cursor.moveToNext());
        }
        cursor.close();
        return arr;
    }


    public int getProfilesCount() {
        db = this.getReadableDatabase();
        String countQuery = "SELECT * FROM " + TABLE_NAME;
        Cursor cursor = db.rawQuery(countQuery, null);
        int count = cursor.getCount();
        cursor.close();
        return count - 1;
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS " + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);
    }
}
