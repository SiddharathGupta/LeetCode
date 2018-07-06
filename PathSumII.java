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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> al = new ArrayList<Integer>();
        pathSumHelper(root, sum, al, result);
        return result;
    }
    private static void pathSumHelper(TreeNode root, int sum, List<Integer> al, List<List<Integer>> result) {
        if(root == null) return;
        al.add(root.val);
        if(root.left == null && root.right == null && root.val == sum) {
            result.add(new ArrayList<Integer>(al));
            al.remove(al.size()-1);
            return;
        }
        else {
            pathSumHelper(root.left, sum-root.val, al, result);
            pathSumHelper(root.right, sum-root.val, al, result);
        }
        al.remove(al.size()-1);
    }
}
