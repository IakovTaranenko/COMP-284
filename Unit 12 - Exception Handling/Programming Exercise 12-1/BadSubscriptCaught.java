// BadSubscriptCaught.Java - Iakov Taranenko - 4/27/2021

/* 

Programming Exercise 12-1

Write an application in which you declare an array of eight first names. Write a try block in which you prompt the user for an integer and display the name in the requested position. Create a catch block that catches the potential ArrayIndexOutOfBoundsException thrown when the user enters a number that is out of range. The catch block also should display the error message Subscript out of range.

Examples of the program are shown below:

Enter a number, and I will display a name 
2
Name is Clifford
Enter a number, and I will display a name 
20
Subscript out of range.

*/

import java.util.*;
public class BadSubscriptCaught {
    public static void main(String[] args) {
        String[] names = {"Ariel", "Brad", "Clifford", "Denise", "Emily", "Fred", "Gina", "Henry"};
        Scanner keyboard = new Scanner(System.in);
        int number;

        // your code here
    }
}