package Link_List;

import Link_List.Custom_List.Node;

public class Remove_Cycle {
	
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
				//hold the address of new Node;
				Node nn=new Node();
				nn.data=item;
				tail.next=nn;
				tail=nn;
				size++;
			}
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
		
		public Node hasCycle() {
			Node fast=head;
			Node slow=head;
	        while(fast !=null && fast.next!=null) {
	        	slow=slow.next;
	        	fast=fast.next.next;
	        	if(slow==fast) {
	        		return slow;
	        	}
	        }
	        return null;
		}
		
		public void CyclereMoval1(){
			Node meet=hasCycle();
			if(meet==null) {
				return;
			}
			Node slow=head;
			while(slow!=null) {
				Node temp=meet;
				while(temp.next != meet){
					if(temp.next==slow) {
						temp.next=null;
						return;
					}
					temp=temp.next;
				}
				slow=slow.next;
			}
		}
		
		public void  CreateCycle() throws Exception{
			tail.next=getNode(2);
		}
		
		public void Display() {
			Node temp=head;
			while(temp!=null){
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println(".");
		}
		
		public void Cyclermoval2(){
			Node meet= hasCycle();
			if(meet==null) {
				return;
			}
			int count=1;
			
			Node temp=meet;
			while(temp.next!=meet) {
				count++;
				temp=temp.next;
			}
			
			Node fast=head;
			for(int i=0; i<count; i++) {
				fast=fast.next;
			}
			
			Node slow=head;
			while(slow.next != fast.next) {
				slow=slow.next;
				fast=fast.next;
			}
			fast.next=null;
		}
		
		public void Floyedcycle() {
			Node meet=hasCycle();
			if(meet==null) {
				return;
			}
			Node fast=meet;
			Node slow=head;
			while(slow.next != fast.next) {
				slow=slow.next;
				fast=fast.next;
			}
			fast.next=null;
		}
		
		public static void main(String[] args) throws Exception{
			Remove_Cycle nn= new Remove_Cycle();
			nn.addlast(1);
			nn.addlast(2);
			nn.addlast(3);
			nn.addlast(4);
			nn.addlast(5);
			nn.addlast(6);
			nn.addlast(7);
			nn.addlast(8);
			nn.CyclereMoval1();
			nn.Display();
		}
}
