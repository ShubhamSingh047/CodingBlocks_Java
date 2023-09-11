package Link_List;

public class Delet_A_Node {
	public static void main(String[] args) {
		Link_List ll=new Link_List();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.Dispaly();
	}
	public static Node<Integer> deleteNode( Node<Integer> head, int pos) {
		// Write your code here.
		if(head==null)return null;
		if(pos==0){
			head=head.next;
			return head;
		}
		Node temp=head;
		while(temp!=null){
			if(pos==1){
				if(temp.next!=null){
					temp.next=temp.next.next;
				}else{
					temp.next=null;
				}
			}
			pos--;
			temp=temp.next;
		}
		return head;
	}

}
