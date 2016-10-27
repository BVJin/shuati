import java.util.HashMap;

public class Siqi {
    public int[] twoSum(int[] nums, int target) {
    	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	int[] result = new int[2];
    	
    	for(int i = 0; i < nums.length; i++){
    		if(map.get(target - nums[i]) != null){
    			result[1] = i;
    			result[0] = map.get(target - nums[i]);
    			break;
    		}
    		else{
    			map.put(nums[i], i);
    		}
    	}
       return result; 
    }
}