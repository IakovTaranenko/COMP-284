// Course.Java - Iakov Taranenko - 4/27/2021

/* 

Programming Exercise 12-6

Create a CourseException class that extends Exception and whose constructor receives a String that holds a college course’s department (for example, CIS), a course number (for example, 101), and a number of credits (for example, 3).

Create a Course class with the same fields and whose constructor requires values for each field. Upon construction, throw a CourseException if the department does not consist of 3 letters, if the course number does not consist of three digits between 100 and 499 inclusive, or if the credits are less than 0.5 or more than 6.

The ThrowCourseException application has been provided to test your implementation. The ThrowCourseException application establishes an array of at least six Course objects with valid and invalid values and displays an appropriate message when a Course object is created successfully and when one is not.

*/

public class Course {
    String department;
    int courseNumber;
    double credits;
    final int DEPT_LENGTH = 3;
    final int LOW_NUM = 100;
    final int HIGH_NUM = 499;
    final double LOW_CREDITS = 0.5;
    final double HIGH_CREDITS = 6;

    public Course() {
        // Write your code here
    }

    public Course(String dept, int num, double creditValue) throws CourseException {
        // Write your code here
    }

    public String toString() {
        // Write your code here
    }
}