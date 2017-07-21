package practicet;

import java.util.ArrayList;
import java.util.Arrays;

public class formatPhone {
	
	public static String formatfonenumber(String s)
	{
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i = 0 ; i < s.length(); i++)
		{
			if(Character.isDigit(s.charAt(i)))
			{
				list.add(s.charAt(i));
				
			}
		}
		
		StringBuilder sb = new StringBuilder();
		int length = 0;
		if(list.size() % 3 == 1)
		{
			length = list.size() - 4;
		}
		else if(list.size() % 3 == 2)
		{
			length = list.size() - 2;
		}
		else
		{
			length = list.size() -3;
		}
		int count = 0 ;
		int j = 0;
		for(int i = 0 ; i < length ; i++)
		{
			count++;
			sb.append(list.get(i));
			if(count == 3)
			{
				sb.append('-');
				count = 0;
				j = i;
			}
		}
		//System.out.println(sb.toString());
		
		
			int temp = 0 ;
			j++;
			while(j < list.size())
			{
				temp++;
				sb.append(list.get(j));
				if(temp == 2 && list.size() % 3 ==1)
				{
					sb.append('-');
				}
				j++;
				
			}
			
		
		
		return sb.toString();
	}
	
	public static void main(String args[])
	{
		String str = "--22";
		System.out.println(formatfonenumber(str));
		 str = "-319-237 - 5488";
		System.out.println(formatfonenumber(str));
		 str = "-319-237 - 548";
		System.out.println(formatfonenumber(str));
		
	}

}
