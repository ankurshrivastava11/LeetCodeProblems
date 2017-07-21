package practicet;

public class missingNumbers {
public int missingNumber(int[] nums) {
	
	int low = 0;
	int high = nums.length-1;
	int mid = (high+low)/2;
	while(low<=high)
	{
		
		if(nums[mid]>mid)
		{
			high = mid-1;
		}
		if(nums[mid]==mid)
		{
			low = mid+1;
		}
		mid = (high+low)/2;
	}
	return mid;   
    }

}
