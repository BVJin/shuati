import java.util.ArrayList;
import java.util.List;


//Trietree
public class Solution1 {
	class Trie{
		Trie[] nodes;
		String word;
		public Trie(){
			this.nodes = new Trie[26];
			this.word = null;
		}
	}
	
    public List<List<String>> wordSquares(String[] words) {
    	List<List<String>> res = new ArrayList<List<String>>();
        Trie root = new Trie();
        //format the trie tree
        for(String word : words){
        	Trie node = root;
        	for(char c : word.toCharArray()){
        		int index = c - 'a';
        		if(node.nodes[index] == null) node.nodes[index] = new Trie();
        		node = node.nodes[index];
        	}
        	node.word = word;
        }
        
	   int l = words[0].length();
	   Trie[] rows = new Trie[l];
	   for(int i = 0; i < l; i++){ 
		   rows[i] = root;
	   }
	   backtracking(0, 0, l, rows, res);
       return res;
    }
    
    public void backtracking(int row, int col, int l, Trie[] rows, List<List<String>> res){
    	if(col == row && row == l){
    		List<String> al =  new ArrayList<String>();
    		for(int i = 0; i < l; i++){
    			al.add(new String(rows[i].word));
    		}
    		res.add(al);
    	}else{
    		if(col < l){
    			for(int i = 0; i < 26; i++){
    				Trie preRow = rows[row];
    				Trie preCol = rows[col];
    				if(rows[row].nodes[i] != null  && rows[col].nodes[i] != null){
        				rows[row] = rows[row].nodes[i];
        				if(row != col) rows[col] = rows[col].nodes[i];
        				backtracking(row, col + 1, l, rows, res);
        				rows[row] = preRow;
        				if(row != col) rows[col] = preCol;
        			}
    			}
    		}else{
    			
				backtracking(row + 1, row + 1, l, rows, res);
			}
    	}
    }
}









