package practicet;

import java.util.Arrays;
import java.util.HashMap;

public class ransom {

public boolean canConstruct(String ransomNote, String magazine) {
        
	char[] ransomN = ransomNote.toCharArray();
    char[] mag = magazine.toCharArray();
    boolean canConst = false;
    HashMap<Character,Integer> hmap = new HashMap<Character,Integer>();
    if(magazine == "" && ransomN.length>0)
    {
    	canConst = false;
    }
    else if(magazine.length() == 0 && ransomNote.length() == 0)
    {
        canConst = true;
    }
    else
    {
        canConst = true;
    }

    for(int i =0; i<mag.length;i++)
    {
    	if(!hmap.containsKey(mag[i]))
    	{
    		hmap.put(mag[i], 1);
    	}
    	else
    	{
    		int value = hmap.get(mag[i]);
    		value++;
    		hmap.put(mag[i], value);
    	}
    }
    for(int j=0;j<ransomN.length;j++)
    {
    	int value = 0;
    	if(hmap.containsKey(ransomN[j]))
    	{
    		value = hmap.get(ransomN[j]);
    	}
    	if(value>0)
    	{
    		value--;
    		hmap.put(ransomN[j], value);
    		canConst = true;
    		
    	}
    	else{
    		return false;
    	}
    }
    
    
    return canConst;      
    }
}
