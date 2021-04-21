// UseDivision.Java - Iakov Taranenko - 4/20/2021

/* 

Programming Exercise 11-4

Create an abstract Division class with fields for a company’s division name (divisionTitle) and account number (acctNum), and an abstract display() method. Use a constructor in the superclass that requires values for both fields.

Create two subclasses named InternationalDivision and DomesticDivision. The InternationalDivision includes a field for the country (country) in which the division is located and a field for the language spoken (language); its constructor requires both. The DomesticDivision includes a field for the state (state) in which the division is located; a value for this field is required by the constructor.

The UseDivision.java file has been provided to test your implementation of the Division, InternationalDivision, and DomesticDivision classes.

An example of the program is shown below:

Domestic Division: Sales  Acct #123
Located in California
Domestic Division: Technology  Acct #234
Located in Kansas
International Division: Technology  Acct #345
Located in Germany Language is German
International Division: Marketing  Acct #456
Located in Japan Language is Japanese

*/

public abstract class UseDivision {
    public static void main(String[] args) {
        DomesticDivision abcDomDiv = new DomesticDivision("Sales", 123, "California");
        DomesticDivision xyzDomDiv = new DomesticDivision("Technology", 234, "Kansas");
        InternationalDivision abcIntDiv = new InternationalDivision("Technology", 345, "Germany", "German");
        InternationalDivision xyzIntDiv = new  InternationalDivision("Marketing", 456, "Japan", "Japanese");

        abcDomDiv.display();
        xyzDomDiv.display();
        abcIntDiv.display();
        xyzIntDiv.display();
    }
}