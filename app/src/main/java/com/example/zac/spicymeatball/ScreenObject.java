package com.example.zac.spicymeatball;

import android.graphics.Point;
import android.media.Image;
import android.graphics.Rect;

/**
 * Created by zac on 11/4/2016.
 * Copyright (c) Zachary Patel
 */

public class ScreenObject {
    private Point pos;
    private Image image;
    private int xLength, yLength;

    // Add some player information here later

    public ScreenObject(){};

    public ScreenObject(Point p, int xLen, int yLen, Image i){
        pos = p;
        image = i;
        xLength = xLen;
        yLength = yLen;

    }

    // Get Methods
    public Image getImage(){
        return image;
    }

    public Point getPos(){
        return pos;
    }

    public int getX(){
        return getPos().x;
    }

    public int getY(){
        return getPos().y;
    }


    public int getxLength() {
        return xLength;
    }

    public int getyLength() {
        return yLength;
    }

    // Returns a rectngle hitbox
    public Rect getHitbox(){
        return new Rect(getX(), getY(), getX() + getxLength(), getY() + getyLength());
    }

    // Set Methods
    public void setImage(Image i){
        image = i;
    }

    public void setPos(Point p) {
        pos = p;
    }

    public void setxLength(int xLength) {
        this.xLength = xLength;
    }

    public void setyLength(int yLength) {
        this.yLength = yLength;
    }

}
