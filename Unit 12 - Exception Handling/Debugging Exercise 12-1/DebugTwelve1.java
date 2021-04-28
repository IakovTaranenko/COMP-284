// DebugTwelve1.Java - Iakov Taranenko - 4/27/2021

/* 

Debugging Exercise 12-1

The files provided in the code editor to the right contain syntax and/or logic errors. In each case, determine and fix the problem, remove all syntax and coding errors, and run the program to ensure it works properly.

*/

public class DebugTwelve1 {
    public static void main(String[] args) throws ArithmeticException {
        double num = -8.8, result;
        
        try {
            if (num <= 0)
                throw(new ArithmeticException());

            result = Math.log(num);
            System.out.println("Result is " + result);
        } catch(ArithmeticException error) {
            System.out.println("Can't take logarithm for value of zero or lower");
        }
    }
}