package leetcode;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static TreeNode arr2TreeNode(Integer[] arr) {
        TreeNode root = new TreeNode(arr[0]);
        f(root, 0, arr, arr.length);
        return root;
    }

    private static void f(TreeNode root, int i, Integer[] arr, int length) {
        int num = i * 2 + 1;
        if (num >= length) {
            return;
        }
        Integer lNum = arr[num];
        if (lNum != null) {
            TreeNode left = new TreeNode(arr[num]);
            root.left = left;
            f(left, num, arr, length);
        }

        num = i * 2 + 2;
        if (num >= length) {
            return;
        }
        Integer rNum = arr[num];
        if (rNum != null) {
            TreeNode right = new TreeNode(arr[num]);
            root.right = right;
            f(right, num, arr, length);
        }
    }
}
