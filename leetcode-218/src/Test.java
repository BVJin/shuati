
public class Test {
	public static void main(String agrs[]){
		Solution s = new Solution();
		int[][] i = new int[][]{{1,2,1},{1,2,2},{1,2,3}};
		//int[][] i = new int[][]{{2,9,10},{3,7,15},{5,12,12},{15,20,10},{19,24,8}};
		for(int[] b : s.getSkyline(i)){
			
			for(int j : b){
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
}
