
public class Test {
	public static void main(String args[]){
		Solution1 s = new Solution1();
		String ss = "3[a2[c3[d]]]ab10[c3[b]]";
		String res = s.decodeString(ss);
		System.out.println(res);
	}
}
