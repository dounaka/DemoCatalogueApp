package ca.tash.catalogueapp.provider;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import ca.tash.catalogueapp.store.Bag;
import ca.tash.catalogueapp.store.Entity;
import ca.tash.catalogueapp.store.WishList;

/**
 * Created by dounaka on 2017-04-13.
 * <p>
 * Volatile database
 * allows to
 */

public class DataStoreInitializer  {
    public static void initData() {
        if (DataStore.getInstance().countAll() > 0) return;
        DataStore dataStore = DataStore.getInstance();
        Bag bag = new Bag();
        // Carrier bag
        bag.id = 12001l;
        bag.photoId = 101l;
        bag.name = "Carrier Bag";
        bag.shortDesc = "Navy Blue and Brown soft leather";
        bag.longDesc = "Our Mountain Briefcase is the ultimate shape changing, go to work, bum around town, travel the world, do it every day carry.";
        bag.colors.add("#1E293A");
        bag.colors.add("#A36348");
        bag.price = 250;
        bag.heightInInches = 14;
        bag.widthInInches = 15;
        bag.deepInInches = 8;
        dataStore.put(bag);


        // Ubarnito
        bag = new Bag();
        bag.id = 12002l;
        bag.photoId = 102l;
        bag.name = "Urbanito";
        bag.shortDesc = "Biker basics";
        bag.longDesc = "Our Urbanito is the ultimate shape changing, go to work, bum around town, travel the world, do it every day carry.";
        bag.colors.add("#1E293A");
        bag.colors.add("#CBC340");
        bag.colors.add("#F3A03A");
        bag.price = 75;

        bag.heightInInches = 12;
        bag.widthInInches = 11;
        bag.deepInInches = 6;


        dataStore.put(bag);

        // Travol
        bag = new Bag();
        bag.id = 12003l;
        bag.photoId = 103l;
        bag.price = 175;
        bag.name = "Travol";
        bag.shortDesc = "Soft leather bag";
        bag.longDesc = "Our Travol is the ultimate shape changing, go to work, bum around town, travel the world, do it every day carry.";
        // no colors so not available
        bag.heightInInches = 10;
        bag.widthInInches = 14;
        bag.deepInInches = 6;
        dataStore.put(bag);

    }
}
