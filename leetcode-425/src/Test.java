import java.util.List;

public class Test {
	public static void main(String args[]){
		Solution1 s = new Solution1();
		String[] beta = new String[]{"area","lead","wall","lady","ball"};
		long startTime = System.currentTimeMillis();
		List<List<String>> res = s.wordSquares(beta);
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		for(List<String> al : res){
			for(String ss : al){
				System.out.print(ss+" ");
			}
			System.out.println();
		}
	}
}
