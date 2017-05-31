import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
    	LinkedList<String> curLine = new LinkedList<String>();
        List<String> res = new ArrayList<String>();
        int curLen = 0;
        int index = 0;
        int curWordLen = 0;
        while(index < words.length){
        	String word = words[index];
        	if(curLen + word.length() <= maxWidth){
        		curLine.add(word);
        		curLen += word.length() + 1; // at least one white space
        		curWordLen += word.length();
        		index++;
        		if(index >= words.length)
        			res.add(formatWords(curLine, maxWidth, curWordLen, true));
        	}else{
        		res.add(formatWords(curLine, maxWidth, curWordLen, false));
        		curLen = 0;
        		curWordLen = 0;
        		curLine.clear();
        	}
        }
        
        return res;
        
    }
    
    public String formatWords(LinkedList<String> curLine, int maxWidth, int wordLen, boolean isLast){
    	String res = "";
    	int count = curLine.size();

    	
    	//one word, just do left justification
    	if(count == 1 || isLast){
    		for(int i = 0; i < curLine.size(); i++){
    			String word = i == curLine.size() - 1? curLine.get(i) : curLine.get(i) + " ";
    			res += word;
    		}
    		int curLen = res.length();
    		for(int i = 0; i < maxWidth - curLen; i++){
    			res += " ";
    		}
    		return res;
    	}else{
    		int[] whiteSpace = new int[count];
    		int base = (maxWidth-wordLen) / (count - 1);
    		Arrays.fill(whiteSpace, base);
    		whiteSpace[0] = 0; //first word doesn't have whitespace prefix
    		int left = (maxWidth-wordLen) % (count - 1);
    		//System.out.println(base + " " + left);
    		for(int i = 1; i <= left; i++){
    			whiteSpace[i] += 1;
    		}
    		for(int i = 0; i < count; i++){
    			for(int j = 0; j < whiteSpace[i]; j++){
    				res += " "; //white space prefix
    			}
    			res += curLine.poll();
    		}
    		return res;
    	}
    }
}
