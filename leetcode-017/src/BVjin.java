import java.util.LinkedList;
import java.util.List;


public class BVjin {
    public List<String> letterCombinations(String digits) {
    	LinkedList<String> res = new LinkedList<String>();
    	if(digits.length() > 0){
	        res.add("");
	        String[] s = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	        for(int i = 0; i<digits.length(); i++){
	        	int curNum = Character.getNumericValue(digits.charAt(i));
	        	while(res.peek().length() == i){
	        		String temp = res.remove();
	        		for(char c : s[curNum].toCharArray()){
	        			res.add(temp+c);
	        		}
	        	}
	        }
    	}
        return res;
    }
}
