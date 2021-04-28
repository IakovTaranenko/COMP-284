// DebugTwelve4.Java - Iakov Taranenko - 4/27/2021

/* 

Debugging Exercise 12-4

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// An employee ID can't be more than 999
// Keep executing until user enters four valid employee IDs
// This program throws a FixDebugEmployeeIDException
import java.util.*;
public class DebugTwelve4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inStr, outString = "";
        final int MAX = 999;
        int[] emp = new int[4];

        for (int x = 0; x < emp.length; ++x) {
            System.out.println("Enter employee ID number");
            inStr = input.next();
            
            try {
                emp[x] = Integer.parseInt(inStr);

                if (emp[x] > MAX)
                    throw(new DebugEmployeeIDException("Number too high " + emp[x]));
            } catch(NumberFormatException  error) {	
                --x;
                System.out.println(inStr + "\nNonnumeric ID");
            } catch(DebugEmployeeIDException error) {	
                --x;
                System.out.println(error + "\nID too large");
            }
        }

        for (int x = 0; x < emp.length; ++x)
            outString = outString + emp[x] + " ";

        System.out.println("Four valid IDS are: " + outString);    
    }
}