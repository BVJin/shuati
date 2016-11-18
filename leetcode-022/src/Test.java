
public class Test {
	public static void main(String[] args){
		BVjin bv = new BVjin();
		for(String s : bv.generateParenthesis(4)){
			System.out.println(s);
		}
	}
}
