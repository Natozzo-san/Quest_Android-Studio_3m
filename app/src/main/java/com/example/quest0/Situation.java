package com.example.quest0;

public class Situation {
    Situation[] direction;
    String text;
    int dHealth, dRespect, dMoney;

    public Situation ( String text, int variants, int dHealth, int dRespect, int dMoney) {
        this.text = text;
        this.dHealth = dHealth;
        this.dRespect = dRespect;
        this.dMoney = dMoney;
        this.direction = new Situation[variants];
    }
}
