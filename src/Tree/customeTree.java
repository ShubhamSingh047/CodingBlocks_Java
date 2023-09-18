package Tree;
import java.util.ArrayList;

class customeTree{
    class TreeNode<T>{
        public T data;
        public ArrayList<TreeNode<T>> child;
        public TreeNode(T data){
            this.data=data;
        }
    }
}