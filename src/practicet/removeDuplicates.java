package practicet;

public class removeDuplicates {
	
public static int removeDuplicate(int[] nums) {
	int i=1;
    for(int j = 1; j<nums.length;j++)
    {
    	if(nums[j]!=nums[j-1])
    	{
    		nums[i]= nums[j];
    		i++;
    	}
    }
    return i;
        
    }
public static void main(String args[])
{

	int[] a =  {1,1,2};
	int res = removeDuplicate(a);
	System.out.println(res);
	
}

}
