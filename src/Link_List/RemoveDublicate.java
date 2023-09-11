package Link_List;

public class RemoveDublicate {
	public Node removeDubl(Node head) {
		if(head==null || head.next==null) {
			return head;
		}
		Node slow=head;
		Node fast=head.next;
		
		while(fast!=null){
			if(fast.val==slow.val) {
				slow.next=fast.next;
			}else{
				slow=fast;
			}
			fast=fast.next;
		}
		return head;
	}
}
