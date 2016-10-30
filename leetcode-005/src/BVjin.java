
public class BVjin {
    public String longestPalindrome(String s) {
        //find the longest common substring of s and reversed s
    	int start=0, end=0, max=0, l = s.length();
    	int[][] res = new int[l][l];
    	
    	for(int i=0;i<l;i++){
    		for(int j=0; j<l;j++){
	    		if(s.charAt(i) == s.charAt(l-j-1) ){
	
	    			if(i==0 || j==0){
	    				res[i][j] = 1;
	    			}else{
	    				res[i][j] = res[i-1][j-1] + 1;
 	    			}
	    			
	    			//if the first char of reversed string's original index equal with the last char
	    			//of original string, then the Palindromic Substring is valid
	    			//original calculation = (l-1)-(j-max+1)
	    			if(max < res[i][j] && l-2+res[i][j]-j == i){	
	    				max = res[i][j];
	    				start = i-max+1;
	    				end = i;
	    			}
	    		}
    		}
    	}
    	return s.substring(start, end+1);
    	
    }
}
