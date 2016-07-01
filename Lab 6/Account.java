// CIS 261 - W1
// Lab #6 - Account.java
// Joshua Hipple
// Account object

public abstract class Account
{
	private final int AccountNum;
	private double balance;
	
	public Account(int AccountNum, double balance)
	{
		this.AccountNum = AccountNum;
		this.balance = balance;
	}
	
	public int getAccountNum()
	{
		return AccountNum;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void deposit(double depositAmount)
	{
		if (depositAmount < 0)
		{
			throw new IllegalArgumentException("Deposit must be greater than 0");
		}
		
		balance += depositAmount;
	}
	
	public void withdraw(double withdrawAmount)
	{
		if (withdrawAmount < 0)
		{
			throw new IllegalArgumentException("Withdrawl must be greater than 0");
		}
		
		balance -= withdrawAmount;
	}
	
	public abstract void calculateDailyInterest();
}