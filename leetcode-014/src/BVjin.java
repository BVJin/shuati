
public class BVjin {
    public String longestCommonPrefix(String[] strs) {
    	if(strs.length > 0){
    		String res = strs[0];
    		for(int i=1; i<strs.length; i++){
    			while(strs[i].indexOf(res) != 0){
    				res = res.substring(0, res.length()-1);
    			}
    		}
    		return res;
    	}else{
    		return "";
    	}
    }
}
