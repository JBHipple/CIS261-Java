// CIS 261 - W1
// Lab #2 - Date.java
// Joshua Hipple
// Object containing date information
public class Date 
{
	// instance variables
	private int month;
	private int day;
	private int year;
	
	// contructor initializes new Date with month day and year
	public Date(int newMonth, int newDay, int newYear)
	{
		this.month = newMonth;
		this.day = newDay;
		this.year = newYear;
	}
	
	//  set and get methods for month variable
	public void setMonth(int newMonth)
	{
		this.month = newMonth;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	// set and get methods for day variable
	public void setDay(int newDay)
	{
		this.day = newDay;
	}
	
	public int getDay()
	{
		return day;
	}
	
	// set and get methods for year variable
	public void setYear(int newYear)
	{
		this.year = newYear;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void displayDate()
	{
		System.out.printf("%d/%d/%d", this.month, this.day, this.year);
	}
}