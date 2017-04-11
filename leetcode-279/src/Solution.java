import java.util.Arrays;

public class Solution {
    public int numSquares(int n) {
    	int[] dp = new int[n+1];
    	Arrays.fill(dp, Integer.MAX_VALUE);
        for(int i = 1; i<=n; i++){
        	if(i*i <= n){
        		dp[i*i] = 1;
        	}
        	for(int j = 1; j*j<i;j++){
        		if(dp[i] == 1) break;
        		if(i == 13){
        			System.out.println(i-j*j + " --> " + dp[i-j*j]);
        			//System.out.println();
        		}
        		dp[i] = Math.min(dp[i-j*j]+1, dp[i]);
        	}
        	
        }
        
        return dp[n];
    }
}