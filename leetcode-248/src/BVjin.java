
public class BVjin {
	char[][] pairs = {{'0', '0'}, {'1', '1'}, {'6', '9'}, {'8', '8'}, {'9', '6'}};
    public int strobogrammaticInRange(String low, String high) {
        int[] count ={0};
        for(int i = low.length(), j = high.length(); i <= j; i++){
        	char[] c = new char[i];
        	dfs(low, high, count, c, 0, i-1);
        }
        //System.out.println(count);
        return count[0];
    }
    
    public void dfs(String low, String high, int[] count, char[] c, int left, int right){
    	if(left > right){
    		if((c.length == low.length() && low.compareTo(new String(c)) > 0) || 
    				(c.length == high.length() && high.compareTo(new String(c)) < 0)){
    			return;
    		}
    		count[0]++;
    		return;
    	}
    	
    	for(int i = 0; i < pairs.length; i++){
    		c[left] = pairs[i][0];
    		c[right] = pairs[i][1];
    		if(c.length != 1 && c[0] == '0'){
    			continue;
    		}
    		if(left == right && pairs[i][0] != pairs[i][1]){
    			continue;
    		}
    		dfs(low, high, count, c, left+1, right-1);
    	}
    	
    	
    }
}
