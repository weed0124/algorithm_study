package leetcode.tree;


/**
 * LeetCode 104. Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		// 해당 트리가 null이면 없으므로 해당 높이는 없음 고로 0
        if (root == null) {
        	return 0;
        }
        
        // 트리의 좌우측중 큰값을 반환한뒤 최상단 Root Node값 1을 더해 반환
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
