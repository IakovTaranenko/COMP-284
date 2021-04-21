// DebugEleven4.Java - Iakov Taranenko - 4/20/2021

/* 

Debugging Exercise 11-4

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// Creates and displays an array of boats -
// some are rowboats; some are ocean liners
import java.util.*;
public class DebugEleven4 {
    static Scanner input = new Scanner(System.in);
    static DebugBoat[] boatArray = new DebugBoat[5];

    public static void main(String[] args) {
        buildArray();
        displayArray();
    }

    public static void buildArray() {
        char boatType;

        for (int x = 0; x < boatArray.length; ++x) {
            boatType = getBoat();
            if (boatType == 'r')
                boatArray[x] = new DebugRowboat();
            else
                boatArray[x] = new DebugOceanLiner();
        }
    }

    public static char getBoat() {
        String boatType;

        System.out.println("Enter r for rowboat; o for ocean liner ");
        boatType = input.next();

        return boatType.charAt(0);
    }

    public static void displayArray() {
        for (int x = 0; x < boatArray.length; ++x)
            System.out.println("Boat #" + (x + 1) + " " + boatArray[x].toString());
    }
}