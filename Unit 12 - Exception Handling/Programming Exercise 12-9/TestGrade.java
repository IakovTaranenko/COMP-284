// TestGrade.Java - Iakov Taranenko - 4/27/2021

/* 

Programming Exercise 12-9

Write an application that displays a series of at least eight student ID numbers (that you have stored in an array) and asks the user to enter a test letter grade for the student.

Create an Exception class named GradeException that contains a static public array of valid grade letters (A, B, C, D, F, and I) that you can use to determine whether a grade entered from the application is valid. The GradeException class constructor should accept a single argument of type String which is the message passed to the Exception superclass. In your application, throw a GradeException if the user does not enter a valid letter grade. Catch the GradeException, and then display the message Invalid grade which should be passed to the GradeException class as a parameter. In addition, store an I (for Incomplete) for any student for whom an exception is caught. At the end of the application, display all the student IDs and grades.

An example of the program is shown below:

Enter letter grade for student id number: 1234
101
Invalid grade
Enter letter grade for student id number: 1245
98
Invalid grade
Enter letter grade for student id number: 1267
A
Enter letter grade for student id number: 1278
A
Enter letter grade for student id number: 2345
D
Enter letter grade for student id number: 1256
I
Enter letter grade for student id number: 3456
I
Enter letter grade for student id number: 3478
B
Enter letter grade for student id number: 4567
B
Enter letter grade for student id number: 5678
C
ID #1234  Grade I
ID #1245  Grade I
ID #1267  Grade A
ID #1278  Grade A
ID #2345  Grade D
ID #1256  Grade I
ID #3456  Grade I
ID #3478  Grade B
ID #4567  Grade B
ID #5678  Grade C

*/

import java.util.*;
public class TestGrade {
    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        int[] ids = {1234, 1245, 1267, 1278, 2345,
                     1256, 3456, 3478, 4567, 5678};
        char[] grades = new char[10];
        String gradeString = new String();
        final int HIGHLIMIT = 100;
        String inString, outString = "";
        int flag = 0;

        for (int x = 0; x < ids.length; ++x) {
            System.out.println("Enter letter grade for student id number: " + ids[x]);
            inString = input.next();
            grades[x] = inString.charAt(0);
            
            try {
                flag = 0;

                for (int xx = 0; xx < GradeException.VALID_GRADES.length; ++xx)
                    if (grades[x] == GradeException.VALID_GRADES[xx]) 
                        flag = 1;

                if (flag == 0) {
                    gradeString = "Invalid grade";
                    throw(new GradeException(gradeString));
                }
            } catch (GradeException error) {
                System.out.println(error.getMessage);
                grades[x] = 'I';
            }
        }

        for (int x = 0; x < ids.length; ++x)
            outString = outString + "ID #" + ids[x] + "  Grade " + grades[x] + "\n";
        System.out.println(outString);
    }
}