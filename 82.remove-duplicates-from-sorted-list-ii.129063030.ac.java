/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode tiny = head, f;
        f = new ListNode(1);
        f.next = head;
        head = f;
        while(tiny != null && tiny.next != null) {
            if(tiny.val != tiny.next.val) {
                tiny = tiny.next;
                f = f.next;
            }
            else {
                while(tiny.next != null && tiny.val == tiny.next.val) tiny = tiny.next;
                f.next = tiny.next;
                tiny = tiny.next;
            }
        }
        return head.next;
    }
}