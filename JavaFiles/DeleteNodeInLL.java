/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
// 1 -> 2 -> 3 -> 4 -> 5 -> 6
// 1 -> 2 -> 4 -> 5 -> 6
class Solution {
    public void deleteNode(ListNode node) {
        if(node == null) return;
        int val = node.next.val;
        node.next = node.next.next;
        node.val = val;
    }
}