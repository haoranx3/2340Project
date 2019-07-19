package com.example.a2340project.views;

import java.util.Random;

import android.annotation.SuppressLint;
import android.graphics.Color;

import android.arch.lifecycle.ViewModelProviders;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.HorizontalScrollView;
import android.widget.Button;
import android.widget.TextView;

import com.example.a2340project.R;
import com.example.a2340project.entity.Region;
import com.example.a2340project.entity.RegionEnum;
import com.example.a2340project.entity.Player;
import com.example.a2340project.model.DatabaseHelper;
import com.example.a2340project.viewmodels.CreatePlayerViewModel;

/**
 * createRegionActivity class
 */

@SuppressWarnings("ALL")
public class createRegionActivity extends AppCompatActivity {

    private HorizontalScrollView map;
    private ImageView background;
    private RelativeLayout screen;
    private RelativeLayout container;
    private RelativeLayout shopContainer;
    private RelativeLayout.LayoutParams layoutParams;
    private RelativeLayout.LayoutParams shopLayoutParams;

    private RelativeLayout confirmBox;
    private TextView confirmText;
    private Button yesButton;
    private Button noButton;
    private Button okButton;

    private RelativeLayout confirmTravel;
    private TextView travelMessage;
    private Button acceptTravel;
    private Button declineTravel;
    private Button okTravel;

    private RelativeLayout confirmEncounter;
    private TextView encounterMessage;

    private RelativeLayout fuel;
    private TextView fuelText;

    private Button backButton;

    private RelativeLayout two;
    private RelativeLayout three;
    private RelativeLayout four;
    private RelativeLayout five;
    private RelativeLayout six;
    private RelativeLayout seven;
    private RelativeLayout eight;
    private RelativeLayout nine;
    private RelativeLayout ten;
    private RelativeLayout eleven;

    private RelativeLayout kanto;
    private RelativeLayout johto;
    private RelativeLayout hoenn;
    private RelativeLayout sinnoh;
    private RelativeLayout unova;
    private RelativeLayout kalos;
    private RelativeLayout oblivia;
    private RelativeLayout sevii;
    private RelativeLayout orre;
    private RelativeLayout almia;
    private RelativeLayout fiore;
    private RelativeLayout orange;

    private String txt;
    private boolean shopping = true;

    private Player player;

    private MediaPlayer selectFX;

    private Random random;

    private Handler handler;

    private TextView regionText;
    private TextView creditText;
    private TextView cityText;
    private TextView cityTextShadow;

    private TextView waterPrice;
    private TextView waterPriceShadow;

    private TextView scarfPrice;
    private TextView scarfPriceShadow;

    private TextView berriesPrice;
    private TextView berriesPriceShadow;

    private TextView nuggetsPrice;
    private TextView nuggetsPriceShadow;

    private TextView pokedollPrice;
    private TextView pokedollPriceShadow;

    private TextView pokemonPrice;
    private TextView pokemonPriceShadow;

    private TextView potionPrice;
    private TextView potionPriceShadow;

    private TextView tmPrice;
    private TextView tmPriceShadow;

    private TextView mushroomPrice;
    private TextView mushroomPriceShadow;

    private TextView pokeballPrice;
    private TextView pokeballPriceShadow;

    private Button toggleBag;
    private Button toggleMap;

    private final DatabaseHelper helper = new DatabaseHelper(this);

    @SuppressWarnings("OverlyLongMethod")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_region);

        Bundle extras = getIntent().getExtras();
        int[] arrInfo = extras.getIntArray("array");
        String name = getIntent().getStringExtra("name");

        Button exit = findViewById(R.id.exitButton);
        map = findViewById(R.id.map);
        background = findViewById(R.id.mapBackground);
        screen = findViewById(R.id.screen);
        container = findViewById(R.id.container);
        shopContainer = findViewById(R.id.shopContainer);
        //noinspection unused
        ImageView ship = findViewById(R.id.shipAnimation);

        layoutParams = (RelativeLayout.LayoutParams) container.getLayoutParams();
        shopLayoutParams = (RelativeLayout.LayoutParams) shopContainer.getLayoutParams();

        confirmBox = findViewById(R.id.confirmItem);
        confirmText = findViewById(R.id.message);
        yesButton = findViewById(R.id.confirm);
        noButton = findViewById(R.id.decline);
        okButton = findViewById(R.id.ok);

        confirmTravel = findViewById(R.id.confirmTravel);
        travelMessage = findViewById(R.id.travelMessage);
        acceptTravel = findViewById(R.id.acceptTravel);
        declineTravel = findViewById(R.id.declineTravel);
        okTravel = findViewById(R.id.okTravel);

        confirmEncounter = findViewById(R.id.encounter);
        encounterMessage = findViewById(R.id.encounterMessage);
        Button okEncounter = findViewById(R.id.okEncounter);

        fuel = findViewById(R.id.fuel);
        fuelText = findViewById(R.id.fuelText);

        backButton = findViewById(R.id.backButton);

        kanto = findViewById(R.id.kanto);
        johto = findViewById(R.id.johto);
        hoenn = findViewById(R.id.hoenn);
        sinnoh = findViewById(R.id.sinnoh);
        unova = findViewById(R.id.unova);
        kalos = findViewById(R.id.kalos);
        oblivia = findViewById(R.id.oblivia);
        sevii = findViewById(R.id.sevii);
        orre = findViewById(R.id.orre);
        almia = findViewById(R.id.almia);
        fiore = findViewById(R.id.fiore);
        orange = findViewById(R.id.orange);

        random = new Random();
        handler = new Handler();

        CreatePlayerViewModel viewModel =
                ViewModelProviders.of(this).get(CreatePlayerViewModel.class);

        regionText = findViewById(R.id.regionText);
        creditText = findViewById(R.id.creditText);
        cityText = findViewById(R.id.cityText);
        cityTextShadow = findViewById(R.id.cityTextShadow);

        waterPrice = findViewById(R.id.waterPrice);
        waterPriceShadow = findViewById(R.id.waterPriceShadow);

        scarfPrice = findViewById(R.id.scarfPrice);
        scarfPriceShadow = findViewById(R.id.scarfPriceShadow);

        berriesPrice = findViewById(R.id.berriesPrice);
        berriesPriceShadow = findViewById(R.id.berriesPriceShadow);

        nuggetsPrice = findViewById(R.id.nuggetsPrice);
        nuggetsPriceShadow = findViewById(R.id.nuggetsPriceShadow);

        pokedollPrice = findViewById(R.id.pokedollPrice);
        pokedollPriceShadow = findViewById(R.id.pokedollPriceShadow);

        pokemonPrice = findViewById(R.id.pokemonPrice);
        pokemonPriceShadow = findViewById(R.id.pokemonPriceShadow);

        potionPrice = findViewById(R.id.potionsPrice);
        potionPriceShadow = findViewById(R.id.potionsPriceShadow);

        tmPrice = findViewById(R.id.tmPrice);
        tmPriceShadow = findViewById(R.id.tmPriceShadow);

        mushroomPrice = findViewById(R.id.mushroomPrice);
        mushroomPriceShadow = findViewById(R.id.mushroomPriceShadow);

        pokeballPrice = findViewById(R.id.pokeballPrice);
        pokeballPriceShadow = findViewById(R.id.pokeballPriceShadow);

        toggleBag = findViewById(R.id.sellButton);
        toggleMap = findViewById(R.id.mapButton);

        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        ten = findViewById(R.id.ten);
        eleven = findViewById(R.id.eleven);

        final Region[] regions = new Region[12];

        for (RegionEnum region : RegionEnum.values()) {
            regions[region.ordinal()] = new Region(region,
                    random.nextInt(2));
        }

        if(arrInfo.length == 0) {
            player = viewModel.getAllPlayers().get(0);
        } else {
            player = new Player(name, "Easy", arrInfo[0], arrInfo[1],arrInfo[2],arrInfo[3],
                    arrInfo[15]);
            player.getShip().setCargo(0, arrInfo[4]);
            player.getShip().setCargo(1, arrInfo[5]);
            player.getShip().setCargo(2, arrInfo[6]);
            player.getShip().setCargo(3, arrInfo[7]);
            player.getShip().setCargo(4, arrInfo[8]);
            player.getShip().setCargo(5, arrInfo[9]);
            player.getShip().setCargo(6, arrInfo[10]);
            player.getShip().setCargo(7, arrInfo[11]);
            player.getShip().setCargo(8, arrInfo[12]);
            player.getShip().setCargo(9, arrInfo[13]);
            player.setPokeDollars(arrInfo[14]);
        }
        player.setCurrentRegion(regions[random.nextInt(12)]);

        configure();


        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                selectFX.setVolume(1f/10f,1f/10f);
                selectFX.start();
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });

        toggleBag.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                selectFX.setVolume(1f/10f,1f/10f);
                selectFX.start();
                if (shopping) {
                    shopping = false;
                    toggleBag();
                    toggleBag.setText("SHOP");
                } else {
                    shopping = true;
                    toggleShop();
                    toggleBag.setText("BAG");
                }
            }
        });

        toggleMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                selectFX.setVolume(1f/10f,1f/10f);
                selectFX.start();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        shopLayoutParams.setMargins(0, shopLayoutParams.topMargin - 100, 0,
                                shopLayoutParams.bottomMargin + 100);
                        shopContainer.setLayoutParams(shopLayoutParams);
                        if (shopLayoutParams.topMargin != -3000) {
                            handler.postDelayed(this, 10);
                        } else {
                            shopContainer.setVisibility(View.GONE);
                            backButton.setVisibility(View.VISIBLE);
                            RelativeLayout[] regionBoxes = {kanto, johto, hoenn, sinnoh,
                                    unova, kalos, oblivia, sevii, orre, almia, fiore, orange};
                            for (RelativeLayout region : regionBoxes) {
                                region.setVisibility(View.VISIBLE);
                            }
                            fuel.setVisibility(View.VISIBLE);
                            txt = "Fuel: " + player.getShip().getFuel();
                            fuelText.setText(txt);
                        }
                    }
                }, 10);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                selectFX.setVolume(1f/10f,1f/10f);
                selectFX.start();
                backButton.setVisibility(View.GONE);
                fuel.setVisibility(View.GONE);
                shopContainer.setVisibility(View.VISIBLE);
                RelativeLayout[] regionBoxes = {kanto, johto, hoenn, sinnoh, unova,
                        kalos, oblivia, sevii, orre, almia, fiore, orange};
                for (RelativeLayout region : regionBoxes) {
                    region.setVisibility(View.GONE);
                }
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        shopLayoutParams.setMargins(0, shopLayoutParams.topMargin + 100, 0,
                                shopLayoutParams.bottomMargin - 100);
                        shopContainer.setLayoutParams(shopLayoutParams);
                        if (shopLayoutParams.topMargin != 0) {
                            handler.postDelayed(this, 10);
                        }
                    }
                }, 10);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayConfirmation("Fresh Water",
                        player.getCurrentRegion().getCity().getFreshWaterPrice(),
                        player.getShip().getCargo(0));
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayConfirmation("Scarf", player.getCurrentRegion().getCity().getScarfPrice(),
                        player.getShip().getCargo(1));
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayConfirmation("Berries",
                        player.getCurrentRegion().getCity().getBerriesPrice(),
                        player.getShip().getCargo(2));
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getCity().getTechLevel() >= 2) {
                    displayConfirmation("Nuggets",
                            player.getCurrentRegion().getCity().getNuggetsPrice(),
                            player.getShip().getCargo(3));
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getCity().getTechLevel() >= 1) {
                    displayConfirmation("Poké Doll",
                            player.getCurrentRegion().getCity().getPokeDollPrice(),
                            player.getShip().getCargo(4));
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getCity().getTechLevel() >= 1) {
                    displayConfirmation("Pokémon",
                            player.getCurrentRegion().getCity().getPokemonPrice(),
                            player.getShip().getCargo(5));
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getCity().getTechLevel() >= 1) {
                    displayConfirmation("Potion",
                            player.getCurrentRegion().getCity().getPotionsPrice(),
                            player.getShip().getCargo(6));
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getCity().getTechLevel() >= 3) {
                    displayConfirmation("TM",
                            player.getCurrentRegion().getCity().getTechnicalMachinePrice(),
                            player.getShip().getCargo(7));
                }
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayConfirmation("Big Mushroom",
                        player.getCurrentRegion().getCity().getBigMushroomPrice(),
                        player.getShip().getCargo(8));
            }
        });

        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getCity().getTechLevel() >= 4) {
                    displayConfirmation("Poké Ball",
                            player.getCurrentRegion().getCity().getPokeBallPrice(),
                            player.getShip().getCargo(9));
                }
            }
        });

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                selectFX.setVolume(1f/10f,1f/10f);
                selectFX.start();
                confirmBox.setVisibility(View.GONE);
                if (shopping) {
                    configure();
                } else {
                    toggleBag();
                }
            }
        });

        noButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                selectFX.setVolume(1f/10f,1f/10f);
                selectFX.start();
                confirmBox.setVisibility(View.GONE);
                if (shopping) {
                    configure();
                } else {
                    toggleBag();
                }
            }
        });

        yesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmBox.setVisibility(View.GONE);
                if (shopping) {
                    switch ((String) confirmText.getText()) {
                        case "Purchase Fresh Water?":
                            purchase(0, player.getCurrentRegion().getCity().getFreshWaterPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Purchase Scarf?":
                            purchase(1, player.getCurrentRegion().getCity().getScarfPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Purchase Berries?":
                            purchase(2, player.getCurrentRegion().getCity().getBerriesPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Purchase Nuggets?":
                            purchase(3, player.getCurrentRegion().getCity().getNuggetsPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Purchase Poké Doll?":
                            purchase(4, player.getCurrentRegion().getCity().getPokeDollPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Purchase Pokémon?":
                            purchase(5, player.getCurrentRegion().getCity().getPokemonPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Purchase Potion?":
                            purchase(6, player.getCurrentRegion().getCity().getPotionsPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Purchase TM?":
                            purchase(7,
                                    player.getCurrentRegion().getCity().getTechnicalMachinePrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Purchase Big Mushroom?":
                            purchase(8, player.getCurrentRegion().getCity().getBigMushroomPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Purchase Poké Ball?":
                            purchase(9, player.getCurrentRegion().getCity().getPokeBallPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        default:
                            break;
                    }
                } else {
                    switch ((String) confirmText.getText()) {
                        case "Sell Fresh Water?":
                            sell(0, player.getCurrentRegion().getCity().getFreshWaterPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Sell Scarf?":
                            sell(1, player.getCurrentRegion().getCity().getScarfPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Sell Berries?":
                            sell(2, player.getCurrentRegion().getCity().getBerriesPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Sell Nuggets?":
                            sell(3, player.getCurrentRegion().getCity().getNuggetsPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Sell Poké Doll?":
                            sell(4, player.getCurrentRegion().getCity().getPokeDollPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Sell Pokémon?":
                            sell(5, player.getCurrentRegion().getCity().getPokemonPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Sell Potion?":
                            sell(6, player.getCurrentRegion().getCity().getPotionsPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Sell TM?":
                            sell(7, player.getCurrentRegion().getCity().getTechnicalMachinePrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Sell Big Mushroom?":
                            sell(8, player.getCurrentRegion().getCity().getBigMushroomPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        case "Sell Poké Ball?":
                            sell(9, player.getCurrentRegion().getCity().getPokeBallPrice());
                            helper.upDatePlayer(player.getId(),
                                    player.getShip().getCargo(0), player.getShip().getCargo(1),
                                    player.getShip().getCargo(2), player.getShip().getCargo(3),
                                    player.getShip().getCargo(4), player.getShip().getCargo(5),
                                    player.getShip().getCargo(6), player.getShip().getCargo(7),
                                    player.getShip().getCargo(8), player.getShip().getCargo(9),
                                    player.getPokeDollars());
                            break;
                        default:
                            break;
                    }
                }
            }
        });

        kanto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getRegion() != RegionEnum.KANTO) {
                    displayTravelConfirmation(RegionEnum.KANTO);
                }
            }
        });

        johto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getRegion() != RegionEnum.JOHTO) {
                    displayTravelConfirmation(RegionEnum.JOHTO);
                }
            }
        });

        hoenn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getRegion() != RegionEnum.HOENN) {
                    displayTravelConfirmation(RegionEnum.HOENN);
                }
            }
        });

        sinnoh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getRegion() != RegionEnum.SINNOH) {
                    displayTravelConfirmation(RegionEnum.SINNOH);
                }
            }
        });

        unova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getRegion() != RegionEnum.UNOVA) {
                    displayTravelConfirmation(RegionEnum.UNOVA);
                }
            }
        });

        kalos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getRegion() != RegionEnum.KALOS) {
                    displayTravelConfirmation(RegionEnum.KALOS);
                }
            }
        });

        oblivia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getRegion() != RegionEnum.OBLIVIA) {
                    displayTravelConfirmation(RegionEnum.OBLIVIA);
                }
            }
        });

        sevii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getRegion() != RegionEnum.SEVIIISLANDS) {
                    displayTravelConfirmation(RegionEnum.SEVIIISLANDS);
                }
            }
        });

        orre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getRegion() != RegionEnum.ORRE) {
                    displayTravelConfirmation(RegionEnum.ORRE);
                }
            }
        });

        almia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getRegion() != RegionEnum.ALMIA) {
                    displayTravelConfirmation(RegionEnum.ALMIA);
                }
            }
        });

        fiore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getRegion() != RegionEnum.FIORE) {
                    displayTravelConfirmation(RegionEnum.FIORE);
                }
            }
        });

        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (player.getCurrentRegion().getRegion() != RegionEnum.ORANGEISLANDS) {
                    displayTravelConfirmation(RegionEnum.ORANGEISLANDS);
                }
            }
        });

        okTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                selectFX.setVolume(1f/10f,1f/10f);
                selectFX.start();
                RelativeLayout[] regionBoxes = {kanto, johto, hoenn, sinnoh, unova, kalos,
                        oblivia, sevii, orre, almia, fiore, orange};
                for (RelativeLayout region : regionBoxes) {
                    region.setClickable(true);
                }
                confirmTravel.setVisibility(View.GONE);
            }
        });

        declineTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                selectFX.setVolume(1f/10f,1f/10f);
                selectFX.start();
                RelativeLayout[] regionBoxes = {kanto, johto, hoenn, sinnoh, unova,
                        kalos, oblivia, sevii, orre, almia, fiore, orange};
                for (RelativeLayout region : regionBoxes) {
                    region.setClickable(true);
                }
                confirmTravel.setVisibility(View.GONE);
            }
        });

        acceptTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (((String) travelMessage.getText()).contains("Kanto")) {
                    travel(regions, 0);
                } else if (((String) travelMessage.getText()).contains("Johto")) {
                    travel(regions, 1);
                } else if (((String) travelMessage.getText()).contains("Hoenn")) {
                    travel(regions, 2);
                } else if (((String) travelMessage.getText()).contains("Sinnoh")) {
                    travel(regions, 3);
                } else if (((String) travelMessage.getText()).contains("Unova")) {
                    travel(regions, 4);
                } else if (((String) travelMessage.getText()).contains("Kalos")) {
                    travel(regions, 5);
                } else if (((String) travelMessage.getText()).contains("Oblivia")) {
                    travel(regions, 6);
                } else if (((String) travelMessage.getText()).contains("Sevii")) {
                    travel(regions, 7);
                } else if (((String) travelMessage.getText()).contains("Orre")) {
                    travel(regions, 8);
                } else if (((String) travelMessage.getText()).contains("Almia")) {
                    travel(regions, 9);
                } else if (((String) travelMessage.getText()).contains("Fiore")) {
                    travel(regions, 10);
                } else if (((String) travelMessage.getText()).contains("Orange")) {
                    travel(regions, 11);
                }
                RelativeLayout[] regionBoxes = {kanto, johto, hoenn, sinnoh, unova, kalos,
                        oblivia, sevii, orre, almia, fiore, orange};
                for (RelativeLayout region : regionBoxes) {
                    region.setClickable(true);
                }
            }
        });

        okEncounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                selectFX.setVolume(1f/10f,1f/10f);
                selectFX.start();
                confirmEncounter.setVisibility(View.GONE);

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        shopLayoutParams.setMargins(0, shopLayoutParams.topMargin + 100, 0,
                                shopLayoutParams.bottomMargin - 100);
                        shopContainer.setLayoutParams(shopLayoutParams);
                        if (shopLayoutParams.topMargin != 0) {
                            handler.postDelayed(this, 10);
                        }
                    }
                }, 100);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                map.smoothScrollTo((background.getWidth() / 2) - (screen.getWidth() / 2), 0);
            }
        }, 500);

        confirmBox.setVisibility(View.GONE);
        layoutParams.setMargins(-1300, 0, 1300, 0);
        container.setLayoutParams(layoutParams);
        container.setVisibility(View.VISIBLE);
        confirmEncounter.setVisibility(View.GONE);

        RelativeLayout[] regionBoxes = {kanto, johto, hoenn, sinnoh, unova, kalos,
                oblivia, sevii, orre, almia, fiore, orange};
        for (RelativeLayout region : regionBoxes) {
            region.setVisibility(View.GONE);
        }

        fuel.setVisibility(View.GONE);

        txt = "Fuel: " + player.getShip().getFuel();
        fuelText.setText(txt);

        backButton.setVisibility(View.GONE);

        shopLayoutParams.setMargins(0, -3000, 0, 3000);
        shopContainer.setLayoutParams(shopLayoutParams);
        shopContainer.setVisibility(View.VISIBLE);

        confirmTravel.setVisibility(View.GONE);

        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                shopLayoutParams.setMargins(0, shopLayoutParams.topMargin + 100, 0,
                        shopLayoutParams.bottomMargin - 100);
                shopContainer.setLayoutParams(shopLayoutParams);
                if (shopLayoutParams.topMargin != 0) {
                    handler.postDelayed(this, 10);
                }
            }
        };

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                layoutParams.setMargins(layoutParams.leftMargin + 50, 0,
                        layoutParams.rightMargin - 50, 0);
                container.setLayoutParams(layoutParams);
                if (layoutParams.rightMargin != -1500) {
                    handler.postDelayed(this, 10);
                } else {
                    container.setVisibility(View.GONE);
                    handler.postDelayed(runnable, 10);
                }
            }
        }, 100);


    }

    private void configure() {
        toggleBag.setClickable(true);
        toggleMap.setClickable(true);
        TextView[] priceText = {waterPrice, scarfPrice, berriesPrice, nuggetsPrice, pokedollPrice,
                pokemonPrice, potionPrice, tmPrice, mushroomPrice, pokeballPrice};
        regionText.setText(player.getCurrentRegion().getRegion().getName());
        String symbol = "\u20BD";
        txt = symbol + player.getPokeDollars();
        creditText.setText(txt);
        cityText.setText(player.getCurrentRegion().getCity().getCityName());
        cityTextShadow.setText(player.getCurrentRegion().getCity().getCityName());

        RelativeLayout[] stripes = {two, three, four, five, six, seven, eight, nine, ten, eleven};
        for (RelativeLayout stripe : stripes) {
            stripe.setClickable(true);
        }

        for (TextView price : priceText) {
            price.setTextColor(Color.parseColor("#000000"));
        }

        int price1 = player.getCurrentRegion().getCity().getFreshWaterPrice();
        txt = (price1 > 0) ? (symbol + price1) : "N/A";
        waterPrice.setText(txt);
        waterPriceShadow.setText(txt);
        if ("N/A".equals(txt)) {
            two.setVisibility(View.GONE);
        } else {
            two.setVisibility(View.VISIBLE);
        }

        price1 = player.getCurrentRegion().getCity().getScarfPrice();
        txt = (price1 > 0) ? (symbol + price1) : "N/A";
        scarfPrice.setText(txt);
        scarfPriceShadow.setText(txt);
        if ("N/A".equals(txt)) {
            three.setVisibility(View.GONE);
        } else {
            three.setVisibility(View.VISIBLE);
        }

        price1 = player.getCurrentRegion().getCity().getBerriesPrice();
        txt = (price1 > 0) ? (symbol + price1) : "N/A";
        berriesPrice.setText(txt);
        berriesPriceShadow.setText(txt);
        if ("N/A".equals(txt)) {
            four.setVisibility(View.GONE);
        } else {
            four.setVisibility(View.VISIBLE);
        }

        price1 = player.getCurrentRegion().getCity().getNuggetsPrice();
        txt = (price1 > 0) ? (symbol + price1) : "N/A";
        nuggetsPrice.setText(txt);
        nuggetsPriceShadow.setText(txt);
        if ("N/A".equals(txt)) {
            five.setVisibility(View.GONE);
        } else {
            five.setVisibility(View.VISIBLE);
        }

        price1 = player.getCurrentRegion().getCity().getPokeDollPrice();
        txt = (price1 > 0) ? (symbol + price1) : "N/A";
        pokedollPrice.setText(txt);
        pokedollPriceShadow.setText(txt);
        if ("N/A".equals(txt)) {
            six.setVisibility(View.GONE);
        } else {
            six.setVisibility(View.VISIBLE);
        }

        price1 = player.getCurrentRegion().getCity().getPokemonPrice();
        txt = (price1 > 0) ? (symbol + price1) : "N/A";
        pokemonPrice.setText(txt);
        pokemonPriceShadow.setText(txt);
        if ("N/A".equals(txt)) {
            seven.setVisibility(View.GONE);
        } else {
            seven.setVisibility(View.VISIBLE);
        }

        price1 = player.getCurrentRegion().getCity().getPotionsPrice();
        txt = (price1 > 0) ? (symbol + price1) : "N/A";
        potionPrice.setText(txt);
        potionPriceShadow.setText(txt);
        if ("N/A".equals(txt)) {
            eight.setVisibility(View.GONE);
        } else {
            eight.setVisibility(View.VISIBLE);
        }

        price1 = player.getCurrentRegion().getCity().getTechnicalMachinePrice();
        txt = (price1 > 0) ? (symbol + price1) : "N/A";
        tmPrice.setText(txt);
        tmPriceShadow.setText(txt);
        if ("N/A".equals(txt)) {
            nine.setVisibility(View.GONE);
        } else {
            nine.setVisibility(View.VISIBLE);
        }

        price1 = player.getCurrentRegion().getCity().getBigMushroomPrice();
        txt = (price1 > 0) ? (symbol + price1) : "N/A";
        mushroomPrice.setText(txt);
        mushroomPriceShadow.setText(txt);
        if ("N/A".equals(txt)) {
            ten.setVisibility(View.GONE);
        } else {
            ten.setVisibility(View.VISIBLE);
        }

        price1 = player.getCurrentRegion().getCity().getPokeBallPrice();
        txt = (price1 > 0) ? (symbol + price1) : "N/A";
        pokeballPrice.setText(txt);
        pokeballPriceShadow.setText(txt);
        if ("N/A".equals(txt)) {
            eleven.setVisibility(View.GONE);
        } else {
            eleven.setVisibility(View.VISIBLE);
        }
    }

    private void toggleShop() {
        configure();
    }

    private void toggleBag() {
        toggleBag.setClickable(true);
        toggleMap.setClickable(true);
        regionText.setText(player.getCurrentRegion().getRegion().getName());
        cityText.setText(player.getCurrentRegion().getCity().getCityName());
        cityTextShadow.setText(player.getCurrentRegion().getCity().getCityName());
        txt = player.getShip().getNumberOfCargo() + "/" + player.getShip().getCargoBay();
        creditText.setText(txt);
        RelativeLayout[] stripes = {two, three, four, five, six, seven, eight, nine, ten, eleven};
        for (RelativeLayout stripe : stripes) {
            stripe.setVisibility(View.VISIBLE);
            stripe.setClickable(true);
        }
        switch (player.getCurrentRegion().getCity().getTechLevel()) {
            case 0:
                pokedollPrice.setTextColor(Color.parseColor("#CF7766"));
                pokemonPrice.setTextColor(Color.parseColor("#CF7766"));
                potionPrice.setTextColor(Color.parseColor("#CF7766"));
                //noinspection fallthrough
            case 1:
                nuggetsPrice.setTextColor(Color.parseColor("#CF7766"));
                //noinspection fallthrough
            case 2:
                tmPrice.setTextColor(Color.parseColor("#CF7766"));
                //noinspection fallthrough
            case 3:
                pokeballPrice.setTextColor(Color.parseColor("#CF7766"));
                //noinspection fallthrough
            default:
                break;
        }
        TextView[] priceText = {waterPrice, scarfPrice, berriesPrice, nuggetsPrice, pokedollPrice,
                pokemonPrice, potionPrice, tmPrice, mushroomPrice, pokeballPrice};
        TextView[] shadowText = {waterPriceShadow, scarfPriceShadow, berriesPriceShadow,
                nuggetsPriceShadow, pokedollPriceShadow, pokemonPriceShadow, potionPriceShadow,
                tmPriceShadow, mushroomPriceShadow, pokeballPriceShadow};
        for (int i = 0; i < 10; i++) {
            txt = Integer.toString(player.getShip().getCargo(i));
            priceText[i].setText(txt);
            txt = Integer.toString(player.getShip().getCargo(i));
            shadowText[i].setText(txt);
        }
    }

    private void displayConfirmation(String s, int price, int amount) {
        selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
        selectFX.setVolume(1f/10f,1f/10f);
        selectFX.start();
        confirmBox.setVisibility(View.VISIBLE);
        toggleBag.setClickable(false);
        toggleMap.setClickable(false);
        RelativeLayout[] stripes = {two, three, four, five, six, seven, eight, nine, ten, eleven};
        for (RelativeLayout stripe : stripes) {
            stripe.setClickable(false);
        }
        if (shopping) {
            if ((price > player.getPokeDollars()) || (player.getShip().getNumberOfCargo()
                    == player.getShip().getCargoBay())) {
                txt = (price > player.getPokeDollars()) ? "Insufficient Funds!"
                        : "Insufficient Space!";
                okButton.setVisibility(View.VISIBLE);
                yesButton.setVisibility(View.GONE);
                noButton.setVisibility(View.GONE);
                confirmText.setText(txt);
            } else {
                txt = "Purchase " + s + "?";
                okButton.setVisibility(View.GONE);
                yesButton.setVisibility(View.VISIBLE);
                noButton.setVisibility(View.VISIBLE);
                confirmText.setText(txt);
            }
        } else {
            if (amount == 0) {
                txt = "Cannot Sell!";
                okButton.setVisibility(View.VISIBLE);
                yesButton.setVisibility(View.GONE);
                noButton.setVisibility(View.GONE);
                confirmText.setText(txt);
            } else {
                txt = "Sell " + s + "?";
                okButton.setVisibility(View.GONE);
                yesButton.setVisibility(View.VISIBLE);
                noButton.setVisibility(View.VISIBLE);
                confirmText.setText(txt);
            }
        }
    }

    private void purchase(int index, int price) {
        selectFX = MediaPlayer.create(getApplicationContext(), R.raw.purchase);
        selectFX.start();
        player.setPokeDollars(player.getPokeDollars() - price);
        player.getShip().setCargo(index, player.getShip().getCargo(index) + 1);
        player.getShip().setNumberOfCargo(player.getShip().getNumberOfCargo() + 1);
        configure();
    }

    private void sell(int index, int price) {
        selectFX = MediaPlayer.create(getApplicationContext(), R.raw.purchase);
        selectFX.start();
        int price1 = (price < 0) ? 100 : price;
        player.setPokeDollars(player.getPokeDollars() + price1);
        player.getShip().setCargo(index, player.getShip().getCargo(index) - 1);
        player.getShip().setNumberOfCargo(player.getShip().getNumberOfCargo() - 1);
        toggleBag();
    }

    private void displayTravelConfirmation(RegionEnum destination) {
        selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
        selectFX.setVolume(1f/10f,1f/10f);
        selectFX.start();
        RelativeLayout[] regionBoxes = {kanto, johto, hoenn, sinnoh, unova, kalos, oblivia,
                sevii, orre, almia, fiore, orange};
        for (RelativeLayout region : regionBoxes) {
            region.setClickable(false);
        }
        confirmTravel.setVisibility(View.VISIBLE);
        int xDiff = Math.abs(destination.getX() - player.getCurrentRegion().getRegion().getX());
        int yDiff = Math.abs(destination.getY() - player.getCurrentRegion().getRegion().getY());
        int fuelCost = (xDiff + yDiff) * 2;
        if (fuelCost <= player.getShip().getFuel()) {
            txt = "Go to " + destination.getName() + " for " + fuelCost + " fuel?";
            travelMessage.setText(txt);
            okTravel.setVisibility(View.GONE);
            acceptTravel.setVisibility(View.VISIBLE);
            declineTravel.setVisibility(View.VISIBLE);
        } else {
            txt = "Insufficient Fuel!";
            travelMessage.setText(txt);
            okTravel.setVisibility(View.VISIBLE);
            acceptTravel.setVisibility(View.GONE);
            declineTravel.setVisibility(View.GONE);
        }
    }

    private void travel(Region[] regions, int index) {
        selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
        selectFX.setVolume(1f/10f,1f/10f);
        selectFX.start();
        RegionEnum destination = regions[index].getRegion();
        int xDiff = Math.abs(destination.getX() - player.getCurrentRegion().getRegion().getX());
        int yDiff = Math.abs(destination.getY() - player.getCurrentRegion().getRegion().getY());
        int fuelCost = (xDiff + yDiff) * 2;
        player.getShip().setFuel(player.getShip().getFuel() - fuelCost);
        player.setCurrentRegion(regions[index]);
        if (shopping) {
            configure();
        } else {
            toggleBag();
        }
        backButton.setVisibility(View.GONE);
        fuel.setVisibility(View.GONE);
        confirmTravel.setVisibility(View.GONE);
        shopContainer.setVisibility(View.VISIBLE);
        layoutParams.setMargins(-1300, 0, 1300, 0);
        container.setLayoutParams(layoutParams);
        container.setVisibility(View.VISIBLE);
        RelativeLayout[] regionBoxes = {kanto, johto, hoenn, sinnoh, unova, kalos, oblivia, sevii,
                orre, almia, fiore, orange};
        for (RelativeLayout region : regionBoxes) {
            region.setVisibility(View.GONE);
        }
        if ((random.nextInt() % 3) == 1) {
            final Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    shopLayoutParams.setMargins(0, shopLayoutParams.topMargin + 100, 0,
                            shopLayoutParams.bottomMargin - 100);
                    shopContainer.setLayoutParams(shopLayoutParams);
                    if (shopLayoutParams.topMargin != 0) {
                        handler.postDelayed(this, 10);
                    }
                }
            };

            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    layoutParams.setMargins(layoutParams.leftMargin + 50, 0,
                            layoutParams.rightMargin - 50, 0);
                    container.setLayoutParams(layoutParams);
                    if (layoutParams.rightMargin != -1500) {
                        handler.postDelayed(this, 10);
                    } else {
                        container.setVisibility(View.GONE);
                        handler.postDelayed(runnable, 10);
                    }
                }
            }, 100);
        } else {
            int damage = 0;
            switch (player.getDifficulty()) {
                case "Easy":
                    damage = 2;
                    break;
                case "Normal":
                    damage = 3;
                    break;
                case "Hard":
                    damage = 4;
                    break;
                case "Impossible":
                    damage = 5;
                    break;
                default:
                    break;
            }
            player.getShip().setHullStrength(player.getShip().getHullStrength() - damage);
            txt = "A trainer attacked you! Your health is now " + player.getShip().getHullStrength()
                    + "!";
            encounterMessage.setText(txt);
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    layoutParams.setMargins(layoutParams.leftMargin + 50, 0,
                            layoutParams.rightMargin - 50, 0);
                    container.setLayoutParams(layoutParams);
                    if (layoutParams.rightMargin != -1500) {
                        handler.postDelayed(this, 10);
                    } else {
                        container.setVisibility(View.GONE);
                        confirmEncounter.setVisibility(View.VISIBLE);
                    }
                }
            }, 100);
        }
    }

}