// CIS 261 - W1
// Lab #4 - SalesCmm.java
// Joshua Hipple
// Object holding data about salaries and commission

public class SalesComm
{
	// instance variables
	private int[] salaries;
	private final int SALARIES_LENGTH = 11;
	
	public SalesComm()
	{
		this.salaries = new int[SALARIES_LENGTH];
	}
	
	public int getSalary(int sales)
	{
		return (int)(200.0 + (sales * .09));
	}
	
	public void incrementSalary(int salary)
	{
		int index = salary / 100;
		
		if (index < 10)
		{
			this.salaries[index]++;
		} else
		{
			salaries[10]++;
		}
	}
	
	public void displaySalaries()
	{
		System.out.println("Range           Number");
		for(int i = 2; i <= 9; i++)
		{
			System.out.printf("$%d00-$%d99%8d%n", i, i, this.salaries[i]);
		}
		System.out.println("$1000 and over  " + this.salaries[10]);
	}
}