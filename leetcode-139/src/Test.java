import java.util.HashSet;
import java.util.Set;

public class Test {
	public static void main(String args[]){
		BVjin bv = new BVjin();
		String s = "leetcode";
		Set<String> dict = new HashSet<String>();
		dict.add("leet");
		dict.add("code");
		System.out.println(bv.wordBreak(s, dict));
	}
}
