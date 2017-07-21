package practicet;

import java.util.*;

public class intersection2 {

public static int[] intersect(int[] nums1, int[] nums2) {
	
	
	
	
	Arrays.sort(nums1);
	Arrays.sort(nums2);
	List<Integer> res = new ArrayList();
	
	int i =0; int j =0; int k =0;
	if(nums1.length == 0)
	{
	    return nums1;
	}
	else if(nums2.length == 0)
	{
	    return nums2;
	}
	else
	{
		while(i<nums1.length && j<nums2.length)
		{

			if(nums1[i] == nums2[j])
			{
				res.add(nums1[i]);
				i++;
				j++;
			}
			else if(nums1[i]>nums2[j])
			{
				j++;
			}
			else
			{
				i++;
			}
		}
		
	}
	int[] result = new int[res.size()];
	for(k =0;k<result.length;k++)
	{
		result[k] = res.get(k);
	}
	
	return result;  
    }
public static void main(String []args)
{
	int nums1[]= {1};
	int nums2[] = {1};
	int res[] = intersect(nums1,nums2);
	for(int si:res)
	System.out.println(si);
}
}
