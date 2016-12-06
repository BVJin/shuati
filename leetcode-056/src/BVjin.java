import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Comparator;

public class BVjin {
    public List<Interval> merge(List<Interval> intervals) {
    	List<Interval> res = new ArrayList<Interval>();
    	if(intervals.size() == 0) return res;
    	PriorityQueue<Interval> queue = new PriorityQueue<Interval>(intervals.size(), new Comparator<Interval>(){
            public int compare(Interval l1, Interval l2){
                return Integer.compare(l1.start, l2.start);
            }
        });
    	
    	for(Interval l : intervals){
        	if(l!=null){
        		queue.offer(l);
        	}
        }
    	
    	Interval intial = queue.poll();
    	while(!queue.isEmpty()){
    		Interval seq = queue.poll();
    		if(intial.end >= seq.start){
    			intial.end = intial.end>seq.end?intial.end:seq.end;
    		}else{
    			res.add(intial);
    			intial = seq;
    		}
    	}
    	res.add(intial);
    	return res;
    	
    	
    }
}
