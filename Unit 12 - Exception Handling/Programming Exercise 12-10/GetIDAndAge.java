// GradeException.Java - Iakov Taranenko - 4/27/2021

/* 

Programming Exercise 12-10

Create a DataEntryException class whose getMessage() method returns information about invalid integer data. Write a program named GetIDAndAge that continually prompts the user for an ID number and an age until a terminal 0 is entered for both. If the ID and age are both valid, display the message ID and Age OK.

Throw a DataEntryException if the ID is not in the range of valid ID numbers (0 through 999), or if the age is not in the range of valid ages (0 through 119). Catch any DataEntryException or InputMismatchException that is thrown, and display the message Invalid age or ID - DataEntryException - \, where \ is the value of the invalid input. For example:

Enter ID 1000
Enter age 40
Invalid age or ID - DataEntryException - 1000

*/

import java.util.*;
public class GetIDAndAge {
    public static void main(String[] args) {
        int id;
        int age;
        final int QUIT = 0;
        int returnVal = QUIT + 1;
        Scanner keyboard = new Scanner(System.in);
        while (returnVal != QUIT) {
            try {
                System.out.print("Enter ID >> ");
                id = keyboard.nextInt();
                System.out.print("Enter age >> ");
                age = keyboard.nextInt();
                returnVal = check(id, age);
            } catch(DataEntryException exception) {
                showStatus("Invalid age or ID - " + exception.getMessage());
            } catch(InputMismatchException exception) {
                showStatus("Invalid data type");
                keyboard.nextLine();
            }
        }
    }

    public static int check(int idNum, int ageNum) throws DataEntryException {
        final int MAX_ID = 999;
        final int MAX_AGE = 119;
        final int QUIT = 0;
        int returnV = 1;

        if (idNum == QUIT && ageNum == QUIT)
            returnV = QUIT;
        else
            showStatus("ID and Age OK");

        if (idNum < QUIT || idNum > MAX_ID)
            throw(new DataEntryException(idNum));

        if (ageNum < QUIT || ageNum > MAX_AGE)
            throw(new DataEntryException(ageNum));

        return returnV;
    }

    public static void showStatus(String msg) {
        System.out.println(msg);
    }
}