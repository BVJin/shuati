
public class BVjin {
    public int[] searchRange(int[] nums, int target) {
    	int s = getFirst(nums, target);
        if(s == nums.length || nums[s] != target){
        	return new int[]{-1, -1};
        }
        int e = getFirst(nums, target+1) - 1;
        
        return new int[]{s,e};
    }
    
    public int getFirst(int nums[], int target){
    	int s = 0, e = nums.length;
    	while(s<e){
    		int mid = (s+e)/2;
    		if(nums[mid]<target){
    			s = mid + 1;
    		}else{
    			e = mid;
    		}
    	}
    	return s;
    }
}
