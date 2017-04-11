import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class Solution {
    public List<int[]> getSkyline(int[][] buildings) {
    	List<int[]> res = new ArrayList<int[]>();
        Map<Integer, List<int[]>> map = new TreeMap<Integer, List<int[]>>(); 
        for(int[] building : buildings){
        	map.putIfAbsent(building[0], new ArrayList<int[]>());
        	map.putIfAbsent(building[1], new ArrayList<int[]>());
        	map.get(building[0]).add(building);
        	map.get(building[1]).add(building);
        }
        
        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comparator<int[]>(){
        		@Override
        		public int compare(int[] b1, int[] b2){
        			return Integer.compare(b2[2], b1[2]);
        		}
        });
        
        for(Entry<Integer, List<int[]>> entry : map.entrySet()){
        	int b = entry.getKey();
        	List<int[]> list = entry.getValue();
        	System.out.println(b + " critical point");
        	for(int[] i : list){
        		if(b == i[0]){
        			heap.add(i);
        		}else{
        			heap.remove(i);
        		}
        	}
    		if(heap.isEmpty()){
    			res.add(new int[]{b, 0});
    		}else{
    			int h = heap.peek()[2];
    			if(res.isEmpty() || res.get(res.size()-1)[1] != h){
    				res.add(new int[]{b, h});
    			}
    		}
        	
        }
        
        return res;
    }
}