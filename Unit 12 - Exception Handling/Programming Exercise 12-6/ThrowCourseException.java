// ThrowCourseException.Java - Iakov Taranenko - 4/27/2021

/* 

Programming Exercise 12-6

Create a CourseException class that extends Exception and whose constructor receives a String that holds a college course’s department (for example, CIS), a course number (for example, 101), and a number of credits (for example, 3).

Create a Course class with the same fields and whose constructor requires values for each field. Upon construction, throw a CourseException if the department does not consist of 3 letters, if the course number does not consist of three digits between 100 and 499 inclusive, or if the credits are less than 0.5 or more than 6.

The ThrowCourseException application has been provided to test your implementation. The ThrowCourseException application establishes an array of at least six Course objects with valid and invalid values and displays an appropriate message when a Course object is created successfully and when one is not.

*/

public class ThrowCourseException {
    public static void main(String[] args) {
        Course[] courses = new Course[6];
        String[] depts = {"CIS", "ACC", "ENGLISH", "BB", "CIS", "ACC"};
        int[] courseNums = {110, 200, 100, 700, 599, 305};
        double[] credits = {3, 4, 7.5, 0, 100, 2.5};
        int x;

        for (x = 0; x < courses.length; ++x)
            courses[x] = new Course();
        for (x = 0; x < courses.length; ++x) {
            try {
                courses[x] = new Course(depts[x], courseNums[x], credits[x]);
            } catch(CourseException error) {
                System.out.println("Course " + x + "  Error: " + error.getMessage());
            }
        }
        System.out.println("\nCourse values");

        for(x = 0; x < courses.length; ++x)
            System.out.println(courses[x].toString());
    }
}