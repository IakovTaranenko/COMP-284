// DataEntryException.Java - Iakov Taranenko - 4/27/2021

/* 

Programming Exercise 12-10

Create a DataEntryException class whose getMessage() method returns information about invalid integer data. Write a program named GetIDAndAge that continually prompts the user for an ID number and an age until a terminal 0 is entered for both. If the ID and age are both valid, display the message ID and Age OK.

Throw a DataEntryException if the ID is not in the range of valid ID numbers (0 through 999), or if the age is not in the range of valid ages (0 through 119). Catch any DataEntryException or InputMismatchException that is thrown, and display the message Invalid age or ID - DataEntryException - \, where \ is the value of the invalid input. For example:

Enter ID 1000
Enter age 40
Invalid age or ID - DataEntryException - 1000

*/

public class DataEntryException extends Exception {
    public DataEntryException(int num) {
        super("DataEntryException - " + num);
    }
}