
public class BVjin1 {
    public int searchInsert(int[] nums, int target) {
    	int s = 0, e = nums.length - 1;
    	while(s < e){
    		int mid = (s+e)/2;
    		if(nums[mid] == target) return mid;
    		if(nums[mid]>target) e = mid-1;
    		if(nums[mid]<target) e = mid+1;
    	}
    	return target<=nums[s]?s:s+1;
    }
}
