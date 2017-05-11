
public class Test {
	public static void main(String args[]){
		Solution s = new Solution();
		String[] input = {"This", "is", "an","at","example","justification.","of","text"};
		for(String ss: s.fullJustify(input, 18)){
			System.out.println(ss + "   --- >" + ss.length());
		}
	}
}
