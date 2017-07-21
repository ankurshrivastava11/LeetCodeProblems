package pkg;

import java.util.ArrayList;

public class Main {
	
	public static Shape getLarger(Shape s1,Shape s2)
	{
		if(s1.area()>s2.area()) return s1;	
		else return s2;
	}
	
	public enum Type
	{
		Home, Work, Mobile;
	}
	
	public static void main(String[] args)
	{
//		Shape s1 = new Circle(1);
//		Shape s2 = new Square(7);
//		Shape sh = getLarger(s1,s2);
//		System.out.println("The Larger Shape is "+ sh.getName() + " with area = "+ sh.area());
		
		phoneNumber p1 = new phoneNumber();
		Type mob = Type.Mobile;
		Type hom = Type.Home;
		Type wor = Type.Work;
		p1.addNumber(mob, "9826547343");
		p1.addNumber(mob, "64783");
		p1.addNumber(hom, "74737");
		p1.addNumber(hom, "982654");
		p1.addNumber(hom, "64783");
		p1.addNumber(hom, "74737");
		p1.addNumber(wor, "982654");
		p1.addNumber(wor, "64783");
		p1.addNumber(hom, "74737");
		p1.addNumber(mob, "74737");
		ArrayList<String> listmob = p1.getMobile();
		ArrayList<String> listwork = p1.getWork();
		ArrayList<String> listhome = p1.getHome();
		for(String x: listmob) 
		{
			System.out.println("Mobile " + x);
		
		}
		for(String x: listwork)
		{
			System.out.println("Work "+x);
		}
		for(String x: listhome)
		{
			System.out.println("Home " + x);
		}
		
	}

}
