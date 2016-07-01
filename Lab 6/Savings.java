// CIS 261 - W1
// Lab #6 - Savings.java
// Joshua Hipple
// Subclass that extends Account

public class Savings extends Account
{
	private final double interestRate = .03;
	
	public Savings(int AccountNum, double balance)
	{
		super(AccountNum, balance);
	}
	
	@Override
	public void calculateDailyInterest()
	{
		double interest = (super.getBalance() * interestRate) / 365;
		System.out.printf("Account %d gets interest %.2f%n", super.getAccountNum(), interest);
		super.deposit(interest);
	}
}