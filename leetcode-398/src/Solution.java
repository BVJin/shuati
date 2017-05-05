import java.util.Random;

public class Solution {
	int[] nums;
	Random ran;
    public Solution(int[] nums) {
        this.nums = nums;
        ran = new Random();
    }
    
    public int pick(int target) {
    	int res = -1;
    	int count = 0;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] == target){
        		if(res == -1){
        			res = i;
        			count++;
        			continue;
        		}
        		if(ran.nextInt(count + 1) == count) res = i;
        		count++;
        	}
        }
        return res;
    }
}