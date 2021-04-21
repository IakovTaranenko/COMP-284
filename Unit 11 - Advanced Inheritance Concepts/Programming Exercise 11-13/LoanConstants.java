// LoanConstants.Java - Iakov Taranenko - 4/20/2021

/* 

Programming Exercise 11-13

Sanchez Construction Loan Co. makes loans of up to $100,000 for construction projects. There are two categories of Loans—those to businesses and those to individual applicants.

Write an application that tracks all new construction loans. The application also must calculate the total amount owed at the due date (original loan amount + loan fee). The application should include the following classes:

• Loan —A public abstract class that implements the LoanConstants interface. A Loan includes a loan number, customer last name, amount of loan, interest rate, and term. The constructor requires data for each of the fields except interest rate. Do not allow loan amounts greater than $100,000. Force any loan term that is not one of the three defined in the LoanConstants class to a short-term, 1-year loan. Create a toString() method that displays all the loan data.

• LoanConstants—A public interface class. LoanConstants includes constant values for short-term (1 year), medium-term (3 years), and long-term (5 years) loans. It also contains constants for the company name and the maximum loan amount.

• BusinessLoan—A public class that extends Loan. The BusinessLoan constructor sets the interest rate to 1% more than the current prime interest rate.

• PersonalLoan—A public class that extends Loan. The PersonalLoan constructor sets the interest rate to 2% more than the current prime interest rate.

• CreateLoans— An application that creates an array of five Loans. Prompt the user for the current prime interest rate. Then, in a loop, prompt the user for a loan type and all relevant information for that loan. Store the created Loan objects in the array. When data entry is complete, display all the loans. For example, the program should accept input similar to the sample program execution below:

Welcome to Sanchez Construction
Enter the current prime interest rate as a decimal number, for example, .05
0.08
Is this a (1) Business loan or (2) Personal loan
1
Enter account number
1
Enter name
Joe
Enter loan amount
10000
Enter term
5
Is this a (1) Business loan or (2) Personal loan
2
Enter account number
2
Enter name
Sara
Enter loan amount
5000
Enter term
3
... And so on for 5 total loans
After all loan information is input, the program should output the loans in the following format:

Sanchez Construction
Loan #1   Name: Joe  $10000.0
 for 5 year(s) at 9% interest
Loan #2   Name: Sara  $5000.0
 for 3 year(s) at 10% interest
Loan #3   Name: Mike  $975.0
 for 1 year(s) at 10% interest
Loan #4   Name: Jane  $7000.0
 for 5 year(s) at 9% interest
Loan #5   Name: Peter  $300.0
 for 1 year(s) at 9% interest

*/

public interface LoanConstants {
    public static final int MAXLOAN = 100000;
    public static final int SHORT_TERM = 1;
    public static final int MEDIUM_TERM = 3;
    public static final int LONG_TERM = 5;
    public static final String COMPANY = "Sanchez Construction";
}