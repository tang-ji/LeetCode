/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode h, temp1, temp2;
        h = new ListNode(0);
        h.next = head;
        head = head.next;
        while(h.next != null && h.next.next != null) {
            temp1 = h.next;
            temp2 = temp1.next;
            temp1.next = temp2.next;
            temp2.next = temp1;
            h.next = temp2;
            h = temp1;
        }
        return head;
    }
}