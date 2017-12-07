/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        if(n == 0) return head;
        if(n == 1) {
            if(head.next == null) return null;
            ListNode temp = head;
            while(temp.next.next != null) temp = temp.next;
            temp.next = null;
            return head;
        }
        ListNode[] temp = new ListNode[n+1];
        temp[0] = head;
        while(true) {
            for(int i = 1; i <= n; i++) {
                temp[i] = temp[i-1].next;
            }
            if(temp[n] == null) return head.next;
            if(temp[n].next != null) temp[0] = temp[1];
            else break;
        }
        temp[0].next = temp[2];
        return head;
    }
}