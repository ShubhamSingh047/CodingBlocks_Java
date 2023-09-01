package Link_List;

public class ReverseALinkList {
	public static void main(String[] args) {
		Link_List ll = new Link_List();
		
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addFirst(50);
		ll.Dispaly();
		
		Link_List.Node head= ll.getHead();

		head=ReversList(head);
		ll.getSize();
		ll.Dispaly(head);
		ll.getSize();
	}
	public static Link_List.Node ReversList(Link_List.Node head) {
		Link_List.Node curr=head;
		Link_List.Node next=null;
		Link_List.Node prev=null;
		
		while(curr!=null) {
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head.next=null;
		return prev;
	}
}
