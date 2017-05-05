import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isRectangleCover(int[][] rectangles) {
    	if(rectangles == null || rectangles.length == 0 || rectangles[0].length == 0) return false;
        int area = 0;
        int x1 = Integer.MAX_VALUE;
        int x2 = Integer.MIN_VALUE;
        int y1 = Integer.MAX_VALUE;
        int y2 = Integer.MIN_VALUE;
        
        HashSet<String> hs = new HashSet<String>();
        for(int[] rec : rectangles){
        	x1 = Math.min(x1, rec[0]);
        	x2 = Math.max(x2, rec[2]);
        	y1 = Math.min(y1, rec[1]);
        	y2 = Math.max(y2, rec[3]);
        	
        	area += (rec[2] - rec[0])*(rec[3] - rec[1]);
        	String s1 = rec[0] + " " + rec[1];
        	String s2 = rec[0] + " " + rec[3];
        	String s3 = rec[2] + " " + rec[3];
        	String s4 = rec[2] + " " + rec[1];
        	
        	if(!hs.add(s1)) hs.remove(s1);
        	if(!hs.add(s2)) hs.remove(s2);
        	if(!hs.add(s3)) hs.remove(s3);
        	if(!hs.add(s4)) hs.remove(s4);
        }
        if(!hs.contains(x1+" " + y1) || !hs.contains(x1+" " + y2) || !hs.contains(x2+" " + y1) || !hs.contains(x2+" " + y2) || hs.size() != 4)
        	return false;
        return area == (x2-x1) * (y2-y1);
        
    }
}