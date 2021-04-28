// PlaceAnOrder.Java - Iakov Taranenko - 4/27/2021

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

import java.util.*;
public class PlaceAnOrder {
    public static void main(String[] args) {
        final int HIGHITEM = 9999;
        final int HIGHQUAN = 12;
        int code;
        int x;
        boolean found = false;
        final int[] ITEM = {111, 222, 333, 444};
        final double[] PRICE = {0.89, 1.47, 2.43, 5.99}; 
        int item;
        int quantity;
        double price = 0;
        double totalPrice = 0;
        Scanner input = new Scanner(System.in);
      
        try {
            System.out.print("Enter item number ");
            if (input.hasNextInt())
                item = input.nextInt();
            else
                throw(new OrderException(OrderMessages.message[0]));

            System.out.print("Enter quantity ");
            if (input.hasNextInt())
                quantity = input.nextInt();
            else
                throw(new OrderException(OrderMessages.message[1]));

            for (x = 0; x < ITEM.length; ++x) {
                if(item == ITEM[x])
                    found = true;
                else
                    found = false;
            
                if(found == true && 1 <= quantity && quantity <= 12) {
                    price = PRICE[x];
                    totalPrice = price * quantity;
                    System.out.print("Total price is $" + totalPrice);
                } 
            }

            if (item < 0)  
                throw (new OrderException(OrderMessages.message[2]));

            if (item > HIGHITEM)
                throw(new OrderException(OrderMessages.message[3]));

            if (quantity < 1)
                throw (new OrderException(OrderMessages.message[4]));

            if (quantity > HIGHQUAN)
                throw (new OrderException(OrderMessages.message[5]));

            if (found == false)
                throw(new OrderException(OrderMessages.message[6]));

    
        } catch(Exception exception) {
            System.out.print("Message is: " + exception.getMessage());
        } 
    }
}
