/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    boolean ans = true;

    public void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        list.add(root.val);
        if (list.size() >= 2 && list.get(list.size() - 2) >= root.val) {
            ans = false;

        }
        inorder(root.right);
    }

    public boolean isValidBST(TreeNode root) {
        inorder(root);
        //   System.out.println(list);
        return ans;
    }
}