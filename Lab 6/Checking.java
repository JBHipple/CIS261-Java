// CIS 261 - W1
// Lab #6 - Checking.java
// Joshua Hipple
// Subclass that extends Account

public class Checking extends Account
{
	private final double interestRate = 0.02;
	
	public Checking(int AccountNum, double balance)
	{
		super(AccountNum, balance);
	}
	
	@Override
	public void calculateDailyInterest()
	{
		if (super.getBalance() > 500)
		{
			double interest = ((super.getBalance() - 500) * interestRate) / 365;
			System.out.printf("Account %d gets interest %.2f%n", super.getAccountNum(), interest);
			super.deposit(interest);
		}
	}
}