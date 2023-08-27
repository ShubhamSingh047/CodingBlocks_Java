package Link_List;

public class ReverseALinkList {
	public ListNode reverseList(ListNode head) {
	        return Reverse(head, null);
    }
	public ListNode Reverse(ListNode curr, ListNode prev) {
		if(curr==null) {
			return;
		}
		
		ListNode temp=Reverse(curr.next, curr);
		curr.next=prev;
	}
}
