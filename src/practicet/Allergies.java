package practicet;

import java.sql.Time;
import java.util.*;

public class Allergies {

	 	private String reporter;
	 	private String name;
	    private String symptoms;
	    private int timeReported;
	    private String severity;
	    private Time time;	
	    public enum Severity {
	        low , medium , High
	    }
	    Severity sever;
	    
	    public Allergies(String reporter , String sysmptoms , int timeReported , String name , Severity severity) 
	    {
	    	this.reporter = reporter;
	    	this.symptoms = sysmptoms;
	    	this.timeReported = timeReported;
	    	this.name = name;
	    	System.out.println(this.sever = severity);
	    	System.out.println(this.sever);
	    	
	    	/*for(Severity values : Severity.values())
	    	{
	    		if(values.toString() == high)
	    		{
	    			System.out.println(high);
	    		}
	    		
	    	}*/
	    	
	  		
	    }
	    
	    public void setReporter(String reporter)
	    {
	    	this.reporter = reporter;
	    }
	    
	    public void setSymptoms(String symptoms)
	    {
	    	this.symptoms = symptoms;
	    }
	    public void setTimeReported(int timeReported)
	    {
	    	this.timeReported = timeReported;
	    }
	    
	    public String getReporter()
	    {
	    	return this.reporter;
	    }
	    
	    public String getName()
	    {
	    	return this.name;
	    }
	    
	    public void setName(String name)
	    {
	    	this.name = name;
	    }
	    
	    public String getSymptoms()
	    {
	    	return this.symptoms;
	    }
	    
	    public int getTimeReported()
	    {
	    	return this.timeReported;
	    }
	  
	    public static void main(String args[])
	    {
	    	Allergies a1 = new Allergies("Aniket", "Vomit", 1123, "Rashes" , Severity.High);
	    	Allergies a2 = new Allergies("ANkur", "infection", 234, "hhd", Severity.medium);
	    	
	    }
	    
}

class Person
{
	private String name;

	private int age;

	private List<Allergies> allergyList;
	

	public Person(String name, int age, List<Allergies> allergyList) {
		super();
		this.name = name;
		this.age = age;
		this.allergyList = allergyList;
	}
	
	public void displayAllergieNames()
	{
		for(int i = 0 ; i < this.getAllergyList().size() ; i++)
		{
			Allergies  as 	= 	this.getAllergyList().get(i);
			System.out.println(as.getName());
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Allergies> getAllergyList() {
		return allergyList;
	}

	public void setAllergyList(List<Allergies> allergyList) {
		this.allergyList = allergyList;
	} 
	
}