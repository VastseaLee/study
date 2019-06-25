package leetcode.two;

import leetcode.TreeNode;

/**
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 */
public class ThirtyFive {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);
        root.left = p;
        root.right = new TreeNode(8);
        p.left = new TreeNode(0);
        p.right = q;
        System.out.println(lowestCommonAncestor(root,p,q).val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == p || root == q) {
            return root;
        }
        int rNum = root.val;
        int pNum = p.val;
        int qNum = q.val;
        if (pNum < rNum && qNum < rNum) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (pNum > rNum && qNum > rNum) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }


    private static TreeNode hh(){
        TreeNode root = new TreeNode(6);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);
        root.left = p;
        root.right = new TreeNode(8);
        p.left = new TreeNode(0);
        p.right = q;
        return root;
    }
}
