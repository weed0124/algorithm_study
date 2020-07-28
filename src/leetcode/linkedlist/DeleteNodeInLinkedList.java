package leetcode.linkedlist;

/**
 * LeetCode 237. Delete Node in a Linked List
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNodeInLinkedList {
	// �����ϰ��� �ϴ� ����� ����/���� ����� ������ ��������ָ� �ǹǷ� ���� ��� ������ ��带 �ٶ󺸰� �ϸ� ���� ó��.
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
