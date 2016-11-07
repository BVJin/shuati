
import java.util.List;


public class Test {
	public static void main(String args[]){
		BVjin bv = new BVjin();
		String d = "347";
		List<String> res = bv.letterCombinations(d);
		System.out.println(res.size());
		for(String s : res){
			System.out.println(s);
		}
	}
}
