package Link_List;

public class Link_List {
	
	private int size;
	private Node head;
	private Node tail;
	
	public class Node{
		int data;
		Node next;
	}
	
	public void Dispaly() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println("!");
	}
	
	public void addFirst(int data) {
		Node nn=new Node();
		nn.data=data;
		if(size==0) {
			head=nn;
			tail=nn;
			size++;
		}else {
			nn.next=head;
			head=nn;
			size++;
		}
	}
	
	public void addLast(int data) {
		Node nn=new Node();
		nn.data=data;
		if(size==0)addFirst(data);
		else {
			tail.next=nn;
			tail=nn;
			size++;
		}
	}
	
	private Node getNode(int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("node is not valid(int the range)");
		}else {
			Node temp=head;
			for(int i=0; i<k; i++) {
				temp=temp.next;
			}
			return temp;
		}
	}
	
	public int KthNodeData(int k) throws Exception{
		return getNode(k).data;
	} 
	
	public void InsetAtK(int k, int data) throws Exception{
		Node nn= new Node();
		nn.data=data;
		if(k==0) {
			addFirst(k);
		}else {
			Node kth=getNode(k-1);
			nn.next=kth.next;
			kth.next=nn;
			size++;
		}
	}
	
}
