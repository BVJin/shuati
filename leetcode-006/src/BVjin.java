
public class BVjin {
    public String convert(String s, int numRows) {
    	if(numRows == 1) return s;
    	
        int l = 2*numRows-2;
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<numRows; i++){
        	
        	//first and last row
        	if(i == 0 || i == numRows-1){
        		for(int j=i; j<s.length(); j=j+l){
        			sb.append(s.charAt(j));
        		}
        	}else{
        		//two steps, first step = 2*numRows - 2 - 2i
        		int j = i;
    			boolean flag = true;
    			int step1 = 2 * (numRows - 1 - i);
    			int step2 = l - step1;
     
    			while (j < s.length()) {
    				sb.append(s.charAt(j));
    				if (flag)
    					j = j + step1;
    				else
    					j = j + step2;
    				flag = !flag;
    			} 
        	}
        }
        return sb.toString();
    }
}
