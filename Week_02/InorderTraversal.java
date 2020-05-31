package Week_02;

import java.util.ArrayList;
import java.util.List;

class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }

    public static void inorder(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.left != null) {
                inorder(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                inorder(root.right, res);
            }
        }
    }
}