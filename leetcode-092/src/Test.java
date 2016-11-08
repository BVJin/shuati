
public class Test {

	public static void main(String args[]){
		BVjin bv = new BVjin();
		ListNode a = new ListNode(1);
		a.next = new ListNode(2);
		a.next.next = new ListNode(3);
		a.next.next.next = new ListNode(4);
		
		ListNode res = bv.reverseBetween(a, 1, 4);
		int l = 0 ;
		while(res != null){
			System.out.println("m1 value: " + res.val + " " + l);
			res = res.next;	
			l++;
		}
	}
}
