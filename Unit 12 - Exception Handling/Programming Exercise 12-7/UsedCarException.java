// UsedCarException.Java - Iakov Taranenko - 4/27/2021

/* 

Programming Exercise 12-7

Create a UsedCarException class that extends Exception; its constructor receives a value for a vehicle identification number (VIN) that is passed to the parent constructor so it can be used in a getMessage() call. Create a UsedCar class with fields for vin, make, year, mileage, and price. The UsedCar constructor throws a UsedCarException when the VIN is not four digits; when the make is not Ford, Honda, Toyota, Chrysler, or Other; when the year is not between 1997 and 2017 inclusive; or either the mileage or price is negative.

The ThrowUsedCarException application has been provided to test your implementation. The ThrowUsedCarException application establishes an array of at least seven UsedCar objects and handles any Exceptions and displays a list of only the UsedCar objects that were constructed successfully.

*/

public class UsedCarException extends Exception {
    public UsedCarException(String s) {
        // Write your code here
    }
}