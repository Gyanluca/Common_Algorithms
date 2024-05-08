package it.cefi;

public class TreeNode {
	
	private int val;
	private TreeNode left;
	private TreeNode right;
	
	//mi serve il costruttore solo per int val
	public TreeNode(int val) {
		super();
		this.val = val;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

}
