import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
	Queue<Integer> queue;
	int size;
	int sum;
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        queue = new LinkedList<Integer>();
        sum = 0;
        this.size = size;
    }
    
    public double next(int val) {
        sum += val;
        queue.add(val);
        if(queue.size() > size){
        	sum -= queue.poll();
        }
        
        return (double)sum/queue.size();
    }
}
