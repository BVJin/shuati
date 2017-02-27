import java.util.Arrays;

public class BVjin1 {
    public int findRadius(int[] houses, int[] heaters) {
    	Arrays.sort(houses);
    	Arrays.sort(heaters);
    	
    	int res = 0;
    	for(int house : houses){
    		int index = Arrays.binarySearch(heaters, house);
    		if(index < 0)
    			index = -1 * (index + 1);
    		int left = index - 1 > -1?Math.abs(house-heaters[index-1]):Integer.MAX_VALUE;
    		int right = index > heaters.length - 1?Integer.MAX_VALUE:Math.abs(house-heaters[index]);
    		
    		res = Math.max(res, Math.min(left, right));
    	}
    	return res;
    }
}
