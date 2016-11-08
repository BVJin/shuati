
public class Test {

	public static void main(String args[]){
		BVjin bv = new BVjin();
		ListNode a = new ListNode(1);
		a.next = new ListNode(2);
		a.next.next = new ListNode(3);
		a.next.next.next = new ListNode(4);
		ListNode res = bv.reverseList2(a);
		while(res != null){
			System.out.print(res.val + " ");
			res = res.next;
		}
	}
}
