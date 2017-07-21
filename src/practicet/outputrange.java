package practicet;

import java.util.ArrayList;
import java.util.List;

public class outputrange {
	
	public static List<String> getRange(int[] nums)
	{
		List<String> list = new ArrayList<>();
		//list.add("");
		for(int i = 0; i< nums.length; i++)
		{
			int val = nums[i];
			while(i+1 < nums.length && nums[i+1]==nums[i]+1)
			{
				i++;
			}
			if(val!=nums[i])
			{
				list.add(val+"->"+nums[i]);
			}
			else
				list.add(val+"");
		}
		
		return list;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {0,1,2,3,4,6,7,8,10};
		List<String> list = getRange(arr);
		for(int i = 0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}

}
