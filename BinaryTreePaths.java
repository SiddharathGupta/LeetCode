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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> al = new ArrayList<String>();
        if(root != null) searchBinaryTree(root, "", al);
        return al;
    }
    private static void searchBinaryTree(TreeNode root, String path, List<String> al) {
        if(root.left == null && root.right == null) al.add(path+root.val);
        if(root.left != null)  searchBinaryTree(root.left, path+root.val+"->", al);
        if(root.right != null)  searchBinaryTree(root.right, path+root.val+"->", al);
    }
}
