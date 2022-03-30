package com.CSCI185;

import java.sql.SQLOutput;
import java.util.Random;



/*
1. make a class for a pokemon
2. make variables
    1. Type - pick a variable
    2. name - pick variable
    3. level - pick a variable
    4. health - pick a variable
    5. attack - pick a variable
 */

/**
 * Creates a monster object that can fight other pokemon
 * @author Terry Yi
 * @Version 1.0
 * @since 1-27-22
 */
public class Pokemon {

    public String type;
    public String name;
    public int level;
    public int health;
    public int attack;

    public void setType(String newType)
    {
        type = newType;
    }

    public void setHealth(int newHealth)
    {
        if(health < 0){
            System.out.println(".....you dead...");
            System.exit(0);
        }
        else
        health =  newHealth;
    }

    public String getType()
    {
        return type;
    }

    public int getHealth() {
        return health;
    }

    /**
     * Precondition: Pokemon must have value for all variables
     * Postcondtion:Print all information for a Pokemon.
     */
    public void writeOutput(){
        System.out.println("Type:" + type);
        System.out.println("Name:" + name);
        System.out.println("Level:" + level);
        System.out.println("Health:" + health);
        System.out.println("Attack:" + attack);
    }

    public void flee(){
        System.out.println(name + "tries to run away");
    }


    /**
     * Deals a random amount of damage related to the attack and
     * type of Pokemon.
     */
    public int inflictDamage() {
        return (int) (Math.random() * 6) + 3 + attack;
    }

public void doAttack(Pokemon other){
        int damage = this.inflictDamage();
    System.out.println(this.name+ " attacked " + other.name+
            " for "+damage+" damage ");
    other.health -=damage;
    other.printStatus();
    }

    public void printStatus()
    {
        System.out.println(name+ " currently has "+health+" hit points.");
        System.exit(0);
    }


        /* the (int) cuts everything off after the decimal point
        - 6 is the "range", anything * by Math.random() will give you the range depending on what you have
       - + 3 will give you the starting range
         */

       // System.out.println(name + " " + "uses flamethrower.");
        //System.out.println("Flamethrower did:"+ " " +attack+ " "+ type + " " + "damage.");
        /* - % means it goes in the order the variables are placed in

        */

    //System.out.printf("%s attacks opponent for %d %s damage ", name, (attack+randomDamage), type);
    //}

    public boolean equal(Pokemon other){
        return this.level == other.level &&
                this.attack == other.attack &&
                this.health == other.health &&
                this.name.equalsIgnoreCase(other.name) &&
                this.type.equalsIgnoreCase(other.type);
    }
}
