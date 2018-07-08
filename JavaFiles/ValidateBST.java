/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        return BSTUtil(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    private static boolean BSTUtil(TreeNode root, long max, long min) {
        if(root == null) return true;
        if(root.val <= min || root.val >= max) return false;
        return (BSTUtil(root.left, root.val, min) && (BSTUtil(root.right, max, root.val)));
    }
}