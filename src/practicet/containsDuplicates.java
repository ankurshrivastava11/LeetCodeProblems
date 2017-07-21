package practicet;

import java.util.Arrays;

public class containsDuplicates {

public boolean containsDuplicate(int[] nums) {
	int length = nums.length;
	boolean result= false;
	int i =0;
	Arrays.sort(nums);
	if(length ==1)
	{
		result = false;
	}
	else
	{
		while(i<nums.length-1)
		{
			if(nums[i]==nums[i+1])
			{
				result = true;
				i++;
			}
		}
	}
	return result;
	
        
    }
}
