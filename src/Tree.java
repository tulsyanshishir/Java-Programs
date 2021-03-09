
public class Tree {
 TreeNode root = null;
 private TreeNode insertNode(TreeNode current, int val) {
	 if(current == null) {
		 current = new TreeNode(val) ;
	 }
	 else {
		 if(current.data > val) {
			 current.left=insertNode(current.left,val);
		 }
		 else if(current.data < val){
			 current.right = insertNode(current.right,val);
			 }
		 else {
			return current;
		  }
			 
	 }
	 return current;
 }
 public void add(int val) {
	 root = insertNode(root,val);
 }
}
