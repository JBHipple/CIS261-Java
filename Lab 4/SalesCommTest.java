// CIS 261 - W1
// Lab #4 - SalesCommTest.java
// Joshua Hipple
// Test program for SalesComm object
import java.util.Scanner;

public class SalesCommTest
{
	public static void main(String[] args)
	{
		int salesIn = 0; // holds sales input
		SalesComm theSalesComm = new SalesComm(); // SalesComm object
		Scanner input = new Scanner(System.in); // input object
		
		//  Prompt user for priming input
		System.out.print("Enter sales amount (negative to end): ");
		salesIn = input.nextInt();
		
		//  Loop while user has not entered sentinel value
		while (salesIn >= 0)
		{
			// calculate salary and add to theSalesComm
			int salary = theSalesComm.getSalary(salesIn);
			theSalesComm.incrementSalary(salary);
			
			// prompt user for next input
			System.out.print("Enter sales amount (negative to end): ");
			salesIn = input.nextInt();
		}
		
		// output results
		theSalesComm.displaySalaries();
	}
}