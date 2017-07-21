package practicet;

import java.util.LinkedHashSet;

public class reverseWord {
	public static String reverseWords(String s) {
		
	String out ="";
    String[] words=s.split("\\s");
    int size = words.length;
    for(int i = size-1; i>=0;i--)
    {
    	out = out + words[i]+" ";
    	
    }
    out = out.trim();
    System.out.println(out);
    return out;
        
	}
	public static void main(String []args)
	{
		String s = "I am an";
		String res = "";
		res = reverseWords(s);
		
		System.out.println(res);
	}
}
