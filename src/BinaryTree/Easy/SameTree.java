package BinaryTree.Easy;

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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        // Implement logic here
        return false; // Placeholder return
    }

    public static void main(String[] args) {
        // Example trees for testing
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        System.out.println("Are the trees the same? " + isSameTree(p, q));
    }
}
