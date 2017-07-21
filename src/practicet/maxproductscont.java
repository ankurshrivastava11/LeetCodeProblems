package practicet;

public class maxproductscont {
	
public int maxProduct(int[] nums) {
	
	int max =Integer.MIN_VALUE;
	if(nums.length==1)
	{
		return nums[0];
	}
	else if(nums.length==2)
	{
		int prod = nums[0]*nums[1];
		max = Math.max(prod, max);
		max = Math.max(max, nums[0]);
		max = Math.max(max, nums[1]);
		return max;
		
	}
	else
	{
		int i =0;
		int j =0;
		while(i<nums.length-1)
		{
			int prod = nums[i];
			j=i+1;
			while(j<nums.length)
			{
				prod = prod*nums[j];
				max = Math.max(max, prod);
				max = Math.max(max, nums[i]);
				max = Math.max(max, nums[j]);
				j++;
			}
			i++;
		}
		return max;
	}
    }

}
