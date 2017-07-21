package practicet;
import java.util.HashMap;
import java.util.Map;

public class findDiffinString {
public char findTheDifference(String s, String t) {
     char value = 'a';
     
	Map<Character , Integer > hmap = new HashMap<Character, Integer>();
	for(int i = 0;i<s.length();i++)
	{
		char a = s.charAt(i);
	    if(hmap.containsKey(a))
	    {
	    	hmap.put(a, (hmap.get(a)+1));
	    }
	    else
	    	hmap.put(a, 1);
	}
	for(int i = 0;i<t.length();i++)
	{
		char a = t.charAt(i);
	    if(hmap.containsKey(a))
	    {
	    	hmap.put(a, (hmap.get(a)-1));
	    }
	    else
	    	hmap.put(a, 1);
	}
	for(int i = 0;i<t.length();i++)
	{
		char a = t.charAt(i);
		if(hmap.get(a)==1 || hmap.get(a)==-1)
		{
			value =  a;
		}
	}
	return value;
    }

}
