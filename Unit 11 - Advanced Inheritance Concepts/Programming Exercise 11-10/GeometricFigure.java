// GeometricFigure.Java - Iakov Taranenko - 4/20/2021

/* 

Programming Exercise 11-10

Create an abstract class called GeometricFigure. Add height, width, and figure attributes. Include an abstract method figureArea to determine the area of the figure. Create two subclasses called Square and Triangle. Define the constructor and figureArea method of each subclass.

The UseGeometric.java file has been provided to test the implementations.

*/

public abstract class GeometricFigure {
    // write your code here
   
    public GeometricFigure(int h, int w, String f) {
        // write your code here
    }

    public int getHeight() {
        // write your code here
    }

    public int getWidth() {
        // write your code here
    }

    public String getFigure() {
        // write your code here
    }
}