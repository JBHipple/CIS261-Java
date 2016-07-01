// CIS 261 - W1
// Lab #5 - DateTest.java
// Joshua Hipple
// Test program for Date object
import java.util.Scanner;

public class DateTest
{
	public static void main(String[] args)
	{
		int menuOption = 0;
		int monthInt;
		String monthStr;
		int dayIn;
		int yearIn;
		Scanner input = new Scanner(System.in);
		
		System.out.println("**********");
		System.out.println("Enter 1 for format: MM/DD/YYYY");
		System.out.println("Enter 2 for format: Month DD, YYYY");
		System.out.println("Enter 3 to exit");
		System.out.print("Choice: ");
		menuOption = input.nextInt();
		
		while (menuOption != 3)
		{
			if (menuOption != 1 && menuOption !=2)
			{
				System.out.println("Invalid input, must choose 1, 2, or 3.");
			} else if (menuOption == 1)
			{
				System.out.print("Enter Month (1-12): ");
				monthInt = input.nextInt();
				System.out.print("Enter Day of Month: ");
				dayIn = input.nextInt();
				System.out.print("Enter Year: ");
				yearIn = input.nextInt();
				
				Date theDate = new Date(monthInt, dayIn, yearIn);
				System.out.println("");
				System.out.printf("MM/DD/YYYY: %s%n", theDate);
				System.out.printf("Month DD, YYYY: %s%n", theDate.toFullDate());
			} else if (menuOption == 2)
			{
				System.out.print("Enter Month Name: ");
				input.nextLine();
				monthStr = input.nextLine();
				System.out.print("Enter Day of Month: ");
				dayIn = input.nextInt();
				System.out.print("Enter Year: ");
				yearIn = input.nextInt();
				
				Date theDate = new Date(monthStr, dayIn, yearIn);
				System.out.println("");
				System.out.printf("MM/DD/YYYY: %s%n", theDate);
				System.out.printf("Month DD, YYYY: %s%n", theDate.toFullDate());
			}
			System.out.println("");
			System.out.println("**********");
			System.out.println("Enter 1 for format: MM/DD/YYYY");
			System.out.println("Enter 2 for format: Month DD, YYYY");
			System.out.println("Enter 3 to exit");
			System.out.print("Choice: ");
			menuOption = input.nextInt();
		}
	}
}