package Tree;

public class BT_to_DL {
	static NodeTree prev=null;
	public static NodeTree Convertion(NodeTree root) {
		if(root==null) {
			return root;
		}
		NodeTree head=Convertion(root.left);
		if(prev==null) {
			head=root;
		}else {
			root.left=prev;
			prev.right=root;
		}
		prev=root;
		Convertion(root.right);
		return head;
	}

}
