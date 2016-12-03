
public class BVjin {
    public int searchInsert(int[] nums, int target) {
    	return binarySearch(0, nums.length-1, nums, target);
    }
    public int binarySearch(int s, int e, int[] nums, int target){
    	if(s==e)
    		return target <= nums[s]?s:s+1;
    	else{
    		int mid = (s+e)/2;
    		if(nums[mid] == target) return mid;
    		if(nums[mid] > target) return binarySearch(s, mid, nums, target);
    		else
    			return binarySearch(mid+1, e, nums, target);
    	}
    }
}
