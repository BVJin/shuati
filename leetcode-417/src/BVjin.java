import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BVjin {
	int[][] dir = new int[][]{{-1,0}, {0, 1}, {1, 0}, {0, -1}};
    public List<int[]> pacificAtlantic(int[][] matrix) {
     List<int[]> res = new ArrayList<int[]>();
     if(matrix.length == 0 || matrix[0].length == 0) return res;
     int n = matrix.length, m = matrix[0].length;
     boolean pacific[][] = new boolean[n][m];
     boolean atlantic[][] = new boolean[n][m];
     Queue<int[]> pq = new LinkedList<int[]>();
     Queue<int[]> aq = new LinkedList<int[]>();
     
     //vertical
     for(int i = 0; i < n; i++){
    	 pacific[i][0] = true;
    	 atlantic[i][m - 1] = true;
    	 pq.offer(new int[]{i, 0});
    	 aq.offer(new int[]{i, m -1});
     };
     
     for(int i = 0; i < m; i++){
    	 pacific[0][i] = true;
    	 atlantic[n-1][i] = true;
    	 pq.offer(new int[]{0, i});
    	 aq.offer(new int[]{n - 1, i});
     }
     
     //horizontal
     bfs(matrix, pq, pacific);
     bfs(matrix, aq, atlantic);
     
     for(int i = 0; i < n; i++){
    	 for(int j = 0; j < m; j++){
    		 if(pacific[i][j] && atlantic[i][j]){
    			 res.add(new int[]{i ,j});
    		 }
    	 }
     }
     
     return res;
    }
    
    public void bfs(int[][] matrix, Queue<int[]> q, boolean[][] ocean){
    	int n = matrix.length, m = matrix[0].length;
    	while(!q.isEmpty()){
    		int[] cur = q.poll();
    		for(int[] d : dir){
    			int x = cur[0] + d[0];
    			int y = cur[1] + d[1];
    			if(x<0 || x>=n || y < 0 || y >=m || ocean[x][y] || matrix[x][y] < matrix[cur[0]][cur[1]]){
    				continue;
    			}
    			ocean[x][y] = true;
    			q.offer(new int[]{x, y});
    		}
    	}
    }
}
