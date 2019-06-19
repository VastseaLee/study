package leetcode.one;

import leetcode.ListNode;

/**
 * 给定一个链表，判断链表中是否有环。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。
 * <p>
 * 进阶：
 * 你能用 O(1)内存解决此问题吗？
 */
public class FortyOne {
    public boolean hasCycle(ListNode head) {
        if(head != null){
            ListNode slow = head;
            ListNode fast = head;
            while (slow.next != null && fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
        }
        return false;
    }
}
