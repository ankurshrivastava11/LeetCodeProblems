package practicet;

public class mergeSol {
public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
	
	    int i =m;
		int j =n;
		int k = m+n;
	      if(nums2.length==0)
	      {
	          return nums1;
	      }
	      else if(j==0)
	      {
	    	  if(nums2[j]>nums1[i])
	    	  {
	    		  nums1[k]=nums2[j];
	    		  j--;
	    	  }
	    	  return nums1;
	      }
	      else
	      {
	          while(i<=0 && j<=0)
	          {
	              if(nums2[j]>nums1[i])
	              {
	                  nums1[k]=nums2[j];
	                  j--;
	                  k--;
	              }
	              else if(nums2[j]<nums1[i])
	              {
	                  nums1[k] = nums1[i];
	                  i--;
	                  k--;
	              }
	              else
	              {
	                  nums1[k]=nums1[i];
	                  nums1[k--]= nums1[i];
	                  k--;
	                  i--;
	                  j--;
	              }
	          }
	          return nums1;
	      }
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

