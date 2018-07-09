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
    TreeNode successor = null;
    public void flatten(TreeNode root) {
        if(root == null) return;
        flatten(root.right);
        flatten(root.left);
        if(successor != null) {
            root.left = null;
            root.right = successor;
        }
        successor = root;
    }
}
