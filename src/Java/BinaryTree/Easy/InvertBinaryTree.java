package Java.BinaryTree.Easy;

public class InvertBinaryTree {

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
        public TreeNode invertTree(TreeNode root) {
            if (root == null) {
                return null;
            }
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.left);
            invertTree(root.right);

            return root;
        }
    }

    public void printTree(TreeNode node) {
        if (node == null) {
            return;
        }
        printTree(node.left);
        System.out.print(node.val + " ");
        printTree(node.right);
    }

    public static void main(String[] args) {
        InvertBinaryTree solution = new InvertBinaryTree();

        TreeNode root = solution.new TreeNode(4);
        root.left = solution.new TreeNode(2);
        root.right = solution.new TreeNode(7);
        root.left.left = solution.new TreeNode(1);
        root.left.right = solution.new TreeNode(3);
        root.right.left = solution.new TreeNode(6);
        root.right.right = solution.new TreeNode(9);

        System.out.println("Original Tree (Inorder Traversal):");
        solution.printTree(root);
        System.out.println();

        Solution solver = solution.new Solution();
        TreeNode invertedRoot = solver.invertTree(root);

        System.out.println("Inverted Tree (Inorder Traversal):");
        solution.printTree(invertedRoot);
    }

}
