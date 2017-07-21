package practicet;

public class rotate {
public static int[] rotate(int[] nums, int k) {
	if(k > nums.length) 
    k=k%nums.length;

int[] result = new int[nums.length];

for(int i=0; i < k; i++){
    result[i] = nums[nums.length-k+i];
}

int j=0;
for(int i=k; i<nums.length; i++){
    result[i] = nums[j];
    j++;
}

System.arraycopy( result, 0, nums, 0, nums.length );
	/*int[] temp1 = new int[nums.length];
	int[] temp2 = new int[nums.length];
	/*for (int i = 0; i <=k/2+1; i++) {
	    int temp = nums[i];
	    temp1[i] = nums[k -1 - i];
	    temp1[k - 1 - i] = temp;
	    //System.out.println(nums[i]);
	    System.out.println(temp1[i]);
	    
	}*/
	/*for (int i = k+1; i < (nums.length)/2+k; i++) {
	    int temp = nums[i];
	    temp2[i] = nums[nums.length+k  - i];
	    temp2[nums.length - 1 - i] = temp;
	    //System.out.println(nums[i]);
	    System.out.println(temp2[i]);
	}
	for (int i = 0; i <temp1.length; i++){
		//nums[i] = temp1[i];
		//System.out.println(temp1[i]);
	}
	/*for (int i = k+1; i < (nums.length); i++){
		int j = 0;
		nums[i] = temp2[j];
				j++;
		System.out.println(nums[i]);
	}
	/*for (int i = 0; i < nums.length/2; i++) {
	    int temp = nums[i];
	    nums[i] = nums[nums.length - 1 - i];
	    nums[nums.length - 1 - i] = temp;
	   // System.out.println(nums[i]);
	}*/
     return nums;
    }

public static void main(String []args)
{
	int[] a =  {1,2,3,4,5,6,7};
	int[] res = new int[7];
	int target = 3;
	res = rotate(a,target);
	for(int i = 0; i<res.length;i++)
	{
	System.out.println(res[i]);
	}
}

}
