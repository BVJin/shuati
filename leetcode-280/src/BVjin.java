
public class BVjin {
    public void wiggleSort(int[] nums) {
    		
        for(int i = 0; i<nums.length; i++){
        	if(i%2 == 1){
        		if(nums[i-1]>nums[i]){
        			int temp = nums[i];
        			nums[i-1] = nums[i];
        			nums[i] = temp;
        		}
        	}else if(i != 0 && nums[i-1] < nums[i]){
        		int temp = nums[i];
    			nums[i-1] = nums[i];
    			nums[i] = temp;
        	}
        }
 
    }
}
