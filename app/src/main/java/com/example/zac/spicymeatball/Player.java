package com.example.zac.spicymeatball;

/**
 * Created by zac on 11/4/2016.
 * Copyright (c) Zachary Patel
 */

public class Player {
    private String name;
    private Meatball m;


    public Player(String playerName, Meatball playerMeatball){
        name = playerName;
        m = playerMeatball;

    }

    public String getPlayerName(){
        return name;
    }

    public Meatball getPlayerMeatball(){
        return m;
    }
}
