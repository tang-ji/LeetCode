/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) return head;
        
        ListNode[] Node = reverse(head, m, n);
        if (m == 1) {
            if (find(head, n).next != null) Node[0].next = find(head, n + 1);
            return Node[1];
        }
        else {
            if (find(head, n).next != null) Node[0].next = find(head, n + 1);
            find(head, m - 1).next = Node[1];
            return head;
        }
        
    }
    
    public ListNode[] reverse(ListNode head, int m, int n) {
        ListNode[] Node = new ListNode[2];
        for (int i = 1; i < m; i++) {
            head = head.next;
        }
        Node[0] = new ListNode(head.val);
        Node[0].next = null;
        ListNode temp0 = Node[0];
        for (int j = 1; j < n - m + 1; j++) {
            ListNode temp = new ListNode(head.next.val);
            temp.next = temp0;
            temp0 = temp;
            head = head.next;
        }
        Node[1] = temp0;
        return Node;
    }
    
    public ListNode find(ListNode head, int n) {
        for (int i = 1; i < n; i++) {
            head = head.next;
        }
        return head;
    } 
}