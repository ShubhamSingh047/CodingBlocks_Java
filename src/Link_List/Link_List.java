package Link_List;



public class Link_List {

	public class Node{
		int data;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public void addFirst(int data) {
		if(head.next==null) {
			head.data=data;
			head.next=null;
		}
	}

}
