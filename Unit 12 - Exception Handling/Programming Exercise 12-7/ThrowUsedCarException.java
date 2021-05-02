// ThrowUsedCarException.Java - Iakov Taranenko - 4/27/2021

/* 

Programming Exercise 12-7

Create a UsedCarException class that extends Exception; its constructor receives a value for a vehicle identification number (VIN) that is passed to the parent constructor so it can be used in a getMessage() call. Create a UsedCar class with fields for vin, make, year, mileage, and price. The UsedCar constructor throws a UsedCarException when the VIN is not four digits; when the make is not Ford, Honda, Toyota, Chrysler, or Other; when the year is not between 1997 and 2017 inclusive; or either the mileage or price is negative.

The ThrowUsedCarException application has been provided to test your implementation. The ThrowUsedCarException application establishes an array of at least seven UsedCar objects and handles any Exceptions and displays a list of only the UsedCar objects that were constructed successfully.

*/

    public class ThrowUsedCarException {
    public static void main(String[] args) {
        UsedCar[] cars = new UsedCar[7];
        String[] vins = {"1234", "2345", "234Q", "12345", "3333", "3123", "9823"};
        String[] makes = {"Ford", "Toyota", "Chrysler", "Other", "Ford", "BMW", "Other"};
        int[] years ={2008, 1975, 1996, 2015, 2010, 2021, 2013};
        int[] mileages = {90000, 120000, 26000, 1000, -2, 20000, 35000};
        int[] prices = {12000, 8000, -200, 5000, 10000, 14000, 9000}; 
        int x;

        for(x = 0; x < cars.length; ++x)
            cars[x] = new UsedCar();
        for(x = 0; x < cars.length; ++x)
            try {
            cars[x] = new UsedCar(vins[x], makes[x], years[x], mileages[x], prices[x]);
            } catch(UsedCarException error) {
            System.out.println("Error: " + error.getMessage());
            }
        System.out.println("\nGood used car values");

        for(x = 0; x < cars.length; ++x)
            if(!cars[x].getVin().equals(UsedCar.DEFAULT_VIN))
                System.out.println(cars[x].toString());
    }
}