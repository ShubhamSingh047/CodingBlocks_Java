package StackAndQueue;

public class Construct_smallest_Number {
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
	
	public void Display() {
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		System.out.println(".");
	}
}
