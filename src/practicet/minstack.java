package practicet;

import java.util.Stack;

public class minstack {
	
	Stack<Integer> stk,stkmin;
	int min = Integer.MAX_VALUE;
	public void MinStack() {
        
        stk = new Stack<Integer>();
        stkmin = new Stack<Integer>();
        
    }
    
    public void push(int x) {
    	stk.push(x);
    	if(x<min)
    	{
    		stkmin.push(x);
    		min = x;
    	}
        
    }
    
    public void pop() {
       stk.pop();
        
    }
    
    public int top() {
    	
    	return stk.pop();
        
    }
    
    public int getMin() {
    	return stkmin.pop();
        
    }
  
}
