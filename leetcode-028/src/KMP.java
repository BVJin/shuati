
public class KMP {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = 0;
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        if(n.length == 0) return 0;
        int[] next = getNext(needle);
        while(i<h.length && j<n.length){
        	if(j== -1 || h[i] == n[j]){
        		i++;
        		j++;
        	}else{
        		j = next[j];
        	}
        }
        
        if(j == n.length)
        	return i-j;
        else 
        	return -1;
    }
    
	public int[] getNext(String needle){
		int[] next = new int[needle.length()];
		next[0] = -1;
		char[] c = needle.toCharArray();
		int k = -1, index = 0;
		while(index < c.length - 1){
			if(k == -1 || c[index] == c[k]){
				++k;
				next[++index] = k;
			}else{
				//find the shortest match rather than rolling back to the start
				k = next[k];
			}
		}
		return next;
	}
}
