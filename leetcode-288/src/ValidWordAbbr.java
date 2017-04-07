import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ValidWordAbbr {
	List<String> words;
	HashMap<Integer, HashMap<Character, int[]>> map;
    public ValidWordAbbr(String[] dictionary) {
    	words = new ArrayList<String>();
        map = new HashMap<Integer, HashMap<Character, int[]>>();
        for(String s : dictionary){
        	if(s.length() < 3){
        		words.add(s);
        	}else{
        		int mid = s.substring(1, s.length()-1).length();
        		words.add(s);
        		if(!map.containsKey(mid)){
        			HashMap<Character,  int[]> m = new HashMap<Character,  int[]>();
        			int[] letters = new int[26];
        			letters[s.charAt(s.length()-1) - 'a']++;
        			m.put(s.charAt(0), letters);
        			map.put(mid, m);
        		}else{
        			HashMap<Character,  int[]> m = map.get(mid);
        			if(m.containsKey(s.charAt(0))){
        				int[] letters = m.get(s.charAt(0));
        				letters[s.charAt(s.length()-1) - 'a']++;
        			}else{
        				int[] letters = new int[26];
            			letters[s.charAt(s.length()-1) - 'a']++;
            			m.put(s.charAt(0), letters);;
        			}
        		}
        	}
        }
    }
    
    public boolean isUnique(String word) {
        if(word.length() < 3){
        	return word.contains(word);
        }else{
        	int mid = word.substring(1, word.length()-1).length();
        	if( map.containsKey(mid) && map.get(mid).containsKey(word.charAt(0))){
        		if(words.contains(word))
        			return map.get(mid).get(word.charAt(0))[word.charAt(word.length()-1) - 'a'] == 1;
        		return map.get(mid).get(word.charAt(0))[word.charAt(word.length()-1) - 'a'] == 0;
        	}
        	return true;
        }
    }
}
/**
 * Your ValidWordAbbr object will be instantiated and called as such:
 * ValidWordAbbr obj = new ValidWordAbbr(dictionary);
 * boolean param_1 = obj.isUnique(word);
 */