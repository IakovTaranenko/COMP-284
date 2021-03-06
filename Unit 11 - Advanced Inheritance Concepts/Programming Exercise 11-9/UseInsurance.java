// UseInsurance.Java - Iakov Taranenko - 4/20/2021

/* 

Programming Exercise 11-9

Write an application that uses an abstract Insurance class and Health and Life subclasses to display different types of insurance policies and the cost per month.

The Insurance class contains a String representing the type of insurance and a double that holds the monthly price. The Insurance class constructor requires a String argument indicating the type of insurance, but the Life and Health class constructors require no arguments. The Insurance class contains a get method for each field; it also contains two abstract methods named setCost() and display(). The Life class setCost() method sets the monthly fee to $36, and the Health class sets the monthly fee to $196.

The UseInsurance.java file is provided to test your implementation of the Health and Life classes.

Examples of the program are shown below:

*/

import java.util.*;
public class UseInsurance {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int insurance;
        System.out.println("Enter 1 for Life Insurance or 2 for Health Insurance");
        String userInput = input.next();
        insurance = Integer.parseInt(userInput);

        if (insurance == 1)
            insuranceLife();
        else
            insuranceHealth();
    }

    public static void insuranceLife() {
        Life life = new Life();
        life.display();
    }

    public static void insuranceHealth() {
        Health health = new Health();
        health.display();
    }
}