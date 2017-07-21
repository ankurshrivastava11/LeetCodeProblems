package practicet;

public class Binarysearch {

	
	static int sorted_search(int[] elements, int target)
	{
		if(elements == null || elements.length<=0) return -1;
		
		int left = 0, right = elements.length-1;
		while(left<right)
		{
			int middle = (left+right+1)/2;
			if(elements[middle] > target)
			{
				right = middle-1;
			}
			else
			{
				left = middle+1;
			}
		}
		
		if(elements[right] == target) return right;
		return -1;
	}
	
	public static void main(String[] args)
	{
		int[] elements = {1,1,2,3};
		int target = 9;
		int res = sorted_search(elements,target);
		System.out.println(res);
	}
}
