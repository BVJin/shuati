import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new ArrayList<String>();
        if(nums.length == 0){
        	String s = upper - lower == 0? lower + "" : lower + "->" + upper;
        	res.add(s);
        	return res;
        }
        for(int i = 0; i<nums.length; i++){
        	if(nums[i] == lower){
        		lower++;
        	}else if(nums[i] > lower){
        		String s = nums[i] - 1 > lower? lower + "->" + (nums[i] - 1) : lower + "";
        		res.add(s);
        		System.out.println("before " + lower);
        		lower = nums[i] == Integer.MAX_VALUE?nums[i]:nums[i] + 1;
        	}
        	if(i == nums.length - 1 && nums[i] != upper){
        		String s = upper - 1 != nums[i]? (nums[i]+1) + "->" + upper : upper + ""; 
        		res.add(s);
        	}
        }
        return res;
    }
}
