

public class Test {
	public static void main(String args[]){
		//BVjin bv = new BVjin();
		Siqi si =  new Siqi();
		int[] a = {2,7,11,15};
		int target = 18;
		int[] result = si.twoSum(a, target);
		for(int i : result){
			System.out.print(i+" ");
		}
		
	}
}
