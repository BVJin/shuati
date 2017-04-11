
public class Solution {
    public void gameOfLife(int[][] board) {
    	int[][] dirs = new int[][]{{-1,-1},{-1,0},{-1,1}, {0,1}, {1,1}, {1,0}, {1,-1}, {0,-1}};
        int m = board.length, n = board[0].length;
        //live to dead -1, dead to live 2
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		int count = 0;
        		for(int[] dir : dirs){
        			int x = i + dir[0];
        			int y = j + dir[1];
        			if(x < 0 || x>=m || y < 0 || y >= n) continue;
        			if(board[x][y] == -1 || board[x][y] == 1){
        				count++;
        			}
        		}
        		if(board[i][j] == 1){
        			board[i][j] = count < 2?-1:count==2||count==3?1:-1;
        		}else if(board[i][j] == 0){
        			board[i][j] = count == 3?2:0;
        		}
        	}
        }
        
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		if(board[i][j] == -1) board[i][j] = 0;
        		if(board[i][j] == 2) board[i][j] = 1;
        	}
        }
    }
}
