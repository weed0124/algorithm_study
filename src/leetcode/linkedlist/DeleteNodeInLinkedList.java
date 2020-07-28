package leetcode.linkedlist;

/**
 * LeetCode 237. Delete Node in a Linked List
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNodeInLinkedList {
	// 삭제하고자 하는 노드의 이전/이후 노드의 정보만 변경시켜주면 되므로 삭제 노드 다음의 노드를 바라보게 하면 삭제 처리.
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
