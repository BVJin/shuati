import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BVjin {
    public List<List<Integer>> threeSum(int[] nums) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if(nums.length >= 3){
    		Arrays.sort(nums);
    		for(int i = 0; i < nums.length - 2; i++){
    			if(i == 0 || nums[i] > nums[i-1]){
	    			//the mid number
	    			int j = i + 1;;
	    			//tailer number
	    			int k = nums.length - 1;
	    			while(j < k){
	    				if(nums[i] + nums[j] + nums[k] == 0){
	    					ArrayList<Integer> al = new ArrayList<Integer>();
	    					al.add(nums[i]);
	    					al.add(nums[j]);
	    					al.add(nums[k]);
	    					res.add(al);
	    					//get rid of duplication
	    					j++;
	    					k--;
	    					//handle duplicated case
	    					while(j<k && nums[j] == nums[j-1])
	    						j++;
	    					while(j<k && nums[k] == nums[k+1])
	    						k--;
	    				}else{
	    					if(nums[i] + nums[j] + nums[k] < 0)
	    						j++;
	    					else
	    						k--;
	    				}
	    			}
    			}
    		}
    	}
    	return res;
    }
}
