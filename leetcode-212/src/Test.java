
public class Test {
	public static void main(String args[]){
		Solution2 s = new Solution2();
		//char[][] board = new char[][]{{'b','b','a','a','b','a'},{'b','b','a','b','a','a'},{'b','b','b','b','b','b'},{'a','a','a','b','a','a'},{'a','b','a','a','b','b'}};
		char[][] board = new char[][]{{'a'}};
		//String[] words = new String[]{"abbbababaa"};
		String[] words = new String[]{"a"};
		for(String res : s.findWords(board, words)){
			System.out.print(res + " --> ");
		}
		System.out.println();
	}
}
