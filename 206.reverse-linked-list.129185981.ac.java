/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = null, temp;
        while(head.next != null) {
            temp = head;
            head = head.next;
            temp.next = dummy;
            dummy = temp;
        }
        head.next = dummy;
        return head;
    }
}