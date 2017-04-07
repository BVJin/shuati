
public class Test {
	public static void main(String[] args){
		Solution bv = new Solution();
		int[][]  i = new int[][]{{1,0,2,0,1},{0,0,0,0,0},{0,0,1,0,0}};
		int res = bv.shortestDistance(i);
		System.out.println(res);
	}
}
