package leetcode.zero;


import leetcode.ListNode;

/**
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 */
public class SixtyOne {
    public static void main(String[] args) {
        ListNode first = new ListNode(0);
        ListNode last = first;
        ListNode next;
        for (int i = 1; i < 6; i++) {
            next = new ListNode(i);
            last.next = next;
            last = next;
        }
        rotateRight(first.next, 2);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        //计算链表长度
        ListNode next = head;
        int count = 1;
        while (next.next != null) {
            count++;
            next = next.next;
        }

        //计算要移多少到前面(其实也就知道移多少到后面)
        int num = k % count + 1;

        //找到要拆分的节点
        next = head;
        if (num > 1) {
            while (count > num) {
                count--;
                next = next.next;
            }


            ListNode node = next;
            while (next.next != null) {
                next = next.next;
            }

            //接接接
            ListNode result = node.next;
            node.next = null;
            next.next = head;
            return result;
        }

        return head;
    }
}
