package leetcode.tree;


/**
 * LeetCode 104. Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 */
public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		// �ش� Ʈ���� null�̸� �����Ƿ� �ش� ���̴� ���� ��� 0
        if (root == null) {
        	return 0;
        }
        
        // Ʈ���� �¿����� ū���� ��ȯ�ѵ� �ֻ�� Root Node�� 1�� ���� ��ȯ
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
