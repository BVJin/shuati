import java.util.ArrayList;

public class BVjin {
	int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};
	
    public int shortestDistance(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dist = new int[m][n];
        int res = Integer.MAX_VALUE;
        ArrayList<Tuple> al = new ArrayList<Tuple>();
        for(int i = 0; i < grid.length; i++){
        	for(int j = 0; j < grid.length; j++){
        		if(grid[i][j] == 1){
        			Tuple t = new Tuple(i, j, 0);
        			al.add(t);
        		}
        		//for detecting visited
        		grid[i][j] = -grid[i][j];
        	}
        }
    }
    
    class Tuple{
    	public int x, y, dist;
    	public Tuple(int y, int x, int dist){
    		this.y = y;
    		this.x = x;
    		this.dist = dist;
    	}
    }
}
