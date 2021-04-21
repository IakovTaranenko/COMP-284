// DebugRowboat.Java - Iakov Taranenko - 4/20/2021

/* 

Debugging Exercise 11-1

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

public class DebugRowboat extends DebugBoat {
    public DebugRowboat() {
        super("row");
        setPassengers();
        setPower();
    }

    public void setPassengers() {
        super.passengers = 2;
    }

    public void setPower() {
        super.power = "oars";
    }
}