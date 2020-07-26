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
		// 이전 노드에 대한 참조가 없으므로 이전 노드 정보를 저장할 변수 선언
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
        	// 이전 노드정보를 prev에 담으면서 next와 prev 치환 
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
