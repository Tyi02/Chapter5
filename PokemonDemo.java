package com.CSCI185;

public class PokemonDemo{
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        p1.setType("Fire");
        p1.name ="Charizard";
        p1.level = 100;
        p1.setHealth(350);
        p1.attack = 50;
        p1.writeOutput();
        p1.inflictDamage();

        System.out.println("----------\n");

        Pokemon p2 = new Pokemon();
        p2.setType("Water");
        p2.name ="WarTortle";
        p2.level = 100;
        p2.setHealth(350);
        p2.attack = 50;
        p2.writeOutput();
        p2.inflictDamage();
    }

}
