// ScoreException.Java - Iakov Taranenko - 4/27/2021

/* 

Programming Exercise 12-8

Write an application that displays a series of at least five student ID numbers (that you have stored in an array) and asks the user to enter a numeric test score for the student. Create a ScoreException class that extends the Exception class. The ScoreException class constructor should accept a single argument of type String which is the message passed to the Exception superclass. Throw a ScoreException for the class if the user does not enter a valid score (less than or equal to 100). Catch the ScoreException, display the message Score over 100, and then store a 0 for the student’s score. At the end of the application, display all the student IDs and scores.

An example of the program is shown below:

Enter score for student id number: 1234
101
Score over 100
Enter score for student id number: 2345
210
Score over 100
Enter score for student id number: 3456
93
Enter score for student id number: 4567
84
Enter score for student id number: 5678
72
ID #1234  Score 0
ID #2345  Score 0
ID #3456  Score 93
ID #4567  Score 84
ID #5678  Score 72

*/

public class ScoreException extends Exception {
    public ScoreException(String s) {
    }
}