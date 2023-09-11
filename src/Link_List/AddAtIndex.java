package Link_List;

public class AddAtIndex {
	public Node AtIndex(Node head, int i) {
		Node temp=head;
		int k=0;
		while(k!=i) {
			if(k==i-1) {
				Node n= new Node(10);
				temp.next=n;
				n.next=temp.next.next;
			}
			k++;
			temp=temp.next;
		}
		return Node;
	}
}
