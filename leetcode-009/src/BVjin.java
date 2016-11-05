
public class BVjin {
    public boolean isPalindrome(int x) {
       //special case
       if(x<0) return false;
       int div = 1;
       int temp = x;
       //how may zeros
       while(temp/10 > 0){
    	   div *= 10;
    	   temp = temp/10;
       }
       while(x != 0){
    	   int left = x/div;
    	   int right = x%10;
    	   if(left != right){
    		   return false;
    	   }else{
    		   x = x%div/10;
    		   div = div/100;
    	   }
       }
       return true;
    }
}
