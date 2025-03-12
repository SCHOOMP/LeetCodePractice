package BinaryTree.Easy;

import java.util.ArrayList;
import java.util.List;

public class SameTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static boolean isSameTree(TreeNode q, TreeNode p) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}


    public static void main(String[] args) {
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        System.out.println("Are the trees the same? " + isSameTree(p, q));

    }
}
//public static boolean isSameTree(TreeNode first, TreeNode second) {
//        List<Integer> listFirst = new ArrayList<>();
//        List<Integer> listSecond = new ArrayList<>();
//        inOrder(first, listFirst);
//        inOrder(second, listSecond);
//        if (listFirst.equals(listSecond)){
//            return true;
//        }
//        return false;
//    }
//
//    private static void inOrder(TreeNode node, List<Integer> list) {
//        if (node != null) {
//            inOrder(node.left, list);
//            list.add(node.val);
//            inOrder(node.right, list);
//        }
//    }