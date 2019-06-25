package leetcode.two;

import leetcode.TreeNode;

/**
 * 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
 * <p>
 * 说明：
 * 你可以假设 k 总是有效的，1 ≤ k ≤ 二叉搜索树元素个数。
 * 进阶：
 * 如果二叉搜索树经常被修改（插入/删除操作）并且你需要频繁地查找第 k 小的值，你将如何优化 kthSmallest 函数？
 */
public class Thirty {
    int index = 1;
    int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        f(root,k);
        return result;
    }

    private void f(TreeNode root, int k) {
        if(root == null){
            return;
        }
        f(root.left,k);
        if(index++ == k){
            result =  root.val;
        }
        f(root.right,k);
    }
}
