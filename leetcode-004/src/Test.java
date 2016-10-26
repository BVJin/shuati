
public class Test {
	public static void main(String args[]){
		int[] a = {3,4};
		int[] b = {1,2};
		BVjin bv = new BVjin();
		double d = bv.findMedianSortedArrays(a, b);
		System.out.print(d);
		
	}
}
