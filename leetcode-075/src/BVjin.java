
public class BVjin {
	//improved counting sort
    public void sortColors(int[] nums) {
    	if(nums == null || nums.length < 2)
    		return;
    	
        int[] collection = new int[3];
        
        for(int i : nums){
        	collection[i]++;
        }
        
        int j = 0;
        int k = 0;
        while(j<3){
        	if(collection[j] != 0){
        		nums[k++] = j;
        		collection[j] -= 1;
        	}else
        		j++;
        }
     }
}
