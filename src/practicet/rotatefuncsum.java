package practicet;

public class rotatefuncsum {
public static int maxRotateFunction(int[] A) {
	if(A.length ==0)
	{
		return 0;
	}
	int max = 0;
	int sum =0;
	for(int k = 0;k<A.length;k++)
	{
		sum += k*A[k];
			max = sum;
			System.out.println("Sum 0 "+ sum);
	}
	for(int k =1;k<A.length;k++)
	{
		int temp = A[A.length-1];
		int i =A.length-1;
		while(i>0)
		{
			A[i] = A[i-1];
			i--;
		}
		A[0] = temp;
		for(int l =0;l<A.length;l++)
		{
			System.out.println(k+" pass :"+A[l]);
		}
		int j =0;
		sum =0;
		while(j<A.length)
		{
			sum+= j*A[j];
			//System.out.println("j at "+k+" pass "+j);
			j++;
			
		}
		if(max<sum)
		{
			max = sum;
			System.out.println("Sum "+k+" "+ sum);
		}	
		
	}
	return max;
        
    }
public static void main(String args[])
{
	int A[] = {-2147483648,-2147483648};
	int res = maxRotateFunction(A);
	System.out.println(res);
}

}
