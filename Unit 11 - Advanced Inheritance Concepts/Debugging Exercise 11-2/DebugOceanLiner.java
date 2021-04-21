// DebugOceanLiner.Java - Iakov Taranenko - 4/20/2021

/* 

Debugging Exercise 11-2

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

public class DebugOceanLiner extends DebugBoat {
    public DebugOceanLiner() {
        super("ocean liner ");
        setPassengers();
        setPower();
    }

    public void setPassengers() {
        super.passengers = 2400;
    }

    public void setPower() {
        super.power = "four engines";
    }
}