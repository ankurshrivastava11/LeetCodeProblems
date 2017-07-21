package practicet;

import java.util.*;

public class repeateddna {
public static List<String> findRepeatedDnaSequences(String s) {
	HashSet seen = new HashSet(), repeated = new HashSet();
    for (int i = 0; i + 9 < s.length(); i++) {
        String ten = s.substring(i, i + 10);
        if (!seen.add(ten))
            repeated.add(ten);
    }
    return new ArrayList(repeated);
        
    }
public static void main(String []args)
{
	String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
	List<String> res =new ArrayList<String>();
	res =findRepeatedDnaSequences(s);
	for(String si:res)
	System.out.println(si+"\n");
}
}
