/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int n = k;
        if (count(head) < k) return head;
        ListNode tail = head;
        while (n-- != 0) tail = tail.next;
        return Union (inverse(head, k), reverseKGroup(tail, k));
    }
    
    public ListNode inverse (ListNode head, int n) {
        ListNode rehead = head;
        if (n > 1) {
            rehead = inverse(head.next, n - 1);
            head.next.next = head;
        }
        head.next = null;
        return rehead;
    }
    
    public ListNode Union (ListNode l1, ListNode l2) {
        ListNode dummy = l1;
        while (dummy.next != null) {
            dummy = dummy.next;
        }
        dummy.next = l2;
        return l1;
    }
    
    public int count (ListNode l) {
        int n = 0;
        while (l != null) {
            n++;
            l = l.next;
        }
        return n;
    }
}