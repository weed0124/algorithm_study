package leetcode.linkedlist;

/**
 * LeetCode 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// ������ null�̸� �ٸ� list�� ��ȯ
        if (l1 == null)
        {
            return l2;
        }
        else if (l2 == null)
        {
            return l1;
        }
        // ũ�� �� �� �������� ��� �ش� list�� next�� ��
        else if (l1.val < l2.val)
        {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else
        {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
