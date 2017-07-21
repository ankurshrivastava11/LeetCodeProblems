package pkg;

public class Circle extends Shape {
	
	private int radius;
	
	String getName()
	{
		return "Circle";
	}

	Circle(int radius)
	{
		this.radius = radius;
	}
	
	double area()
	{
		return radius*radius*22/7;
	}
	
	
}
