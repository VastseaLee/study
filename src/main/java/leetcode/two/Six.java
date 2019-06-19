package leetcode.two;

import leetcode.ListNode;

/**
 * 反转一个单链表。
 * <p>
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class Six {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode left = head;
        ListNode mid = head.next;
        if (mid == null) {
            return head;
        }
        ListNode right = mid.next;
        if (right == null) {
            mid.next = left;
            left.next = null;
            return mid;
        }
        left.next = null;
        while (right != null) {
            mid.next = left;
            left = mid;
            mid = right;
            right = right.next;
        }
        mid.next = left;
        return mid;
    }
}
