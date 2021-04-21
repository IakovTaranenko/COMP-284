// Student.Java - Iakov Taranenko - 4/20/2021

/* 

Programming Exercise 11-7

https://i.imgur.com/PW1Qf3N.png

*/

public abstract class Student {
    private String id;
    private String lastName;
    protected double tuition;

    public Student(String id, String name) {
        // write your code here
    }

    public void setId(String idNum) {
        // write your code here
    }

    public void setLastName(String name) {
        // write your code here
    }

    public String getId() {
        // write your code here
    }

    public String getLastName() {
        // write your code here
    }

    public double getTuition() {
        // write your code here
    }

    public abstract void setTuition();
}