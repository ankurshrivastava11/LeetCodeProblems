package practicet;

public class sol {
	
	 public static int removeElement(int[] nums, int val) {
		 
		 int j =0;
		 int i =0;
	        
	        for(i=0;i<nums.length;i++)
	        {
	        	if(nums[i]!=val){
	        		nums[j]= nums[i];
	        		j++;
	        	}
	        }
	        return j;
	    }
 
public static void main(String []args)
{
	int[] a =  {3,3,2,2};
	int res = removeElement(a,3);
	System.out.println(res);
	}

}

