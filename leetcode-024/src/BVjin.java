
public class BVjin {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode index = dummy.next;
        ListNode prev = dummy;
        while(index!=null && index.next != null){
        	ListNode nextNode = index.next.next;
        	ListNode temp = index.next;
        	prev.next = index.next;
        	temp.next = index;
        	prev = index;
        	index = nextNode; 	
        }
        prev.next = index;
        return dummy.next;
    }
}
