package leetcode.two;

import leetcode.ListNode;

import java.util.List;

/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点
 */
public class ThirtySeven {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        ListNode node = new ListNode(5);
        head.next = node;
        node.next = new ListNode(1);
        node.next.next = new ListNode(9);
        deleteNode(node);
        System.out.println(node.next);
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
