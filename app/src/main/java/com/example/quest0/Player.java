package com.example.quest0;

public class Player {
    public int Health;
    public int Respect;
    public int Money;
    public String name;

    public Player(String name) {
        Health = 100;
        Respect = 100;
        Money = 100;
        this.name = name;
    }
}
