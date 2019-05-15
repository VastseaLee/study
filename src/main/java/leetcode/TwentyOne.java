package leetcode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class TwentyOne {
    public static void main(String[] args) {
        mergeTwoLists(Two.getByArr(new int[]{1,2,4}),Two.getByArr(new int[]{1,3,4}));
    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode first;
        if (l1.val > l2.val) {
            first = new ListNode(l2.val);
            l2 = l2.next;
        } else {
            first = new ListNode(l1.val);
            l1 = l1.next;
        }
        ListNode last = first;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                last.next = l2;
                last = l2;
                l2 = l2.next;
            } else {
                last.next = l1;
                last = l1;
                l1 = l1.next;
            }
        }
        if (l1 != null) {
            last.next = l1;
        }
        if (l2 != null) {
            last.next = l2;
        }
        return first;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode first;
        if (l1.val > l2.val) {
            first = new ListNode(l2.val);
            l2 = l2.next;
        } else {
            first = new ListNode(l1.val);
            l1 = l1.next;
        }
        ListNode last = first;
        ListNode next;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                next = new ListNode(l2.val);
                last.next = next;
                last = next;
                l2 = l2.next;
            } else {
                next = new ListNode(l1.val);
                last.next = next;
                last = next;
                l1 = l1.next;
            }
        }
        if (l1 != null) {
            last.next = l1;
        }
        if (l2 != null) {
            last.next = l2;
        }
        return first;
    }
}
