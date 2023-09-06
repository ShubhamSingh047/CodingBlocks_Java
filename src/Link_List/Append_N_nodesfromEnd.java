package Link_List;

public class Append_N_nodesfromEnd {
	public static Solution(Node head, int n) {
		Node temp=head;
		Node newTail=head;
		Node newHead=head;
		int size=0;
		while(temp!=null) {
			if(temp.next==null) {
				newTail=temp;
				newTail.next=null;
				break;
			}
			size++;
			temp=temp.next;
		}
		int count=size-n;
		for(int i=0; i<count; i++) {
			newHead=newHead.next;
		}
		head=newHead.next;
		newHead.next=null;
		return head;
	}
}
