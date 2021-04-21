// DemoTurners2.Java - Iakov Taranenko - 4/20/2021

/* 

Programming Exercise 11-8

Create an interface named Turner, with a single method named turn(). Create a class named Leaf that implements the Turner interface to display Changing colors.. Create a class named Page that implements the Turner interface to display Going to the next page.. Create a class named Pancake that implements the Turner interface to display Flipping..

Think of two more objects that can use the Turner interface, create classes for them, and then add objects to the DemoTurners2 application. Save the files, using the names of new objects that use turn().

*/


public class DemoTurners2 {
    public static void main(String[] args) {
        Leaf aLeaf = new Leaf();
        Page aPage = new Page();
        Pancake aCake = new Pancake();

        // write your code here

        aLeaf.turn();
        aPage.turn();
        aCake.turn();

        // write your code here
    }
}