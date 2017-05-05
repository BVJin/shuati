import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BVjin {
	int[][] dirs = new int[][]{{1,0}, {0,1}, {-1,0}, {0,-1}};
	
    public int shortestDistance(int[][] grid) {
    	int res = Integer.MAX_VALUE;
    	int buildNum = 0;
        int m = grid.length, n = grid[0].length;
        ArrayList<int[]> queue = new ArrayList<int[]>();
        for(int i = 0; i < grid.length; i++){
        	for(int j = 0; j < grid[0].length; j++){
        		if(grid[i][j] == 1){
        			queue.add(new int[]{i,j});
        			buildNum++;
        		}
        		grid[i][j] = -grid[i][j];
        	}
        }
        System.out.println();
        
        for(int i = 0; i<queue.size(); i++){
        	int[] cur = queue.get(i);
        	int reachBuilding = 0;
        	boolean[][] visited = new boolean[m][n];
        	int[][] dist = new int[m][n];
        	Queue<int[]> q = new LinkedList<int[]>();
        	q.add(cur);
        	boolean ifReach = false;
        	while(!q.isEmpty()){
        		int[] node = q.poll();
        		for(int[] dir : dirs){
        			int x = dir[0] + node[0];
        			int y = dir[1] + node[1];
        			
        			if(x<0 || x >= m || y < 0 || y >= n || grid[x][y] == -1 || grid[x][y] == -2 || visited[x][y]){
        				System.out.println("x y = " + x +" " + y);
        				if(x == 0 && y == 0) System.out.println(grid[x][y] + " " + visited[x][y]);
        				if(x>=0  && x < m && y >= 0 && y < n && grid[x][y] == -1 && !visited[x][y]){
        					reachBuilding++;
        					visited[x][y] = true;
        				}
        				continue;
        			}
        			ifReach = true;
        			visited[x][y] = true;
        			dist[x][y] = grid[node[0]][node[1]] == -1?1:dist[node[0]][node[1]]+1;
        			grid[x][y] += dist[x][y];
        			
        			q.offer(new int[]{x, y});
        		}
        	}
        	System.out.println(buildNum + " " + reachBuilding);
        	if(!ifReach || reachBuilding != buildNum) return -1;

         	System.out.println("============");
        	 for(int k = 0; k < grid.length; k++){
             	for(int j = 0; j < grid[0].length; j++){
             		System.out.print(grid[k][j] + " ");
             	}
             	System.out.println();
             }
        	 System.out.println("============");
        }
        
        for(int i = 0; i < grid.length; i++){
        	System.out.println();
        	for(int j = 0; j < grid[0].length; j++){
        		System.out.print(grid[i][j] + " ");
        		if(grid[i][j] > 0)
        			res = Math.min(res, grid[i][j]);
        	}
        }
        System.out.println();
        
        return res;
    }
    
}
