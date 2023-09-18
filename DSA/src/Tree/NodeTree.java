package Tree;
import java.util.*;

public class NodeTree<T> {
		T data;
		ArrayList <NodeTree<T>> child;
		NodeTree(T data){
			this.data=data;
			this.child=new ArrayList<>();
		}
	}
