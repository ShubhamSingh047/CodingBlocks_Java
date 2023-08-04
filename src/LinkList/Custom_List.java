package LinkList;

public class Custom_List {
	public class Node{
		int data;
		Node next;
	}
	private Node head;
	private Node tail;
	public int size;
	
	public void addFirst(int item) {
		Node nn=new Node();
		nn.data=item;
		if(size==0) {
			head=nn;
			tail=nn;
			size++;
		}
		else {
			nn.next=head;
			head=nn;
			size++;
		}
	}
	
	public void addlast(int item) {
		if(size==0) {
			addFirst(item);
		}else {
			//nn hold the address of new Node;
			Node nn=new Node();
			nn.data=item;
			tail.next=nn;
			tail=nn;
			size++;
		}
	}
	
	public void Display() {
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(".");
	}
	
	public void AddAtIndex(int k, int item) throws Exception {
		if(k==0) {
			addFirst(item);
		}
		else if(k==size) {
			addlast(item);
		}else {
			Node k_1th = getNode(k-1);
			Node nn = new Node();
			nn.data = item;
			nn.next=k_1th.next;
			k_1th.next=nn;
			size++;
		}
		
	}
	
	public int getFirst() {
		return head.data;
	}
	
	public int getLast() {
		return tail.data;
	}
	
	public int getAtIndex(int k) throws Exception {
		return getNode(k).data;
	}
	
	private Node getNode(int k) throws Exception {
		if(k<0||k>=size) {
			throw new Exception("i is not a valid input");
		}
		Node temp=head;
		for(int i=0; i<k; i++) {
			temp=temp.next;
		}
		return temp;
	}
}
