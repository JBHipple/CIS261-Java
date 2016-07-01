// CIS 261 - W1
// Lab #6 - AccountTest.java
// Joshua Hipple
// Test program for Account object
import java.util.Scanner;
import java.util.ArrayList;

public class AccountTest
{
	public static void main(String[] args)
	{
		int menuOption;
		int accountNum;
		double balance;
		Scanner input = new Scanner(System.in);
		ArrayList<Account> theAccounts = new ArrayList<Account>();
		
		System.out.println("Enter one of the following:");
		System.out.println("1) Create a new Checking Account");
		System.out.println("2) Create a new Savings Account");
		System.out.println("3) Make a deposit");
		System.out.println("4) Make a withdrawl");
		System.out.println("5) Display all accounts");
		System.out.println("6) Calculate Daily Interest");
		System.out.println("7) Exit");
		
		menuOption = input.nextInt();
		
		while (menuOption != 7)
		{
			switch(menuOption)
			{
				case 1:
					System.out.print("A new Checking account with number: ");
					accountNum = input.nextInt();
					System.out.print("Enter the initial balance: ");
					balance = input.nextDouble();
					Checking newChecking = new Checking(accountNum, balance);
					theAccounts.add(newChecking);
					break;
				case 2:
					System.out.print("A new Savings account with number: ");
					accountNum = input.nextInt();
					System.out.print("Enter the initial balance: ");
					balance = input.nextDouble();
					Savings newSavings = new Savings(accountNum, balance);
					theAccounts.add(newSavings);
					break;
				case 3:
					System.out.print("Which account to deposit? ");
					accountNum = input.nextInt();
					System.out.print("Enter the amount of deposit: ");
					double depositAmt = input.nextDouble();
					theAccounts.get(accountNum - 1).deposit(depositAmt);
					break;
				case 4:
					System.out.print("Which account to withdraw? ");
					accountNum = input.nextInt();
					System.out.print("Enter the amount of withdraw: ");
					double withdrawAmt = input.nextDouble();
					theAccounts.get(accountNum - 1).withdraw(withdrawAmt);
					break;
				case 5:
					System.out.println("******************************");
					for (Account theAccount: theAccounts)
					{
						System.out.printf("Account %d has balance %.2f%n", theAccount.getAccountNum(), theAccount.getBalance());
					}
					System.out.println("******************************");
					break;
				case 6:
					for (Account theAccount: theAccounts)
					{
						theAccount.calculateDailyInterest();
					}
					break;
				default:
					System.out.println("Invalid selection.  Try again.");
			}
			
			System.out.print("Make selection:");
			menuOption = input.nextInt();
		}
	}
}