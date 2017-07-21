package practicet;

public class findminrotate {
public static int findMin(int[] nums) {
	
	 	int low = 0;
		int high = nums.length-1;
		int min = 0;
		if(nums.length ==1)
		{
			min = nums[0];
		}
		else
		{
		while(low<=high)
		{
			int mid = ((high-low)+low)/2;
			System.out.println(mid);
			if(mid ==0)
			{
				min = Math.min(nums[0], nums[1]);
				break;
			}
			else if(nums[mid]<=nums[mid+1] &&nums[mid]<=nums[mid-1])
			{
				min = nums[mid];
			}
			else if(nums[mid]<=nums[mid+1]&& nums[mid]>=nums[mid-1])
			{
				high = mid-1;
			}
			else if(nums[mid]>=nums[mid+1] && nums[mid]<=nums[mid-1])
			{
				low = mid+1;
			}
			else{
				high--;
			}
		}
		}
	       return min;
    }
public static void main(String []args)
{
	int nums[]= {1,2,1};
	int res = findMin(nums);
	System.out.println(res);
}

}
