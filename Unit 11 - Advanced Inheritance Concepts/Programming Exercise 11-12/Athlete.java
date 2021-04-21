// Athlete.Java - Iakov Taranenko - 4/20/2021

/* 

Programming Exercise 11-12

Create an interface called Runner. The interface has an abstract method called run() that displays a message describing the meaning of run to the class. Create classes called Machine, Athlete, and PoliticalCandidate that all implement Runner.

The run() should print the following in each class:

Machine - When a machine is running, it is operating.
Athlete - An athlete might run in a race, or in a game like soccer.
PoliticalCandidate - A political candidate runs for office.

*/

public class Athlete implements Runner {
    public void run() {
        System.out.println("An athlete might run in a race, or in a game like soccer.");
    }
}