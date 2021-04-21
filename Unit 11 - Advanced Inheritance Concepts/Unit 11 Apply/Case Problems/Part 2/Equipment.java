// Equipment.Java - Iakov Taranenko - 4/20/2021

/* 

Unit 11 Case Problems

a. In previous chapters, you have created several classes for Sammy's Seashore Supplies. Now, Sammy has decided to restructure his rates to include different fees for equipment types in addition to the fees based on rental length, and to charge for required lessons for using certain equipment. Create an abstract class named Equipment that holds fields for a numeric equipment type, a String equipment name, and a fee for renting the equipment. Include a final array that holds the equipment names—personal watercraftski, pontoon boat, rowboat, canoe, kayak, beach chair, umbrella, and other. Also include a final array that includes the surcharges for each equipment type— $50, $40, $15, $12, $10, $2, $1, and $0, respectively. Include a constructor that requires an equipment type and sets the field to the type unless it is out of range, in which case the type is set to the other code. Include get and set methods for each field and include an abstract method that returns a String explaining the lesson policy for the type of equipment. Save the file as Equipment.java.

b. Create two classes that extend Equipment—EquipmentWithoutLesson and EquipmentWithLesson. The constructor for each class requires that the equipment type be in range—that is, personal watercraft, pontoon boats, rowboats, canoes, and kayaks are EquipmentWithLesson objects, but other equipment types are not. In both subclasses, the constructors set the equipment type to other if it is not in range. The constructors also set the equipment fee, as described in part 2a. Each subclass also includes a method that returns a message indicating whether a lesson is required, and the cost ($27) if it is. Save the files as EquipmentWithoutLesson.java and EquipmentWithLesson.java.

c. In Chapter 8, you created a Rental class. Now, modify it to contain an Equipment data field and an additional price field that holds a base price before equipment fees are added. Remove the array of equipment Strings from the Renta1 class as well as the method that returns an equipment string. Modify the Renta1 constructor so that it requires three parameters: contract number, minutes for the rental, and an equipment type. The method that sets the hours and minutes now sets a base price before equipment fees are included. Within the constructor, set the contract number and time as before, but add statements to create either an EquipmentWithLesson object or an EquipmentWithoutLesson object, and assign it to the Equipment data field. Assign the sum of the base price (based on time) and the equipment fee (based on the type of equipment) to the price field. Save the file as Rental.java.

d. In Chapter 8, you created a Renta1Demo class that displays details for four Rental objects. Modify the class as necessary to use the revised Rental class that contains an Equipment field. Be sure to modify the method that displays details for the Renta1 to include all the pertinent data for the equipment. Save the file as RentalDemo.java.

Create a zip file of the .java file(s) and submit the assignment.

*/