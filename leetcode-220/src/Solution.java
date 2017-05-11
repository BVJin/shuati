import java.util.TreeMap;

public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeMap<Long, Integer> tree = new TreeMap<Long, Integer>();
        for(int i = 0; i < nums.length; i++){
        	long most = (long)nums[i] + t + 1;
        	long least = (long)nums[i] - t - 1;
        	//System.out.println("most = " + most + " least = " + least);
        	while(tree.lowerKey(most) != null && tree.lowerKey(most) - nums[i] >= 0){
        		//System.out.println("Most");
        		int index = tree.get(tree.lowerKey(most));
        		//System.out.println(index + " " + i);
        		if(i - index <= k)
        			return true;
        		else
        			most = tree.lowerKey(most);
        	}
        	
        	while(tree.higherKey(least) != null && nums[i] - tree.higherKey(least) >= 0){
        		//System.out.println("Least");
        		int index = tree.get(tree.higherKey(least));
        		if(i - index <= k)
        			return true;
        		else
        			least = tree.higherKey(least);
        	}
        	tree.put((long)nums[i], i);
        }
        return false;
    }
}
