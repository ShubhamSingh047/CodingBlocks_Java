package LinkList;

public class Leetcode_Cycle_LinkInList {
	//Question https://leetcode.com/problems/linked-list-cycle/ floyed cycle algo
	public boolean hasCycle(ListNode head) {
	        LinkNode fast=head;
	        LinkNode slow=head;
	        while(fast !=null && fast.next!=null) {
	        	slow=slow.next;
	        	fast=fast.next.next;
	        	if(slow==fast) {
	        		return true;
	        	}
	        }
	        return false;
	 }

}
