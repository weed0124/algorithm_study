package leetcode.linkedlist;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// 한쪽이 null이면 다른 list를 반환
        if (l1 == null)
        {
            return l2;
        }
        else if (l2 == null)
        {
            return l1;
        }
        // 크기 비교 후 기준점을 잡아 해당 list의 next와 비교
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
