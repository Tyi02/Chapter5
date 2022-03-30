package com.CSCI185;
/*
Define a method called getDensity that could be added to SpeciesSecondTry in 5.6
This method has one parameter of type double that is named area.
The parameter area gives the area occupied by the species in square miles.
The method getDensity returns a value of type double that is equal to the number of individuals per square mile
of the species.
 You can assume the area is always greater then zero
 */
import java.util.Scanner;
public class SpeciesFirstTry {

    public String name;
    public int population;
    public double growthRate;

    public void readInput () {

        Scanner keyboard = new Scanner (System.in);
        System.out.println ("What is the species' name?");
        name = keyboard.nextLine ();
        System.out.println ("What is the population of the species?");
        population = keyboard.nextInt ();
        System.out.println ("Enter growth rate (% increase per year):");
        growthRate = keyboard.nextDouble ();
    }


    public void writeOutput () {

        System.out.println ("Name = " + name);
        System.out.println ("Population = " + population);
        System.out.println ("Growth rate = " + growthRate + "%");
    }


    public int getPopulationIn (int years) {

        int result = 0;
        double populationAmount = population;
        int count = years;
        while ((count > 0) && (populationAmount > 0))
        /*
        - while loop line will determine either true or false
        - if true, continues loop
        - if false, goes to next if statement
        - "&&" means if both the count statement and population amount is true, then the loop will be true
        - vice versa for false
         */
        {
            populationAmount = populationAmount +
                (growthRate / 100) * populationAmount;
            count -- ;
            /*
            - "--" means takes count and removes one
             */
        }
        if (populationAmount > 0)
            result = (int) populationAmount;
        return result;
    }

    /**
     * Calculate population per spare mile of a given species.
     * @param area area occupied in sq miles as a double
     * @return number of species per square mile as a double
     */
    public double getDensity(double area){ // area occupied in sq miles
        double density = population/area;
        return density;

    }
}