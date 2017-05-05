import java.util.Arrays;

public class BVjin {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        
        int i = 0, res = Integer.MAX_VALUE;
        
        for(int house : houses){
        	while(i < heaters.length - 1 && Math.abs(house - heaters[ i+1 ]) <= Math.abs(house - heaters[i])){
        		i++;
        	}
        	
        	res = Math.min(res, Math.abs(house - heaters[i]));
        }
        
        return res;
    }
}
