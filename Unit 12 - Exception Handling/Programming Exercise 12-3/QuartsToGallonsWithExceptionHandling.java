// QuartsToGallonsWithExceptionHandling.Java - Iakov Taranenko - 4/27/2021

/* 

Programming Exercise 12-3

In Chapter 2, you created an application named QuartsToGallonsInteractive that accepts a number of quarts from a user and converts the value to gallons. Now, add exception-handling capabilities to this program and continuously reprompt the user while any nonnumeric value is entered.

An example of the program is shown below:

Enter quarts needed >> ten
Invalid data entry
Enter quarts needed >> one
Invalid data entry
Enter quarts needed >> 5
A job that needs 5 quarts requires 1 gallons plus 1 quarts.

*/

import java.util.Scanner;
class QuartsToGallonsWithExceptionHandling {
    public static void main(String[] args) {  
        final int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 18;
        int gallonsNeeded;
        int extraQuartsNeeded;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter quarts needed >> ");
        quartsNeeded = input.nextInt();
        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsNeeded + " quarts requires " + gallonsNeeded + " gallons plus " + extraQuartsNeeded + " quarts.");
    }
}