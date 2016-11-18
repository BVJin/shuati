
public class Test {
	public static void main(String args[]){
		BVjin bv = new BVjin();
		
		String s = "[][]{}([])";
		
		System.out.println(bv.isValid(s));
	}
}
