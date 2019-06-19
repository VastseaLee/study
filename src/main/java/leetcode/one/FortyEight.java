package leetcode.one;

import leetcode.ListNode;

/**
 * 在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序。
 */
public class FortyEight {
    public ListNode sortList(ListNode head) {
        return head == null ? null : sort(head);
    }


    private ListNode sort(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode left = sort(head);
        ListNode right = sort(slow);
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        ListNode head;
        if (left.val > right.val) {
            head = right;
            right = right.next;
        } else {
            head = left;
            left = left.next;
        }
        ListNode listNode = head;
        while (left != null && right != null) {
            if (left.val > right.val) {
                listNode.next = right;
                listNode = right;
                right = right.next;
            } else {
                listNode.next = left;
                listNode = left;
                left = left.next;
            }
        }
        if (left != null) {
            listNode.next = left;
        }
        if (right != null) {
            listNode.next = right;
        }
        return head;
    }
}
