package Java.BinaryTree.Medium;

public class CountCompleteTreeNodes {

    public static int countNodes(TreeNode node) {
            if (node == null) {
                return 0;
            }
            return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1
        );

        CountCompleteTreeNodes tree = new CountCompleteTreeNodes();
        System.out.println(countNodes(root));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
