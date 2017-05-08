import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean wordPatternMatch(String pattern, String str) {
        if(pattern == null || str == null) return false;
        Map map = new HashMap();
        Set set = new HashSet();
        return backtracking(map, set, 0, pattern, 0, str);
        
    }
    
    public boolean backtracking(Map map, Set set, int i, String pattern, int j, String str){
    	if(i == pattern.length() && j == str.length()) return true;
    	if(i == pattern.length() || j == str.length()) return false;
    	
    	char c = pattern.charAt(i);
    	
    	if(map.containsKey(c)){
    		String s = (String) map.get(c);
    		
    		if(!str.startsWith(s, j)){
    			return false;
    		}
    		
    		return backtracking(map, set, i+1, pattern, j + s.length(), str);
    	}
    	
    	for(int k = j; k < str.length(); k++){
    		String s = str.substring(j, k+1);
    		
    		if(set.contains(s)) continue;
    		
    		map.put(c, s);
    		set.add(s);
    		
    		if(backtracking(map, set, i + 1, pattern, k + 1, str)){
    			return true;
    		}
    		
    		map.remove(c);
    		set.remove(s);
    		
    	}
    	
    	return false;
    }
}
