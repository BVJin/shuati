import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	class Trie{
		Trie[] nodes;
		String word;
		Trie(){
			nodes = new Trie[26];
			word = "";
		}
	}
	
	public List<String> findWords(char[][] board, String[] words) {
		List<String> res = new ArrayList<String>();
		boolean[][] visited = new boolean[board.length][board[0].length];
		Trie root = new Trie();
		buildTree(words, root);
		for(int i = 0; i < board.length; i++){
			for(int j = 0; j < board[0].length; j++){
				backtracking(board, visited, res, root, i, j);
			}
		}
//		for(int i = 0; i < 26; i++){
//        	if(root.nodes[i] != null){
//        		System.out.print((char)(i + 'a'));
//        		System.out.print(" " + root.nodes[i].word);
//        	}
//        }
//        System.out.println();
		return res;
	}
	
	public void buildTree(String[] words, Trie root){
		for(String word : words){
			Trie node = root;
			for(char c : word.toCharArray()){
				int index = c - 'a';
				if(node.nodes[index] == null) node.nodes[index] = new Trie();
				node = node.nodes[index];
			}
			node.word = word;
		}
	}
	
	int[][] steps = new int[][]{{0,1}, {0,-1}, {1,0}, {-1,0}};
	
	public void backtracking(char[][] board, boolean[][] visited, List<String> res, Trie root, int m, int n){
	    
	    char c = board[m][n];
	    if(visited[m][n] || root.nodes[c-'a'] == null) return;
		root = root.nodes[c - 'a'];
		if(root != null && root.word.length() > 0){
			res.add(root.word);
			root.word = "";
		}
		visited[m][n] = true;
		for(int[] step : steps){
			int x = m + step[0], y = n + step[1];
			if(x<0 || x>board.length - 1 || y<0 || y>board[0].length - 1 || visited[x][y])
				continue;
			backtracking(board, visited, res, root, x, y);
		}
		visited[m][n] = false;
	}
}
