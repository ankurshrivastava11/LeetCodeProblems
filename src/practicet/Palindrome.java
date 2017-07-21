package practicet;

public class Palindrome {
	public static boolean isPalindrome(String s) {
        boolean is_palindrome = true;
        if(s.length()==0)
        {
        	return false;
        }
        s = s.toLowerCase();
        System.out.println(s);
        String str = s.replaceAll("([^A-Za-z0-9]|\\s)+", "");
        int i =0;
        int j = str.length()-1;
        while(i<j)
        {
        	if(str.charAt(i++)!=str.charAt(j--))
        	{
        		is_palindrome = false;
        	}
        
        }
        
        return is_palindrome;
        
    }
	public static void main(String args[])
	{

		String a =  "";
		boolean res = isPalindrome(a);
		
		System.out.println(res);
	}

}
