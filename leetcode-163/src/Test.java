import java.util.List;

public class Test {
	public static void main(String args[]){
		Solution bv = new Solution();
		int[] test = new int[]{-2147483648,-2147483648,0,2147483647,2147483647};
		List<String> res = bv.findMissingRanges(test, -2147483648, 2147483647);
		for(String s : res){
			System.out.print(s + " ");
		}
	}
}
