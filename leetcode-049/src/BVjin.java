import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class BVjin {
    public List<List<String>> groupAnagrams(String[] strs) {
    	List<List<String>> res = new ArrayList<List<String>>();
    	Map<String, List<String>> map = new HashMap<String, List<String>>();
    	for(String s : strs){
    		char[] chars = s.toCharArray();
    		Arrays.sort(chars);
    		String sorted = new String(chars);
    		if(map.containsKey(sorted)){
    			List<String> target = map.get(sorted);
    			target.add(s);
    		}else{
    			ArrayList<String> al = new ArrayList<String>();
    			al.add(s);
    			map.put(sorted, al);
    		}
    	}
    	for(String key : map.keySet()){
    		res.add(map.get(key));
    	}
    	
    	return res;
    	//this is good
//    	for(String key: map.keySet()) {
//    		Collections.sort(map.get(key));
//    	}
//    	return new ArrayList<List<String>>(map.values());
    }
}
