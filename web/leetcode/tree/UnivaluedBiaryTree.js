/**
 * LeetCode 965. Univalued Binary Tree
 * 
 * Definition for a binary tree node.
 * function TreeNode(val) {
 *     this.val = val;
 *     this.left = this.right = null;
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isUnivalTree = function(root) {
    // root가 null이면 true 반환
    if (!root) {
        return true;
    }
    // 값을 비교할 기준을 담아놓을 변수 선언
    var value = root.val;
    // 재귀함수를 선언하여 해당 노드의 left, right를 각각 비교하여 값을 반환
    function recurFunc(root) {
        if (root) {
            if (root.val !== value) {
                return false;
            }
            return recurFunc(root.left) && recurFunc(root.right);
        }
        return true;
    }
    
    return recurFunc(root);
};