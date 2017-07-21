package practicet;

import java.util.ArrayList;
import java.util.List;

public class generatesubsetstring {
	
	private static String getSubset(String inputSet, int mask) {
	    StringBuffer subset = new StringBuffer();

	    for (int i = 0; i < inputSet.length(); i++) {
	        // Check if ith bit is set
	        if ((mask & (1 << i)) != 0) {
	            subset.append(inputSet.charAt(i));
	        }
	    }

	    return subset.toString();
	}

	public static List<String> permuteSet(String inputSet) {
	    List<String> powerSet = new ArrayList<String>();
	    
	    int n = inputSet.length(); // size for binary
	    int powerSetLength = 1 << n; // you should check that n is small enough

	    for (int i = 0; i < powerSetLength; i++) {
	        powerSet.add(getSubset(inputSet, i));
	    }
	    
	    return powerSet;
	}
	
	public static void main(String []args)
	{
		String s = "abc";
		List<String> lis = new ArrayList<String>();
		lis = permuteSet(s);
		
		System.out.println(lis);
	}

}
