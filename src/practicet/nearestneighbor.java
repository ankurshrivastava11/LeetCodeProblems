package practicet;

import java.util.Arrays;

public class nearestneighbor {
	
	public static int[] getnearest(int[] nums)
	{
		int res[] = new int[nums.length];
		for(int i = 0; i<nums.length; i++)
		{
			int j = i+1;
			int k = i-1;
			int index = -1;
			while(k>=0 || j<nums.length)
			{
				if(k<0)
				{
					if(nums[j]>nums[i]) 
					{
						res[i] = j;
						break;
					}
					j++;
				}
				else if(j==nums.length)
				{
					if(nums[i]<nums[k]) 
						{
							res[i] = k;
							break;
						}
					k--;
				}
				else
				{
				if(nums[j] == nums[k] && nums[i]<nums[j]) res[i] = k;
				else if(nums[i]<nums[j] && nums[i] < nums[k])
				{
					if(nums[k]>nums[j]) res[i] = k;
					else res[i] = j;
					break;
				}
				else if(nums[i]<nums[j] && nums[k] < nums[j])
				{
					res[i] = j;
					break;
				}
				else if(nums[i]<nums[j] && nums[k] > nums[j])
				{
					res[i] = k;
					break;
				}
				
				k--;
				j++;
				}
			}
		}
		return res;
		}
		
	public static void main(String[] args){
		
		int[] arr = {1,4,7,2,4,8,6};
		int[] res = getnearest(arr);
		for(int i:res)
		System.out.println(i);
	}

}
