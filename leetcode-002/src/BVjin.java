
public class BVjin {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		//these two steps I cannot understand well
		//this is the explanation
		//http://6924918.blog.51cto.com/6914918/1283761
		//https://www.zhihu.com/question/31203609
		ListNode c1 = l1;
        ListNode c2 = l2;
        

        ListNode sentinel = new ListNode(0); 
        ListNode d = sentinel;
        
        int sum = 0;
        while (c1 != null || c2 != null) {
        	//if last round sum > 10, add 1 to next round
            sum /= 10;
            if (c1 != null) {
                sum += c1.val;
                c1 = c1.next;
            }
            if (c2 != null) {
                sum += c2.val;
                c2 = c2.next;
            }
            //get the current round value
            d.next = new ListNode(sum % 10);
            d = d.next;

        }
        
        if (sum / 10 == 1)
        	d.next = new ListNode(1);
        return sentinel.next;
    }
}
