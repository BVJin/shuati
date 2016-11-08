
public class BVjin {
	//iterative
    public ListNode reverseList1(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null){
        	ListNode tempNext = cur.next;
        	cur.next = prev;
        	prev = cur;
        	cur = tempNext;
        }
        return prev;
    }
    
    //Recursive
    public ListNode reverseList2(ListNode head){
        if (head == null || head.next == null) {
        	System.out.println("Head " + head.val);
        	
        	return head;
        }
        ListNode p = reverseList2(head.next);
        System.out.println("list reverse " + p.val + " Head " + head.val);
        //System.out.println("head next next" + head.next.next.val);
        head.next.next = head;
        System.out.println("head next " + head.next.val);
        head.next = null;  
        //System.out.println(head.next.next.val);
        return p;
    }
}
