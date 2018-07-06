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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        // return buildTreeUtil(0, postorder.length-1, inorder.length-1, inorder, postorder);
        return buildTreeUtil(0, inorder.length-1, 0, postorder.length-1, inorder, postorder);
    }
    private static TreeNode buildTreeUtil(int in_start, int in_end, int post_start, int post_end, int[] inorder, int[] postorder) {
        if(in_start > in_end || post_start > post_end) return null;
        TreeNode root = new TreeNode(postorder[post_end]);
        int in_root = 0;
        for(int i=in_start;i<=in_end;i++) {
            if(root.val == inorder[i]) {
                in_root = i;
                break;
            }
        }
        root.left = buildTreeUtil(in_start, in_root-1, post_start, in_root-in_start-1+post_start, inorder, postorder);
        root.right = buildTreeUtil(in_root+1, in_end, in_root-in_start+post_start, post_end-1, inorder, postorder);
        return root;
    }
}
