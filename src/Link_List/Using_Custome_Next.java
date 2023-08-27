package Link_List;

public class Using_Custome_Next {
	public static void main(String[] args) throws Exception {
		Custom_List ll=new Custom_List();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.Display();
		int res=ll.getAtIndex(1);
		System.out.println(res);
	}
}
