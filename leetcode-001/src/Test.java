

public class Test {
	public static void main(String args[]){
		BVjin bv = new BVjin();
		int[] a = {2,7,11,15};
		int target = 18;
		int[] result = bv.twoSum(a, target);
		for(int i : result){
			System.out.print(i+" ");
		}
		
	}
}
