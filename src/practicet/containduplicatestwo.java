package practicet;

import java.util.HashMap;

public class containduplicatestwo {
public static boolean containsNearbyDuplicate(int[] nums, int k) {
	
	HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
	for(int i = 0; i < nums.length; i++){
        if(hmap.containsKey(nums[i]) && (i - hmap.get(nums[i])<= k)) return true;
        hmap.put(nums[i],i);
    }
    return false;
    }

public static void main(String args[])
{

	int[] a =  {1,2,3};
	int k = 1;
	boolean res = containsNearbyDuplicate(a,k);
	
	System.out.println(res);
}

}
