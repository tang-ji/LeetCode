/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        if(k == 0) return head;
        ListNode tiny = head;
        int n = 1;
        while(tiny.next != null) {
            tiny = tiny.next;
            n++;
        }
        tiny.next = head;
        int step = n - k % n;
        while(step > 0) {
            tiny = tiny.next;
            step--;
        }
        ListNode ret = tiny.next;
        tiny.next = null;
        return ret;
    }
}