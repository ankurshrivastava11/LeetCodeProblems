package practicet;

public class peakElement {
public static int findPeakElement(int[] nums) {
	
	int n =0;
	int index= 0;
	if(nums.length==1)
	{
		return n;
	}
	else if(nums.length==2)
	{
		if(nums[n]>nums[n+1])
		{
			return n;
		}
		else
			return n+1;
	}
	else{
	
	for(n=0;n<nums.length-1;n++)
	{
		if(nums[n]>nums[n+1] && nums[n]>nums[n-1])
		{
			index = n;
		}
	}
	if (index==0)
	{
		int max = -1;
		for(n=1;n<nums.length-1;n++)
		{
			if(nums[n]>max)
			{
				max = nums[n];
				index = n;
			}
		}
	}
        return index;
	}
    }
public static void main(String args[])
{

	int[] a =  {1,2,3};
	int res = findPeakElement(a);
	
	System.out.println(res);
}
}
