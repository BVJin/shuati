import java.util.ArrayList;
import java.util.HashMap;

public class WordDistance {
	HashMap<String, ArrayList<Integer>> map;
    public WordDistance(String[] words) {
    	map = new HashMap<String, ArrayList<Integer>>();
        for(int i = 0; i < words.length; i++){
        	if(map.containsKey(words[i])){
        		map.get(words[i]).add(i);
        	}else{
        		ArrayList<Integer> al = new ArrayList<Integer>();
        		al.add(i);
        		map.put(words[i], al);
        	}
        }
    }
    
    public int shortest(String word1, String word2) {
    	ArrayList<Integer> w1 = map.get(word1);
    	ArrayList<Integer> w2 = map.get(word2);
    	int res = Integer.MAX_VALUE;
    	int i = 0, j = 0;
    	while(i < w1.size() && j < w2.size()){
    		res = Math.min(res, Math.abs(w1.get(i) - w2.get(j)));
    		if(w1.get(i) > w2.get(j)){
    			j++;
    		}else{
    			i++;
    		}
    	}
    	return res;
    }
}

/**
 * Your WordDistance object will be instantiated and called as such:
 * WordDistance obj = new WordDistance(words);
 * int param_1 = obj.shortest(word1,word2);
 */