// MetalElement.Java - Iakov Taranenko - 4/20/2021

/* 

Programming Exercise 11-5

Create an abstract class named Element that holds properties of elements, including their symbol, atomic number, and atomic weight. Include a constructor that requires values for all three properties, a get method for each value, and an abstract method named describeElement().

For example, the symbol for carbon is C, its atomic number is 6, and its atomic weight is 12.01. You can find these values by reading a periodic table in a chemistry reference or by searching the Internet.

Create two extended classes named MetalElement and NonMetalElement. Each contains a describeElement() method that displays the details of the element and a brief explanation of the properties of the element type. For example, metals are good conductors of electricity, while nonmetals are poor conductors.

*/

public class MetalElement extends Element {
    public MetalElement(String s, int an, double aw) {
        // write your code here
    }

    public void describeElement() {
        // write your code here
    }
}