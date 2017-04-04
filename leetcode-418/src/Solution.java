
public class Solution {
    public int wordsTyping(String[] sentence, int rows, int cols) {
        String s = String.join(" ", sentence) + " ";
        int start = 0;
        for(int i = 0; i < rows; i++){
        	start += cols;
        	if(s.charAt(start % s.length()) == ' '){
        		start++;
        	}else{
        		while(start > 0 && s.charAt((start-1) % s.length()) != ' '){
        			start--;
        		}
        	}
        }
        
        return start / s.length();
    }
}
