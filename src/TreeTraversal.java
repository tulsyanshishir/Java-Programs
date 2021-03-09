import java.util.Stack;

public class TreeTraversal {
	private TreeNode temp = new TreeNode();
	public void traverseInorder(TreeNode root)
	{
		if(root == null) 
			return;
		
			traverseInorder(root.left);
			System.out.print(root.data + " ");
			traverseInorder(root.right);
		
	}
	
	public void preOrder(TreeNode root) {
		if(root == null)
			return;
		
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	
	}
	
	public void postOrder(TreeNode root) {
		if(root == null)
			return;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	public TreeNode Mirror(TreeNode root) {
		
		if(root == null) 
			return root;
		Mirror(root.left);
		Mirror(root.right);
		
		temp.left = root.left;
		root.left = root.right;
        root.right = temp.left;
		return root;
	}
	
	public boolean areMirror(TreeNode a, TreeNode b) {
		if(a == null && b ==null)
			return true;
		if(a == null || b == null)
			return false;
		return a.data == b.data 
				&& areMirror(a.left,b.right)
				&& areMirror(a.right,b.left);
	}
	
	public int treeHeight(TreeNode node) {
		if(node==null)
			return 0;
		int lh = treeHeight(node.left);
		int rh = treeHeight(node.right);
		
		return lh>rh?lh+1:rh+1;
	}
	
	public void zigZag(TreeNode root) {
		TreeNode node;
		if (root == null)
			return;
		Stack<TreeNode> currentLevel = new Stack<>();
		Stack<TreeNode> nextLevel = new Stack<>();
		boolean leftToRight = true;
		
		currentLevel.push(root);
		
		while(!currentLevel.isEmpty()) {
			node = currentLevel.pop();
			System.out.print(node.data + " ");
			if(leftToRight) {
				if(node.left != null) 
					nextLevel.push(node.left);
				if(node.right != null)
					nextLevel.push(node.right);
			}
			else {
				if(node.right != null)
					nextLevel.push(node.right);
				if(node.left != null) 
					nextLevel.push(node.left);	
			}
			if(currentLevel.isEmpty()) {
				leftToRight = ! leftToRight;
				Stack<TreeNode> temp = currentLevel;
				currentLevel = nextLevel;
				nextLevel= temp;
			}
		}
		
	}

}
