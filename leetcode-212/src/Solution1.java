import java.util.ArrayList;
import java.util.List;

public class Solution1 {
	class Trie{
		Trie[] nodes;
		int level;
		Trie(){
			nodes = new Trie[26];
			level = -1;
		}
	}
	
    public List<String> findWords(char[][] board, String[] words) {
    	List<String> res = new ArrayList<String>();
        Trie root = new Trie();
        boolean visited[][] = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
        	for(int j = 0; j < board[0].length; j++){
//        		for(boolean[] b1 : visited){
//        			System.out.println();
//        			for(boolean b : b1){
//        				System.out.print(b?"True " : "False ");
//        			}
//        		}
//        		System.out.println();
//        		Trie node = root;
//        		node.nodes[board[i][j] - 'a'] = new Trie();
//        		node = node.nodes[board[i][j] - 'a'];
        		//visited[i][j] = true;
        		backtracking(board, visited, root, i, j);
        		//visited[i][j] = false;
        	}
        }
        for(int i = 0; i < 26; i++){
        	if(root.nodes[i] != null) System.out.print((char)(i + 'a'));
        }
        System.out.println();
        System.out.println("Cur lvl :  " + root.nodes[0].level);
        
        for(int i = 0; i < 26; i++){
        	if(root.nodes[0].nodes[i] != null) System.out.print((char)(i + 'a'));
        }
        System.out.println();
        System.out.println("Cur lvl :  " + root.nodes[0].nodes[0].level);
        
        for(int i = 0; i < 26; i++){
        	if(root.nodes[0].nodes[0].nodes[i] != null) System.out.print((char)(i + 'a'));
        }
        System.out.println();
        
        for(int i = 0; i < 26; i++){
        	if(root.nodes[0].nodes[0].nodes[1].nodes[i] != null) System.out.print((char)(i + 'a'));
        }
        System.out.println();
        
        for(String word : words){
        	Trie node = root;
        	int i = 0;
        	while(i < word.length()){
        		char c = word.charAt(i);
        		int index = c - 'a';
        		if(node.nodes[index] == null)
        			break;
        		else
        			node = node.nodes[index];
        		i++;
        	}
        	if(i == word.length() && !res.contains(word))
        		res.add(word);
        }
        return res;
    }
    int[][] steps = new int[][]{{0,1}, {0,-1}, {1,0}, {-1,0}};
    public void backtracking(char[][] board, boolean[][] visited, Trie node, int m, int n){
    	int curLvl = node.level + 1;
    	visited[m][n] = true;
    	int curIndex = board[m][n] - 'a';
		if(node.nodes[curIndex] == null) node.nodes[curIndex] = new Trie();
		Trie temp = node;
		node = node.nodes[curIndex];
		node.level = curLvl;
    	for(int[] step : steps){
    		int x = m + step[0], y = n + step[1];
    		if(x<0 || x>board.length-1 || y<0 || y>board[0].length-1 || visited[x][y])
    			continue;
    		//visited[x][y] = true;
    		
    		backtracking(board, visited, node, x, y);
    		
    		
    	}
    	visited[m][n] = false;
    	node = temp;
    }
}
