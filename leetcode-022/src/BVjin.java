import java.util.ArrayList;
import java.util.List;


public class BVjin {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        dfs(res,"", n, n);
        return res;
    }
    
    public void dfs(List<String> res, String s, int left, int right){
    	if(left > right)
    		return;
    	
    	if(left==0 && right==0)
    		res.add(s);
    	
    	if(left > 0)
    		dfs(res, s+"(", left-1, right);
    	
    	if(right > 0)
    		dfs(res, s+")", left, right-1);
    }
}
