package practicet;

import java.util.HashMap;

public class anagram {
public boolean isAnagram(String s, String t) {
	
	HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
	for(int i =0; i<s.length();i++)
	{
		if(!hmap.containsKey(s.charAt(i)))
		{
			hmap.put(s.charAt(i), 1);
		}
		else{
			int value = hmap.get(s.charAt(i));
			hmap.put(s.charAt(i), value+1);
		}
		
	}
	for(int i =0; i<t.length();i++)
	{
		if(!hmap.containsKey(t.charAt(i)))
		{
			hmap.put(t.charAt(i), 1);
		}
		else
		{
			int value = hmap.get(t.charAt(i));
			hmap.put(t.charAt(i), value-1);
		}
		
	}
        for(int i :hmap.values())
        {
        	if(i!=0)
        	{
        		return false;
        	}
        }
        return true;
        
    }

}
