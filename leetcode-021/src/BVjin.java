
public class BVjin {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode index = dummy;
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while(temp1 != null || temp2 != null){
        	if((temp1 == null && temp2 != null) || (temp2 != null && temp1.val > temp2.val)){
        		index.next = temp2;
        		temp2 = temp2.next;
        	}else{
        		index.next = temp1;
        		temp1 = temp1.next;
        	}
        	index = index.next;
        }
        
        return dummy.next;
    }
}
