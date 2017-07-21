package practicet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class generatesubsets {
	public static List<List<Integer>> subsets(int[] nums) {
	    List<List<Integer>> ans = new ArrayList<>();
	    ans.add(new ArrayList<>());
	    Arrays.sort(nums);
	    for (int num : nums)
	    {
	        int size = ans.size();
	        for (int i = 0; i < size; i++)
	        {
	            List<Integer> tmp = new ArrayList<>(ans.get(i));
	            tmp.add(num);
	            ans.add(tmp);
	            
	        }
	    }
	    
	    return ans;
	    
	    
	

}
	public static void main(String []args)
	{
		int nums[]= {1,2,3};
		List<List<Integer>> res = subsets(nums);
		
		System.out.println(res);
		System.out.println(res.size());
	}

}
