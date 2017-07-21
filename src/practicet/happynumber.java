package practicet;

import java.util.HashSet;
import java.util.Set;

public class happynumber {
public static boolean isHappy(int n) {
        if(n<=0)
        {
        	return false;
        }
        int res =n;
        Set<Integer> result = new HashSet<Integer>();
        
        while(res>1)
        	{
        		if(!result.add(res)){
        			return false;
        		}
        		result.add(res);
        		res = Square(res);
        	}
        return true;
}
private static int Square(int res)
{
	int sum =0;
	while(res>0)
	{
		int temp = res%10;
		sum = sum + (temp*temp);
		res = res/10;
	}
	return sum;
}
public static void main(String []args)
{
	int a =  1;
	boolean res =isHappy(a);
	
	System.out.println(res);
}
}
