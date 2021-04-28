// DebugTwelve2.Java - Iakov Taranenko - 4/27/2021

/* 

Debugging Exercise 12-2

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

// A byte can't hold a value higher than 127
// This program throws an ArithmeticException
// if adding two bytes yields a value that is too high
public class DebugTwelve2 {
    public static void main(String[] args) {
        byte num1 = 120, num2 = 120, result;
        final byte HIGHBYTE = 127;

        try {
            byte allowed = (byte)(HIGHBYTE - num1);
            if (num2 > allowed)
                throw(new ArithmeticException());

            result = (byte)(num1 + num2);
            System.out.println("Result is " + result);
        } catch(ArithmeticException error) {
            System.out.println("Byte can't hold value higher than " + HIGHBYTE);
        }
    }
}