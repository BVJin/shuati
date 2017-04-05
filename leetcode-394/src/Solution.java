

public class Solution {
    public String decodeString(String s) {
        String res = dfs(s, new int[]{0}, 0, "");
        return res;
    }
    
    public String dfs(String s, int[] curIndex, int curTimes, String curS){
    	String roundS = "";
    	while(curIndex[0] < s.length()){
    		char c = s.charAt(curIndex[0]);
    		curIndex[0] = curIndex[0] + 1;
    		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
    			roundS += c;
    		}else if(c >= '0' && c <= '9'){
    			String num = c + "";
    			while(curIndex[0]  < s.length() && Character.isDigit(s.charAt(curIndex[0]))){
    				char n = s.charAt(curIndex[0]);
    				curIndex[0]++;
					num += n;
    			}
    			roundS = dfs(s, curIndex, Integer.parseInt(num), roundS);
    		}else if(c == '['){
    			continue;
    		}else if(c == ']'){
    			String temp = roundS;
    			for(int j = 0; j < curTimes - 1; j++){
    				roundS += temp;
    			}
//    			System.out.println(curTimes - 1);
//    			System.out.println(roundS);
    			break;
    		}
    	}
    	return curS+roundS;
    	
    }
}
