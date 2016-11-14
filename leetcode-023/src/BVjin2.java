
public class BVjin2 {
    public ListNode mergeKLists(ListNode[] lists) {
        return dichotomy(lists, 0, lists.length-1);
    }
    
    public ListNode dichotomy(ListNode[] lists, int start,int end){
    	if(start == end) return lists[start];
    	int mid = (start+end)/2;
    	if(start<end){
    		ListNode l1 = dichotomy(lists, start, mid);
    		ListNode l2 = dichotomy(lists, mid+1, end);
    		return merge(l1, l2);
    	}else{
    		return null;
    	}
    }
    
    public ListNode merge(ListNode l1, ListNode l2){
    	if(l1 == null) return l2;
    	if(l2 == null) return l1;
    	if(l1.val< l2.val){
    		l1.next = merge(l1.next, l2);
    		return l1;
    	}else{
    		l2.next = merge(l1, l2.next);
    		return l2;
    	}
    }
    
}
