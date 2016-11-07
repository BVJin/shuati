import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;


public class BVjin {
	
	class Pair{
		int a, ai, b, bi;
		public Pair(int a, int ai, int b, int bi){
			this.a = a;
			this.ai = ai;
			this.b = b;
			this.bi = bi;
		}
		
		boolean same(Pair p){
			return p != null && p.a == a && p.b == b;
		}
	}
	
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	if(nums.length < 3) return res;
    	Arrays.sort(nums);
    	//Treemap to store the pair
    	TreeMap<Integer, List<Pair>> map = new TreeMap<Integer, List<Pair>>();
    	//grab all the pair, and since tree map instersection take O(logN) time complexity
    	//so it is O(n^2logn)
    	for(int i = 0; i < nums.length; i++){
    		for(int j=i+1; j < nums.length; j++){
    			int sum = nums[i] + nums[j];
    			List<Pair> temp;
    			if(map.containsKey(sum)){
    				temp = map.get(sum);
    				temp.add(new Pair(nums[i],i,nums[j],j));
    			}else{
    				temp = new ArrayList<Pair>();
    				temp.add(new Pair(nums[i],i,nums[j],j));
    				map.put(sum, temp);
    			}
    		}
    	}
    	
    	//now 4sum = 2sum + 2sum and handle duplication
    	Integer start = map.firstKey();
    	Integer end = map.lastKey();
    	while(start != null && end != null && start <= end){
    		if(start + end < target){
    			start = map.higherKey(start);
    		}else if(start + end > target){
    			end = map.lowerKey(end);
    		//if start equals end, careful for duplication
    		//The only case that the list have four same number, otherwise the quadruplets
    		//will be counted at the next condition
    		}else if(start == end){
    			List<Pair> al = map.get(start);
    			for(int i = 0; i< al.size(); i++){
    				Pair p = al.get(i);
    				if(p.a == p.b){
    					for(int j=i+1; j<al.size(); j++){
    						Pair p1 = al.get(j);
    						if(p1.a == p1.b){
    							if(p.bi < p1.ai){
    								res.add(Arrays.asList(new Integer[]{p.a, p.b, p1.a, p1.b}));
    								break;
    							}
    						}else{
    							break;
    						}
    					}
    					break;
    				}
    			}
    			end = map.lowerKey(end);
    			start = map.higherKey(start);
    		//if start not equal end and match the target
    		}else{
    			Pair lastStart = null;
    			List<Pair> first = map.get(start);
    			for(Pair a : first){
    				if(a.same(lastStart))
    					continue;
    				lastStart = a;
    				Pair lastEnd = null;
    				List<Pair> last = map.get(end);
    				for(Pair b : last){
    					if(b.ai > a.bi){
    						if(b.same(lastEnd))
        						continue;
    						lastEnd = b;
    						res.add(Arrays.asList(new Integer[]{a.a, a.b, b.a, b.b}));
    					}				
    				}
    			}
    			end = map.lowerKey(end);
                start = map.higherKey(start);
    		}
    	}
    	return res;
    }
}
