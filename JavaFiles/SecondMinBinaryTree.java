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
    int min1;
    long result = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        min1 = root.val;
        dfs(root);
        return (result<Long.MAX_VALUE) ? (int)result : -1;
    }
    private void dfs(TreeNode node) {
        if(node != null) {
            if(min1 < node.val && node.val < result) result = node.val;
            else if(node.val == min1) {
                dfs(node.left);
                dfs(node.right);
            }
        }
    }
}