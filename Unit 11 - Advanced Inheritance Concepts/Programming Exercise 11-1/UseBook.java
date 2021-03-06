// UseBook.Java - Iakov Taranenko - 4/20/2021

/* 

Programming Exercise 11-1

Create an abstract class named Book. Include a String field for the book’s title and a double field for the book’s price. Within the class, include a constructor that requires the book title, and add two get methods—one that returns the title and one that returns the price. Include an abstract method named setPrice().

Create two child classes of Book: Fiction and NonFiction. Each must include a setPrice() method that sets the price for all Fiction Books to $24.99 and for all NonFiction Books to $37.99. Write a constructor for each subclass, and include a call to setPrice() within each. Write an application demonstrating that you can create both a Fiction and a NonFiction Book, and display their fields.

*/

public class UseBook {
    public static void main(String[] args) {
        Fiction aNovel = new Fiction("Huckelberry Finn");
        NonFiction aManual = new
        NonFiction("Elements of Style");

        System.out.println("Fiction " + aNovel.getTitle() + " costs $" + aNovel.getPrice());

        System.out.println("Non-Fiction " + aManual.getTitle() + " costs $" + aManual.getPrice());
    }
}