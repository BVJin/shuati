import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        List<Integer> res= new ArrayList<Integer>();
        if(m==0 || n == 0 || positions == null || positions.length == 0 || positions[0].length == 0)
        	return res;
        int count = 0;
        int[][] dirs = new int[][]{{-1,0}, {0, 1},{1,0}, {0, -1}};
        int[] roots = new int[n * m];
        Arrays.fill(roots, -1);
        for(int[] p : positions){
        	int root = p[0] * n + p[1];
        	roots[root] = root;
        	count++;
        	
        	for(int[] d : dirs){
        		int x = p[0] + d[0];
        		int y = p[1] + d[1];
        		int nr = x * n + y;
        		if(x<0 || x>=m || y<0 || y>=n|| roots[nr] == -1) continue;
        		int rootNr = findFather(roots, nr);
        		if(root != rootNr){
        			roots[root] = rootNr;
        			root = rootNr;
        			count--;
        		} 		
        	}
        	
        	res.add(count);
        }
        
        return res;
    }
    
    public int findFather(int[] roots, int index){
    	while(index != roots[index]){
    		roots[index] = roots[roots[index]];
    		index = roots[index];	
    	}
    	return index;
    }
}
