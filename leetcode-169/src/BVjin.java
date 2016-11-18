
public class BVjin {
    public int majorityElement(int[] nums) {
        int count = 0;
        int res = 0;
        for(int i : nums){
        	if(count == 0){
        		res = i;
        		count = 1;
        	}else if(i == res){
        		count++;
        	}else{
        		count--;
        	}
        }
        return res;
    }
}
