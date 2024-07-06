package com.mygdx.game.Utils;

import java.io.Serializable;

public class tank implements Serializable{
    private int gas;
    private String color;
    private int hp;
    public void setColor(String c){
        this.color=c;

    }
    public String getcolor(){
        return color;
    }

}
