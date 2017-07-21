package practicet;

import java.util.ArrayList;
import java.util.List;

public class removedup2 {
	public static int removeDuplicates(int[] nums) {
        int i=1,j=1,count=1;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(nums.length==0)
        {
            int m =0;
            return m;
        }
        int a = nums[0];
        list.add(a);
        while(i<nums.length)
        {
            if(nums[i]==a)
            {System.out.println(a);
                if(count < 2)
                {
                	System.out.println("inside if"+a);
                    j++;
                    count++;
                    i++;
                    list.add(a);
                }
                else
                {
                    i++;
                }
            }
            else
            {
            	System.out.println(a);
            
                a = nums[i];
                count=1;
                j++;
                list.add(a);
                i++;
                
            }
        }
        System.out.println(j);
        return j;
        
}
	public static void main(String []args)
	{
		int nums[]= {1,1,1,2};
		int res = removeDuplicates(nums);
		System.out.println(res);
	}
}
