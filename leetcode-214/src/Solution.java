
public class Solution {
    public String shortestPalindrome1(String s) {
    	if(s.length() == 0) return s;
        for(int i = s.length() - 1; i > -1; i--){
        	if(isPalindrome2(s, 0, i)) return new StringBuilder(s.substring(i + 1)).reverse().toString() + s;
        }
        return new StringBuilder(s.substring(1)).reverse().toString() + s;
    }
    
    private boolean isPalindrome1(String word, int i, int j) {
	    while (i < j) {
	    	if (word.charAt(i++) != word.charAt(j--)) return false;
	    }
	    	
	    return true;
	}
    
    //ACED
    public String shortestPalindrome2(String s) {
    	if(s.length() == 0) return s;
        for(int i = s.length() - 1; i > -1; i--){
        	if(isPalindrome2(s, 0, i)) return new StringBuilder(s.substring(i + 1)).reverse().toString() + s;
        }
        return new StringBuilder(s.substring(1)).reverse().toString() + s;
    }
    
    private boolean isPalindrome2(String word, int i, int j) {
    	int left = (i + j) / 2, right = (i + j) / 2;
    	if((j - i) % 2 == 1) right = left + 1;
	    while (left >= i && right <= j) {
	    	if (word.charAt(left--) != word.charAt(right++)) return false;
	    }
	    	
	    return true;
	}
    
    public String shortestPalindrome(String s) {
        String temp = s + "#" + new StringBuilder(s).reverse().toString();
        int[] table = getNext(s);
        for(int i : table){
        	System.out.print(i + " ");
        }
        //get the maximum palin part in s starts from 0
        return new StringBuilder(s.substring(table[table.length - 1] + 1)).reverse().toString() + s;
    }
    
    public int[] getNext(String s){
    	//System.out.println(s);
    	int[] next = new int[s.length()];
    	next[0] = -1;
    	int l = s.length();
    	int k = -1; //prefix
    	int j = 0; //postfix
    	while( j < l - 1){
    		if(k == -1 || s.charAt(k) == s.charAt(j)){
    			k++;
    			j++;
    			next[j] = k;
    		}else{
    			k = next[k];
    		}
    	}
    	return next;
    }

//    public int[] getTable(String s){
//        //get lookup table
//        int[] table = new int[s.length()];
//        
//        //pointer that points to matched char in prefix part
//        
//        int index = 0;
//        //skip index 0, we will not match a string with itself
//        for(int i = 1; i < s.length(); i++){
//            if(s.charAt(index) == s.charAt(i)){
//                //we can extend match in prefix and postfix
//                table[i] = table[i-1] + 1;
//                index ++;
//            }else{
//                //match failed, we try to match a shorter substring
//                
//                //by assigning index to table[i-1], we will shorten the match string length, and jump to the 
//                //prefix part that we used to match postfix ended at i - 1
//                index = table[i-1];
//                
//                while(index > 0 && s.charAt(index) != s.charAt(i)){
//                    //we will try to shorten the match string length until we revert to the beginning of match (index 1)
//                    index = table[index-1];
//                }
//                
//                //when we are here may either found a match char or we reach the boundary and still no luck
//                //so we need check char match
//                if(s.charAt(index) == s.charAt(i)){
//                    //if match, then extend one char 
//                    index ++ ;
//                }
//                
//                table[i] = index;
//            }
//            
//        }
//        
//        return table;
//    }
}
