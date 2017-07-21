package practicet;

public class jump {
public static boolean canJump(int[] nums) {
    int j=0;
    boolean can_Jump = false;
    int i =0;
    int len = nums.length-1;
    for(i=0;i<nums.length;i++)
    {
    	if(i+nums[i] >= len)
    	{
    		i= i+nums[i];
    		can_Jump = true;
    		
    	}
    	else
    	{
    		can_Jump = false;
    	}
    }
    
	return can_Jump;
	
    }
public static void main(String []args)
{
	int[] a =  {3,2,1,0,4};
	boolean res = canJump(a);
	
	System.out.println(res);
}

}
