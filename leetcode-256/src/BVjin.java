import java.util.Arrays;


public class BVjin {
    public int threeSumSmaller(int[] nums, int target) {
        int res = 0;
        Arrays.sort(nums);
        if(nums.length > 2){
        	for(int i=0;i<nums.length-2;i++){
        		//left
        		int j = i+1;
        		//right
        		int k = nums.length - 1;
        		while(j<k){
        			//stop moving k since the elements on the left of current k will be less than nums[k]
	        		if(nums[i]+nums[j]+nums[k]<target){
	        			res += k-j;
	        			//move j
	        			j++;
	        		}else{
	        			k--;
	        		}
        		}
        	}
        }
        return res;
    }
}
