// DebugEleven2.Java - Iakov Taranenko - 4/20/2021

/* 

Debugging Exercise 11-2

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// An array for different boat types
public class DebugEleven2 {
    public static void main(String[] args) {
        DebugBoat[] ref = new DebugBoat[3];
        DebugRowboat blueBoat = new DebugRowboat();
        DebugRowboat redBoat = new DebugRowboat();
        DebugOceanLiner bigBoat = new DebugOceanLiner();

        ref[0] = redBoat;
        ref[1] = blueBoat;
        ref[2] = bigBoat;

        for (int x = 0; x < ref.length; x++) {
            ref[x].setPassengers();
            ref[x].setPower();
            System.out.println(ref[x].toString());
        }
    }
}