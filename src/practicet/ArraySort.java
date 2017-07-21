package practicet;

public class ArraySort {
	public static int[] sortArray(int arr[])
	{
		int i,max, j, location, temp, len = arr.length;
		
		for( i =0; i<len;i++)
		{
			max = arr[i];
			location = i;
			for(j=i;j<len;j++)
			{
				if(max>arr[j])
				{
					max = arr[j];
					location = j;
				}
			}
			temp = arr[i];
			arr[i] = max;
			arr[location] = temp;
		}
		return arr;
	}
	
	public static void main(String args[])
	{
		int a[] = {2,1,5,3,4};
		int res[] = new int[5];
		res = sortArray(a);
		for(int k =0; k< res.length;k++)
		{
			System.out.println(res[k]);
		}
	}

}
