package pkg;

public class Square extends Shape{
	private int length;
	public Square(int length)
	{
		this.length = length;
	}

	String getName()
	{
		return "Square";
	}
	double area()
	{
		return length*length;
	}

}
