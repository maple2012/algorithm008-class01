import javax.swing.tree.TreeNode;

public class N104Solution {

    public static int MaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left_height = maxDepth(root.left);
            int right_height = maxDepth(root.right);
            return java.lang.Math.max(left_height,right_height) + 1;
        }

    }
}