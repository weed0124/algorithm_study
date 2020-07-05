/**
 * LeetCode 897. Increasing Order Search Tree
 * 
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {TreeNode}
 */
var increasingBST = function(root) {
    // 최하위 노드까지 탐색하면 반환처리
    if (root === null) {
        return root;
    }
    // 트리 좌측부터 탐색하며 좌측의 root값을 담아놓음
    const leftRoot = increasingBST(root.left);
    // 결과값에 트리 좌측은 null이므로 null처리
    root.left = null;
    // 트리 좌측 탐색이 끝나면 우측 탐색을 시작한다.
    root.right = increasingBST(root.right);
    
    if (!leftRoot) {
        return root;
    }
    
    let leftLastNode = leftRoot;
    while (leftLastNode.right) {
        leftLastNode = leftLastNode.right;
    }
    leftLastNode.right = root;
    return leftRoot;
};