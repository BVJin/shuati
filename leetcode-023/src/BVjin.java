import java.util.Comparator;
import java.util.PriorityQueue;


public class BVjin {
    public ListNode mergeKLists(ListNode[] lists) {
    	if(lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>(){
        	public int compare(ListNode l1, ListNode l2){
        		return l1.val - l2.val;
        	}
        });
        
        for(ListNode l : lists){
        	if(l!=null){
        		pq.offer(l);
        	}
        }
        
        ListNode dummy = new ListNode(0);
        ListNode index = dummy;
        while(!pq.isEmpty()){
        	ListNode l = pq.poll();
        	index.next = l;
        	index = index.next;
        	
        	if(l.next != null){
        		pq.offer(l.next);
        	}
        }
        return dummy.next;
    }
}
