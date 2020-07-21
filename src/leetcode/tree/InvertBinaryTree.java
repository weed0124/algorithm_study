package leetcode.tree;

/**
 * LeetCode 226. Invert Binary Tree
 * https://leetcode.com/problems/invert-binary-tree/
 */
public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        
        root.right = left;
        root.left = right;
        
        return root;
    }
}
