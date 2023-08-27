package Link_List;

public class Intersection_Of_LinkedList {
	//https://leetcode.com/problems/intersection-of-two-linked-lists/submissions/
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        ListNode A=headA;
	        ListNode B=headB;
	        while(A!=B) {
	        	if(A==null) {
	        		A=headB;
	        	}else {
	        		A=A.next;
	        	}
	        	
	        	if(B==null){
	        		B=headA;
	        	}else {
	        		B=B.next;
	        	}
	        }
	        return A;
	    }
}
