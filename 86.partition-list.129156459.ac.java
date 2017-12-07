/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode head1 = new ListNode(0), head2 = new ListNode(0);
        ListNode tail1 = head1, tail2 = head2;
        if(head == null) return null;
        while(head != null) {
            if(head.val < x) {
                tail1.next = head;
                tail1 = tail1.next;
            }
            else {
                tail2.next = head;
                tail2 = tail2.next;
            }
            head = head.next;
        }
        tail1.next = head2.next;
        tail2.next = null;
        return head1.next;
    }
}