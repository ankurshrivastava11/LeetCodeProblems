package practicet;

public class mergeNums {
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
	
	int i =m;
	int j =n;
	int k = m+n;
	while(i>=0 && j>=0)
	{
		if(nums2[j]>=nums1[i])
		{
			nums1[k]=nums2[j];
			k--;
			j--;
		}
		else if(nums2[j]<nums1[i])
		{
			nums1[k]=nums1[i];
			k--;
			i--;
		}
	}
	return nums1;
		
	
	}
	public static void main(String args[])
	{

		int[] a =  {0};
		int[] b = {1};
		int[] res = merge(a,0,b,0);
		for(int i = 0;i<res.length;i++)
		{
		System.out.println(res[i]);
		}
	}


}
