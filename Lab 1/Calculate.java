// CIS 261 - W1
// Lab #1 - Calculate.java
// Joshua Hipple
// Prompt user for 2 numbers as input, output sum, difference, product, and quotient to screen

// Import Scanner class for user input
import java.util.Scanner;

public class Calculate
{
	public static void main(String[] args)
	{
		// Create new Scanner object for input
		Scanner input = new Scanner(System.in);
		
		// Initialize input variables
		int number1;
		int number2;
		
		// Prompt user for 2 numbers and assign to variables
		System.out.print("Enter first integer:  ");
		number1 = input.nextInt();
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		// Output the calculated values
		System.out.println(""); // Enters blank line
		System.out.printf("Sum is %d%n", (number1 + number2));
		System.out.printf("Product is %d%n", (number1 * number2));
		System.out.printf("Difference is %d%n", (number1 - number2));
		System.out.printf("Quotient is %d%n", (number1 / number2));
	}
}