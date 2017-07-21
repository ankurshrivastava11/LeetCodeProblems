package practicet;

import java.util.Stack;

public class validParanthes {
public boolean isValid(String s) {
        
        Stack<Character> stk = new Stack<Character>();
        boolean is_valid = false;
        if(s.isEmpty())
        {
        	return true;
        }
    
        for(int i = 0;i<s.length();i++ )
        {
        	if(s.charAt(i) == '(')
        	{
        		if(!stk.isEmpty() && stk.peek()==')')
            	{
            		stk.pop();
            	}
        	}
        	else if(s.charAt(i) == '{')
        	{
        		if(!stk.isEmpty() && stk.peek()=='}')
            	{
            		stk.pop();
            	}
        	}
        	else if(s.charAt(i) == '[')
        	{
        		if(!stk.isEmpty() && stk.peek()==']')
            	{
            		stk.pop();
            	}
        	}
        	else
        	{
        		stk.push(s.charAt(i));
        	}
        }
        if(stk.isEmpty())
        {
        	is_valid = true;
        }
        
        return is_valid;
    }

}
