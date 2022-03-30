package com.CSCI185;

/*
Write a program that uses the Purchase class in 6.13. Set the prices to the following:
	1.	Oranges: 10 for $2.99
	2.	Eggs: 12 for $1.69
	3.	Apples: 3 for $1.00
	4.	Watermelons: $439 each
	5.	Bagels: 6 for $3.50
	6.	Set the purchased quantity to the following:
	7.	2 dozen oranges, 2 dozen eggs, 20 apples, 2 watermelons, 1 dozen bagels
	8.	Display the total cost of the bill
 */
public class Store {
    public static void main(String[] args) {



    Purchase item1 = new Purchase();
        item1.setName("Oranges");
    item1.setPrice(10, 2.99);
    item1.setNumberBought(24);



    Purchase item2 = new Purchase();
    item2.setName("Eggs");
        item2.setPrice(12, 1.69);
        item2.setNumberBought(24);

        Purchase item3 = new Purchase();
        item3.setName("Apples");
        item3.setPrice(3,1.00);
        item3.setNumberBought(20);

        Purchase item4 = new Purchase();
        item4.setName("Watermelons");
        item4.setPrice(1,4.39);
        item4.setNumberBought(2);

        Purchase item5 = new Purchase();
        item5.setName("Bagels");
        item5.setPrice(6,3.50);
        item5.setNumberBought(12);




        double item1Cost = item1.getTotalCost();
        double item2Cost = item2.getTotalCost();
        double item3Cost = item3.getTotalCost();
        double item4Cost = item4.getTotalCost();
        double item5Cost = item5.getTotalCost();

        double total = item1Cost + item2Cost + item3Cost + item4Cost + item5Cost;

        item1.writeOutput();
        item2.writeOutput();
        item3.writeOutput();
        item4.writeOutput();
        item5.writeOutput();


        System.out.printf("The total cost is $%1.2f",total);

        double item1UnitCost = item1.getUnitCost();
        double item2UnitCost = item2.getUnitCost();
        double item3UnitCost = item3.getUnitCost();
        double item4UnitCost = item4.getUnitCost();
        double item5UnitCost = item5.getUnitCost();

        double unitCost = item1UnitCost + item2UnitCost + item3UnitCost + item4UnitCost + item5UnitCost;

        System.out.println("""
                """);

        System.out.printf("The total Unit cost $%1.2f", unitCost);







    }
}
