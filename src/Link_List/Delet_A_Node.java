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
	public static void delteNode(Node node) {
		node.data=node.next.data;
		node.next=node.next.next;
	}

}
