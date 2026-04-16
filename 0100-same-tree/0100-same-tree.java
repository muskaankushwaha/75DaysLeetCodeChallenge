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
    boolean ans = true;

    public boolean isSameTree(TreeNode t1, TreeNode t2) {

        if (t1 != null || t2 != null) {
            if ((t1 == null && t2 != null) || (t1 != null && t2 == null)) {
                return ans = false;
            } else if (t1.val != t2.val) {
                return ans = false;
            }
                if (ans) {
                    ans = (isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right));
                }
            
        }
        return ans;
    }
}
