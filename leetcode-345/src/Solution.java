
public class Solution {
    public String reverseVowels(String s) {
    	String vowels = "aeiouAEIOU";
    	char[] res = s.toCharArray();
        int p1 = 0, p2 = s.length()-1;
        while(p2 > p1){
        	if(!vowels.contains(s.charAt(p1) + ""))
        		p1++;
        	if(!vowels.contains(s.charAt(p2) + ""))
        		p2--;
        	if(vowels.contains(s.charAt(p1) + "") && vowels.contains(s.charAt(p2) + "") && p2 > p1){
        		char temp = s.charAt(p1);
        		res[p1] = res[p2];
        		res[p2] = temp;
        		p1++;
        		p2--;
        	}
        	
        }
        
        return new String(res);
    }
}
