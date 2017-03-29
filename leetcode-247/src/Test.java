import java.util.List;

public class Test {
	public static void main(String args[]){
		BVjin bv = new BVjin();
		List<String> res = bv.findStrobogrammatic(5);
		for(String s : res){
			System.out.println(s);
		}
	}
}
