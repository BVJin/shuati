import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<String>> wordSquares(String[] words) {
    	List<List<String>> res = new ArrayList<List<String>>();
    	for(int i = 0; i < words.length; i++){
    		ArrayList<String> al = new ArrayList<String>();
    		al.add(words[i]);
    		if(words[i].length() == 1)
    			res.add(al);
    		else
    			backtracking(res, al, words, 1, words[0].length());
    	}
    	return res;
    }
    
    public void backtracking(List<List<String>> res, ArrayList<String> curList, String[] words, int point, int wordl){
		String curPrefix = "";
    	//format prefix
    	for(int j = 0; j < point; j++){
    		curPrefix += curList.get(j).charAt(point);
		}
    	for(int i = 0; i < words.length; i++){
    		if(words[i].startsWith(curPrefix)){
    			ArrayList<String> nextList = new ArrayList<String>(curList);
    			nextList.add(words[i]);
    			if(point + 1 == wordl){
    				res.add(nextList);
    			}else{
    				backtracking(res, nextList, words, point+1, wordl);
    			}
    		}
    	}
    }
}
