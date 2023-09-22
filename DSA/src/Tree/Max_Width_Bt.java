package Tree;

public class Max_Width_Bt {
	/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode() {}
	 *     TreeNode(int val) { this.val = val; }
	 *     TreeNode(int val, TreeNode left, TreeNode right) {
	 *         this.val = val;
	 *         this.left = left;
	 *         this.right = right;
	 *     }
	 * }
	 */
	class Pair {
	    TreeNode node; 
	    int num; 
	    Pair(TreeNode _node, int _num) {
	        num = _num;
	        node = _node; 
	    }
	}
	class Solution {
	    public int widthOfBinaryTree(TreeNode root) {
	      return height(root);
	    }
	    public int height(TreeNode root){
	       Queue<Pair> q=new LinkedList<>();
	       q.add(new Pair(root,1));
	       int res=0;
	       while(!q.isEmpty()){
	           int size=q.size();
	            int min=q.peek().num;
	            int first=0, last=0;
	            for(int i=0; i<size; i++){
	                int curr_id=q.peek().num-min;
	                TreeNode curr=q.poll().node;
	                if(i==0)first=curr_id;
	                if(i==size-1)last=curr_id;
	                if(curr.left!=null){
	                    q.add(new Pair(curr.left, curr_id*2+1));
	                }
	                if(curr.right!=null){
	                    q.add(new Pair(curr.right,curr_id*2+2));
	                }
	            }
	            res=Math.max(res,last-first+1);
	       }
	       return res;
	    }
	}
}
