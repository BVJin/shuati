import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solution {
	List<Integer> list;
    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
	public Solution(ListNode head) {
		list = new ArrayList<Integer>();
	    ListNode boo = head;
	    while(boo != null){
	    	list.add(boo.val);
	    	boo = boo.next;
	    }
	}
	
	/** Returns a random node's value. */
	public int getRandom() {
	    Random ran = new Random();
	    int target = ran.nextInt(list.size());
	    return list.get(target);
	}
}
