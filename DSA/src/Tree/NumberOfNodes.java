package Tree;
import java.util.*;

public class NumberOfNodes {
	class Solution {
	    public List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> lis=new ArrayList<>();
	        Queue<TreeNode> q= new LinkedList<>();
	        if(root==null)return lis;
	        q.add(root);
	        while(!q.isEmpty()){
	            int size=q.size();
	            List<Integer> li2=new ArrayList<>();
	            for(int i=0; i<size; i++){
	                TreeNode curr=q.poll();
	                if(curr!=null){
	                    li2.add(curr.val);
	                    if(curr.left!=null)q.add(curr.left);
	                    if(curr.right!=null)q.add(curr.right);
	                }
	            }
	            lis.add(li2);
	        }
	        return lis;
	    }
	}
}
