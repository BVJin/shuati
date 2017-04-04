import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public void wallsAndGates(int[][] rooms) {
        if(rooms == null || rooms.length == 0 || rooms[0].length == 0) return;
        
        int m = rooms.length, n = rooms[0].length;
        
        int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        for(int i = 0; i < m; i++){
        	for(int j = 0; j < n; j++){
        		if(rooms[i][j] == 0){
        			Queue<int[]> q = new LinkedList<int[]>();
        			q.offer(new int[]{i, j});
        			while(!q.isEmpty()){
        				int[] cur = q.poll();
        				for(int[] dir : dirs){
        					int x = cur[0] + dir[0];
        					int y = cur[1] + dir[1];
        					if(x<0 || x>=m || y<0 || y>=n || rooms[x][y] == -1 || rooms[x][y] == 0 || (rooms[cur[0]][cur[1]] + 1) > rooms[x][y])
        						continue;
        					rooms[x][y] = rooms[cur[0]][cur[1]] + 1;
        					q.offer(new int[]{x,y});
        				}
        			}
        		}
        	}
        }
        
    }
}
