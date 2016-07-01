public class Rectangle
{
	private double length;
	private double width;
	
	public Rectangle()
	{
		this.length = 1.0;
		this.width = 1.0;
	}
	
	public double getLength()
	{
		return this.length;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public void setLength(double length)
	{
		if (length > 0.0 && length < 20.0)
		{
			this.length = length;
		} else
		{
			System.out.println("Invalid length!");
		}
	}
	
	public void setWidth(double width)
	{
		if (width > 0.0 && width < 20.0)
		{
			this.width = width;
		} else
		{
			System.out.println("Invalid width!");
		}
	}
	
	public double getArea()
	{
		return (this.length * this.width);
	}
	
	public double getPerimeter()
	{
		return ((length * 2) + (width * 2));
	}
	
	public String toString()
	{
		return String.format("Rectangle length: %.2f%nRectangle width: %.2f%nRectangle perimeter: %.2f%nRectangle area: %.2f%n", this.length, this.width, this.getPerimeter(), this.getArea());
	}
}