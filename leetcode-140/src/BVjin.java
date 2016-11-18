import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class BVjin {
    public List<String> wordBreak(String s, Set<String> wordDict) {
    	List<String> res = new ArrayList<String>();
    	List<String>[] dp = new ArrayList[s.length() + 1];
    	dp[0] = new ArrayList<String>();
    	for(int i = 0; i<s.length(); i++){
    		if(dp[i] != null){
    			for(int j = i + 1; j < s.length()+1; j++){
    				if(wordDict.contains(s.substring(i,j))){
    					if(dp[j]==null){
                            ArrayList<String> list = new ArrayList<String>();
                            list.add(s.substring(i,j));
                            dp[j]=list;
                        }else{
                            dp[j].add(s.substring(i,j));
                        }
    				}
    			}
    		}
    	}
    	
    	if(dp[s.length()] == null){
    		return new ArrayList<String>();
    	}else{
    		helper(dp, res, "", s.length());
    		return res;
    	}
    	
    }
   
    public void helper(List<String>[] dp, List<String> res, String cur, int index){
    	if(index==0){
    		res.add(cur.trim());
            return;
        }
     
        for(String s: dp[index]){
            String combined = s + " "+ cur;
            helper(dp, res, combined, index-s.length());
        }
    }
}
