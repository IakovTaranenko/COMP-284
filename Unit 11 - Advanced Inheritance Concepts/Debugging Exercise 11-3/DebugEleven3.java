// DebugEleven3.Java - Iakov Taranenko - 4/20/2021

/* 

Debugging Exercise 11-3

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// Two boats should be equal
// if they hold the same number of passengers
// and also have the same power source
public class DebugEleven3 {
    public static void main(String args[]) {
    DebugRowboat redBoat = new DebugRowboat();
    DebugRowboat blueBoat = new DebugRowboat();

    System.out.print("The two boats are");
    if (redBoat == blueBoat)
        System.out.println(" equal");
    else
        System.out.println(" not equal");
    }
}