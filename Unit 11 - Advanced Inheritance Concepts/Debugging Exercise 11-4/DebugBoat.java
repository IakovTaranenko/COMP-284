// DebugBoat.Java - Iakov Taranenko - 4/20/2021

/* 

Debugging Exercise 11-4

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

public abstract class DebugBoat {
    String boatType = new String();
    int passengers;
    String power = new String();

    public DebugBoat(String bt) {
        boatType = bt;
    }

    public boolean equals(DebugBoat otherBoat) {
        boolean result;

        if ((passengers == otherBoat.passengers) && (power.equals(otherBoat.power)))
            result = true;
        else
            result = false;
        return result;
    }

    public String toString() {
        return("This " + boatType + "boat carries " + passengers + " and is powered by " + power);
    }

    public abstract void setPower();
    public abstract void setPassengers();
}