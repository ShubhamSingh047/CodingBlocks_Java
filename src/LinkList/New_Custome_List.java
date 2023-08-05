package LinkList;

import LinkList.Custom_List.Node;

public class New_Custome_List {
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
		
		public static void main(String[] args) {
			New_Custome_List nn= new New_Custome_List();
			nn.addlast(1);
			nn.addlast(2);
			nn.addlast(3);
			nn.addlast(4);
			nn.Display();
		}
}
