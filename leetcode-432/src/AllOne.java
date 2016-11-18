import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class AllOne {
	Map<Integer, LinkedList<String>> keys;
	Map<String, Integer> map;
	int max, min;
    /** Initialize your data structure here. */
    public AllOne() {
        keys = new HashMap<Integer, LinkedList<String>>();
        map = new HashMap<String, Integer>();
        max = Integer.MIN_VALUE; 
        min = Integer.MAX_VALUE;
    }
    
    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
    	if(key == "") return;
    	int newVal = 1;
        if(map.containsKey(key)){
        	newVal = map.get(key) + 1;
        }
        map.put(key, newVal);
        System.out.println(newVal);
        if(!keys.containsKey(newVal)){
        	LinkedList<String> l = new LinkedList<String>();
        	l.add(key);
        	keys.put(newVal, l);
        }else{
        	LinkedList<String> newLvl = keys.get(newVal);
        	newLvl.add(key);
        	keys.put(newVal, newLvl);
        }
        if(newVal > max){
			max = newVal;
		}
       	if(newVal != 1){
    		LinkedList<String> oldLvl = keys.get(newVal - 1);
    		oldLvl.remove(key);
    		if(oldLvl.size() == 0 && min == newVal - 1){
    			min = newVal;
    		}
    		
    		keys.put(newVal - 1, oldLvl);
    	}else{
    		min = 1;
    	}
       	
    }
    
    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
    	if(key == "") return;
        if(map.containsKey(key)){
        	int newVal = map.get(key) - 1;
        	LinkedList<String> oldLvl = keys.get(newVal+1);
        	oldLvl.remove(key);
        	keys.put(newVal+1, oldLvl);
        	if(newVal != 0){
        		LinkedList<String> newLvl = keys.get(newVal);
        		newLvl.add(key);
        		keys.put(newVal, newLvl);
        		if(oldLvl.size() == 0 && max == newVal + 1){
        			max = newVal;
        		}
        		if(newVal < min){
        			min = newVal;
        		}
        	}else{
        		map.remove(key);
        	}
        }
    }
    
    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
    	System.out.println(max);
        return map.size() > 0?keys.get(max).peek():"";
    }
    
    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
    	return map.size() > 0?keys.get(min).peek():"";
    }
}