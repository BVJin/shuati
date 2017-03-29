import java.util.HashMap;

public class BVjin {
    public boolean isStrobogrammatic(String num) {
    	HashMap<Character, Character> map = new HashMap<Character, Character>();
    	map.put('6', '9');
    	map.put('9', '6');
    	map.put('1', '1');
    	map.put('0', '0');
    	map.put('8', '8');
    	int i = 0, j = num.length() - 1;
    	while(i <= j){
    		if(i == j)
    			return num.charAt(i) == '1' || num.charAt(i) == '8' || num.charAt(i) == '0';
    		else{
    			if(!map.containsKey(num.charAt(i)) ||  map.get(num.charAt(i)) != num.charAt(j)){
    				return false;
    			}
    		}
    			
    		i++;
    		j--;
    	}
    	return true;
    }
}
