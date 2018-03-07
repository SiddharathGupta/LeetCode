/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 != null) return l2;
        else if(l1 != null && l2 == null) return l1;
        else {
            ListNode head1 = l1, head2 = l2;
            ListNode dummy = new ListNode(0);
            ListNode p = dummy;
            while(head1 != null || head2 != null) {
                if(head1 != null && head2 != null) {
                    if(head1.val < head2.val) {
                        p.next = head1;
                        head1 = head1.next;
                    }
                    else {
                        p.next = head2;
                        head2 = head2.next;
                    }
                    p = p.next;
                }
                else if(head1 == null) {
                    p.next = head2;
                    break;
                }
                else if(head2 == null) {
                    p.next = head1;
                    break;
                }   
            }
            return dummy.next;
        }
    }
}