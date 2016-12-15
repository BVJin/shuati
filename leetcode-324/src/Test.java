
public class Test {
	public static void main(String args[]){
		BVjin bv = new BVjin();
		int[] temp = {1,5,1,1,6,4};
		bv.wiggleSort(temp);
		for(int i : temp){
			System.out.print(i + " ");
		}
		
	}
}
