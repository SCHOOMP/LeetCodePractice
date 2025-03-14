package Java.BinaryTree.Easy;

import com.sun.source.tree.Tree;

public class SymmetricTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (root == null) {
                return true;
            }
            return isMirror(root.left, root.right);
        }

        private boolean isMirror(TreeNode t1, TreeNode t2) {
            if (t1 == null && t2 == null) {
                return true;
            }
            if (t1 == null || t2 == null) {
                return false;
            }
            return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
        }
    }

    // Method to print the tree using inorder traversal
    public static void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        printTree(node.left);
        System.out.print(node.val + " ");
        printTree(node.right);
    }

    public static void main(String[] args) {
        SymmetricTree solution = new SymmetricTree();

        TreeNode root = solution.new TreeNode(1);
        root.left = solution.new TreeNode(2);
        root.right = solution.new TreeNode(2);
        root.left.left = solution.new TreeNode(3);
        root.left.right = solution.new TreeNode(4);
        root.right.left = solution.new TreeNode(4);
        root.right.right = solution.new TreeNode(3);

        Solution solver = solution.new Solution();
        boolean result = solver.isSymmetric(root);
        printTree(root);
        System.out.println("Is the tree symmetric? " + result);
    }

}
