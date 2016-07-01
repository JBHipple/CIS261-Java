// CIS 261 - W1
// Lab #3 - SalesTest.java
// Joshua Hipple
// Test program for Sales object
import java.util.Scanner;

public class SalesTest
{
	public static void main(String[] args)
	{
		// create sales object
		Sales theSales = new Sales();
		
		// create input object
		Scanner input = new Scanner(System.in);
		
		// create and initialize variables to hold product and quantity numbers
		int product = 0;
		int quantity = 0;
		
		// Prompt user for priming input
		System.out.print("Enter product number (1-5) (0 to stop): ");
		product = input.nextInt();
		
		//  Loop while user has not entered sentinel value
		while (product != 0)
		{
			// prompt user for quantity sold
			System.out.print("Enter quantity sold: ");
			quantity = input.nextInt();
			
			// initialize local loop variable to hold sales total
			double sales = 0;
			
			// determine the correct product, calculate sales, and add to object's correct sales total
			switch (product)
			{
				case 1:
					sales = quantity * 2.98;
					theSales.addProd1(sales);
					break;
				case 2:
					sales = quantity * 4.5;
					theSales.addProd2(sales);
					break;
				case 3:
					sales = quantity * 9.98;
					theSales.addProd3(sales);
					break;
				case 4:
					sales = quantity * 4.49;
					theSales.addProd4(sales);
					break;
				case 5:
					sales = quantity * 6.87;
					theSales.addProd5(sales);
					break;
			}
			
			// prompt user for next input
			System.out.print("Enter product number (1-5) (0 to stop): ");
			product = input.nextInt();
		}
		
		// display sales totals
		theSales.displayTotals();
	}
}