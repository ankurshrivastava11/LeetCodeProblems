package practicet;

public class basicalc {
public static int calculate(String s) {
	int i =0,j=0,k=0,l=0;
    s = s.trim();
while(i<s.length())
{
	if(s.charAt(i) == '*')
	{
		int a = (int) s.charAt(i-1);
		int b = (int) s.charAt(i+1);
		int tmp = a*b;
		s = s.substring(0, i-1) + Integer.toString(tmp) + s.substring(i+2,s.length());
		i++;
		System.out.println(s+" " +s.length());
	}
	else{
	i++;}
		
}
while(j<s.length())
{
	if(s.charAt(j)=='/')
	{
		int a = (int) s.charAt(j-1);
		int b = (int) s.charAt(j+1);
		int tmp = a/b;
		s = s.substring(0, j-1) + Integer.toString(tmp) + s.substring(j+2,s.length());
		j++;
	
	}
	else{
	j++;}
}
while(k<s.length())
{
	if(s.charAt(k)=='+')
	{
		int a = (int) s.charAt(k-1);
		int b = (int) s.charAt(k+1);
		int tmp = a+b;
		s = s.substring(0, k-1) + Integer.toString(tmp) + s.substring(k+2,s.length());
		k++;
	}
	else{
	k++;}
}
while(l<s.length())
{
    if(s.charAt(l)=='-')
	{
    	System.out.println(s+" " +s.length());
		int a = (int) s.charAt(l-1);
		int b = (int) s.charAt(l+1);
		int tmp = a-b;
		s = s.substring(0, l-1) + Integer.toString(tmp) + s.substring(l+2,s.length());
		System.out.println(s+" " +s.length());
		l++;
	}
	else{
	    l++;
	}
}
int sum = Integer.parseInt(s);
return sum;
    }
public static void main(String []args)
{
	String s = "1+2+5*6";
	int res = calculate(s);
	System.out.println(res);
}
}
