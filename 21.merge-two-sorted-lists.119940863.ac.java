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
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode h1 = l1, h2 = l2, h = new ListNode(0), tiny = h;
        while(h1 != null && h2 != null) {
            if(h1.val <= h2.val) {
                tiny.next = h1;
                h1 = h1.next;
                tiny = tiny.next; 
                tiny.next = h2;
            }
            else {
                tiny.next = h2;
                h2 = h2.next;
                tiny = tiny.next; 
                tiny.next = h1;
            }
        }
        return h.next;
    }
}