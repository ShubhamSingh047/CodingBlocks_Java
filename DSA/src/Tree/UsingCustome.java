package Tree;

public class UsingCustome {
	public static void main(String[] args) {
		NodeTree<Integer> root = new NodeTree<>(10);
		NodeTree<Integer> node1 = new NodeTree<>(20);
		NodeTree<Integer> node2 = new NodeTree<>(30);
		NodeTree<Integer> node3 = new NodeTree<>(40);
		NodeTree<Integer> node4 = new NodeTree<>(50);
		
		root.child.add(node1);
		root.child.add(node2);
		node1.child.add(node4);
		node2.child.add(node3);
	}
}
