// OrderMessages.Java - Iakov Taranenko - 4/27/2021

/* 

Programming Exercise 12-11

A company accepts user orders for its products interactively. Users might make the following errors as they enter data:

• The item number ordered is not numeric, too low (less than 0), or too high (more than 9999).

• The quantity is not numeric, too low (less than 1), or too high (more than 12).

• The item number is not a currently valid item.

Although the company might expand in the future, its current inventory consists of the items listed in Table 12-1.

Table of item numbers and prices. The table has 4 rows and 2 columns. The column headings from left to right are Item Number and Price parentheses dollar sign parentheses. The row details are as follows. Row 1: Item Number, 111; Price parentheses dollar sign parentheses, 0 period 8 9. Row 2: Item Number, 222; Price parentheses dollar sign parentheses, 1 period 4 7. Row 3: Item Number, 333; Price parentheses dollar sign parentheses, 2 period 4 3. Row 4: Item Number, 444; Price parentheses dollar sign parentheses, 5 period 9 9.
Create a class that stores an array of usable error messages. Create an OrderException class that stores one of the messages. Create an application that contains prompts for an item number and quantity. Allow for the possibility of nonnumeric entries as well as out-of-range entries and entries that do not match any of the currently available item numbers. The program should display an appropriate message if an error has occurred. The program error messages can be found in the OrderMessages.java file. If no errors exist in the entered data, compute the user’s total amount due (quantity times price each) and display it.

*/

public class OrderMessages {
   public final static String[] message = {
        "Item number not numeric    ",
        "Quantity not numeric       ",
        "Item number too low        ",
        "Item number too high       ",
        "Quantity too low           ",
        "Quantity too high          ",
        "Item number does not exist "     };
}