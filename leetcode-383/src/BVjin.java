
public class BVjin {
    public boolean canConstruct(String ransomNote, String magazine) {
//    	String s = magazine;
//        for(char c: ransomNote.toCharArray()){
//        	if(s.indexOf(""+c) > -1){
//        		s = s.replaceFirst(""+c, "");
//        	}else{
//        		return false;
//        	}
//        }
//        return true;
    	
    	int[] arr = new int[26];
    	for(char c : magazine.toCharArray()){
    		arr[c - 'a']++;
    	}
    	for(char c : ransomNote.toCharArray()){
    		if(--arr[c-'a']<0)
    			return false;
    	}
    	return true;
    }
}
