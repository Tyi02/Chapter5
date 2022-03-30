package com.CSCI185;

public class Dog
{
	public String name;
	public String breed;
	public int age;
	public char gender;
	public double weight;

	public void writeOutput()
	{
		System.out.println("Name: " + name);
		System.out.println("Breed: " + breed);
		System.out.println("Age in calendar years: " + age);
		System.out.println("Age in human years: " + getAgeInHumanYears());
		System.out.println("Gender is:" + gender);
		System.out.println("Weight is:" + weight);
		System.out.println();
	}

	public int getAgeInHumanYears()
	{
		int humanYears = 0;
		if (age <= 2)
		{
			humanYears = age * 11;
		}
		else
		{
			humanYears = 22 + ((age-2) * 5);
		}
		return humanYears;
	}
}