
public class Test {
	public static void main(String agrs[]){
		BVjin bv = new BVjin();
		ListNode l1 = new ListNode(1);
		ListNode l2 = null;
		ListNode res = bv.mergeTwoLists(l1, l2);
		System.out.println(res.val);
		System.out.println(res.next.val);
	}
}
