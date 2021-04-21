// SidedObject.Java - Iakov Taranenko - 4/20/2021

/* 

Programming Exercise 11-11

An interface named SidedObject has been added that contains a method called displaySides(). Modify the displaySides() method so that it displays the number of sides the object possesses. Modify the GeometricFigure2 subclasses to include the use of the interface to display the number of sides of the figure.

The displaySides() method in the Square2 class should output This figure has four sides. It should output This figure has three sides in the Triangle2 class.

*/

public interface SidedObject {
    public void displaySides();
}