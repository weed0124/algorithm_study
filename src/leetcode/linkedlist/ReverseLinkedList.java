package leetcode.linkedlist;

/**
 * LeetCode 206. Reverse Linked List
 * https://leetcode.com/problems/reverse-linked-list/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		// ���� ��忡 ���� ������ �����Ƿ� ���� ��� ������ ������ ���� ����
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
        	// ���� ��������� prev�� �����鼭 next�� prev ġȯ 
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
