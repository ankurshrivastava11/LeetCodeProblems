package practicet;

import java.util.Stack;

public class brickthrow {
	
	public static int totalScore(String[] blocks, int n)
	{
		int sum = 0;
		int[] sumArray = new int[2];
		Stack<Integer> stack = new Stack();
		stack.push(0);
		stack.push(0);
		for(int i = 0; i< n ; i++)
		{
			int score = 0;
			if(blocks[i].equals("Z"))
			{
				if(!stack.isEmpty())
				{
					sum = sum - stack.pop();
				}
				score = stack.peek();
			}
			else if(blocks[i].equals("X"))
			{
				sum +=(2*stack.peek());
				score = 2*stack.peek();
				stack.push(score);
			}
			else if(blocks[i].equals("+"))
			{
				sum +=sumArray[0]+sumArray[1];
				score = sumArray[0]+sumArray[1];
				stack.push(score);
			}
			else
			{
				stack.push((Integer.parseInt(blocks[i])));
				sum += ((Integer.parseInt(blocks[i])));
				score = ((Integer.parseInt(blocks[i])));
			}
			sumArray[0] = sumArray[1];
			sumArray[1] = score;
		}
		return sum;
	}
	
	public static void main(String[] args)
	{
		String[] blocks = new String[]{"1","X","2","Z","Z","6","+"};
		int result = totalScore(blocks, 7);
		System.out.print(result);
	}

}
