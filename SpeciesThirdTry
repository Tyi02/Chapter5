package com.CSCI185;

import java.util.Scanner;
public class SpeciesThirdTry
{
    private String name;
    private int population;
    private double growthRate; 

    //Mutator Method (Setter)
    //Rule: void with a parameter that mathces the var type
    public void setPopulation(int newPopulation)
    {
        if(newPopulation< 0){
            System.out.println("That doesn't work stupid....");
            System.exit(0); //quits program
        }
        else
        population = newPopulation;
    }

    //Accessor Method - getter
    //Rule: Type of the method needs to match the variable
    //and I need to return var

    public int getPopulation()
    {
        return population;
    }

   public void readInput ()
   {
        Scanner keyboard = new Scanner (System.in);
        System.out.println ("What is the species' name?");
        name = keyboard.nextLine ();
        System.out.println ("What is the population of the species?");
       setPopulation(keyboard.nextInt());
        System.out.println ("Enter growth rate (% increase per year):");
        growthRate = keyboard.nextDouble ();
    }


    public void writeOutput ()
    {
        System.out.println ("Name = " + name);
        System.out.println ("Population = " + population);
        System.out.println ("Growth rate = " + growthRate + "%");
    }


    public int predictPopulation (int years) {
        int result = 0;
        double populationAmount = population;
        int count = years;
        while ((count > 0) && (populationAmount > 0)) {
            populationAmount = (populationAmount +
                    (growthRate / 100) * populationAmount);
            count--;
        }
        if (populationAmount > 0)
            result = (int) populationAmount;
        return result;
    }

        public boolean equals(SpeciesThirdTry other){
            return this.population == other.population &&
                    this.growthRate == other.growthRate &&
                    this.name.equalsIgnoreCase(other.name);
        }
    }
