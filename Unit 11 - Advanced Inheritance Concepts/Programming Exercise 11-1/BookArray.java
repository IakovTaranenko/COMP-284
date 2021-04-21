// BookArray.Java - Iakov Taranenko - 4/20/2021

/* 

Programming Exercise 11-1

Create an abstract class named Book. Include a String field for the book’s title and a double field for the book’s price. Within the class, include a constructor that requires the book title, and add two get methods—one that returns the title and one that returns the price. Include an abstract method named setPrice().

Create two child classes of Book: Fiction and NonFiction. Each must include a setPrice() method that sets the price for all Fiction Books to $24.99 and for all NonFiction Books to $37.99. Write a constructor for each subclass, and include a call to setPrice() within each. Write an application demonstrating that you can create both a Fiction and a NonFiction Book, and display their fields.

*/

public class BookArray {
    public static void main(String[] args) {
        Book someBooks[] = new Book[10];
        someBooks[0] = new Fiction("Scarlet Letter");
        someBooks[1] = new NonFiction("Introduction to Java");
        someBooks[2] = new Fiction("Mill on the Floss");
        someBooks[3] = new NonFiction("The Road Not Taken");
        someBooks[4] = new Fiction("A Tale of Two Cities");
        someBooks[5] = new NonFiction("Europe on $5 a Day");
        someBooks[6] = new Fiction("War and Peace");
        someBooks[7] = new Fiction("A Simple Plan");
        someBooks[8] = new Fiction("Disclosure");
        someBooks[9] = new Fiction("Nancy Drew");

        for (int x = 0; x < someBooks.length; ++x)
            System.out.println("Book: " +  someBooks[x].getTitle() + " costs $" + someBooks[x].getPrice());
    }
}