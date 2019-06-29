package com.example.a2340project.views;

import java.util.Random;

import android.arch.lifecycle.ViewModelProviders;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
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
import com.example.a2340project.viewmodels.CreatePlayerViewModel;

public class createRegionActivity extends AppCompatActivity {

    private Button exit;
    private HorizontalScrollView map;
    private ImageView background;
    private RelativeLayout screen;
    private RelativeLayout container;
    private RelativeLayout shopContainer;
    private ImageView ship;
    private RelativeLayout.LayoutParams layoutParams;
    private RelativeLayout.LayoutParams shopLayoutParams;

    private String symbol = "\u20BD";
    private String txt;

    private Player player;

    private MediaPlayer selectFX;

    private Random random;

    private Handler handler;

    private CreatePlayerViewModel viewModel;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_region);

        exit = findViewById(R.id.exitButton);
        map = findViewById(R.id.map);
        background = findViewById(R.id.mapBackground);
        screen = findViewById(R.id.screen);
        container = findViewById(R.id.container);
        shopContainer = findViewById(R.id.shopContainer);
        ship = findViewById(R.id.shipAnimation);

        layoutParams = (RelativeLayout.LayoutParams) container.getLayoutParams();
        shopLayoutParams = (RelativeLayout.LayoutParams) shopContainer.getLayoutParams();

        random = new Random();
        handler = new Handler();

        viewModel = ViewModelProviders.of(this).get(CreatePlayerViewModel.class);

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

        Region[] regions = new Region[12];

        for (RegionEnum region : RegionEnum.values()) {
            regions[region.ordinal()] = new Region(region, region.getX(), region.getY(), 5, 0, random.nextInt(2));
        }

        player = viewModel.getAllPlayers().get(0);
        player.setCurrentRegion(regions[random.nextInt(13)]);

        regionText.setText(player.getCurrentRegion().getRegion().getName());
        txt = symbol + player.getPokeDollars();
        creditText.setText(txt);
        cityText.setText(player.getCurrentRegion().getCity().getCityName());
        cityTextShadow.setText(player.getCurrentRegion().getCity().getCityName());

        txt = symbol + player.getCurrentRegion().getCity().getFreshWaterPrice();
        waterPrice.setText(txt);
        waterPriceShadow.setText(txt);

        txt = symbol + player.getCurrentRegion().getCity().getScarfPrice();
        scarfPrice.setText(txt);
        scarfPriceShadow.setText(txt);

        txt = symbol + player.getCurrentRegion().getCity().getBerriesPrice();
        berriesPrice.setText(txt);
        berriesPriceShadow.setText(txt);

        txt = symbol + player.getCurrentRegion().getCity().getNuggetsPrice();
        nuggetsPrice.setText(txt);
        nuggetsPriceShadow.setText(txt);

        txt = symbol + player.getCurrentRegion().getCity().getPokeDollPrice();
        pokedollPrice.setText(txt);
        pokedollPriceShadow.setText(txt);

        txt = symbol + player.getCurrentRegion().getCity().getPokemonPrice();
        pokemonPrice.setText(txt);
        pokemonPriceShadow.setText(txt);

        txt = symbol + player.getCurrentRegion().getCity().getPotionsPrice();
        potionPrice.setText(txt);
        potionPriceShadow.setText(txt);

        txt = symbol + player.getCurrentRegion().getCity().getTechnicalMachinePrice();
        tmPrice.setText(txt);
        tmPriceShadow.setText(txt);

        txt = symbol + player.getCurrentRegion().getCity().getBigMushroomPrice();
        mushroomPrice.setText(txt);
        mushroomPriceShadow.setText(txt);

        txt = symbol + player.getCurrentRegion().getCity().getPokeBallPrice();
        pokeballPrice.setText(txt);
        pokeballPriceShadow.setText(txt);


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

        toggleMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFX = MediaPlayer.create(getApplicationContext(), R.raw.select);
                selectFX.setVolume(1f/10f,1f/10f);
                selectFX.start();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        shopLayoutParams.setMargins(0, shopLayoutParams.topMargin - 50, 0, shopLayoutParams.bottomMargin + 50);
                        shopContainer.setLayoutParams(shopLayoutParams);
                        if (shopLayoutParams.topMargin != -4000) {
                            handler.postDelayed(this, 10);
                        } else {
                            shopContainer.setVisibility(View.GONE);
                        }
                    }
                }, 10);
            }
        });


        final String TAG = "Display Tag";
        for (Region var: regions) {
            Log.d(TAG, var.toString());
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                map.smoothScrollTo(background.getWidth()/2 - screen.getWidth()/2, 0);
            }
        }, 500);

        layoutParams.setMargins(-1300, 0, 1300, 0);
        container.setLayoutParams(layoutParams);
        ship.setVisibility(View.VISIBLE);

        shopLayoutParams.setMargins(0, -4000, 0, 4000);
        shopContainer.setLayoutParams(shopLayoutParams);
        shopContainer.setVisibility(View.VISIBLE);

        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                shopLayoutParams.setMargins(0, shopLayoutParams.topMargin + 50, 0, shopLayoutParams.bottomMargin - 50);
                shopContainer.setLayoutParams(shopLayoutParams);
                if (shopLayoutParams.topMargin != 0) {
                    handler.postDelayed(this, 10);
                }
            }
        };

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                layoutParams.setMargins(layoutParams.leftMargin + 50, 0, layoutParams.rightMargin - 50, 0);
                container.setLayoutParams(layoutParams);
                if (layoutParams.rightMargin != -1500) {
                    handler.postDelayed(this, 10);
                } else {
                    ship.setVisibility(View.GONE);
                    handler.postDelayed(runnable, 10);
                }
            }
        }, 100);


    }

}
