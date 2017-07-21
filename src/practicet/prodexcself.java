package practicet;

public class prodexcself {
	public static int[] productExceptSelf(int[] nums) {
	int prod = 1;
	int j =0;
    int output[] = new int[nums.length];
    for(int i =0;i<nums.length;i++)
    {
    	prod = 1;
        
        while(j<i)
        {
            prod = prod*nums[j];
            System.out.println("prod1 "+ prod+" j "+j);
            j++;
            
        }
        j = i+1;
        while(j<nums.length)
        {
            prod = prod*nums[j];
            System.out.println("prod2 "+ prod+" j "+j);
            j++;
        }
        output[i] = prod;
        System.out.println("output prod3 "+ prod+" i "+i);
    }
    
    return output;
    
    

}
public static void main(String []args)
{
	int[] a =  {2,3,8};
	int out[] = new int[a.length];
	 out = productExceptSelf(a);
	
	 for(int i:out)
	System.out.println(i);
}

}
