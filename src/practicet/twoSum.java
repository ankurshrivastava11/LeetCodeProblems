package practicet;

public class twoSum {
public static int[] twoSum(int[] nums, int target) {
	int[] indices = new int[2];
	int i=0;
	int j=0;
	for(i=0;i<nums.length;i++)
	{
		for(j=1;j<nums.length;j++)
		{
			if (nums[i]+nums[j] ==target){
				if(i<j)
				{
				   indices[0] = i;
				   indices[1] = j;
				   break;
				}
				else if(i>j){
				    indices[0] = j;
				   indices[1] = i;
				   break;
				}
				else{}
			}
		}
	}for(i=0;i<nums.length;i++)
	{
		for(j=1;j<nums.length;j++)
		{
			if (nums[i]+nums[j] ==target){
				if(i<j)
				{
				   indices[0] = i;
				   indices[1] = j;
				   break;
				}
				else if(i>j){
				    indices[0] = j;
				   indices[1] = i;
				   break;
				}
				else{}
			}
		}
	}
	return indices;
        
    }
public static void main(String []args)
{
	int[] a =  {11, 7, 2, 15};
	int[] res = new int[2];
	int target = 9;
	res = twoSum(a,target);
	System.out.println(res);
	}

}


