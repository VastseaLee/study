package leetcode;

import java.util.List;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class Two {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        int[] arr2 = new int[]{5, 6, 4};

        show(addTwoNumbers(getByArr(arr), getByArr(arr2)));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num = l1.val + l2.val;
        boolean flag = false;
        if (num >= 10) {
            num %= 10;
            flag = true;
        }
        ListNode first = new ListNode(num);
        ListNode last = first;
        ListNode next;
        //两两相加
        while (l1.next != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
            num = l1.val + l2.val;
            if (flag) {
                num += 1;
                flag = false;
            }
            if (num >= 10) {
                num %= 10;
                flag = true;
            }
            next = new ListNode(num);
            last.next = next;
            last = next;
        }

        //比较长的再单独处理
        while (l1.next != null) {
            l1 = l1.next;
            num = l1.val;
            if (flag) {
                num += 1;
                flag = false;
            }
            if (num >= 10) {
                num %= 10;
                flag = true;
            }
            next = new ListNode(num);
            last.next = next;
            last = next;
        }

        while (l2.next != null) {
            l2 = l2.next;
            num = l2.val;
            if (flag) {
                num += 1;
                flag = false;
            }
            if (num >= 10) {
                num %= 10;
                flag = true;
            }
            next = new ListNode(num);
            last.next = next;
            last = next;
        }

        //如果最后还有一个1则需要单独起一个
        if (flag) {
            last.next = new ListNode(1);
        }

        return first;
    }


    public static void show(ListNode ln) {
        System.out.print(ln.val + ",");
        if (ln.next != null) {
            show(ln.next);
        }
    }

    //数组转换成链表
    public static ListNode getByArr(int[] arr) {
        ListNode first = new ListNode(arr[0]);
        ListNode last = first;
        ListNode next;
        for (int i = 1; i < arr.length; i++) {
            next = new ListNode(arr[i]);
            last.next = next;
            last = next;
        }
        return first;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }


}