import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int numIslands(char[][] grid) {
    	int res = 0;
    	int[][] dir = new int[][]{{-1,0}, {0, 1},{1,0}, {0, -1}};
    	if(grid == null || grid.length == 0 || grid[0].length == 0) return res;
    	int n = grid.length, m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        for(int i = 0; i < n; i++){
        	for(int j = 0; j < m; j++){
        		if(grid[i][j] == '1' && !visited[i][j]){
        			visited[i][j] = true;
        			Queue<int[]> q = new LinkedList<int[]>();
        			q.offer(new int[]{i, j});
        			while(!q.isEmpty()){
        				int[] cur = q.poll();
        				for(int[] d : dir){
        					int x = cur[0]+d[0], y=cur[1]+d[1];
        					if(x<0 || x>=n || y<0 || y>=m || visited[x][y] || grid[x][y] == '0')
        						continue;
        					visited[x][y] = true;
        					q.offer(new int[]{x, y});
        				}
        			}
        			res++;
        		}
        	}
        }
        return res;
        
    }
}
