import java.util.Random;


//Reservoir Sampling
public class Solution1 {
	ListNode nodes;
	Random ran;
    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
    public Solution1(ListNode head) {
        nodes = head;
        ran = new Random();
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        ListNode boo = nodes;
        int res = boo.val;
        int index = 1;
        while(boo.next != null){
        	boo = boo.next;
        	if(ran.nextInt(index+1) == index) res = boo.val;
        	index = index + 1;
        }
        return res;
    }
}