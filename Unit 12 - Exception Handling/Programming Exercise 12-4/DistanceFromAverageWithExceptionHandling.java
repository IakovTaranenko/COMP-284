// DistanceFromAverageWithExceptionHandling.Java - Iakov Taranenko - 4/27/2021

/* 

Programming Exercise 12-4

In Chapter 8 Exercise 2, you wrote an application named DistanceFromAverage that allows a user to enter up to 15 double values and then displays each entered value and its distance from the average. Now, modify that program to first prompt the user to enter an integer that represents the array size. Java generates a NumberFormatException if you attempt to enter a noninteger value using nextInt(); handle this exception by displaying an appropriate error message. If the user enters the value 99999 to quit the program before entering all values to fill the array, the program should perform its calculations on the values already entered before exiting.

Create an array using the integer entered as the size. Java generates a NegativeArraySizeException if you attempt to create an array with a negative size; handle this exception by setting the array size to a default value of five. If the array is created successfully, use exception-handling techniques to ensure that each entered array value is a double before the program calculates each element’s distance from the average.

An example of the program is shown below:

Please enter a value for the array size >> 3
Enter a numeric value or 99999 to quit >> 223
Enter next numeric value or 99999 to quit >> -223
Enter next numeric value or 99999 to quit >> Tuesday
Enter next numeric value or 99999 to quit >> 0
You entered 3 numbers and their average is 0.0
223.0 is -223.0 away from the average
-223.0 is 223.0 away from the average
0.0 is 0.0 away from the average

*/

import java.util.*;
public class DistanceFromAverageWithExceptionHandling {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[15];
        double entry;
        double total = 0;
        double average = 0;
        final int QUIT = 99999;
        int x = 0, y;
        System.out.print("Enter a numeric value or " + QUIT + " to quit >> ");
        entry = input.nextDouble();

        while (entry != QUIT && x < numbers.length) {
            numbers[x] = entry;
            total += numbers[x];
            ++x;

            if (x < numbers.length) {
                System.out.print("Enter next numeric value or " + QUIT + " to quit >> ");
                entry = input.nextDouble();  
            }
        }
        
        if (x == 0)
            System.out.println("Average cannot be computed because no numbers were entered");
        else {
            average = total / x;
            System.out.println("You entered " + x + " numbers and their average is " + average);

            for (y = 0; y < x; ++y)
            System.out.println(numbers[y] + " is " + (numbers[y] - average) + " away from the average");
        }           
    }
}