import java.util.List;

public class Test {
	public static void main(String args[]){
		BVjin bv = new BVjin();
		int[] nums = {1,2,3};
		List<List<Integer>> res = bv.subsets(nums);	
		for(List<Integer> al : res){
			System.out.println();
			for(int i : al){;
				System.out.print(i+" ");
			}
		}
	}
}
