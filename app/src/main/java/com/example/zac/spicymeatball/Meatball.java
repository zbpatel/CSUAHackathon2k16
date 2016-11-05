package com.example.zac.spicymeatball;

/**
 * Created by zac on 11/4/2016.
 * Copyright (c) Zachary Patel
 */

public class Meatball extends ScreenObject {
    private Player meatballPlayer;
    public Meatball(Player p){
        meatballPlayer = p;

    }

    public Player getPlayer(){
        return meatballPlayer;
    }
}
