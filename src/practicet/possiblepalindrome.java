package practicet;

import java.util.*;
//import java.util.HashMap;
//import java.util.List;

public class possiblepalindrome {
	
	public static List<String> getPalindrome(String s)
	{
		System.out.println(s);
		List<String> list = new ArrayList<String>();
		HashMap<Character,Integer> hmap = new HashMap<>();
		for(int i = 0; i<s.length();i++)
		{
			if(!hmap.containsKey(s.charAt(i)))
			{
				hmap.put(s.charAt(i), 1);
			}
			else
			{
				hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
			}
		}
		char[] ch = new char[hmap.size()];
		int[] count = new int[hmap.size()];
		int index = 0;
        for (Map.Entry<Character, Integer> entry : hmap.entrySet())
        {
            ch[index] = entry.getKey();
            count[index] = entry.getValue();
            index++;
        }
		char[] result = new char[s.length()];
		System.out.println(count.length);
		System.out.println(result.length);
		getCombination(ch,count,result,0,list);
		
		return list;
	}
	public static void getCombination(char[] ch, int[] count, char[] result,int level,List<String> list)
	{
		if(level == result.length)
		{
			String str = String.valueOf(result);
			boolean b = isPalindrome(str);
			if(b) 
			{
				list.add(str);
			}
			return;
		}
		for(int i = 0;i<ch.length;i++)
		{
			if(count[i] == 0)
			{
				continue;
			}
			result[level] = ch[i];
			count[i]--;
			getCombination(ch,count,result,level+1,list);
			count[i]++;
		}
		
	}
	public static boolean isPalindrome(String str)
	{
		boolean b = true;
		int i =0,j=str.length()-1;
		while(i<=j)
		{
			if(str.charAt(i) == str.charAt(j))
			{
				i++;
				j--;
				b = true;
			}
			else
			{
				return false;
			}
		}
		return b;
	}
	
	public static void main(String[] args)
	{
		String str = "aabbc";
		List<String> list = new ArrayList<>();
		list = getPalindrome(str);
		for(int i = 0; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
