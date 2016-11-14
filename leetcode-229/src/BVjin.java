import java.util.ArrayList;
import java.util.List;


public class BVjin {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        int count1 = 0;
        int count2 = 0;
        Integer n1 = null;
        Integer n2 = null;
        
        for(int i : nums){
        	if(n1!=null && i == n1.intValue()){
        		count1++;
        	}else if(n2!=null && i == n2.intValue()){
        		count2++;
        	}else if(count1 == 0){
        		n1 = i;
        		count1 = 1;
        	}else if(count2 == 0){
        		n2 = i;
        		count2 = 1;
        	}else{
        		count1--;
        		count2--;
        	}
        }
        
        count1 = count2 = 0;
        
        for(int i:nums){
        	if(i == n1.intValue()) count1++;
        	else if(i == n2.intValue()) count2++;
        }
        
        if(count1 > nums.length/3)
        	res.add(n1);
        if(count2 > nums.length/3)
        	res.add(n2);
        
        return res;
    }
}
