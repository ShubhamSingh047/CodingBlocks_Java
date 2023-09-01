package Link_List;

public class Consuming_LinkList {
	public static void main(String[] args) throws Exception {
		Link_List ll= new Link_List();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		
		ll.addFirst(50);
		ll.addLast(60);
		
		ll.InsetAtK(2, 100);
		ll.Dispaly();
	}
}
