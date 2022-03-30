package com.CSCI185;

public class PokemonPuce {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        p1.name = "Charizard";
        p1.attack = 25;
        p1.type = "Fire";
        p1.level = 2;
        p1.health = 150;

        Pokemon p2 = new Pokemon();
        p2.name = "Snorlax";
        p2.attack = 20;
        p2.type = "Nprmal";
        p2.level = 2;
        p2.health =200;

        boolean done = false;
        while(!done)
        {
            p1.doAttack(p2);
            p2.doAttack(p1);
            System.out.println("------------\n");
            if(p2.health <= 0 || p1.health <= 0)

                done = true;
            }
        }

    }

