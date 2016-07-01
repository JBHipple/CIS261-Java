import java.util.Scanner;

public class RectangleTest
{
	public static void main(String[] args)
	{
		int lengthIn;
		int widthIn;
		Scanner input = new Scanner(System.in);
		
		Rectangle theRectangle = new Rectangle();
		
		System.out.print("Enter length (0 to quit): ");
		lengthIn = input.nextInt();
		System.out.print("Enter width (0 to quit): ");
		widthIn = input.nextInt();
		
		while (lengthIn != 0 && widthIn != 0)
		{
			theRectangle.setLength(lengthIn);
			theRectangle.setWidth(widthIn);
			
			System.out.print(theRectangle);
			
			System.out.printf("%nEnter length (0 to quit): ");
			lengthIn = input.nextInt();
			System.out.print("Enter width (0 to quit): ");
			widthIn = input.nextInt();
		}
	}
}