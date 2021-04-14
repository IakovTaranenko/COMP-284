// DemoPoems.Java - Iakov Taranenko - 4/13/2021

/* 

Debugging Exercise 10-4

Create a class named Poem that contains the following fields:

title - the name of the poem (of type String)
lines - the number of lines in the poem (of type int)
Include a constructor that requires values for both fields. Also include get methods to retrieve field values. Create three subclasses: Couplet, Limerick, and Haiku. The constructor for each subclass requires only a title; the lines field is set using a constant value. A couplet has two lines, a limerick has five lines, and a haiku has three lines.

An example of the DemoPoems program is shown below:

Poem: The Raven   Lines: 84
Poem: True Wit   Lines: 2
Poem: There was an Old Man with a Beard   Lines: 5
Poem: The Wren   Lines: 3

*/

import java.util.*;
public class DemoPoems {
    public static void main(String[] args) {
        Poem poem1 = new Poem("The Raven", 84);
        Couplet poem2 = new Couplet("True Wit");
        Limerick poem3 = new Limerick("There was an Old Man with a Beard");
        Haiku poem4 = new Haiku("The Wren");
        display(poem1);
        display(poem2);
        display(poem3);
        display(poem4);
    }

    public static void display(Poem p) {
        System.out.println("Poem: " + p.getTitle() + "   Lines: " + p.getLines());
    }
}  