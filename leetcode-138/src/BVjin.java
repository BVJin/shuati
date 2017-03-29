import java.util.ArrayList;
import java.util.HashMap;

public class BVjin {
    public RandomListNode copyRandomList(RandomListNode head) {
    	if(head == null) return head;
    		
    	HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
    	
    	RandomListNode res = head;
    	while(res != null){
    		map.put(res, new RandomListNode(res.label));
    		res = res.next; 
    	}
    	
    	res = head;
    	while(res != null){
    		map.get(res).next = map.get(res.next);
    		map.get(res).random = map.get(res.random);
    		res = res.next;
    	};
    	
    	return map.get(head);
    }
}
