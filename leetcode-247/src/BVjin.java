import java.util.List;
import java.util.ArrayList;

public class BVjin {
	String[] nums = {"0", "1", "6", "8", "9"};
    public List<String> findStrobogrammatic(int n) {
    	List<String> res = new ArrayList<String>();
    	StringBuffer sb = new StringBuffer();
    	for(int i = 0 ; i < n; i++){
    		sb.append("a");
    	}
    	helper(sb,res,0, n-1);
    	return res;
    }
    
    public void helper(StringBuffer cur, List<String> res, int index, int l){
    	if(index > l/2){
    		res.add(cur.toString());
    		return;
    	}
    		
    	for(int i = 0; i < nums.length; i++){
    		StringBuffer newCur = new StringBuffer(cur.toString());
    		if(index == l/2 && l%2 == 0){
    			if(nums[i] != "6" && nums[i] != "9"){
    				newCur.replace(index, index+1, nums[i]);
    				helper(newCur, res, index + 1, l);
    			}
    		}else{
    			if(nums[i] == "6"){
        			newCur.replace(index, index + 1, "6");
        			newCur.replace(l-index, l-index + 1, "9");
        			helper(newCur, res, index + 1, l);
        		}else if(nums[i] == "9"){
        			newCur.replace(index, index + 1, "9");
        			newCur.replace(l-index, l-index + 1, "6");
        			helper(newCur, res, index + 1, l);
        		}else if(index != 0 || (index == 0 && !nums[i].equals("0"))){
        			newCur.replace(index, index + 1, nums[i]);
        			newCur.replace(l-index, l-index + 1, nums[i]);
        			helper(newCur, res, index + 1, l);
        		}
    		}
    	}
    }
}
