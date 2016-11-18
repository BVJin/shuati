
public class Test {
	public static void main(String[] args){
		BVjin bv = new BVjin();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		ListNode res = bv.swapPairs(head);
		while(res!=null){
			System.out.println(res.val);
			res = res.next;
		}
	}
}
