package leetcode;

import java.util.*;

/**
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 */
public class TwentyThree {
    public static void main(String[] args) {
        ListNode[] lists = new ListNode[100];
        for (int z = 0; z < 100; z++) {
            int[] ints = new int[1000];
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 1000; j++) {
                    ints[j] = (int) Math.random() * 1000;
                }
            }
            lists[z] = Two.getByArr(ints);
        }

        long start = System.nanoTime();
        mergeKLists2(lists);
        System.out.println(System.nanoTime() - start);
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        ListNode first = new ListNode(0);
        ListNode last = first;
        int index;
        int min;
        for (int i = 0; i < lists.length; ) {
            if (lists[i] != null) {
                min = lists[i].val;
                index = i;
                for (int j = i + 1; j < lists.length; j++) {
                    if (lists[j] != null && min > lists[j].val) {
                        min = lists[j].val;
                        index = j;
                    }
                }
                last.next = lists[index];
                last = last.next;
                lists[index] = lists[index].next;
            } else {
                i++;
            }
        }
        return first.next;
    }


    public static ListNode mergeKLists2(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode res = new ListNode(0);
        ListNode cur = res;
        PriorityQueue<ListNode> q = new PriorityQueue<>(new Comparator<ListNode>(){
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                q.offer(lists[i]);
            }
        }
        while (!q.isEmpty()) {
            ListNode t = q.poll();
            cur.next = new ListNode(t.val);
            cur = cur.next;
            if (t.next != null){
                q.offer(t.next);
            }
        }
        return res.next;
    }
}
