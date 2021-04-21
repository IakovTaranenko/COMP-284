// Waitstaff.Java - Iakov Taranenko - 4/20/2021

/* 

Unit 11 Case Problems

a. In previous chapters, you have created several classes for Carly's Catering. Now, create a new abstract class named Employee. The class contains data fields for an employee's ID number, last name, first name, pay rate, and job title. The class contains get and set methods for each field; the set methods for pay rate and job title are abstract. Save the file as Employee.java.

b. Create three classes that extend Emp1oyee named Waitstaff, Bartender, and Coordinator. The method that sets the pay rate in each class accepts a parameter and assigns it to the pay rate, but no Waitstaff employee can have a rate higher than 10.00, no Bartender can have a rate higher than 14.00, and no Coordinator can have a rate higher than 20.00. The method that sets the job title accepts no parameters—it simply assigns the string waitstaff, bartender, or coordinator to the object appropriately. Save the files as Waitstaff.java, Bartender.java, and Coordinator.java.

c. In Chapter 10, you created a DinnerEvent class that holds event information, including menu choices. Modify the class to include an array of 15 Employee objects representing employees who might be assigned to work at a DinnerEvent. Include a method that accepts an Employee array parameter and assigns it to the Employee array field, and include a method that returns the Employee array. The filename is DinnerEvent.java.

d. Write an application that declares a DinnerEvent object, prompts the user for an event number, number of guests, menu options, and contact phone number, and then assigns them to the object. Also prompt the user to enter data for as many Employees as needed based on the number of guests. A DinnerEvent needs one Waitstaff Employee for every event, two if an event has 10 guests or more, three if an event has 20 guests or more, and so on. A DinnerEvent also needs one Bartender for every 25 guests and one Coordinator no matter how many guests attend. All of these Employees should be stored in the Employee array in the DinnerEvent object. (For many events, you will have empty Employee array positions.) After all the data values are entered, pass the DinnerEvent object to a method that displays all of the details for the event, including all the details about the Emp1oyees assigned to work. Save the program as StaffDinnerEvent.java.

Create a zip file of the .java file(s) and submit the assignment.

*/