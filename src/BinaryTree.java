
public class BinaryTree {
  public static void main(String args[]) {
	  Tree bt = new Tree();
	  Tree Tree = new Tree();
	  TreeTraversal traverse = new TreeTraversal();
	  
	  bt.add(10);
	  bt.add(6);
	  bt.add(7);
	  bt.add(4);
	  bt.add(18);
	  bt.add(11);
	  bt.add(17);
	  bt.add(16);
	  
	  Tree.add(10);
	  Tree.add(6);	
	  Tree.add(7);	
	  Tree.add(4);
	  Tree.add(18);
	  Tree.add(11);
	  Tree.add(17);
	  Tree.add(16);

	  System.out.println("inOrder");
	  traverse.traverseInorder(bt.root);
	  System.out.println("preOrder");
	  traverse.preOrder(bt.root);
	  System.out.println("postOrder");
	  traverse.postOrder(bt.root);
	  
	  
	  Tree.root = traverse.Mirror(Tree.root);
	  
	 	  
	  System.out.println("rev tree");
	  traverse.traverseInorder(Tree.root);
	  
	  System.out.println("Are Tree and bt Mirror : " + traverse.areMirror(bt.root, Tree.root));
	  
	  System.out.println("Height of tree is : " + traverse.treeHeight(bt.root));
	  
	  System.out.println("Zig Zag traversal is :");
	  traverse.zigZag(bt.root);
  }
}
