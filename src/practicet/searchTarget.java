package practicet;

public class searchTarget {
public static int search(int[] nums, int target) {
	
	if (nums == null) return -1;
    int low = 0, high = nums.length-1;
    while (low <= high) {
        int mid = (high-low)/2 + low;
        if (nums[mid] > target) {
            if (nums[low] > nums[high] && target <= nums[high] && nums[mid] >= nums[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        } else if (nums[mid] < target) {
            if (nums[low] > nums[high] && target >= nums[low] && nums[mid] <= nums[high]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        } else {
            return mid;
        }
    }
    return -1;
    }
public static void main(String []args)
{
	int[] a =  {3,1};
	int t =3;
	 int index = search(a,t);

	System.out.println(index);
}
}
