// OnlineNewspaperSubscription.Java - Iakov Taranenko - 4/20/2021

/* 

Programming Exercise 11-3

Create an abstract NewspaperSubscription class with fields for the subscriber name, address, and rate. Include get and set methods for the name field and get methods for the address and subscription rate; the setAddress() method is abstract.

Create two subclasses named PhysicalNewspaperSubscription and OnlineNewspaperSubscription. The parameter for the setAddress() method of the PhysicalNewspaperSubscription class must contain at least one digit; otherwise, an error message is displayed and the subscription rate is set to 0. If the address is valid, the subscription rate is assigned $15. The parameter for the setAddress() method of the OnlineNewspaperSubscription class must contain an at sign (@) or an error message is displayed. If the address is valid, the subscription rate is assigned $9.

*/

public class OnlineNewspaperSubscription extends NewspaperSubscription {
    public void setAddress(String a) {
        // write your code here
    }

}