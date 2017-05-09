import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        List<String> res = new ArrayList<String>();
        if(words.length == 0) return res;
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(String word : words){
        	for(int i = 0; i < board.length; i++){
        		for(int j = 0; j < board[0].length; j++){
        			if(word.charAt(0) == board[i][j]){
        				//System.out.println(word);
        				if(res.contains(word)) continue;
        				if(word.length() == 1){
        					res.add(word);
        				}
        				if(word.length() > 1){
//        					System.out.println(word + " ");
//        					for(boolean[] b: visited){
//        						System.out.println();
//        						for(boolean b1 : b){
//        							System.out.print(b1?"true " : "false ");
//        						}
//        					}
        					visited[i][j] = true;
        					backtracking(res, board, visited, word, 1, i, j);
        					visited[i][j] = false;
        				}
        			}
        		}
        	}
        }
        return res;
    }
    int[][] steps = new int[][]{{0,1}, {0, -1}, {1, 0}, {-1, 0}};
    public void backtracking(List<String> res, char[][] board, boolean[][] visited, String word, int index, int m, int n){
    	if(index > word.length() - 1) return;
    	for(int[] step : steps){
    		int x = m + step[0];
    		int y = n + step[1];
    		if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || visited[x][y])
    			continue;
    		visited[x][y] = true;
    		if(board[x][y] == word.charAt(index)){
    			if(index == word.length() - 1 && !res.contains(word)){
    				res.add(word);
    				visited[x][y] = false; 
    				return;
    			}
    			backtracking(res, board, visited, word, index + 1, x, y);
    		}
    		visited[x][y] = false;    		
    	}
    }
}
