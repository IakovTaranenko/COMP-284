// PurchaseArray.Java - Iakov Taranenko - 3/23/2021

/* 

Programming Exercise 8-11

In Chapter 6 Exercise 15, you created a class named Purchase. Each Purchase contains an invoice number (invoiceNumber), amount of sale (saleAmount), amount of sales tax (tax), and several methods including get and set methods and a display method.

Now, implement the PurchaseArray program that declares an array of five Purchase objects and prompt a user for their values. As each Purchase object is created, continuously prompt until the user enters an invoice number between 1000 and 8000 inclusive and a non-negative sale amount. Prompt the user for values for each object and then display all the values.

An example of the program is shown below:

Enter invoice number >> 1001
Enter sale amount >> 200
Enter invoice number >> 1002
Enter sale amount >> 352
Enter invoice number >> 1003
Enter sale amount >> 546
Enter invoice number >> 1004
Enter sale amount >> 45798
Enter invoice number >> 1005
Enter sale amount >> 486

Summary of purchases:
Invoice #1001  Amount of sale: $200.0  Tax: $10.0
Invoice #1002  Amount of sale: $352.0  Tax: $17.6
Invoice #1003  Amount of sale: $546.0  Tax: $27.3
Invoice #1004  Amount of sale: $45798.0  Tax: $2289.9
Invoice #1005  Amount of sale: $486.0  Tax: $24.3

*/

import java.util.*;
public class PurchaseArray {
    public static void main(String[] args) {
        Scanner InputService = new Scanner(System.in);

        Purchase[] purchases = new Purchase[5];
        final int LOW = 1000;
        final int HIGH = 8000;

        int input;
        double amount;
        String entry;

        for (int i = 0; i < purchases.length; i++)  {
            purchases[i] = new Purchase();
            System.out.print("Enter invoice number >> ");
            input = InputService.nextInt();

            while (input <= LOW || input >= HIGH)  {
                System.out.println("Invoice number must be between " + LOW + " and " + HIGH);
                System.out.print("Enter invoice number >> ");
                input = InputService.nextInt();
            }

            System.out.print("Enter sale amount >> ");
            amount = InputService.nextDouble();

            while (amount < 0) {
                System.out.print("Enter sale amount greater than or equal to 0 >> ");
                amount = InputService.nextDouble();
            }

            purchases[i].setInvoiceNumber(input);
            purchases[i].setSaleAmount(amount);
        }

        System.out.println("\nSummary of purchases:");
        for (int i = 0; i < purchases.length; i++)
            purchases[i].display();
    }
}