
public class BVjin {
    public int findPeakElement(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
    
    public int helper(int[] nums, int left, int right){
    	if(left == right)
    		return left;
    	if(left + 1 == right)
    		return nums[left] > nums[right]?left:right;
    	
    	int mid = (left+right)/2;
    	
    	if((nums[mid] > nums[mid-1]) && (nums[mid] > nums[mid+1]))
    		return mid;
    	
    	if((nums[mid] < nums[mid-1])&&(nums[mid] > nums[mid+1]))
    		return helper(nums, left, mid);
    	else
    		return helper(nums, mid, right);
    	
    	
    }
}
