import java.util.Arrays;
import java.util.Set;

public class BVjin {
   public boolean wordBreak(String s, Set<String> wordDict) {
        boolean[] b = new boolean[s.length() + 1];
        Arrays.fill(b, false);
        b[0] = true;
        
        for(int i = 0; i < s.length(); i++){
        	if(b[i]){
        		for(int j = i+1; j< s.length()+1; j++){
        			if(wordDict.contains(s.substring(i, j))){
        				b[j] = true;
        			}
        		}
        	}
        }
        
        return b[s.length()];
    }
}
