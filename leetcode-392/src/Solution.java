
public class Solution {
    public boolean isSubsequence(String s, String t) {
        int res = 0;
        for(int i = 0; i < t.length(); i++){
        	if(res == s.length()) return true;
        	
        	if(s.charAt(res) == t.charAt(i))
        		res++;
        }
        return res == s.length();
    }
}
