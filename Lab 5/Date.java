// CIS 261 - W1
// Lab #5 - Date.java
// Joshua Hipple
// Date object
import java.util.Scanner;

public class Date
{
	// instance variables
	private int month;
	private int day;
	private int year;
	
	private static final int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Date(String monthStr, int day, int year)
	{
		int monthInt;
		switch (monthStr)
		{
			case "January":
			case "january":
				monthInt = 1;
				break;
			case "February":
			case "february":
				monthInt = 2;
				break;
			case "March":
			case "march":
				monthInt = 3;
				break;
			case "April":
			case "april":
				monthInt = 4;
				break;
			case "May":
			case "may":
				monthInt = 5;
				break;
			case "June":
			case "june":
				monthInt = 6;
				break;
			case "July":
			case "july":
				monthInt = 7;
				break;
			case "August":
			case "august":
				monthInt = 8;
				break;
			case "September":
			case "september":
				monthInt = 9;
				break;
			case "October":
			case "october":
				monthInt = 10;
				break;
			case "November":
			case "november":
				monthInt = 11;
			case "December":
			case "december":
				monthInt = 12;
				break;
			default:
				throw new IllegalArgumentException("Invalid month name: " + monthStr);
		}
		this.month = monthInt;
		this.day = day;
		this.year = year;
	}
	
	public Date(int month, int day, int year)
	{
		if (month <= 0 || month > 12)
		{
			throw new IllegalArgumentException("Month must be between 1 and 12");
		}
		
		if (day <= 0 || (day > monthDays[month] && !(month == 2 && day == 29)))
		{
			throw new IllegalArgumentException("Month " + month + "does not contain " + day + " days.");
		}
		
		if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
		{
			throw new IllegalArgumentException("Month " + month + "does not contain " + day + " days.");
		}
		
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public String toString()
	{
		return String.format("%d/%d/%d", month, day, year);
	}
	
	public String toFullDate()
	{
		String monthStr = "";
		switch (this.month)
		{
			case 1:
				monthStr = "January";
				break;
			case 2:
				monthStr = "February";
				break;
			case 3:
				monthStr = "March";
				break;
			case 4:
				monthStr = "April";
				break;
			case 5:
				monthStr = "May";
				break;
			case 6:
				monthStr = "June";
				break;
			case 7:
				monthStr = "July";
				break;
			case 8:
				monthStr = "August";
				break;
			case 9:
				monthStr = "September";
				break;
			case 10:
				monthStr = "October";
				break;
			case 11:
				monthStr = "November";
				break;
			case 12:
				monthStr = "December";
				break;
		}
		
		return String.format("%s %d, %d", monthStr, day, year);
	}
}