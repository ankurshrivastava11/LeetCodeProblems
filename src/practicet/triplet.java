package practicet;

import java.util.Arrays;

public class triplet {
	static boolean tripletSum(int x, int[] a) {
	    Arrays.sort(a);
	    int j = 0; int k = 0;
	    for(int i = 0; i<a.length-2;i++)
	    {
	    	j = i+1;
	    	k = a.length-1;
	    	while(j<k)
	    	{
	    		if(a[i]+a[j]+a[k]==x) return true;
	    		else if(a[i]+a[j]+a[k]<x) j++;
	    		else k--;
	    	}
	    }
	   
	    
	    return false;

	}
	public static void main(String[] args)
	{
		int[] arr ={469, 999, 84, 640, 516, 622, 994, 827, 723, 839, 829, 582, 400, 979, 892, 24, 944, 835, 244, 350, 703, 708, 503, 142, 688, 347, 892, 638, 414, 401, 817, 691, 163, 936, 127, 411, 878, 383, 261, 190, 706, 875, 664, 723, 196, 567, 361, 39, 589, 812, 246, 468, 426, 868, 190, 543, 64, 548, 503, 618, 100, 24, 227, 204, 49, 52, 571, 637, 459, 968, 457, 406, 532, 963, 820, 976, 557, 532, 496, 45, 592, 804, 389, 916, 451, 320, 273, 792, 384, 134, 776, 643, 570, 301, 955, 79};
		int x = 146;
		System.out.println(tripletSum(x,arr) );
	}


}
