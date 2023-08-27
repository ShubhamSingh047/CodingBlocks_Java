package Link_List;

public class LeetCode_LinkList {
	//https://leetcode.com/problems/middle-of-the-linked-list/
	public ListNode middleNode(ListNode head) {
		ListNode fast=head;
		ListNode slow=head;
		
		while(fast!=null && fast.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		return slow;
	}

}
