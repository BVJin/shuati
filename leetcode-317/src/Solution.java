import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int shortestDistance(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dirs = new int[][]{{1,0}, {0,1}, {-1,0}, {0,-1}};
        int[][] buildings = new int[m][n];
        int[][] dist = new int[m][n];
        int buildingNum = 0;
        
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		if(grid[i][j] == 1){
        			buildingNum++;
        			int curDist = 1;
        			boolean[][] visited = new boolean[m][n];
        			Queue<int[]> queue = new LinkedList<int[]>();
        			queue.offer(new int[]{i,j});
        			while(!queue.isEmpty()){
        				int size = queue.size();
        				for(int q = 0; q < size; q++){
        					int[] cur = queue.poll();
        					for(int[] dir: dirs){
            					int x= cur[0] + dir[0];
            					int y = cur[1] + dir[1];
            					if(x < 0 || x >= m || y < 0 || y >=n || grid[x][y] == 1 || grid[x][y] == 2 || visited[x][y])
            						continue;
            					buildings[x][y]++;
            					visited[x][y] = true;
            					dist[x][y] += curDist;
            					queue.offer(new int[]{x, y});
            				}
        				}
        				curDist++;
        			}
        		} 		
        	}
        }
        
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		if(buildings[i][j] == buildingNum && grid[i][j] == 0)
        			res = Math.min(dist[i][j], res);
        	}
        }
        
        return res == Integer.MAX_VALUE? -1:res;
        
        
    }
}
