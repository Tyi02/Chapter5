package com.CSCI185;

import java.util.Scanner;

public class SpeciesDemo {
    public static void main(String[] args) {
        //Make a species object( name the var anything)
        //get user input via method
        //print info via method

        SpeciesFirstTry s1 = new SpeciesFirstTry();
        s1.name = "Wombat";
        s1.population = 16;
        s1.readInput();
        s1.writeOutput();
       //int pop =  s1.getPopulationIn();
        Scanner keyboard = new Scanner(System.in);
        /*
        - for user input
         */
        //System.out.println("Please enter a number of years");
      //  int yearPrediction = keyboard.nextInt();
        //System.out.println("The population would be "+ s1.getPopulationIn(yearPrediction));
        
        System.out.println("The population would be "+ s1.getPopulationIn(25));
        System.out.println("The density over 4 miles is: "+ s1.getDensity(4));
    }
}
