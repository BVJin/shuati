import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomizedSet {
	Map<Integer, Integer> map;
	List<Integer> al;
	Random rand = new Random();
    /** Initialize your data structure here. */
    public RandomizedSet() {
    	map = new HashMap<Integer, Integer>();
    	al = new ArrayList<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
    	if(!al.contains(val)){
    		al.add(val);
    		map.put(val, al.size()-1);
    		return true;
    	}
    	return false;
    }
    
    //** IMPORTANT! remove last element of arraylist is o(1), otherwise it o(n)
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
    	if(al.contains(val)){
    		if(map.get(val) < al.size() - 1){
    			int cur = map.get(val);
    			int last = al.get(al.size()-1);
    			al.set(cur, last);
    			map.put(last, cur);
    		}
    		map.remove(val);
    		al.remove(al.size()-1);
    		return true;
    	}
    	return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
       return al.get(rand.nextInt(al.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */