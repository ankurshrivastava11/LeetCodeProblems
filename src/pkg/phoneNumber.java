package pkg;

import java.util.ArrayList;

import pkg.Main.Type;

public class phoneNumber {
	
	private String number;
	ArrayList<String> mob = new ArrayList<String>();
	ArrayList<String> work = new ArrayList<String>();
	ArrayList<String> home = new ArrayList<String>();
	

	protected String getNumber() {
		return number;
	}

	protected void setNumber(String number) {
		this.number = number;
	}
	
	public void addNumber(Type typ,String number)
	{
		if(typ == Type.Mobile) 
		{
			mob.add(number);
		}
		else if(typ == Type.Work)
		{
			work.add(number);
		}
		else if(typ == Type.Home) 
		{
			home.add(number);
		}
		else System.out.println("Invalid type");
	}
	
	public ArrayList<String> getMobile()
	{
		return mob;
	}
	public ArrayList<String> getWork()
	{
		return work;
	}
	public ArrayList<String> getHome()
	{
		return home;
	}
	

}
