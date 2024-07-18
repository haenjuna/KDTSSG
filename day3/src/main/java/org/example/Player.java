package org.example;

public class Player {
    int hp;
    String name;

    public Player(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    public int attack() {
        return 100-hp;
    }

    public String defense(int damage) {
        this.hp -= damage;
        return "와 존나쌔 피"+this.hp+ "남음";
    }
}
