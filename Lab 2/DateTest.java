// CIS 261 - W1
// Lab #2 - DateTest.java
// Joshua Hipple
// Test program implementing Date object
public class DateTest
{
	public static void main(String[] args)
	{
		// create new Date object
		Date theDate = new Date(7, 4, 2004);
		
		// display the date
		System.out.print("The initial date is: ");
		theDate.displayDate();
		
		// change the date
		theDate.setMonth(11);
		theDate.setDay(1);
		theDate.setYear(2003);
		
		// display the new date
		System.out.print("\nDate with new values is: ");
		theDate.displayDate();
	}
}