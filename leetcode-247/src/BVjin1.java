import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BVjin1 {
    public List<String> findStrobogrammatic(int n) {
        return helper(n, n);
    }
    
    public List<String> helper(int left, int n){
    	if(left == 0) return new ArrayList<String>(Arrays.asList(""));
    	if(left == 1) return new ArrayList<String>(Arrays.asList("0", "1", "8"));
    	
    	List<String> l = helper(left-2, n);
    	
    	List<String> res = new ArrayList<String>();
    	
    	for(String s : l){
    		if( left != n)
    			res.add("0" + s + "0");
    		res.add("1" + s + "1");
    		res.add("6" + s + "9");
    		res.add("8" + s + "8");
    		res.add("9" + s + "6");
    	}
    	
    	return res;
    }
}
