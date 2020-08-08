package leetcode.tree;

/**
 * LeetCode 108. Convert Sorted Array to Binary Search Tree
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class ConvertSortedArrayToBinarySearchTree {
	
	/**
	 * 균형이진탐색트리(AVL트리)를 구하는 문제
	 */
	public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return makeBST(nums, 0, nums.length - 1);
    }
    
    public TreeNode makeBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int middle = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = makeBST(nums, left, middle - 1);
        node.right = makeBST(nums, middle + 1, right);
        return node;
    }
}
