package Tree;

public class checkBalanceBt {
	public int CheckBalance(NodeTree root) {
		if(root==null)return 0;
		int Lt=CheckBalance(root.left);
		int Rt=CheckBalance(root.right);
		if(Lt==-1||Rt==-1)return -1;
		if(Math.abs(Lt-Rt)>1)return -1;
		return Math.max(Rt,Lt)+1;
	}
}
