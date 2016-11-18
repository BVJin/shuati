
public class BVjin {
    public boolean isPalindrome(String s) {
       if(s.length() == 0  || s.length() == 1) return true;
       int start = 0, end = s.length()-1;
       while(start < end){
    	   while(!Character.isLetterOrDigit(s.charAt(start)) && start < end){
    		   start++;
    	   }
    	   while(!Character.isLetterOrDigit(s.charAt(end)) && start < end){
    		   end--;
    	   }
    	   if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
    		   return false;
    	   }else{
    		   start++;
    		   end--;
    	   }
       }
       
       return true;
    }
}
