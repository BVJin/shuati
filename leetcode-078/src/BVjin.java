import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//another solution is bit mainpulation, skip for now! will be back LOL
public class BVjin {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        res.add(al);
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
        	if(i!=0 && nums[i]==nums[i-1]){
        		i++;
        		continue;
        	};
        	int size = res.size();
        	for(int j = 0; j<size; j++){
        		System.out.println(j);
        		ArrayList<Integer> temp = new ArrayList<Integer>(res.get(j));
        		temp.add(nums[i]);
        		if(!res.contains(temp)){
        			System.out.println(temp);
        			res.add(temp);
        		}
        	}
        }
        return res;
    }
}
