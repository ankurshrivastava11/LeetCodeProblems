package practicet;

public class reverseStringRecursion {
	
	String reverse(String str)
	{
		if(str.length() <= 1 || str == null) 
			{
			System.out.println("String is "+ str);
			return str;
			
			}
	System.out.println(str.substring(1) + " "+ str.charAt(0));
	System.out.println("str "+str);
		return reverse(str.substring(1))+str.charAt(0);
		
	}
	public static void main(String[] args)
	{
		String str = "Eclipse";
		reverseStringRecursion res = new reverseStringRecursion();
		System.out.println("Reverse is "+ res.reverse(str));
	}

}
