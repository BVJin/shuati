import java.util.ArrayList;


public class BVjin {
	//two pointer
	//fast and slow, gap is n
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        
        //set fast pointer
        for(int i = 0; i<n; i++){
        	fast = fast.next;
        }
        
        //fast is null means head should be removed
        if(fast == null){
        	return head.next;
        }
        
        while(fast.next != null){
        	slow = slow.next;
        	fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
        
    }
}
