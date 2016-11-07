
public class BVjin {
	public boolean isMatch(String s, String p) {
		System.out.println(s);
		System.out.println(p);
    	//if p is empty, just check s
    	if(p.isEmpty())
    		return s.isEmpty();
    	
    	//p length = 1
    	if(p.length() == 1){
    		System.out.println("length = 1");
    		if(s.length()<1){
    			return false;
    		}else if(p.charAt(0)!=s.charAt(0) && p.charAt(0)!='.'){
    			return false;
    		}else{
    			return isMatch(s.substring(1), p.substring(1));
    		}
    	}
    	
    	//second char is not '*'
    	if(p.charAt(1) != '*'){
    		if (s.length() < 1) {
    			return false;
    		}
    		if ((p.charAt(0) != s.charAt(0)) && (p.charAt(0) != '.')) {
    			return false;
    		} else {
    			System.out.println("equal");
    			return isMatch(s.substring(1), p.substring(1));
    		}
    	}else{
    		//second char is '*'
    		// * = 0
    		if(isMatch(s, p.substring(2))){
    			return true;
    		}
    		// * >= 1
    		int i = 0;
    		// if char before * of p and the first char of s is not '.' or not equal, return false
    		// if it is, try every substring
    		while (i<s.length() && (s.charAt(i)==p.charAt(0) || p.charAt(0)=='.')){
    			if (isMatch(s.substring(i + 1), p.substring(2))) {
    				return true;
    			}
    			i++;
    		}
    		return false;
    	}
    	
    }
}
