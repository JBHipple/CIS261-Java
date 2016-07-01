// CIS 261 - W1
// Lab #3 - Sales.java
// Joshua Hipple
// Object containing sales information

public class Sales
{
	// instance variables
	private double prod1Total;
	private double prod2Total;
	private double prod3Total;
	private double prod4Total;
	private double prod5Total;
	
	// constructor initializes new Sales object with 0 totals
	public Sales()
	{
		this.prod1Total = 0.0;
		this.prod2Total = 0.0;
		this.prod3Total = 0.0;
		this.prod4Total = 0.0;
		this.prod5Total = 0.0;
	}
	
	// methods to add to sales totals for each product
	public void addProd1(double sales)
	{
		this.prod1Total += sales;
	}
	
	public void addProd2(double sales)
	{
		this.prod2Total += sales;
	}
	
	public void addProd3(double sales)
	{
		this.prod3Total += sales;
	}
	
	public void addProd4(double sales)
	{
		this.prod4Total += sales;
	}
	
	public void addProd5(double sales)
	{
		this.prod5Total += sales;
	}
	
	// methods to return value for each product
	public double getProd1()
	{
		return this.prod1Total;
	}
	
	public double getProd2()
	{
		return this.prod2Total;
	}
	
	public double getProd3()
	{
		return this.prod3Total;
	}
	
	public double getProd4()
	{
		return this.prod4Total;
	}
	
	public double getProd5()
	{
		return this.prod5Total;
	}
	
	// method to display the total sales for each product
	public void displayTotals()
	{
		System.out.printf("%nProduct 1: $%.2f", getProd1());
		System.out.printf("%nProduct 2: $%.2f", getProd2());
		System.out.printf("%nProduct 3: $%.2f", getProd3());
		System.out.printf("%nProduct 4: $%.2f", getProd4());
		System.out.printf("%nProduct 5: $%.2f", getProd5());
	}
}