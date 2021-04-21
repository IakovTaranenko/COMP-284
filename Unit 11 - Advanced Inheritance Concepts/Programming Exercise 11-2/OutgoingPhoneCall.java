// OutgoingPhoneCall.Java - Iakov Taranenko - 4/20/2021

/* 

Programming Exercise 11-2

The Talk-A-Lot Cell Phone Company provides phone services for its customers. Create an abstract class named PhoneCall that includes a String field for a phone number and a double field for the price of the call. Also include a constructor that requires a phone number parameter and that sets the price to 0.0. Include a set method for the price. Also include three abstract get methods—one that returns the phone number, another that returns the price of the call, and a third that displays information about the call.

Create two child classes of PhoneCall: IncomingPhoneCall and OutgoingPhoneCall.

The IncomingPhoneCall constructor passes its phone number parameter to its parent’s constructor and sets the price of the call to 0.02. The method that displays the phone call information displays the phone number, the rate, and the price of the call (which is the same as the rate).

The OutgoingPhoneCall class includes an additional field that holds the time of the call in minutes. The constructor requires both a phone number and the time. The price is 0.04 per minute, and the display method shows the details of the call, including the phone number, the rate per minute, the number of minutes, and the total price.

*/

public class OutgoingPhoneCall extends PhoneCall {
    public final static double RATE = .04;
    private int minutes;

    public OutgoingPhoneCall(String num, int mins) {
        // write your code here
    }

    public void getInfo() {
        // write your code here
    }

    public String getPhoneNumber() {
        // write your code here
    }

    public double getPrice() {
        // write your code here
    }
}