package practicet;

public class createorig {
	
	public static String compare(String str1, String str2)
	{
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		int i = 0;
		int j = 0;
		int index = 0;
		
		while(i<str1.length())
		{
			if(str1.charAt(i) == str2.charAt(j))
			{
				sb1.append(str1.charAt(i));
				System.out.println(str1.charAt(i));
				i++;
				j++;
				index = j;
				
			}
			else
			{
				j++;
			}
			if(j == str2.length())
			{
				i++;
				j = index;
			}
		}
		i = 0;
		j = 0;
		while(j<str2.length())
		{
			if(str2.charAt(j) == str1.charAt(i))
			{
				sb2.append(str2.charAt(j));
				System.out.println(str2.charAt(j));
				i++;
				j++;
				index = i;
			}
			else
			{
				i++;
			}
			if(i == str1.length())
			{
				j++;
				i = index;
			}
			
		}
		
		if(sb2.length()>sb1.length()) return sb2.toString();
		else return sb1.toString();
		
	}
	
	public static void main(String[] args)
	{
		String str1 = "grHenllso wortlds!";
		String str2 = "H5elelo 1dworlbd!";
		String strin = compare(str1,str2);
		System.out.println(strin);
		
	}

}
