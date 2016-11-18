import java.util.HashSet;
import java.util.Set;


public class BVjin {
    public boolean canPermutePalindrome(String s) {
        Set<Character> set = new HashSet<Character>();
        for(int i = 0; i<s.length(); i++){
        	if(!set.contains(s.charAt(i))){
        		set.add(s.charAt(i));
        	}else{
        		set.remove(s.charAt(i));
        	}
        }
        return set.size() <= 1;
    }
}
