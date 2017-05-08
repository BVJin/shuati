import java.util.HashMap;
import java.util.TreeSet;


public class Solution1 {
    public boolean isSubsequence(String s, String t) {
    	HashMap<Character, TreeSet<Integer>> map = new HashMap<Character, TreeSet<Integer>>();
    	for(int i = 0; i < t.length(); i++){
    		char c = t.charAt(i);
    		if(!map.containsKey(c)){
    			TreeSet<Integer> tree = new TreeSet<Integer>();
    			map.put(c, tree);
    		}
    		map.get(c).add(i);
    	};
    	int lastIndex = -1;
    	for(int i = 0; i < s.length(); i++){
    		char c = s.charAt(i);
    		if(map.containsKey(c) && map.get(c).size() > 0){
    			if(map.get(c).higher(lastIndex) == null)
    				return false;
    			else
    				lastIndex = map.get(c).higher(lastIndex);
    		}else
    			return false;
    	}
    	
    	return true;
    }
}
