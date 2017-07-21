package practicet;

import java.util.Arrays;
import java.util.HashMap;

public class singleElementfind {
public int singleNumber(int[] nums) {
	
	int value = 0;
    HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
for(int i = 0;i<nums.length;i++)
{
    if(hmap.containsKey(nums[i]))
    {
    	hmap.put(nums[i], 0);
    }
    else
    	hmap.put(nums[i], 1);
}
for(int i = 0;i<nums.length;i++)
{
	if(hmap.get(nums[i])==1)
	{
		value =  nums[i];
	}
}
return value;
    }

}
